package 배열심화_개념;

import java.util.Arrays;

public class _09이차원배열구조 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3, 4 };

		int[][] darr = new int[2][];

		darr[0] = arr;
		darr[1] = arr2;
		System.out.println(Arrays.deepToString(darr));

		int[][] array = {

				{ 1 },

				{ 1, 2 },

				{ 1, 2, 3 }

		};

		System.out.println(Arrays.deepToString(array));
	}
}
