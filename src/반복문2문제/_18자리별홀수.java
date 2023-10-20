package 반복문2문제;

import java.util.Scanner;

public class _18자리별홀수 {
	public static void main(String[] args) {
//		문제
//		자리별홀수
//			1~10000 사이의 숫자를 입력받고 자리별 홀수의 개수를 출력하시오
//		예시
//			561  : 홀수 2개
//			1    : 홀수 1개
//			668  : 홀수 0개
//			9999 : 홀수 4개
		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		boolean run = true;

		System.out.println("자리별 홀수의 개수를 출력합니다");
		System.out.println("1~10000사이의 숫자를 입력하세요 >>");
		int input = sc.nextInt();
		while (true) {
			if (input < 1 || input > 10000) {
				System.out.println("다시 입력하세요 1~10000");
				continue;
			}
			break;
		}

		while (run) {
			if (input % 2 != 0) {
				cnt += 1;
				System.out.println("홀수의 갯수 : " + cnt);
			}

			input /= 10;

			if (input == 0) {
				run = false;
			}
		}
		sc.close();
	}
}
