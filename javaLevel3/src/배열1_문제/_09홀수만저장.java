package 배열1_문제;

import java.util.Random;

public class _09홀수만저장 {
	public static void main(String[] args) {
//		문제
//			아래 배열에 랜덤값 -100~100 4개를 저장한 후
//			그 값 중 홀수만 temp에 저장 후 arr와 temp 배열을 출력하시오.
//			
//			예)
//				arr = {20, 40, -11, 36}
//				temp1 = {0, 43, -11, 0}
//				temp2 = {43, -11, 0, 0}
		Random rn = new Random();
		int[] arr = new int[4];
		int[] temp1 = new int[4];
		int[] temp2 = new int[4];

		int cnt = 0;

		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = rn.nextInt(100 - (-100) + 1) + (-100);
			System.out.print(arr[i] + " ");
			if (arr[i] % 2 != 0) {
				temp1[i] = arr[i];
				temp2[cnt] = arr[i];
				cnt += 1;
			}
		}

		System.out.println();

		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(temp1[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(temp2[i] + " ");
		}
	}
}
