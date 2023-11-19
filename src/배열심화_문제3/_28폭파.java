package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _28폭파 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 5;
		int bomb = 9;
		int wall = 4;
		int road = 0;
		int[][] map = {

				{ 0, 0, 0, 0, 9 },

				{ 0, 0, 4, 4, 0 },

				{ 0, 9, 9, 9, 0 },

				{ 4, 0, 0, 0, 0 },

				{ 9, 0, 0, 0, 0 } };
		int cnt = 5; // 설치된 폭탄 개수
		int bombs[][] = new int[cnt][2]; // {y, x} 설치 순서대로 누적됨

		bombs[0][0] = 2;
		bombs[0][1] = 2;

		bombs[1][0] = 0;
		bombs[1][1] = 4;

		bombs[2][0] = 4;
		bombs[2][1] = 0;

		bombs[3][0] = 2;
		bombs[3][1] = 3;

		bombs[4][0] = 2;
		bombs[4][1] = 1;

		while (true) {
			System.out.println("bombs[][] == " + Arrays.deepToString(bombs));

			// 출력
			for (int i = 0; i < size; i += 1) {

				for (int j = 0; j < size; j += 1) {

					if (map[i][j] == bomb) {
						System.out.print(String.format("%-3s", "◐"));
					} else if (map[i][j] == wall) {
						System.out.print(String.format("%-3s", "■"));
					} else if (map[i][j] == road) {
						System.out.print(String.format("%-3s", "+"));
					}
				}
				System.out.println();
			}

			System.out.print("폭파(6)");
			int input = sc.nextInt();

			if (input == 6) {
				// 폭파

				int y = bombs[0][0];
				int x = bombs[0][1];

				bombs[0] = null;

				for (int i = 1; i < bombs.length; i += 1) {

					if (y - 1 < 0) {
						y = 0;
					}

					if (x - 1 < 0) {
						x = 0;
					}

					if (y + 1 > size - 1) {
						y = size - 1;
					}

					if (x + 1 > size - 1) {
						x = size - 1;
					}

					if (bombs[i][0] == y && bombs[i][1] == x) {
						System.out.print(bombs[i]);
					}
				}
			} else if (input == -1) {
				break;
			}
		}
		sc.close();
	}
}
