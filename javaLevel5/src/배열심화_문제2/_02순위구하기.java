package 배열심화_문제2;

import java.util.Arrays;

public class _02순위구하기 {
	public static void main(String[] args) {
// 각 학번의 석차를 출력하시오
// rank = [1 2 4 2 5]
		String nums[] = { "1001", "1002", "1003", "1004", "1005" };
		int[] score = { 100, 54, 21, 54, 10 };

		int[] rank = new int[score.length]; // 0 0 0 0 0

		for (int i = 0; i < score.length; i += 1) {
			rank[i] = 1;
			for (int k = 0; k < score.length; k += 1) {
				if (i != k && score[i] < score[k]) {
					rank[i] += 1;
				}
			}
		}

		System.out.println(Arrays.toString(rank));

		String result = "";
		for (int i = 0; i < score.length; i += 1) {
			result += String.format("%s(%3d점) %d등 %n", nums[i], score[i], rank[i]);
		}

		System.out.println(result);
	}
}
