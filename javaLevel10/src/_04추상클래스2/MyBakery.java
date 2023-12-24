package _04추상클래스2;

public class MyBakery extends MyBrand {
	private static int myNum;
	private boolean isTakeOut;

	public MyBakery(String name, boolean isTakeOut) {
		super(++myNum, name);
		this.isTakeOut = isTakeOut;
	}

	@Override
	public void takeOrder() {
		System.out.printf("원우베이커리 %s 에서 주문했습니다.\n", super.info());
		if (!this.isTakeOut) {
			System.out.println("매장에서 드시겠습니까?");
		}
	}
}
