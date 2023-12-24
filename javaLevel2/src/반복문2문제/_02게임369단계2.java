package 반복문2문제;

import java.util.Random;

public class _02게임369단계2 {
	public static void main(String[] args) {
//		1. 1~50까지 반복을 한다

		Random rn = new Random();

		int i = 1;

		while (i <= 50) {
			int rnNum = rn.nextInt(50 - 1 + 1) + 1;
			int ten = rnNum % 100 / 10;
			int one = rnNum % 10;

			System.out.print(i + ") ");

			System.out.print("rnNum : " + rnNum);
			if (rnNum < 10) {
				if (one == 3 || one == 6 || one == 9) {
					System.out.print(" 짝 ");
				} else {
					System.out.print("");
				}
			}

			if (rnNum >= 10) {
				if ((ten % 3 == 0) && (one % 3 == 0)) {
					System.out.print(" 짝짝 ");
				} else if ((ten % 3 == 0) || (one % 3 == 0)) {
					System.out.print(" 짝 ");
				} else
					System.out.print("");
			}
			System.out.println();
			i += 1;
		}
	}
}
