package 배열심화_문제2;

import java.util.Arrays;

public class _19압축하기 {
	public static void main(String[] args) {
//		after배열의 0번은 압축할 값, 1번은 연속된 수의 개수이다
//		압축하시오.
		int[] before = { 3, 3, 5, 5, 5, 5, 5, 3, 4, 4, 4 };
		int[][] after = new int[4][2];
		int idx = 0;

		after[0][0] = before[0];
		after[0][1] = 1;

		for (int i = 1; i < before.length; i += 1) {

			if (i != before.length - 1) {
				after[idx][0] = before[i];
				after[idx][1] += 1;

				if (before[i + 1] != before[i]) {
					idx += 1;
				}
			} else {
				after[idx][0] = before[i];
				after[idx][1] += 1;
			}
			System.out.println(Arrays.deepToString(after));
		}
	}
}
