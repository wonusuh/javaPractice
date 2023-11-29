package 메서드_개념;

class Test06 {

	int result;

	void plus(int a, int b) {
		result = a + b;
	}
}

class Test07 {

	int plus(int a, int b) {
		return a + b;
	}
}
// 리턴을 사용하는 이유
//1. 리턴을 사용하면 인스턴스변수를 한 개 줄일 수 있음.

public class _11메서드기본이론6 {

	public static void main(String[] args) {

		Test06 e6 = new Test06();
		Test07 e7 = new Test07();

		e6.plus(10, 3);
		System.out.println(e6.result);

		int result = e7.plus(10, 3);

		System.out.println(result);
	}
}
