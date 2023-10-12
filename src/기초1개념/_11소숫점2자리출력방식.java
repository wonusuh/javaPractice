package 기초1개념;

public class _11소숫점2자리출력방식 {
	public static void main(String[] args) {
		// 평균 구하는 공식
		// 3개의 값의 평균
		// (총합) / 갯수.0

		System.out.printf("%.2f\n", (84 + 23 + 53) / 3.0);
		System.out.println(String.format("%.2f", (84 + 23 + 53) / 3.0));
		System.out.println(Math.round((84 + 23 + 53) / 3.0 * 100) / 100.0);
	}
}
