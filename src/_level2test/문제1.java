package _level2test;

import java.util.Random;
import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		int com = rn.nextInt(100 - 1 + 1) + 1;
		int score = 200;
		boolean first = true;
		while (true) {
			System.out.println("up & down");
			System.out.println("1~100 사이의 정수를 입력하세요 >>");
			int me = sc.nextInt();
			if (me < 1 || me > 100) {
				System.out.println("범위 오류 : 1~100사이의 정수를 입력하세요");
				continue;
			}
			if (me < com) {
				score -= 20;
				first = false;
				System.out.println("크다. 현재 점수 == " + score);
			}
			if (me > com) {
				score -= 20;
				first = false;
				System.out.println("작다. 현재 점수 == " + score);
			}
			if (score <= 0) {
				System.out.println("게임오버");
				break;
			}
			if (me == com) {
				if (first) {
					score += 100;
				}
				System.out.println("정답");
				System.out.printf("com == %d, 총점수 == %d\n", com, score);
				break;
			}
		}
		sc.close();
	}
}
