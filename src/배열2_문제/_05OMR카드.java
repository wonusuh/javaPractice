package 배열2_문제;

import java.util.Arrays;
import java.util.Random;

public class _05OMR카드 {
	public static void main(String[] args) {
//		문제
//			1. test배열은 시험문제의 정답지이다
//			2. student배열에 1~5점 사이의 랜덤숫자 5개를 저장한다
//			3. 각 자리수를 비교해서 점수를 result 배열에 기록한다.
//				(맞으면 true 틀리면 false 를 저장)
//			4. 점수는 한 문제당 20점이다.
//			5. 성적도 함께 출력한다.
//			
//				예)
//					test =    {1, 3, 4, 2, 5}
//					student = {1, 1, 4, 4, 3}
//					result = {true, false, true, false, false}
//					성적 = 40점;
		Random rn = new Random();
		int[] test = { 1, 3, 4, 2, 5 };
		int[] student = new int[5];
		boolean[] result = new boolean[5];
		int score = 0;

		for (int i = 0; i < test.length; i += 1) {
			student[i] = rn.nextInt(5 - 1 + 1) + 1;
			if (test[i] == student[i]) {
				result[i] = true;
				score += 20;
			}
		}
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(result));
		System.out.println(score + "점");
	}
}
