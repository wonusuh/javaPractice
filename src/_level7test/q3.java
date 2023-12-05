package _level7test;

import java.util.Random;
import java.util.Scanner;

class Word {

	String word;
	int ranPos;
}

class WordDAO {

	Word[] list;
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);

	void init() {

		String[] simple = { "java", "jsp", "python", "android", "spring" };
		list = new Word[simple.length];

		for (int i = 0; i < simple.length; i += 1) {

			Word w = new Word();

			w.word = simple[i];
			w.ranPos = ran.nextInt((w.word.length() - 1) - 0 + 1) + 0;
			list[i] = w;
		}
	}

	void shuffle() {

		for (int i = 0; i < 1000; i += 1) {

			int num = ran.nextInt((list.length - 1) - 0 + 1) + 0;
			Word temp = list[0];

			list[0] = list[num];
			list[num] = temp;
		}
	}

	void printWithAStar(int idx) {

		for (int i = 0; i < list[idx].word.length(); i += 1) {

			if (i == list[idx].ranPos) {
				System.out.print("*");
			} else {
				System.out.print(list[idx].word.charAt(i));
			}
		}
	}

	void run() {
		init();// 객체들 생성해서 배열에 넣기
		shuffle();// 배열 섞기

		int correct = 0;// 맞춘 갯수겸 list의 방번호

		while (true) {
			printWithAStar(correct);

			System.out.println(" 를 맞추세요. >> ");
			String answer = sc.next();
			sc.nextLine();

			if (!answer.equals(list[correct].word)) {
				System.err.println("오답 입니다.");
				continue;
			} else {
				System.out.println("정답 입니다.");
			}
			correct++;

			if (correct == list.length) {
				System.out.println("게임 종료");
				return;
			}
		}
	}
}

public class q3 {

	public static void main(String[] args) {

		WordDAO dao = new WordDAO();

		dao.run();
	}
}
