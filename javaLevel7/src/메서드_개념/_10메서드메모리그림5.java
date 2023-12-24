package 메서드_개념;

import java.util.Arrays;

class Ex05 {

	int[] type04(int[] arr) {

		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i += 1) {
			newArr[i] = arr[i] * 100;
		}
		return newArr;
	}
}

public class _10메서드메모리그림5 {

	public static void main(String[] args) {

		Ex05 e = new Ex05();
		int[] arr = { 10, 20, 30 };
		int[] newArr = e.type04(arr);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
}
