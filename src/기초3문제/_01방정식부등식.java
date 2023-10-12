package 기초3문제;

public class _01방정식부등식 {

	public static void main(String[] args) {
		/*
		 * [미지수가 하나인 일차방정식] 각 방정식과 부등식의 풀이 과정을 주석으로 표현하시오. 그리고 a 랑 b 의 값을 도출하시오
		 * 
		 * 정답 a = 17 b = 9.5
		 */

		int a = 0;
		boolean result1 = 7 * 2 - a == 3 * -2 - -3;
		// 14-a = -6 +3
		// -a = -17
		// a = 17
		System.out.println(result1);

		double b = 0;
		boolean result2 = 7 * 2 - b * 2 < -5;
		// 14-2b < -5
		// -2b < -19
		// b > 19/2
		System.out.println(result2);
	}
}
