package 기초2개념;

public class _09자료형변환 {
	public static void main(String[] args) {
		System.out.println(10 - 3.0);
		// 강제형변환
		int x = 10;
		double y = 3.5;
		int result = x + (int) y;
		System.out.println(result);

		char a = 'a';
		System.out.println((int) a);
		char A = 'A';
		System.out.println((int) A);
		int b = 98;
		System.out.println((char) b);
		char 가 = '가';
		System.out.println(가 * 2.2);
	}
}
