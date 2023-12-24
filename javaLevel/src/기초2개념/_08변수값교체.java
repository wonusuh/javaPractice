package 기초2개념;

public class _08변수값교체 {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		// System.out.println("a = " + a);
		// System.out.printf("b = %d\n", b);

		System.out.printf("a = %d, b = %d\n", a, b);

		// 실제로 a, b 의 값을 교체해서 출력하기
		int c = a;
		a = b;
		b = c;
		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
