package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _12숫자이동되감기 {

	public static void main(String[] args) {
//		[(1)Left (2)Right (3)Up (4)Down (5)되감기]
//		0이 플레이어의 위치이다.
//		번호를 입력받고 해당위치로 이동 ==>
//		이동할 때 값을 서로 교환한다.
//		
//		한 칸 한 칸 이동할 때 마다 move배열에 이동한 경로를 저장했다가,
//		5번 입력시 => 왔던길로 되돌아가기한다.

		Scanner sc = new Scanner(System.in);
		int game[][] = {

				{ 1, 2, 3, 4 },

				{ 5, 6, 7, 8 },

				{ 9, 10, 11, 12 },

				{ 13, 14, 15, 0 } };
		int move[][] = new int[10][2]; // 플레이어의 좌표기록 0 : y, 1 : x
		int x = 3;
		int y = 3;

		move[0][0] = y;
		move[0][1] = x;

		int cnt = 1;

		while (true) {
			System.out.println("move" + Arrays.deepToString(move));
			System.out.println("cnt" + cnt);

			// 게임판 출력
			for (int i = 0; i < game.length; i += 1) {

				for (int j = 0; j < game[i].length; j += 1) {
					if (game[i][j] == 0) {
						System.out.printf(String.format("%-3s", "★"));
					} else {
						System.out.printf(String.format("%-3d", game[i][j]));
					}
				}
				System.out.println();
			}
			System.out.println("[(1)Left (2)Right (3)Up (4)Down (5)되감기]");
			System.out.print(">> ");

			int input = sc.nextInt();

			if (input == 1) {
				// left

				if (x != 0) {

					int temp = game[y][x - 1];

					game[y][x - 1] = 0;
					game[y][x] = temp;
					x -= 1;
					cnt += 1;
				}
			} else if (input == 2) {
				// right

				if (x != 3) {

					int temp = game[y][x + 1];

					game[y][x + 1] = 0;
					game[y][x] = temp;
					x += 1;
					cnt += 1;
				}
			} else if (input == 3) {
				// up

				if (y != 0) {

					int temp = game[y - 1][x];

					game[y - 1][x] = 0;
					game[y][x] = temp;
					y -= 1;
					cnt += 1;
				}
			} else if (input == 4) {
				// down

				if (y != 3) {

					int temp = game[y + 1][x];

					game[y + 1][x] = 0;
					game[y][x] = temp;
					y += 1;
					cnt += 1;
				}
			} else if (input == 5) {
				// 되감기

				if (cnt == 1) {
					System.err.println("처음 턴 일때는 돌아갈 수 없습니다.");
					continue;
				}

				int tempY = y;
				int tempX = x;

				y = move[cnt - 2][0];
				x = move[cnt - 2][1];
				game[y][x] = 0;
				System.out.println("y" + y);
				System.out.println("x" + x);
			} else {
				break;
			}
			move[cnt - 1][0] = y;
			move[cnt - 1][1] = x;
		}
		sc.close();
	}
}
