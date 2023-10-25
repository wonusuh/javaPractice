package 배열_개념;

import java.util.Arrays;
import java.util.Random;

public class _07중복숫자금지1 {
	public static void main(String[] args) {
		// 랜덤으로 숫자의 중복없이 배열에 저장하는 방법 3가지

		// [방법 1] 셔플
		Random rn = new Random();

		int[] arr = new int[4]; // 1 2 3 4
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < 50; i += 1) {
			int idx = rn.nextInt(4 - 0 + 1) + 0; // 0 1 2 3

			int temp = arr[0];
			arr[0] = arr[idx];
			arr[idx] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
