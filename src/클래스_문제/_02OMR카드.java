package 클래스_문제;

import java.util.Arrays;
import java.util.Random;

class OMR {
	int[] answer = { 1, 2, 3, 4, 5 };
	int[] hgd = new int[5];
	int cnt = 0;
	int score = 0;
}

//문제
//1. 배열answer는 시험문제의 정답지이다.
//2. 배열 hgd에 1~5사이의 랜덤숫자 5개를 저장한다.
//3. answer와 hgd값을 비교해 정오표를 출력한다.
//4. 한 문제당 20점이다.
public class _02OMR카드 {

	public static void main(String[] args) {

		OMR card = new OMR();
		Random rn = new Random();

		// 값 넣기
		for (int i = 0; i < card.hgd.length; i += 1) {
			card.hgd[i] = rn.nextInt(5 - 1 + 1) + 1;
		}

		// 채점하기
		for (int i = 0; i < card.hgd.length; i += 1) {

			if (card.hgd[i] == card.answer[i]) {
				card.cnt += 1;
				card.score += 20;
			}
		}
		System.out.println("answer = " + Arrays.toString(card.answer));
		System.out.println("hgd = " + Arrays.toString(card.hgd));
		System.out.println("성적 = " + card.score);
	}
}
