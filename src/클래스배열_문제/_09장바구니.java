package 클래스배열_문제;

class Item {
	int itemNo, price;
	String name;

	int getItemNo() {
		return itemNo;
	}

	void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class User {
	int userNo;
	String name;

	int getUserNo() {
		return userNo;
	}

	void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class Cart {// joint table
	int userNo, itemNo;

	int getUserNo() {
		return userNo;
	}

	void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	int getItemNo() {
		return itemNo;
	}

	void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
}

class ItemDAO {// item crud
	Item[] itemList;

	Item[] getItemList() {
		return itemList;
	}

	void setItemList(Item[] itemList) {
		this.itemList = itemList;
	}

	String returnItemName(int itemNum) {
		String temp = "";
		for (int i = 0; i < itemList.length; i += 1) {
			if (itemNum == itemList[i].getItemNo()) {
				temp = itemList[i].getName();
				break;
			}
		}
		return temp;
	}

	int returnItemIdx(int itemNum) {

		int idx = -1;

		for (int i = 0; i < itemList.length; i += 1) {

			if (itemNum == itemList[i].getItemNo()) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	void init(String idata) {
		String[] datas = idata.split(",");
		itemList = new Item[datas.length];
		for (int i = 0; i < datas.length; i += 1) {
			String[] splitted = datas[i].split("/");
			Item temp = new Item();
			temp.setItemNo(Integer.parseInt(splitted[0]));
			temp.setName(splitted[1]);
			temp.setPrice(Integer.parseInt(splitted[2]));
			itemList[i] = temp;
		}
	}
}

class UserDAO {// user crud
	User[] userList;

	User[] getUserList() {
		return userList;
	}

	void setUserList(User[] userList) {
		this.userList = userList;
	}

	String returnUserName(int num) {
		String name = "";
		for (int i = 0; i < userList.length; i += 1) {
			if (num == userList[i].getUserNo()) {
				name = userList[i].getName();
				break;
			}
		}
		return name;
	}

	int returnUserIdx(int num) {

		int idx = -1;

		for (int i = 0; i < getUserList().length; i += 1) {

			if (num == userList[i].getUserNo()) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	void init(String udata) {
		String[] datas = udata.split(",");
		userList = new User[datas.length];
		for (int i = 0; i < datas.length; i += 1) {
			String[] splitted = datas[i].split("/");
			User temp = new User();
			temp.setUserNo(Integer.parseInt(splitted[0]));
			temp.setName(splitted[1]);
			userList[i] = temp;
		}
	}
}

class CartDAO {
	Cart[] cartList;
	ItemDAO idao;
	UserDAO udao;

	void init(String cdata) {
		idao = new ItemDAO();
		udao = new UserDAO();
		String[] datas = cdata.split("\n");
		cartList = new Cart[datas.length];
		for (int i = 0; i < cartList.length; i++) {
			String[] splitted = datas[i].split("/");
			Cart temp = new Cart();
			temp.setUserNo(Integer.parseInt(splitted[0]));
			temp.setItemNo(Integer.parseInt(splitted[1]));
			cartList[i] = temp;
		}
	}

	void quiz1() {// 회원별로 아이템 구매목록 출력
		System.out.println("=====quiz1=====");

		User[] uList = udao.getUserList();
		Item[] iList = idao.getItemList();
		int[][] itemCnt = new int[uList.length][iList.length];

		for (int i = 0; i < uList.length; i += 1) {// 값 넣기

			for (int j = 0; j < cartList.length; j += 1) {

				if (uList[i].getUserNo() == cartList[j].getUserNo()) {
					itemCnt[i][idao.returnItemIdx(cartList[j].getItemNo())] += 1;
				}
			}
		}

		for (int i = 0; i < itemCnt.length; i += 1) {// 결과 출력
			System.out.printf("%s==> ", uList[i].getName());

			for (int j = 0; j < itemCnt[i].length; j += 1) {

				if (itemCnt[i][j] != 0) {
					System.out.printf("%s%d ", iList[j].getName(), itemCnt[i][j]);
				}
			}
			System.out.println();
		}
	}

	void quiz2() {// 아이템별로 구매한 회원이름 출력
		System.out.println("=====quiz2=====");

		Item[] iList = idao.getItemList();
		User[] uList = udao.getUserList();
		boolean[][] check = new boolean[iList.length][uList.length];

		for (int i = 0; i < iList.length; i += 1) {// 값 넣기

			for (int j = 0; j < cartList.length; j += 1) {

				if (iList[i].getItemNo() == cartList[j].getItemNo()) {
					check[i][udao.returnUserIdx(cartList[j].getUserNo())] = true;
				}
			}
		}

		for (int i = 0; i < check.length; i += 1) {

			for (int j = 0; j < check[i].length; j += 1) {

				if (check[i][j]) {
					System.out.print(iList[j].getName());
				}
			}
			System.out.println();
		}
	}

	void run(String idata, String udata, String cdata) {
		init(cdata);
		idao.init(idata);
		udao.init(udata);
		quiz1();
		quiz2();
	}
}

public class _09장바구니 {
	public static void main(String[] args) {
		String itemData = "1001/고래밥/1200,1002/새우깡/2300,1003/칸쵸/1500";
		String userData = "3001/이만수,3002/김철민,3003/이영희";
		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";
		CartDAO cdao = new CartDAO();
		cdao.run(itemData, userData, cartData);
	}
}
