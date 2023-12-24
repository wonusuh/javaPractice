package 이차원반복문;

import java.util.Scanner;

public class _04소수찾기2단계 {
	public static void main(String[] args) {
//		소수찾기 2단계
//			정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
//			예)
//			입력 : 20
//			2, 3, 5, 7, 11, 13, 17, 19
//		먼저 소수찾기 1단계 : 해당 숫자만 소수인지 아닌지 4가 소수니 => 소수 아님
//		2가 소수니? 3이 소수니? 4가 소수니? ==> 2, 3 만 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("2부터 입력값 까지의 모든 소수 출력 >> ");
		int input = sc.nextInt();
		for (int k = 2; k <= input; k += 1) {

			int cnt = 0;

			// 소수인지 아닌지 판별해서 출력
			for (int i = 1; i <= k; i += 1) {
//				System.out.printf("[k]=%d [i]=%d \n", k, i);
				if (k % i == 0) {
					cnt += 1;
				}
			}
			if (cnt == 2) {
				System.out.print(k + " ");
			}
		}
		sc.close();
	}
}
