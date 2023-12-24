package 배열심화_문제2;

import java.util.Arrays;

public class _03배열비교1 {
	public static void main(String[] args) {
//		문제 arr, b, c 배열에 공통적으로 존재하는 값을 result배열에 순차적으로 저장하시오.
//		정답 result = {40, 50, 0, 0}
		int[][] arr = {

				{ 10, 20, 30 },

				{ 40, 50, 60 },

				{ 70, 80, 90 } };
		int[] b = { 23, 40, 30, 50 };
		int[] c = { 4, 34, 40, 50 };

		int[] result = new int[4];

		int idx = 0;

		for (int i = 0; i < arr.length; i += 1) {
			for (int k = 0; k < arr[i].length; k += 1) {
				int val = arr[i][k];

				boolean check1 = false;
				boolean check2 = false;

				for (int j = 0; j < b.length; j += 1) {
					if (val == b[j]) {
						check1 = true;
					}
					if (val == c[j]) {
						check2 = true;
					}
				}

				if (check1 && check2) {
					result[idx] = val;
					idx += 1;
				}

			}
		}

		System.out.println(Arrays.toString(result));
	}
}
