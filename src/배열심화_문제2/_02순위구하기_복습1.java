package 배열심화_문제2;

import java.util.Arrays;

public class _02순위구하기_복습1 {
	public static void main(String[] args) {
		// 각 학번의 석차를 출력하시오
		// rank = [1 2 4 2 5]
//		String nums[] = { "1001", "1002", "1003", "1004", "1005" };
		int[] score = { 100, 54, 21, 54, 10 };
		int[] rank = new int[score.length]; // 0 0 0 0 0

		for (int i = 0; i < rank.length; i += 1) {
			rank[i] = 1;

			for (int j = 0; j < score.length; j += 1) {

				if (i != j && score[j] > score[i]) {
					rank[i] += 1;
				}
				System.out.println("i" + i + " " + "j" + j + " " + Arrays.toString(rank));
			}
		}
	}
}
