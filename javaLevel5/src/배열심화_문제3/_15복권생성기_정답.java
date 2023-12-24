package 배열심화_문제3;

import java.util.Random;

public class _15복권생성기_정답 {

	public static void main(String[] args) {
		int[][] lottoSet = new int[5][7];

		Random rd = new Random();
		int size = lottoSet[0].length;
		boolean check = false; // 당첨이 한개인지 체크

		for (int k = 0; k < lottoSet.length; k += 1) {
			boolean win = false;
			int cnt = 0;
			for (int i = 0; i < size; i += 1) {
				lottoSet[k][i] = rd.nextInt(2);
				lottoSet[k][i] = lottoSet[k][i] == 0 ? 7 : 1;
				// System.out.print(lottoSet[k][i]+" ");

				if (lottoSet[k][i] == 7) {
					cnt += 1;
					if (cnt == 3) {
						win = true;
						// break;
					}
				} else {
					cnt = 0;
				}
			}

			// 당첨인데 또 당첨일 경우
			if (win && check) {
				k -= 1;
			} else if (k == lottoSet.length - 1 && !win && !check) { // 전부 꽝일경우
				k -= 1;
			} else if (win && !check) { // 당첨이 아직 안나왔고 당첨이 된 경우
				check = true;
				System.out.println("당첨 복권 = " + (k + 1) + "번째!! ");
			}

		}

		for (int[] lotto : lottoSet) {
			for (int num : lotto) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}
}
