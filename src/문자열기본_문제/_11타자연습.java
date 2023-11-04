package 문자열기본_문제;

import java.util.Random;
import java.util.Scanner;

public class _11타자연습 {
	public static void main(String[] args) {
//		타자연습 게임 1단계
//		1. 문제를 섞는다 (shuffle)
//		2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
//		예)
//		문제 : mysql
//		입력 : mydb
//		
//		문제 : mysql
//		입력 : mysql <-- 정답을 맞추면 , 다음 문제 제시
//		
//		문제 : jsp
		String[] words = { "java", "mysql", "jsp", "spring" };
		boolean[] check = new boolean[words.length];

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int cnt = 0;

		while (true) {

			int num = rn.nextInt(3 - 0 + 1) + 0;

			if (check[num] == true) {
				continue;
			}

			while (true) {
				System.out.println("문제 " + words[num]);
				System.out.print("정답 입력 >> ");
				String answer = sc.nextLine();

				if (answer.equals(words[num])) {
					check[num] = true;
					cnt += 1;
					System.out.println("cnt : " + cnt);
					break;
				}
			}

			if (cnt == 4) {
				System.out.println("모두 맞췄다.");
				break;
			}
		}
		sc.close();
	}
}
