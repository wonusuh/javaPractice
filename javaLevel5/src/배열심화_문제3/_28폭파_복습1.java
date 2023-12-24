package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _28폭파_복습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 5;
		int bomb = 9;
		int wall = 4;
		int road = 0;
		int map[][] = {

				{ 0, 0, 0, 0, 9 },

				{ 0, 0, 4, 4, 0 },

				{ 0, 9, 9, 9, 0 },

				{ 4, 0, 0, 0, 0 },

				{ 9, 0, 0, 0, 0 } };
		int cnt = 5; // 설치된 폭탄 개수
		int bombs[][] = new int[cnt][2]; // {y,x} 설치순서대로 누적됨
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

			// 출력
			for (int i = 0; i < map.length; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {

					if (map[i][j] == bomb) {
						System.out.print("@  ");
					} else if (map[i][j] == wall) {
						System.out.print("■  ");
					} else {
						System.out.print("+  ");
					}
				}
				System.out.println();
			}
			System.out.println("bombs[][] : " + Arrays.deepToString(bombs));

			System.out.print("폭파(6)");
			int dir = sc.nextInt();

			if (dir != 6) {
				break;
			}

			// 폭파 버튼을 눌렀다는건 폭파할 폭탄이 있다는 뜻
			int bombCnt = 1;
			boolean check = false; // 근처에 폭탄이 있는지 없는지

			while (bombCnt > 0) {

				int y = bombs[0][0];
				int x = bombs[0][1];

				// 주변에 폭탄이 있는지 검사하기전에 배열의 0번째에 있는 폭탄 먼저 터뜨리기

				// y, x 기준으로 -1 ~ 1 을 조사
				// y 좌표 조사
				for (int i = -1; i <= 1; i += 1) {

					if (y + i >= 0 && y + i < size) {

						if (i != 0 && map[y + i][x] == bomb) {
							System.out.println("y + i == " + (y + i));
						}
					}
				}

				// x좌표 조사
				for (int i = -1; i <= 1; i += 1) {

					if (x + i >= 0 && x + i < size) {

						if (i != 0 && map[y][x + i] == bomb) {
							System.out.println("x + i == " + (x + i));
						}
					}
				}

				bombCnt -= 1;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		sc.close();
	}
}
