package 배열1_문제;

import java.util.Arrays;

public class _20교차저장1 {
	public static void main(String[] args) {
//		문제
//			배열 a의 값과 b의 값을 번갈아가면서
//			c에 저장한다
//		정답
//			c = {10, 40, 20, 50, 30, 60}
		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60 };
		int[] c = { 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < c.length; i += 1) {
			if (i % 2 == 0) {
				c[i] = a[i / 2];
			} else {
				c[i] = b[i / 2];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
