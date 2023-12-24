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
		int move[][] = new int[10][2]; // 플레이어의 좌표를 기록 => (y, x)
		int y = 3;
		int x = 3;

		move[0][0] = y;
		move[0][1] = x;

		int cnt = 1;

		while (true) {

			// 현재 y, x의 값을 배열에 적용
			game[y][x] = 0;

			// 출력
			for (int i = 0; i < game.length; i += 1) {

				for (int j = 0; j < game[i].length; j += 1) {

					if (game[i][j] == 0) {
						System.out.printf(String.format("%-3s", game[i][j]));
					} else {
						System.out.printf(String.format("%-3d", game[i][j]));
					}
				}
				System.out.println();
			}
			System.out.println("move" + Arrays.deepToString(move));
			System.out.println("cnt" + cnt);
			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");

			int input = sc.nextInt();
			int yPre = y;
			int xPre = x;
			int temp = game[yPre][xPre];

			if (input == 1) {
				// left
				x = xPre - 1;
			} else if (input == 3) {
				// right
				x = xPre + 1;
			} else if (input == 5) {
				// up
				y = yPre - 1;
			} else if (input == 2) {
				// down
				y = yPre + 1;
			} else if (input == 5) {
				// turning back

				if (cnt == 1) {
					System.err.println("처음 턴 일때는 돌아갈 수 없습니다.");
					continue;
				}
			} else {
				break;
			}

			// 배열의 범위를 벗어날 수 없게 하기
			if (y < 0 || y > game.length - 1) {
				y = yPre;
			}

			if (x < 0 || x > game.length - 1) {
				x = xPre;
			}
			game[yPre][xPre] = temp;
		}
		sc.close();
	}
}
