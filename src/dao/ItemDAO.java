package dao;

import java.util.ArrayList;

import Utils.InputManager;
import vo.Item;

public class ItemDAO {
	private ArrayList<Item> itemList;
	private InputManager im;

	public ItemDAO() { // 생성자 입니다.
		itemList = new ArrayList<Item>();
		im = InputManager.getInstance();
	}

	public void putDataIn(String data) { // 받아온 데이터를 배열에 저장합니다.
		String[] datas = data.split("\n");
		for (String s : datas) {
			String[] splitted = s.split("/");
			Item temp = new Item();
			temp.setName(splitted[0]);
			temp.setPrice(Integer.parseInt(splitted[1]));
			temp.setCategory(splitted[2]);
			itemList.add(temp);
		}
	}

	private void showAllItems() { // itemList 에있는 객체들의 정보를 출력합니다.
		for (Item i : itemList) {
			System.out.printf("%10s%10d%10s\n", i.getName(), i.getPrice(), i.getCategory());
		}
	}

	public void manageItems(CartDAO cartDAO) { // 아이템을 관리합니다.
		while (true) {
			showAllItems();
			System.out.println("[1. 아이템 추가] [2. 아이템 삭제] [0. 뒤로가기]");
			int sel = im.getValue(0, 2);
			if (sel == 0) { // 0. 뒤로가기
				break;
			} else if (sel == 1) { // 1. 아이템 추가
				addAnItem();
			} else if (sel == 2) { // 2. 아이템 삭제
				deleteAnItem(cartDAO);
			}
		}
	}

	private Item getAnItemByName(String itemName) { // 아이템 이름으로 검색해서 해당하는 객체를 리턴합니다.
		for (Item i : itemList) {
			if (i.getName().equals(itemName)) {
				System.out.println("아이템이 존재합니다.");
				return i;
			}
		}
		System.out.println("아이템이 존재하지 않습니다.");
		return null;
	}

	private void addAnItem() { // itemList에 한 개 추가합니다.
		System.out.print("카테고리를 입력하세요. >> ");
		String category = im.sc.next();
		im.sc.nextLine();
		System.out.print("추가할 아이템의 이름을 입력하세요. >> ");
		String itemName = im.sc.next();
		im.sc.nextLine();
		if (getAnItemByName(itemName) != null)
			return;
		System.out.print("아이템의 가격을 입력하세요. >> ");
		int price = im.sc.nextInt();
		if (price < 1) {
			System.out.println("가격은 1원 이상만 가능합니다.");
			return;
		}
		Item temp = new Item();
		temp.setName(itemName);
		temp.setPrice(price);
		temp.setCategory(category);
		itemList.add(temp);
	}

	private void deleteAnItem(CartDAO cartDAO) { // itemList에서 아이템을 삭제하고, cartList에서도 해당 아이템을 모두 삭제합니다.
		if (cartDAO.cartList.size() == 0) {
			System.out.println("아이템이 없습니다.");
			return;
		}
		System.out.println("삭제할 아이템을 입력하세요. >> ");
		String item = im.sc.next();
		im.sc.nextLine();
		if (getAnItemByName(item) == null)
			return;
		for (Item i : itemList) {
			if (i.getName().equals(item)) {
				itemList.remove(i);
				break;
			}
		}
		for (int i = 0; i < cartDAO.cartList.size(); i += 1) {
			if (cartDAO.cartList.get(i).getItemName().equals(item)) {
				cartDAO.cartList.remove(i);
				i -= 1;
			}
		}
	}

	public void manageCategory(CartDAO cartDAO) { // 카테고리를 관리합니다. 카테고리 추가는 아이템 추가를 통해서만 할 수 있습니다.
		while (true) {
			System.out.println("---------------------------------------------");
			showAllCategories();
			System.out.println("[1. 카테고리 추가하기] [2. 카테고리 삭제하기] [0. 뒤로가기]");
			int sel = im.getValue(0, 2);
			if (sel == 0) { // 뒤로가기
				break;
			} else if (sel == 1) { // 1. 카테고리 추가하기
				addAnItem();
			} else if (sel == 2) { // 2. 카테고리 삭제하기
				deleteACategory(cartDAO);
			}
		}
	}

	private void showAllCategories() { // itemList에서 중복된 값을 제외하고 한 번만 배열에 담아 그 배열을 출력합니다.
		ArrayList<Item> tempList = new ArrayList<Item>();
		for (int i = 0; i < itemList.size(); i += 1) {
			boolean dupl = false;
			for (int j = 0; j < i; j += 1) {
				if (itemList.get(i).getCategory().equals(itemList.get(j).getCategory())) {
					dupl = true;
					break;
				}
			}
			if (dupl)
				continue;
			tempList.add(itemList.get(i));
		}
		int idx = 0;
		for (Item i : tempList) {
			System.out.printf("(%d) ", ++idx);
			System.out.println(i.getCategory());
		}
	}

	private void deleteACategory(CartDAO cartDAO) { // 카테고리에 해당하는 아이템들을 새로운배열에 담고 그 배열에 있는 값들을 cartList에서도 지웁니다.
		ArrayList<String> categoryList = new ArrayList<String>();
		System.out.println("삭제할 카테고리의 이름을 입력하세요. >> ");
		String categoryName = im.sc.next();
		im.sc.nextLine();
		for (int i = 0; i < itemList.size(); i += 1) {
			if (itemList.get(i).getCategory().equals(categoryName)) {
				categoryList.add(itemList.get(i).getName());
				itemList.remove(i);
				i -= 1;
			}
		}
		if (categoryList.size() == 0) {
			System.out.println("아무 카테고리도 없습니다.");
			return;
		}
		for (int i = 0; i < categoryList.size(); i += 1) {
			for (int j = 0; j < cartDAO.cartList.size(); j += 1) {
				if (cartDAO.cartList.get(j).getItemName().equals(categoryList.get(i))) {
					cartDAO.cartList.remove(j);
					j -= 1;
				}
			}
		}
	}
}
