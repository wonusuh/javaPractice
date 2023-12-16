package Controller;

import Utils.FileManager;
import Utils.InputManager;
import dao.CartDAO;
import dao.ItemDAO;
import dao.UserDAO;

public class ShopController {
	private ItemDAO itemDAO;
	private UserDAO userDAO;
	private CartDAO cartDAO;
	private FileManager fm;
	private InputManager im;

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

	// System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]" + "\n[100.관리자] [0.종료] ");
	// System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기] ");
	// System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
	// System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
	public void run() {
		while (true) {
			System.out.println("Shop==================================================================");
			System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]" + "\n[100.관리자] [0.종료]");
			int sel = im.getValue(0, 4);
			if (sel == 0) { // 0.종료
				break;
			} else if (sel == 1) { // 1.가입
			} else if (sel == 2) { // 2.탈퇴
			} else if (sel == 3) { // 3.로그인
			} else if (sel == 4) { // 4.로그아웃
			} else if (sel == 100) { // 100.관리자
				while (true) {
					System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기]");
					int choice = im.getValue(0, 4);
					if (choice == 0) { // 0.뒤로가기
						break;
					} else if (choice == 1) { // 1.아이템관리
						itemDAO.manageItems(cartDAO);
					} else if (choice == 2) { // 2.카테고리관리
						itemDAO.manageCategory(cartDAO);
					} else if (choice == 3) { // 3.장바구니관리
					} else if (choice == 4) { // 4.유저관리
					}
				}
			}
		}
		im.sc.close();
	}
}
