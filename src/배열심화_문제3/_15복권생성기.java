package 배열심화_문제3;

import java.util.Arrays;
import java.util.Random;

public class _15복권생성기 {

	public static void main(String[] args) {
//		복권 1개당 7칸으로, 총 5개의 복권을 제작하려한다.
//		복권 1줄은 1 또는 7의 랜덤 숫자로 구성돼있다.
//		7이 연속으로 3개 이상이면 당첨이고 그 미만은 꽝이다.
//		5개 중에 딱 1개만 당첨 복권이고 나머지 4개는 꽝인 복권을
//		랜덤으로 생성해서 출력하시오.

//		예)
//			1177117 꽝
//			1117771 당첨
//			7711771 꽝
//			7171717 꽝
		Random rn = new Random();
		int[][] lottoSet = new int[5][7];
		int seven = 0;

		while (true) {

			// 1과 7만 생성해서 넣기
			for (int i = 0; i < lottoSet.length; i += 1) {
				for (int j = 0; j < lottoSet[i].length; j += 1) {
					int num = rn.nextInt(2) + 0;
					if (num == 0) {
						num = 1;
					} else {
						num = 7;
					}
					lottoSet[i][j] = num;
				}
			}

			// 7이 몇 개 들었나 검사하기
			for (int i = 0; i < lottoSet.length; i += 1) {

				boolean threeSeven = false;
				int three = 0;

				for (int j = 0; j < lottoSet[i].length; j += 1) {

					if (lottoSet[i][j] == 7) {
						three += 1;
					} else {
						three = 0;
					}

					if (three >= 3) {
						threeSeven = true;
					}
				}

				if (threeSeven) {
					seven += 1;
				}
			}
			System.out.println("seven == " + seven);
			System.out.println(Arrays.deepToString(lottoSet));
			if (seven == 1) {
				break;
			} else {
				seven = 0;
			}
		}
	}
}
