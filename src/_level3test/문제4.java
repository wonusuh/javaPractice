package _level3test;

import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
//		 * # 소수찾기 2단계
//		 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
//		 * 예)
//		 * 입력 : 20
//		 * 2, 3, 5, 7, 11, 13, 17, 19
		Scanner sc = new Scanner(System.in);

		System.out.print("2부터 입력값 까지의 모든 소수를 출력합니다 >> ");

		int input = sc.nextInt();

		for (int i = 2; i <= input; i += 1) {

			int cnt = 0;

			for (int k = 1; k <= i; k += 1) {
				if (i % k == 0) {
					cnt += 1;
				}
			}
			if (cnt == 2) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
