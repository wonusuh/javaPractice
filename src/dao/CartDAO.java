package dao;

import java.util.ArrayList;

import Utils.InputManager;
import vo.Cart;

public class CartDAO {
	public ArrayList<Cart> cartList;
	private InputManager im;

	public CartDAO() { // 생성자 입니다.
		cartList = new ArrayList<Cart>();
		im = InputManager.getInstance();
	}

	public void putDataIn(String data) { // 받아온 데이터를 배열에 저장합니다.
		String[] datas = data.split("\n");
		for (String str : datas) {
			String[] splitted = str.split("/");
			Cart temp = new Cart();
			temp.setUserId(splitted[0]);
			temp.setItemName(splitted[1]);
			cartList.add(temp);
		}
	}

	public void manageCart() { // 카트를 관리합니다.
		if (cartList.size() == 0) {
			System.err.println("장바구니가 비어있습니다.");
			return;
		}
		while (true) {
			showCartList();
			System.out.println("[1. 주문 한 개 지우기] [2. 장바구니 모두 비우기] [0. 뒤로가기]");
			int sel = im.getValue(0, 2);
			if (sel == 0) { // 0. 뒤로가기
				break;
			} else if (sel == 1) { // 1. 주문 한 개 지우기
				deleteAnOrder();
			} else if (sel == 2) { // 2. 장바구니 모두 비우기
				cartList.clear();
				System.out.println("주문내역을 모두 삭제했습니다.");
				break;
			}
		}
	}

	private void showCartList() { // cartList의 모든 객체들을 출력합니다.
		System.out.println("--------------------------------------------------------------------");
		int idx = 0;
		for (Cart c : cartList) {
			System.out.printf("(%d) %s : %s\n", ++idx, c.getUserId(), c.getItemName());
		}
	}

	private void deleteAnOrder() { // 주문번호를 입력받아 주문을 한 개 삭제합니다.
		while (true) {
			showCartList();
			System.out.println("[ 삭제할 주문의 번호를 입력하세요. ]");
			int idx = im.getValue(1, cartList.size()) - 1;
			System.out.println(cartList.get(idx).getUserId() + "/" + cartList.get(idx).getItemName() + " 삭제했습니다.");
			cartList.remove(idx);
		}
	}
}
