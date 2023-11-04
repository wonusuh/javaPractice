package 배열심화_개념;

import java.util.Arrays;

public class _01정렬_암기 {
	public static void main(String[] args) {
		int[] score = { 10, 50, 30, 40, 80, 19 };
		// 내림차순 80, 50, 40, 30, 19, 10
		for (int k = 0; k < score.length; k += 1) {

			int max = score[k];
			int maxIdx = k;
			for (int i = k; i < score.length; i += 1) {
				if (max < score[i]) {
					max = score[i];
					maxIdx = i;
				}
			}

			int temp = score[k];
			score[k] = score[maxIdx];
			score[maxIdx] = temp;

			System.out.println(Arrays.toString(score));
		}
	}
}
