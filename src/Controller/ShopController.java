package Controller;

import Utils.FileManager;
import dao.CartDAO;
import dao.ItemDAO;
import dao.UserDAO;

public class ShopController {
	ItemDAO itemDAO;
	UserDAO userDAO;
	CartDAO cartDAO;
	FileManager instance;

	/**
	 * @param itemDAO
	 * @param userDAO
	 * @param cartDAO
	 */
	public ShopController() {
		this.itemDAO = new ItemDAO();
		this.userDAO = new UserDAO();
		this.cartDAO = new CartDAO();
		instance = FileManager.getInstance();
	}

	// System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]" + "\n[100.관리자] [0.종료] ");
	// System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
	// System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
	// System.out.println("[1.아이템관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0.뒤로가기] ");
	public void run() {
		while (true) {
			break;
		}
	}
}
