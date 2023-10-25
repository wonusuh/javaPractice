package 배열2_문제;

import java.util.Arrays;

public class _07홀수순차저장 {
	public static void main(String[] args) {
//		문제
//			arr배열 값 중 홀수만 배열 c에 저장하시오
//			단, 위치는 뒤에서부터 저장하시오
//		정답
//			c = {0, 0, 17, 51, 49}
		int[] arr = { 10, 49, 51, 36, 17 };
		int[] c = new int[arr.length];

		int odd = c.length - 1;
		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] % 2 != 0) {
				c[odd] = arr[i];
				odd -= 1;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
