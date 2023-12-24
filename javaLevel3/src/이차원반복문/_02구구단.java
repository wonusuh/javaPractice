package 이차원반복문;

public class _02구구단 {
	public static void main(String[] args) {
//		구구단을 9단까지 출력하세요
		for (int i = 2; i < 10; i += 1) {
			System.out.println(i + "단");
			for (int k = 1; k < 10; k += 1) {
				System.out.println(i + " * " + k + " == " + i * k);
			}
			System.out.println();
		}
	}
}
