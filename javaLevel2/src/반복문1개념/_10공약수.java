package 반복문1개념;

public class _10공약수 {
	public static void main(String[] args) {
//		문제
//			105 63 175의 공약수를 구하시오
//			공약수란, 위 두 수의 공통인 약수를 의미한다
//			약수란, 어떤 수를 나누어 떨어지게 하는 수를 의미한다.
//		정답
//			1, 7

		int x = 105;
		int y = 63;
		int z = 175;

		// 먼저 최소값 찾기
		int min = x;
		if (min > y) {
			min = y;
		}
		if (min > z) {
			min = z;
		}
		System.out.println("min == " + min);

		int i = 1;

		while (i <= min) {
			if (x % i == 0 && y % i == 0 && z % i == 0) {
				System.out.print(i + ", ");
			}
			i += 1;
		}
		System.out.println();
		System.out.println("i == " + i);
	}
}
