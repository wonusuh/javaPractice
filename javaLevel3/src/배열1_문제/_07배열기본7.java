package 배열1_문제;

import java.util.Random;

public class _07배열기본7 {
	public static void main(String[] args) {
//		문제
//			아래 배열에서 랜덤 값 -100 ~100을 4개 저장 후
//			그 값 중 홀수만 출력하시오
//			예)
//				int[] arr = {-11, 4, 73, -2};
//				결과 : -11, 73
		Random rn = new Random();
		int[] arr = new int[4];
		int cnt = 0;
		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = rn.nextInt(100 - (-100) + 1) + (-100);
			if (arr[i] % 2 != 0) {
				System.out.print(cnt == 0 ? arr[i] : ", " + arr[i]);
				cnt += 1;
			}
		}
	}
}
