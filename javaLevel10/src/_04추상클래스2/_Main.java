package _04추상클래스2;

public class _Main {
	public static void main(String[] args) {
		MyChicken store1 = new MyChicken("강남");
		MyChicken store2 = new MyChicken("홍대");
		MyChicken store3 = new MyChicken("압구정");
		MyCafe store4 = new MyCafe("제주", true);
		MyCafe store5 = new MyCafe("신촌", true);
		MyCafe store6 = new MyCafe("강남", false);
		MyBakery store7 = new MyBakery("강남", false);
		MyBakery store8 = new MyBakery("서초", true);
		MyBrand[] myStores = { store1, store2, store3, store4, store5, store6, store7, store8 };
		for (MyBrand myStore : myStores) {
			myStore.takeOrder();
		}
	}
}
