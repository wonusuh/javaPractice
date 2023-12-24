package 배열1_문제;

import java.util.Arrays;

public class _18거꾸로저장 {
	public static void main(String[] args) {
//		문제
//			a배열의 값을 b배열에 하나씩 저장하는데
//			순서를 거꾸로 저장하시오
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < a.length; i += 1) {
			b[(b.length - 1) - i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}
}
