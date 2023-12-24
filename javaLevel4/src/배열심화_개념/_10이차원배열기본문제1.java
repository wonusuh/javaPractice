package 배열심화_개념;

import java.util.Arrays;

public class _10이차원배열기본문제1 {
	public static void main(String[] args) {
//		int[][] arr = {
//
//				{ 10, 20, 30 },
//
//				{ 10, 20, 30, 40, 50 },
//
//				{ 10, 20, 30, 40 },
//
//		};
		// 위와같은 각열의 크기가 다른 2차원배열을 반복문으로 만들기
		int row = 3;
		int[][] test = new int[row][];
		int[] list = { 3, 5, 4 }; // 각각 배열의 길이

		for (int i = 0; i < test.length; i += 1) {
			test[i] = new int[list[i]];

			for (int k = 0; k < list[i]; k += 1) {
				test[i][k] = (k + 1) * 10;
				System.out.println(Arrays.deepToString(test));
			}
		}
	}
}
