package 배열심화_문제3;

public class _16여행 {

	public static void main(String[] args) {
		// 철수는 여행을 떠났다.
		// 8은 철수이고 7은 벽이고 0은 이동가능한곳이다.
		// dir 은 철수가 바라보는 방향이고 0~3까지 북동남서 의 방향을 표현한다.
		// input의 데이터는 1은 한 칸 전진이고, 2는 좌회전(90도) 3은 우회전(90도)이다.
		// 회전은 방향만 전환하고 이동하지는 않는다.
		// input을 전부 입력받고, 해당 내용을 전부 출력하시오.
		int map[][] = {

				{ 0, 0, 0, 0, 0, 0, 0 },

				{ 0, 7, 7, 7, 7, 0, 0 },

				{ 0, 7, 0, 0, 7, 0, 0 },

				{ 0, 7, 0, 8, 7, 0, 0 },

				{ 0, 0, 0, 0, 7, 0, 0 },

				{ 0, 0, 0, 0, 7, 7, 0 },

				{ 0, 0, 0, 0, 0, 0, 0 } };
		int dir = 0; // 0북 1동 2남 3서
		int[] input = { 1, 1, 2, 1, 1, 2, 1, 1, 3, 1, 1 };

		String[] draw = { "▲", "▶", "▼", "◀" };
		int y = 3;
		int x = 3;

		for (int i = 0; i < input.length; i += 1) {

			// map 출력
			System.out.println("===================");
//			System.out.println("input " + input[i]);
			for (int j = 0; j < map.length; j += 1) {

				for (int k = 0; k < map[j].length; k += 1) {

					if (map[j][k] == 0) {
						System.out.print(String.format("%-3s", "□"));
					} else if (map[j][k] == 7) {
						System.out.print(String.format("%-3s", "■"));
					} else if (map[j][k] == 8 && dir == 0) {
						System.out.print(String.format("%-3s", draw[dir]));
					} else if (map[j][k] == 8 && dir == 1) {
						System.out.print(String.format("%-3s", draw[dir]));
					} else if (map[j][k] == 8 && dir == 2) {
						System.out.print(String.format("%-3s", draw[dir]));
					} else if (map[j][k] == 8 && dir == 3) {
						System.out.print(String.format("%-3s", draw[dir]));
					}
				}
				System.out.println();
			}

			// 방향전환
			int preDir = dir;

			if (input[i] == 2) {
				// 좌회전
				dir = preDir - 1;

				if (dir < 0) {
					dir = 3;
				}
			} else if (input[i] == 3) {
				// 우회전
				dir = preDir + 1;

				if (dir > 3) {
					dir = 0;
				}
			}

			// 이동
			int preY = y;
			int preX = x;
			boolean wall = false;

			if (input[i] == 1 && dir == 0) {
				// 북

				if (map[preY - 1][preX] == 7) {
					wall = true;
					y = preY;
					x = preX;
				} else {
					y -= 1;
					map[y][x] = 8;
					map[preY][preX] = 0;
				}
			} else if (input[i] == 1 && dir == 1) {
				// 동

				if (map[preY][preX + 1] == 7) {
					wall = true;
					y = preY;
					x = preX;
				} else {
					x += 1;
					map[y][x] = 8;
					map[preY][preX] = 0;
				}
			} else if (input[i] == 1 && dir == 2) {
				// 남

				if (map[preY + 1][preX] == 7) {
					wall = true;
					y = preY;
					x = preX;
				} else {
					y += 1;
					map[y][x] = 8;
					map[preY][preX] = 0;
				}
			} else if (input[i] == 1 && dir == 3) {
				// 서

				if (map[preY][preX - 1] == 7) {
					wall = true;
					y = preY;
					x = preX;
				} else {
					x -= 1;
					map[y][x] = 8;
					map[preY][preX] = 0;
				}
			}

			if (wall) {
				System.out.println("벽을 만나서 이동하지 못했다.");
			}
		}
	}
}
