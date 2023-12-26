package _12함수형프로그래밍;

import java.util.ArrayList;
import java.util.List;

public class _05스트림_이론 {
	public static List<Item> setData() {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(1001, 1500, "과자", "새우깡"));
		itemList.add(new Item(1002, 2000, "과자", "칸초"));
		itemList.add(new Item(1003, 10000, "어류", "고등어"));

		itemList.add(new Item(1001, 1500, "과자", "새우깡"));
		itemList.add(new Item(1002, 2000, "과자", "칸초"));
		itemList.add(new Item(1003, 10000, "어류", "고등어"));
		return itemList;
	}

	public static void main(String[] args) {

	}
}
