package 배열심화_문제3;

import java.util.Random;

public class _21경마 {

	public static void main(String[] args) {
//		말 다섯 마리가 20개의 트랙을 달린다.
//		매 회 랜덤으로 1~4칸의 거리를 이동할 수 있다.
//		다섯 말이 모두 도착하면 게임은 끝난다.
//		각 말들의 순위를 출력하시오.
//		단, 말이 동시에 도착하면 등수는 같다.
		int board = 20;
		int size = 5;
		int[][] game = new int[size][board];

		int total[] = new int[5]; // 말 이동 기록
		int rank[] = new int[5]; // 순위 기록

		int horse = 1;
		int cnt = 1;
		int finishCnt = 0;

		Random rn = new Random();
		while (true) {
			System.out.println("--------------------------------------------------------");

			// 종료조건
			if (finishCnt == 5) {
				break;
			}

			// 말 이동
			for (int i = 0; i < game.length; i += 1) {

				// 말 위치 검색
				int idx = -1;
				boolean check = false;

				for (int j = 0; j < game[i].length; j += 1) {

					if (game[i][j] != 0) {
						idx = j;
						check = true;
						break;
					}
				}

				// 말이 결승선에 도착했으면 컨티뉴
				if (total[i] != 0) {
					continue;
				}

				// 말위치에 + num;
				int num = rn.nextInt(4) + 1;

				if (check) {

					game[i][idx] = 0;
					int advanced = idx + num;

					if (advanced > game[i].length - 1) {
						total[i] = 1;
						finishCnt += 1;
						advanced = game[i].length - 1;
					}
					game[i][advanced] = horse;
				} else {
					// 말이 경기장 위에 없을 때
					game[i][num - 1] = horse;
				}
			}

			// 등수 매기기
			int temp = cnt; // 힌트

			for (int i = 0; i < total.length; i += 1) {

				if (total[i] != 0 && rank[i] == 0) {
					rank[i] = temp;
					cnt += 1;
				}
			}

			// 경기장 출력
			for (int i = 0; i < game.length; i += 1) {

				for (int j = 0; j < game[i].length; j += 1) {

					if (game[i][j] == 1) {
						System.out.print("말");
					} else {
						System.out.print("==");
					}
				}

				if (rank[i] != 0) {
					System.out.printf("(%d)", rank[i]);
				}
				System.out.println();
			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
