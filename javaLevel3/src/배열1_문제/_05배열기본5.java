package 배열1_문제;

import java.util.Random;

public class _05배열기본5 {
	public static void main(String[] args) {
//		문제
//			array배열에 -100~100 사이의 랜덤값 5개를 저장 후,
//			모든 값을 출력하시오.
		Random rn = new Random();
		int[] array = new int[5];
		int cnt = 0;
		for (int i = 0; i < array.length; i += 1) {
			cnt += 1;
			array[i] = rn.nextInt(100 - (-100) + 1) + (-100);
			System.out.print(cnt == 1 ? array[i] : ", " + array[i]);
		}
	}
}
