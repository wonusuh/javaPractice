package 클래스_문제;

import java.util.Arrays;

class User {
	String id;
}

class Item {
	String name;
	int price;
}

class Cart {
	String userId, itemName;
}

public class _17클배_카트1 {

	public static void main(String[] args) {

		String data1 = "qwer/asdf/zxcv";
		String data2 = "새우깡,1200/감자깡,3200/고구마깡,2100";
		String data3 = "qwer,새우깡/qwer,고구마깡/asdf,감자깡/qwer,새우깡/zxcv,새우깡";

		User[] userList;
		Item[] itemList;
		Cart[] cartList;

		// [문제] 문자열을 각각의 클래스배열에 저장하고, 회원별로 구매한 상품 총 금액을 출력하시오.
		String[] users = data1.split("/");
		userList = new User[users.length];
		for (int i = 0; i < userList.length; i += 1) {

			User temp = new User();

			temp.id = users[i];
			userList[i] = temp;
		}

		String[] items = data2.split("/");
		itemList = new Item[items.length];
		for (int i = 0; i < itemList.length; i += 1) {

			String[] temp = items[i].split(",");
			Item it = new Item();

			it.name = temp[0];
			it.price = Integer.parseInt(temp[1]);

			itemList[i] = it;
		}

		String[] inCart = data3.split("/");
		cartList = new Cart[inCart.length];
		for (int i = 0; i < cartList.length; i += 1) {

			String[] temp = inCart[i].split(",");
			Cart c = new Cart();

			c.userId = temp[0];
			c.itemName = temp[1];

			cartList[i] = c;
		}

		// 총 구매 금액 구하기
		int[] result = new int[userList.length];

		for (int i = 0; i < cartList.length; i += 1) {

			int idx = -1;
			int value = 0;

			// id를 찾는 반복문
			for (int j = 0; j < userList.length; j += 1) {

				if (cartList[i].userId.equals(userList[j].id)) {
					idx = j;
				}
			}

			// item의 가격을 찾는 반복문
			for (int j = 0; j < itemList.length; j += 1) {

				if (cartList[i].itemName.equals(itemList[j].name)) {
					value = itemList[j].price;
				}
			}
			result[idx] += value;
		}
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i += 1) {
			System.out.printf("%s(%d) ", userList[i].id, result[i]);
		}
		// [정답] qwer(4500), asdf(3200), zxcv(1200)
	}
}
