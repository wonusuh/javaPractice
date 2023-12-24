package 기타문법;

public class _02증감연산자 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("1a : " + a);
		System.out.println("2a : " + a++);
		System.out.println("3a : " + a);

		// 연산자 끼리 우선순위 변수 뒤에 ++ 붙이는게 우선순위가 낮다

		int b = 10;
		System.out.println("1b : " + b);
		System.out.println("2b : " + ++b);
		System.out.println("3b : " + b);
	}
}
