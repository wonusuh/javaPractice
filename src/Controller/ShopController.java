package Controller;

import Utils.FileManager;
import Utils.InputManager;
import dao.CartDAO;
import dao.ItemDAO;
import dao.UserDAO;
import vo.Cart;
import vo.Item;
import vo.User;

public class ShopController {
	private ItemDAO itemDAO;
	private UserDAO userDAO;
	private CartDAO cartDAO;
	private FileManager fm;
	private InputManager im;
	public User log;

	/**
	 * @param itemDAO
	 * @param userDAO
	 * @param cartDAO
	 */
	public ShopController() { // 생성자 입니다.
		itemDAO = new ItemDAO();
		userDAO = new UserDAO();
		cartDAO = new CartDAO();
		fm = FileManager.getInstance();
		im = InputManager.getInstance();
		fm.loadData(itemDAO, userDAO, cartDAO);
	}

	private void signIn() {
		System.out.println("[ 로그인 ]");
		System.out.println("id를 입력하세요. >> ");
		String id = im.sc.next();
		im.sc.nextLine();
		log = userDAO.findAUserById(id);
		if (log == null)
			return;
		System.out.println("pw를 입력하세요.");
		String pw = im.sc.next();
		im.sc.nextLine();
		if (log.getUserPw().equals(pw)) {
			System.out.println("로그인에 성공했습니다.");
		} else {
			System.out.println("비밀번호를 확인하세요.");
			log = null;
		}
	}

	private void leaveMembership() {
		if (log.getUserId().equals("admin")) {
			System.out.println("관리자는 탈퇴할 수 없습니다.");
			return;
		}
		System.out.println("비밀번호를 입력하세요. >> ");
		String pw = im.sc.next();
		im.sc.nextLine();
		if (!log.getUserPw().equals(pw)) {
			System.out.println("pw를 확인하세요.");
			return;
		}
		userDAO.userList.remove(log);
		cartDAO.deleteAllOrdersByUser(log);
		this.log = null;
		System.out.println("탈퇴했습니다.");
	}

	private void showEarnings() {
		int earnings = 0;
		for (Cart c : cartDAO.cartList) {
			for (Item i : itemDAO.itemList) {
				if (c.getItemName().equals(i.getName())) {
					earnings += i.getPrice();
					break;
				}
			}
		}
		System.out.printf("매출 : %d원", earnings);
	}

	// System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]" + "\n[100.관리자] [0.종료] ");
	// System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기] ");
	// System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
	// System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
	public void run() {
		while (true) {
			System.out.println("Shop==================================================================");
			System.out.print("[1. 가입] ");
			System.out.print("[2. 로그인] ");
			System.out.print("[100. 관리자] ");
			System.out.println("[0. 종료]");
			int sel = im.getValue(0, 2);
			if (sel == 1) {
				userDAO.signUp();
			} else if (sel == 2) {
				signIn();
				if (log == null)
					continue;
				while (true) {
					System.out.printf("[ %s 로그인 중 ]\n", log.getUserName());
					System.out.println("[1. 쇼핑] [2. 내 장바구니] [3. 삭제] [4. 구입] [5. 로그아웃] [6. 회원 탈퇴]");
					int choice = im.getValue(0, 6);
					if (choice == 1) {
						cartDAO.shopping(itemDAO, log);
					} else if (choice == 2) {
						cartDAO.showMyCart(itemDAO, log);
					} else if (choice == 3) {
						cartDAO.deleteAllOrdersByUser(log);
						System.out.println("장바구니를 모두 비웠습니다.");
					} else if (choice == 4) {
						log = null;
						System.out.println("로그아웃 성공");
						break;
					} else if (choice == 5) {
						log = null;
						System.out.println("로그아웃 성공");
						break;
					} else if (choice == 6) {
						leaveMembership();
						if (log == null)
							break;
					}
				}
			} else if (sel == 100) {
				while (true) {
					System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기]");
					int choice = im.getValue(0, 4);
					if (choice == 1) {
						itemDAO.manageItem(cartDAO);
					} else if (choice == 2) {
						itemDAO.manageCategory(cartDAO);
					} else if (choice == 3) {
						cartDAO.manageCart();
					} else if (choice == 4) {
						userDAO.manageUser(cartDAO);
					} else if (choice == 0) {
						break;
					}
				}
			} else if (sel == 0) {
				showEarnings();
				break;
			}
		}
		im.sc.close();
	}
}
