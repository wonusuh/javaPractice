package 조건문문제;

import java.util.Scanner;

public class _14점수유효성검사 {
	public static void main(String[] args) {
//		1. 점수 2개를 입력받아 평균을 구한다
//		2. 평균이 60점 이상이면 합격, 60점미만이면 불합격
//		3. 조건1) 입력받은 정수가 음수거나 100점을 초과하면, 오류메세지를 출력
//		4. 조건2) 평균이 60점 이상이라도 한 과목이라도 50점 미만이면, 불합격 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 과목의 점수를 입력하세요(0~100)");
		double first = sc.nextInt();
		boolean check1 = first < 0 || first > 100;

		System.out.println("두 번째 과목의 점수를 입력하세요(0~100)");
		double second = sc.nextInt();
		boolean check2 = second < 0 || second > 100;

		if (check1) {
			System.out.println("첫 번째 과목의 점수를 다시 입력하세요(0~100)");
		}
		if (check2) {
			System.out.println("두 번째 과목의 점수를 다시 입력하세요(0~100)");
		}

		if (!check1 && !check2) {
			double average = (first + second) / 2;
			if (average >= 60 && first >= 50 && second >= 50) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		sc.close();
	}
}
