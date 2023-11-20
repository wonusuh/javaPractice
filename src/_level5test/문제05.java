package _level5test;

import java.util.Arrays;
import java.util.Random;

public class 문제05 {

	public static void main(String[] args) {
//		복권 1개 당 7칸으로, 총 5개의 복권을 제작하려 한다.
//		복권 1줄은 1 또는 7의 랜덤 숫자로 구성되어 있다.
//		7이 연속으로 3개이상이면 "당첨"이고, 그 미만은 "꽝" 이다.
//		5개 중에 딱 1개만 당첨 복권이고 나머지 4개는 꽝인 복권을
//		랜덤으로 생성해서 출력하시오.
//		
//		예)
//			1177117 (꽝)
//			1117771 (당첨)
//			7171117 (꽝)
//			7711771 (꽝)
//			7171717 (꽝)

		int[][] lottoSet = new int[5][7];
		Random rn = new Random();

		while (true) {

			int seven = 0; // 7이 연속으로 3번 나온 횟수

			for (int i = 0; i < lottoSet.length; i += 1) {

				for (int j = 0; j < lottoSet[i].length; j += 1) {

					// 1과 7만 생성하기
					int num = rn.nextInt(1 - 0 + 1) + 0;

					if (num == 0) {
						num = 1;
					} else {
						num = 7;
					}
					lottoSet[i][j] = num;
				}
			}

			// 검사하기
			int three = 0;

			for (int i = 0; i < lottoSet.length; i += 1) {

				boolean check = false;

				for (int j = 0; j < lottoSet[i].length; j += 1) {

					if (lottoSet[i][j] == 7) {
						three += 1;
					} else {
						three = 0;
					}

					if (three >= 3) {
						check = true;
					}

				}

				if (check) {
					seven += 1;
				}
			}

			// 출력
			System.out.println(Arrays.deepToString(lottoSet));

			// 연속으로 7이3번 나온 복권의 개수가 1일 때만 종료
			System.out.println(seven);
			if (seven == 1) {
				break;
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
