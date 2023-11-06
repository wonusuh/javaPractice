package _level4test;

import java.util.Arrays;

public class 문제10 {
	public static void main(String[] args) {
//		[문제]
//	     두 배열을 하나로 합치고 오름차순으로정렬하시오.	
//		 예) 1,2,3,5,7,8,9,10,12,15,19,20
		int[] arr1 = { 9, 10, 3, 2, 20, 19 };
		int[] arr2 = { 15, 12, 1, 5, 7, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i += 1) {
			arr3[i] = arr1[i];
			arr3[i + arr1.length] = arr2[i];
		}
		System.out.println(Arrays.toString(arr3));

		// 정렬
		for (int k = 0; k < arr3.length; k += 1) {

			int min = 21;
			int idx = -1;

			for (int i = k; i < arr3.length; i += 1) {

				if (arr3[i] < min) {
					min = arr3[i];
					idx = i;
				}
			}

			int temp = arr3[k];
			arr3[k] = arr3[idx];
			arr3[idx] = temp;
		}

		System.out.println(Arrays.toString(arr3));
	}
}
