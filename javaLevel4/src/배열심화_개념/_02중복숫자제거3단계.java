package 배열심화_개념;

import java.util.Arrays;
import java.util.Random;

public class _02중복숫자제거3단계 {
	public static void main(String[] args) {
//		중복숫자 금지 3단계
//		1. arr배열에 1~10사이의 랜덤 숫자 5개를 저장한다
//		2. 단 중복되는 숫자가 없어야한다
//		3. 이차원반복문 사용하기
		Random rn = new Random();

		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = rn.nextInt(5 - 1 + 1) + 1;

			int idx = -1;

			for (int k = 0; k < i; k += 1) {

				if (arr[i] == arr[k]) {
					idx = k;
				}

				if (idx != -1) {
					i -= 1;
				}

				System.out.printf("i%d k%d ", i, k);
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
