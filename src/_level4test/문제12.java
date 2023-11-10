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
			// 가변배율 사용해보기
			// 배열을 어디서 초기화 해야하나?
			int[] copy = arr[i];

			for (int j = 0; j < arr[i].length; j += 1) {

				for (int k = 0; k < arr[i].length; k += 1) {

					// 자신을 제외하고 같은 수가 있는 경우에만 배열에 복사하기
					if (j != k) {

						if (arr[i][j] == arr[i][k]) {
							System.out.print(arr[i][k] + " ");
							break;
						}
					}
				}
			}
			System.out.println();
		}
		System.out.print(Arrays.deepToString(arr));
	}
}
