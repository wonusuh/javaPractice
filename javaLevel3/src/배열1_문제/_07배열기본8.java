package 배열1_문제;

import java.util.Random;

public class _07배열기본8 {
	public static void main(String[] args) {
		Random rn = new Random();
		int[] arr = new int[4];

		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = rn.nextInt(100 - (-100) + 1) + (-100);

			if (arr[i] % 2 != 0) {
				System.out.print(cnt == 0 ? arr[i] : " + " + arr[i]);
				cnt += 1;
				sum += arr[i];
			}
		}
		if (cnt > 1) {
			System.out.println(" == " + sum);
		}
	}
}
