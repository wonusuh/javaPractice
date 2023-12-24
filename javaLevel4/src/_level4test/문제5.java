package _level4test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
//		* # 타자연습 게임[2단계]
//				 * 1. 문제를 섞는다.(shuffle)
//				 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
//				 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *(랜덤 위치 )로 출력 
//				 * 예)
//				 * 문제 : mys*l
//				 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
//				 * 문제 : *sp
//				 * 입력 : jap
//				 * 문제 : j*p (x) : 문제 틀릴시 별 고정 
//				 * 문제 : *sp (0)
		String[] words = { "java", "mysql", "jsp", "spring" };

		// shuffle
		Random rn = new Random();

		for (int i = 0; i < 10; i += 1) {

			int num = rn.nextInt(words.length);
			String temp = words[0];

			words[0] = words[num];
			words[num] = temp;
			System.out.println(i + " " + num + Arrays.toString(words));
		}

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i += 1) {

			int rnStar = rn.nextInt(words[i].length());

			while (true) {
				System.out.print("문제 : ");

				for (int k = 0; k < words[i].length(); k += 1) {

					if (k == rnStar) {
						System.out.print("*");
					} else {
						System.out.print(words[i].charAt(k));
					}
				}
				System.out.println();
				System.out.print("입력 : ");

				String answer = sc.nextLine();

				if (answer.equals(words[i])) {
					break;
				}
			}
		}
		sc.close();
	}
}
