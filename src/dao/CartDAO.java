package dao;

import java.util.ArrayList;

import vo.Cart;

public class CartDAO {
	public ArrayList<Cart> cartList;

	public CartDAO() { // 생성자 입니다.
		cartList = new ArrayList<Cart>();
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
}
