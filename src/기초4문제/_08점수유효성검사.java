package 기초4문제;

import java.util.Scanner;

public class _08점수유효성검사 {
	public static void main(String[] args) {
		// 점수를 입력받는다
		// 60점 이상이면 합격, 미만이면 불합이다
		// 단, 입력받은 정수가 음수이거나 100점을 초과하면, 예외메세지를 출력한다.
		// 예) 점수를 잘못입력했습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		boolean check = score < 0 || score > 100;

		if (check) {
			System.out.println("점수를 다시 입력하세요");
		}

		if (!check) {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		sc.close();
	}
}
