package 배열1_문제;

import java.util.Arrays;

public class _21교차저장2 {
	public static void main(String[] args) {
//		문제
//			배열 d의 값을 번갈아가면서 배열 e, f에 각각 저장하시오.
//		정답
//		e = {10, 30, 50}
//		f = {20, 40, 60}

		int[] d = { 10, 20, 30, 40, 50, 60 };
		int[] e = { 0, 0, 0 };
		int[] f = { 0, 0, 0 };

		int idx = 0;

		for (int i = 0; i < d.length; i += 1) {
			if (i % 2 == 0) {
				e[idx] = d[i];
			} else {
				f[idx] = d[i];
				idx += 1;
			}
		}
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}
}
