package _level4test;

import java.util.Arrays;

public class 문제12 {
	public static void main(String[] args) {
//		아래 배열에서 혼자있는 숫자를 제거한후 나머지값들만 출력해보자.

//	  	(예)
//			{1,2,3,2,1}  ==>  {1,2,2,1}    // 3이 혼자있음
//		    {1,3,4,4,2}  ==>  {4,4}        // 1,2,3 혼자있음
//		    {1,1,1,1,1}  ==>  {1,1,1,1,1}  // 없음
		int[] arr1 = { 1, 2, 3, 2, 1 };
		int[] arr2 = { 1, 3, 4, 4, 2 };
		int[] arr3 = { 1, 1, 1, 1, 1 };
		int[][] arr = {

				arr1,

				arr2,

				arr3 };

		for (int i = 0; i < arr.length; i += 1) {

			int[] copy = arr[i];

			for (int j = 0; j < arr[i].length; j += 1) {

				arr[i] = new int[copy.length - 1];

				System.out.println(copy.length);
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
