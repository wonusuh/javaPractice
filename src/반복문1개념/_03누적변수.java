package 반복문1개념;

public class _03누적변수 {
	public static void main(String[] args) {
		// 문제1) 1~10 까지 합을 출력
		// 문제2) 10~1까지 짝수 갯수를 출력
		int i = 1;
		int sum = 0;
		while (i < 11) {
			System.out.println(i + ", " + sum);
			sum += i;
			i += 1;
		}
		System.out.println("sum : " + sum);

		// 문제2
		i = 10;
		sum = 0;
		while (i >= 1) {
			System.out.println("i : " + i + ", sum : " + sum);
			if (i % 2 == 0) {
				sum += 1;
			}
			i -= 1;
		}
		System.out.println("짝수 갯수 : " + sum);
	}
}
