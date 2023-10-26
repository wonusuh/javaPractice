package 배열_개념;

import java.util.Arrays;
import java.util.Random;

public class _09즉석복권 {
	public static void main(String[] args) {
//		문제
//			즉석복권1
//			숫자 7이 연속으로 3번 등장하면, "당첨" 출력.
//			
//		1.생성
		int[] lotto = new int[7];
//		2. 1과 7만 저장
//		3. 당첨인지 꽝인지 출력
		// 심화 7이 나올 확률 40%로 하기
		Random rn = new Random();

		int cnt = 0;
		boolean lucky = false;
		for (int i = 0; i < lotto.length; i += 1) {
			while (true) {
				int num = rn.nextInt(2);
				if (num == 1 || num == 7) {
					lotto[i] = num;
					if (num == 1) {
						cnt = 0;
					} else if (num == 7) {
						cnt += 1;
					}
					if (cnt >= 3) {
						lucky = true;
					}
					break;
				}
			}
		}
		System.out.print(Arrays.toString(lotto));
		if (lucky) {
			System.out.println(" 당첨");
		} else {
			System.out.println(" 꽝");
		}
	}
}
