package 메서드_개념;

class Test01 {

	int x;

	void type01() {
		System.out.println("유산도없고 외부값도 없는 메서드");
	}
}

public class _01메서드기본1 {

	public static void main(String[] args) {

		Test01 t = new Test01();

		t.type01();
	}
}
