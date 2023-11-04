package 배열심화_문제;

import java.util.Arrays;

public class _05배열비교 {
	public static void main(String[] args) {
//		문제
//			arr과 b배열의 값이 서로 겹치면,
//			각 배열의 겹치는 값을 모두 0으로 변경하시오.
//		정답
//			arr = {0, 0, 30, 40}
//			b = {0, 3, 0, 50}
		int[] arr = { 10, 20, 30, 40 };
		int[] b = { 10, 3, 20, 50 };

		for (int i = 0; i < arr.length; i += 1) {

			int idx = -1;

			for (int k = i; k < b.length; k += 1) {
				if (arr[i] == b[k]) {
					b[k] = 0;
					idx = i;
				}
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(b));
			}
			if (idx != -1) {
				arr[idx] = 0;
			}
		}
	}
}
