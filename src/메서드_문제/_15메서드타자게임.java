package 메서드_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class WordGame {
	Random rn = new Random();
	String[] wordList = { "java", "spring", "jsp", "android", "php" }, myInputs;
	boolean[] checkList;
	int count, size = wordList.length;
	Scanner sc = new Scanner(System.in);

	void shuffle() {
		for (int i = 0; i < 100; i += 1) {
			int num = rn.nextInt(4 - 0 + 1) + 0;
			String temp = wordList[0];
			wordList[0] = wordList[num];
			wordList[num] = temp;
		}
		System.out.println("wordList : " + Arrays.toString(wordList));
	}

	void showQuestions() {
		myInputs = new String[5];
		checkList = new boolean[5];
		for (int i = 0; i < wordList.length; i += 1) {
			int star = rn.nextInt((wordList[i].length() - 1) - 0 + 1) + 0;
			System.out.printf("%d) ", i + 1);
			for (int j = 0; j < wordList[i].length(); j += 1) {
				if (j != star) {
					System.out.print(wordList[i].charAt(j));
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" 의 단어를 맞춰보세요. >> ");
			String answer = sc.next();
			sc.nextLine();
			myInputs[i] = answer;
			if (answer.equals(wordList[i])) {
				count += 1;
				checkList[i] = true;
			}
		}
	}

	void showWordList() {
		System.out.println(Arrays.toString(this.wordList));
	}

	void showMyAnswer() {
		System.out.println(Arrays.toString(this.myInputs));
	}

	void showTrueOrFalse() {
		System.out.println(Arrays.toString(this.checkList));
	}

	void run() {
		while (true) {
			while (true) {
				System.out.println("타자연습게임");
				System.out.println("1)게임 0)종료");
				System.out.print("메뉴 선택 >> ");
				int sel = sc.nextInt();
				if (sel == 0) {
					return;
				} else if (sel == 1) {
					break;
				}
			}
			shuffle();
			showQuestions();
			System.out.println("--------------------");
			System.out.print("정답");
			showWordList();
			System.out.print("내답");
			showMyAnswer();
			System.out.print("정오표");
			showTrueOrFalse();
			System.out.println("--------------------");
			System.out.println("[Game Over]");
		}
	}
}

public class _15메서드타자게임 {
	public static void main(String[] args) {
		WordGame wordGame = new WordGame();
		wordGame.run();
		wordGame.sc.close();
	}
}
