package 메서드_개념;

class Test02 {

	void type2(int x) {
		System.out.println("유산은 없고 외부값은 있다");
		System.out.printf("외부값은 x == %d", x);
	}

	void printSum() {

		int total = 0;

		for (int i = 0; i <= 5; i += 1) {
			total += 1;
		}
		System.out.println(total);
	}
}

public class _02메서드기본이론2 {

	public static void main(String[] args) {

		Test02 t = new Test02();

		t.printSum();
		t.printSum();

		t.type2(10);
	}
}
