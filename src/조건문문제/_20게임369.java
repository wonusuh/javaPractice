package 조건문문제;

import java.util.Random;

public class _20게임369 {
	public static void main(String[] args) {
//		369게임
//		1. 1~50 사이의 램덤숫자를 저장한다
//		2. 위 수에 369의 개수가
//			1) 2개이면, 짝짝을 출력
//			2) 1개이면, 짝을 출력
//			3) 0개이면, 해당 숫자를 출력
//			예)
//				33 : 짝짝
//				16 : 짝
//				7 : 7
//				36 : 짝짝
//				23 : 짝
//				21 : 21
		Random rn = new Random();
		int rnNum = rn.nextInt(50 - 1 + 1) + 1;
		System.out.println("rnNum : " + rnNum);

		int ten = rnNum % 100 / 10;
		int one = rnNum % 10;

		if (rnNum < 10) {
			if (one == 3 || one == 6 || one == 9) {
				System.out.println("짝");
			} else {
				System.out.println(rnNum);
			}
		}

		if (rnNum >= 10) {
			if ((ten == 3 || ten == 6 || ten == 9) && (one == 3 || one == 6 || one == 9)) {
				System.out.println("짝짝");
			} else if ((ten == 3 || ten == 6 || ten == 9) || (one == 3 || one == 6 || one == 9)) {
				System.out.println("짝");
			} else
				System.out.println(rnNum);
		}
	}
}
