package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _01구구단2단계 {
	public static void main(String[] args) {
		// 1단계
//		1. 구구단 문제를 출제를 랜덤으로 받는다 (2단부터 9단까지)
//		2. 입력받은 숫자를 토대로 구구단 문제를 출력한다
//			예) 3 x 7 = ?
//		3. 사용자에게 문제에 해당하는 정답을 입력받는다.
//		4. 정답 혹은 오답을 출력한다

//		구구단 게임[2단계]
//				게임을 5회 반복한다
//				정답을 맞추면 20점이다
//				게임 종료 후 성적을 출력한다.

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int i = 1;
		int total = 0;

		while (i <= 5) {
			int guguFirst = rn.nextInt(9 - 2 + 1) + 2;
			int guguSecond = rn.nextInt(9 - 1 + 1) + 1;

			System.out.println("다음 구구단의 정답을 입력하세요. " + guguFirst + " x " + guguSecond + " = ?");
			System.out.print("정답 입력 => ");

			int answer = sc.nextInt();

			if (answer == guguFirst * guguSecond) {
				System.out.println("정답!");
				total += 20;
			} else {
				System.out.println("오답!");
			}
			i += 1;
		}
		System.out.println("총점 : " + total);
		sc.close();
	}
}
