//package 클래스배열_문제;
//
//class Item {
//	int itemNo;
//	String name;
//	int price;
//
//	void init(String itemNo, String name, String price) {
//		this.itemNo = Integer.parseInt(itemNo);
//		this.name = name;
//		this.price = Integer.parseInt(price);
//	}
//
//	void printInfo() {
//		System.out.printf("%d %s %d원 %n", itemNo, name, price);
//	}
//}
//
//// 아이템 CRUD : 아이템 추가 삭제 수정 출력
//class ItemDAO {
//	Item[] itemList;
//
//	void addItemDatas(String data) {
//		String[] temp = data.split(",");
//		itemList = new Item[temp.length];
//
//		for (int i = 0; i < temp.length; i += 1) {
//			String[] info = temp[i].split("/");
//			itemList[i] = new Item();
//			itemList[i].init(info[0], info[1], info[2]);
//		}
//	}
//}
//
//class User {
//	int userNo;
//	String name;
//
//	void init(String userNo, String name) {
//		this.userNo = Integer.parseInt(userNo);
//		this.name = name;
//	}
//
//	void printInfo() {
//		System.out.printf("%d %s %n", userNo, name);
//	}
//}
//
////유저 CRUD : 유저 추가 삭제 수정 출력
//class UserDAO {
//	User[] userList;
//
//	// 한명씩 추가
//	void addUser(User user) {
//		int cnt = userList == null ? 0 : userList.length;
//		if (cnt != 0) {
//			User[] temp = userList;
//			userList = new User[cnt + 1];
//			for (int i = 0; i < cnt; i += 1) {
//				userList[i] = temp[i];
//			}
//		} else {
//			userList = new User[1];
//		}
//		userList[cnt] = user;
//	}
//
//	void addUserDatas(String data) {
//		String[] temp = data.split(",");
//		for (int i = 0; i < temp.length; i += 1) {
//			String[] info = temp[i].split("/");
//			User u = new User();
//			u.init(info[0], info[1]);
//			addUser(u);
//		}
//	}
//
//	void printAllUser() {
//		for (User u : userList) {
//			u.printInfo();
//		}
//	}
//}
//
//class Cart {
//	int userNo;
//	int itemNo;
//
//	void init(String userNo, String itemNo) {
//		this.userNo = Integer.parseInt(userNo);
//		this.itemNo = Integer.parseInt(itemNo);
//	}
//}
//
//class CartDAO {
//	Cart[] cartList;
//	UserDAO udao;
//	ItemDAO idao;
//
//	void init() {
//		udao = new UserDAO();
//		idao = new ItemDAO();
//
//	}
//
//	void addCart(Cart cart) {
//		int cnt = cartList == null ? 0 : cartList.length;
//
//		if (cnt != 0) {
//			Cart[] temp = cartList;
//			cartList = new Cart[cnt + 1];
//			for (int i = 0; i < cnt; i += 1) {
//				cartList[i] = temp[i];
//			}
//
//		} else {
//			cartList = new Cart[1];
//		}
//		cartList[cnt] = cart;
//
//	}
//
//	void addCartDatas(String data) {
//		String[] temp = data.split("\n");
//		for (int i = 0; i < temp.length; i += 1) {
//			String[] info = temp[i].split("/");
//			Cart c = new Cart();
//			c.init(info[0], info[1]);
//			addCart(c);
//		}
//	}
//
//	void quiz1() {
//		// [문제1] 회원별 아이템 구매목록 출력
//		// [정답1] 이만수==> 고래밥3,칸쵸1 / 김철민 ==> 고래밥1 / 이영희 ==> 고래밥1,새우깡2
//
//		User[] uList = udao.userList;
//		Item[] iList = idao.itemList;
//		// 회원 아이템
//		int[][] itemCnt = new int[uList.length][iList.length];
//
//		int uIdx = 0;
//		int iIdx = 0;
//		for (Cart c : cartList) {
//			uIdx = 0;
//			for (User u : uList) {
//				iIdx = 0;
//				for (Item i : iList) {
//					if (c.userNo == u.userNo && c.itemNo == i.itemNo) {
//						itemCnt[uIdx][iIdx] += 1;
//					}
//					iIdx += 1;
//				}
//				uIdx += 1;
//			}
//		}
//
//		String data = "";
//		for (int i = 0; i < itemCnt.length; i += 1) {
//			data += uList[i].name + " ==> ";
//			for (int k = 0; k < itemCnt[i].length; k += 1) {
//				if (itemCnt[i][k] > 0)
//					data += iList[k].name + itemCnt[i][k] + ",";
//			}
//			data = data.substring(0, data.length() - 1);
//			data += " / ";
//		}
//		data = data.substring(0, data.length() - 2);
//		System.out.println(data);
//		System.out.println();
//	}
//
//	void quiz2() {
//		// [문제2] 아이템별로 구입한 회원이름 출력
//		// [정답2] 고래밥==> 이만수,김철민,이영희 / 새우깡==> 이영희 / 칸쵸==> 이만수
//		User[] uList = udao.userList;
//		Item[] iList = idao.itemList;
//		int[][] itemCnt = new int[uList.length][iList.length];
//
//	}
//
//	void run(String idata, String udata, String cdata) {
//		init();
//		idao.addItemDatas(idata);
//		udao.addUserDatas(udata);
//		addCartDatas(cdata);
//		quiz1();
//	}
//}
//
//public class _09장바구니_정답 {
//	public static void main(String[] args) {
//		String itemData = "1001/고래밥/1200,1002/새우깡/2300,1003/칸쵸/1500";
//		String userData = "3001/이만수,3002/김철민,3003/이영희";
//		String cartData = "";
//		cartData += "3001/1001\n";
//		cartData += "3001/1001\n";
//		cartData += "3003/1002\n";
//		cartData += "3001/1001\n";
//		cartData += "3001/1003\n";
//		cartData += "3003/1002\n";
//		cartData += "3003/1001\n";
//		cartData += "3002/1001";
//
//		CartDAO cdao = new CartDAO();
//		cdao.run(itemData, userData, cartData);
//
//	}
//
//}
