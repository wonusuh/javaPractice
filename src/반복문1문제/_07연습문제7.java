package 반복문1문제;

public class _07연습문제7 {
	public static void main(String[] args) {
//		문제
//		조건1) 30의 약수를 출력하고
//		조건2) 그 총합을 구하시오
//		조건3) 그 갯수를 구하시오
		// 정답 1 2 3 4 5 6 10 15 30
		// 합 = 72
		// 갯수 =8
		int i = 1;
		int sum = 0;
		int count = 0;
		while (i <= 30) {
			if (30 % i == 0) {
				System.out.print(i + " ");
				sum += i;
				count += 1;
			}
			i += 1;
		}
		System.out.print("");
		System.out.println("합 = " + sum);
		System.out.println("갯수 = " + count);
	}
}
