package 문자열기본_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _14영단어_복습1 {
	public static void main(String[] args) {
//		문제
//		처음 영어단어는 전부 *로 표시되어 출력된다
//		영어단어를 입력받아 틀릴 때 마다 랜덤으로 한 글자씩 벗겨진다.
//		단, 점수는 5점씩 감점된다
//		또한 같은 철자가 여러개이면 한 번에 벗겨진다
//		전부 벗겨지거나 영어단어를 맞추면 게임이 종료된다.
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		String word = "performance";
		String meaning = "공연";

		int size = word.length();
		boolean[] check = new boolean[size];
		int score = 100;
		int cnt = size;

		System.out.println(meaning);

		while (true) {

			int star = rn.nextInt(size);
			if (check[star] == true) {
				continue;
			}
			System.out.println(Arrays.toString(check));

			for (int i = 0; i < size; i += 1) {
				if (check[i] == false) {
					System.out.print("*");
				} else {
					System.out.print(word.charAt(i));
				}
			}

			System.out.print(" 단어를 맞추세요 >>");

			String answer = sc.nextLine();

			if (answer.equals(word)) {
				break;
			}

			for (int i = 0; i < size; i += 1) {
				if (word.charAt(i) == word.charAt(star)) {
					cnt -= 1;
					check[i] = true;
				}
			}

			if (cnt == 0) {
				break;
			}
			score -= 5;
		}
		System.out.println(score + "점");
		sc.close();
	}
}
