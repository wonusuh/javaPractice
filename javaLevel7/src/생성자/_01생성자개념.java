package 생성자;

// 생성자 => 인스턴스를 생성하는 메서드
class Ex01 {

	int a, b;
	String c;

	Ex01(int a, int b, String c) {
	}
}

public class _01생성자개념 {

	public static void main(String[] args) {

		Ex01 e = new Ex01(1, 2, "test");

		System.out.println(e.a);
	}
}
