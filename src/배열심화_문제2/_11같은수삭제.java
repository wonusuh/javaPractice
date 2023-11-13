package 배열심화_문제2;

import java.util.Arrays;

public class _11같은수삭제 {
	public static void main(String[] args) {
//		문제
//			1. input 의 데이터를 a배열에 순차적으로 저장한다.
//			2. 단, 저장하려는 숫자가 현재 숫자와 같으면 둘 다 삭제한다.
//			
//			a = {1, 3, 0, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 2, 1, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 2, 4, 0, 0, 0, 0, 0, 0, 0}
//			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
//		정답
//			a = {1, 2, 0, 0, 0, 0, 0, 0, 0, 0}
		int[] input = { 1, 3, 3, 2, 1, 1, 4, 4 };
		int[] a = new int[input.length]; // { 1,0, 0, 0, 0, 0, 0, 0 };
		int idx = 0;
		a[idx] = input[0];

		for (int i = 1; i < input.length; i += 1) {

			if (a[idx] == input[i]) {
				a[idx] = 0;
				idx -= 1;

				if (idx < 0) {
					idx = 0;
				}
			} else {
				idx = a[idx] == 0 ? 0 : idx + 1;
				a[idx] = input[i];
			}

			System.out.println(Arrays.toString(a));
		}
	}
}
