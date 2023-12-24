package 배열_개념;

import java.util.Arrays;

public class _05쉽게출력하기 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
		System.out.println("==========");

		String arrays = "[";
		for (int i = 0; i < arr.length; i += 1) {
			if (i == arr.length - 1) {
				arrays += arr[i] + "]";
			} else {
				arrays += arr[i] + ", ";
			}
		}
		System.out.println(arrays);
	}
}
