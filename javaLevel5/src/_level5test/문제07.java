package _level5test;

import java.util.Arrays;
import java.util.Random;

public class 문제07 {

	public static void main(String[] args) {
//		말 다섯 마리가 20개의 트랙을 달린다.
//		매 회 랜덤으로 1~4칸의 거리를 이동할 수 있다.
//		다섯 말이 모두 도착하면 게임은 끝난다.
//		각 말들의 순위를 출력하시오.
//		단, 말이 동시에 도착하면 등수는 같다.

		Random rn = new Random();
		int[][] horse = new int[5][20];
		int[] rank = new int[5];
		int[] recording = new int[5];
		int cnt = 1;
		int rankedCnt = 0;

		while (true) {

			// 말의 위치 기록하기
			for (int i = 0; i < horse.length; i += 1) {
				horse[i][recording[i]] = 1;
			}

			// 경기장 출력
			for (int i = 0; i < horse.length; i += 1) {

				for (int j = 0; j < horse[i].length; j += 1) {

					if (horse[i][j] == 1) {
						System.out.print("말");
					} else {
						System.out.print("==");
					}
				}
				if (rank[i] != 0) {
					System.out.printf("(%d위)", rank[i]);
				}
				System.out.println();
			}
			System.out.println("recording[] == " + Arrays.toString(recording));
			System.out.println("rank[]    ==   " + Arrays.toString(rank));

			// 종료 조건
			if (rankedCnt == 5) {
				break;
			}

			// 말 이동
			int temp = cnt;

			for (int i = 0; i < horse.length; i += 1) {

				if (recording[i] == horse[i].length - 1) {
					continue;
				}

				horse[i][recording[i]] = 0;

				int num = rn.nextInt(4 - 1 + 1) + 1;
				recording[i] += num;

				if (recording[i] >= horse[i].length - 1) {
					recording[i] = horse[i].length - 1;
					rank[i] = temp;
					cnt += 1;
					rankedCnt += 1;
				}
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
