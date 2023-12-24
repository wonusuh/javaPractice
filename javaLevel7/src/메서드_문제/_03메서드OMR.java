package 메서드_문제;

import java.util.Arrays;
import java.util.Random;

class ScoreMng {

	Random rn = new Random();
	int[] answer = { 1, 3, 4, 2, 5 };
	int[] my = new int[5];

	void makeAnswer() {

		for (int i = 0; i < this.my.length; i += 1) {
			this.my[i] = this.rn.nextInt(5 - 1 + 1) + 1;
		}
	}

	void showAnswer() {
		System.out.println("my : " + Arrays.toString(this.my));
	}

	void checkAnswer() {
		System.out.print("answer : " + Arrays.toString(this.answer));

		int score = 0;

		for (int i = 0; i < this.my.length; i += 1) {

			if (this.my[i] == this.answer[i]) {
				score += 20;
			}
		}
		System.out.println(score + "점");
	}
}

public class _03메서드OMR {

	public static void main(String[] args) {

		ScoreMng sm = new ScoreMng();

		sm.makeAnswer(); // 내 답안 랜덤으로 작성
		sm.showAnswer(); // 내 답안 출력
		sm.checkAnswer(); // 정답 비교 점수 출력
	}
}
