package 배열2_문제;

import java.util.Arrays;

public class _20한줄에저장 {
	public static void main(String[] args) {
//		문제
//			arr1 배열과 arr2배열을 서로 붙여서 temp배열에 저장하시오
//		정답
//			temp = {2, 65, 34, 76, 8, 5, 6, 54, 1, 4};
		int arr1[] = { 2, 65, 34, 76, 8, 5 };
		int arr2[] = { 6, 54, 1, 4 };

		// 초기에 배열의 길이를 모를때 배열의 초기값은 null로 사용한다
		int temp[] = null;

		temp = new int[arr1.length + arr2.length];

		int idx = 0;

		for (int i = 0; i < temp.length; i += 1) {
			if (i == arr1.length) {
				idx = 0;
			}
			if (i < arr1.length) {
				temp[i] = arr1[idx];
			} else {
				temp[i] = arr2[idx];
			}
			idx += 1;
		}
		System.out.println(Arrays.toString(temp));
	}
}
