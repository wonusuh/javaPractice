package 배열심화_문제;

import java.util.Arrays;

public class _09압축 {
	public static void main(String[] args) {
//		문제
//			arr 배열에 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서
//			b 배열에 저장하시오
//		정답
//			b = {1, 3, 2, 3, 4, 5};
		// 같지 않으면 배열 b 에 저장
		int[] arr = { 1, 1, 1, 3, 3, 3, 3, 2, 2, 3, 3, 3, 4, 5 };
		int[] b = new int[arr.length];
		int idx = 0;

		for (int i = 0; i < arr.length; i += 1) {
			if (i == 0) {
				b[0] = arr[0];
			}
			if (b[idx] != arr[i]) {
				idx += 1;
				b[idx] = arr[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
