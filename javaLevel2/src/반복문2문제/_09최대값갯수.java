package 반복문2문제;

import java.util.Random;

public class _09최대값갯수 {
	public static void main(String[] args) {
//		문제
//			랜덤으로 1~10을 10 번 출력하고
//			가장 큰 수를 출력하시오
//			단, 가장 큰 수의 갯수도 출력하시오

		Random rn = new Random();

		int i = 1;
		int max = 0;
		int duplicated = 0;

		while (i <= 10) {
			int num = rn.nextInt(10 - 1 + 1) + 1;

			if (num > max) {
				max = num;
				duplicated = 0;
			}
			if (num == max) {
				duplicated += 1;
			}
			System.out.printf("num == %d, duplicated == %d\n", num, duplicated);
			i += 1;
		}
		System.out.println();
		System.out.println("가장 큰 수 중복 : " + duplicated);
		System.out.println("최대수 : " + max);
	}
}
