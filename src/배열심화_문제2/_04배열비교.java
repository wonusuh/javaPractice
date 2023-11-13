package 배열심화_문제2;

import java.util.Arrays;

public class _04배열비교 {
	public static void main(String[] args) {
//		문제
//			arr배열과 result 배열을 비교해서 겹치는 값이 있므면 두 배열의 값을 전부 0으로 변경하시오.
//		단, 겹치는 값이 여러개 있으면 전부 0으로 변경하시오.
//		정답
//			arr{ {0 0 4}, {0 0 0}, {0 8 9} }
//		
//		result { 0 0 0 0 7}
		int[][] array = {

				{ 1, 3, 4 },

				{ 5, 6, 3 },

				{ 6, 8, 9 } };
		int[] result = { 1, 5, 6, 3, 7 };

		for (int i = 0; i < result.length; i += 1) {

			int val = result[i];

			for (int j = 0; j < array.length; j += 1) {

				for (int k = 0; k < array[j].length; k += 1) {

					if (val == array[j][k]) {
						result[i] = 0;
						array[j][k] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(array));
		System.out.println(Arrays.toString(result));
	}
}
