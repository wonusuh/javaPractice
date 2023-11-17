package 배열심화_문제3;

import java.util.Random;
import java.util.Scanner;

public class _26속코반 {

	public static void main(String[] args) {
//		소코반
//		1. 캐릭터가 공을 움직여 골대에 넣으면 종료되는 게임이다.
//		2. 벽의 개수를 입력받아 벽을 설치한다. 단, 최대 벽의개수는 15미만으로 제한한다.
//		4. 벽(9), 공(3), 캐릭터(2) 그리고 골대(7)의 설치가 끝나면 본격적으로 게임이 시작된다.
//		5. 캐릭터는 상하좌우로 이동이 가능해 이동하면서 공을 밀어내어 골대에 넣어야한다.
//		-----심화-----
//		6. 공은 상하좌우 맨 끝 배열에 위치되면 안된다.
//		7. 공의 갯수는 1~3랜덤으로 배치되고 모든 공을 골대에 넣어야 게임이 종료된다.
//		8. 캐릭터, 공, 골대 주변에 기둥이 2개 이상 존재하지 않게 배치하기.
//		------------------------팀원 추가---------------------------------------
//		9. 골은 하나씩 생성되고 골을 넣으면 새 공이 나옴.

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		final int SIZE = 9;
		final int MAN = 2;
		final int WALL = 9;
		final int BALL = 3;
		final int GOAL = 7;
		final int ROAD = 0;

		int[][] field = new int[SIZE][SIZE];
		int ball = rn.nextInt(3 - 1 + 1) + 1;
		int win = 0;
		int max = 15;

		// 벽 설치
		while (true) {
			System.out.print("세울 벽의 개수를 입력하세요 >> ");

			int pillar = sc.nextInt();

			// 최대 벽의 개수 제한
			if (pillar >= max) {
				System.err.printf("세울 수 있는 벽의 개수는 %d개 미만입니다.\n", max);
				continue;
			}

			for (int i = 0; i < pillar; i += 1) {

				int yRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;
				int xRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;

				if (field[yRan][xRan] == 0) {
					field[yRan][xRan] = WALL;
				} else {
					i -= 1;
				}
			}
			break;
		}

		// 캐릭터
		int manY = -1;
		int manX = -1;

		while (true) {

			int yRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;
			int xRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;

			if (field[yRan][xRan] == 0) {
				field[yRan][xRan] = MAN;
				manY = yRan;
				manX = xRan;
			} else {
				continue;
			}
			break;
		}

		// 골대
		int goalY = -1;
		int goalX = -1;

		while (true) {

			int yRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;
			int xRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;

			if (field[yRan][xRan] == 0) {
				field[yRan][xRan] = GOAL;
				goalY = yRan;
				goalX = xRan;
			} else {
				continue;
			}
			break;
		}

		boolean run = true;
		int ballY = -1;
		int ballX = -1;

		while (true) {

			// 공
			while (run) {
				run = false;

				int yRan = rn.nextInt(7) + 1;
				int xRan = rn.nextInt(7) + 1;

				if (field[yRan][xRan] == 0) {
					field[yRan][xRan] = BALL;
					ballY = yRan;
					ballX = xRan;
				} else {
					continue;
				}
			}

			field[ballY][ballX] = BALL;
			field[manY][manX] = MAN;
			field[goalY][goalX] = GOAL;
			System.out.printf("gameCnt : %d/%d\n", win, ball);

			// 출력
			for (int i = 0; i < field.length; i += 1) {

				for (int j = 0; j < field[i].length; j += 1) {
					// 벽(9), 공(3), 캐릭터(2) 그리고 골대(7)

					if (field[i][j] == MAN) {
						System.out.printf("%-3s", "옷");
					} else if (field[i][j] == BALL) {
						System.out.printf("%-3s", "●");
					} else if (field[i][j] == GOAL) {
						System.out.printf("%-3s", "○");
					} else if (field[i][j] == WALL) {
						System.out.printf("%-3s", "■");
					} else if (field[i][j] == ROAD) {
						System.out.printf("%-3s", "+");
					}
				}
				System.out.println();
			}

			// 승리조건
			if (win == ball) {
				System.out.println("승리!");
				break;
			}
			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");

			int dir = sc.nextInt();
			int manPreY = manY;
			int manPreX = manX;
			int ballPreY = ballY;
			int ballPreX = ballX;

			if (dir == 5) {
				// 상
				manY = manPreY - 1;

				if (manY == ballY && manX == ballX) {
					ballY = ballPreY - 1;
				}
			} else if (dir == 2) {
				// 하
				manY = manPreY + 1;

				if (manY == ballY && manX == ballX) {
					ballY = ballPreY + 1;
				}
			} else if (dir == 1) {
				// 좌
				manX = manPreX - 1;

				if (manY == ballY && manX == ballX) {
					ballX = ballPreX - 1;
				}
			} else if (dir == 3) {
				// 우
				manX = manPreX + 1;

				if (manY == ballY && manX == ballX) {
					ballX = ballPreX + 1;
				}
			} else if (dir == -1) {
				break;
			}

			// 배열의 범위를 벗어날 수 없게 하기
			if (manY < 0 || manY > SIZE - 1 || ballY < 0 || ballY > SIZE - 1) {
				manY = manPreY;
				ballY = ballPreY;
			}

			if (manX < 0 || manX > SIZE - 1 || ballX < 0 || ballX > SIZE - 1) {
				manX = manPreX;
				ballX = ballPreX;
			}

			// 공 뒤에 기둥이 있으면 전진하지 못하게하기
			if (field[ballY][ballX] == WALL || field[manY][manX] == WALL) {
				manY = manPreY;
				manX = manPreX;
				ballY = ballPreY;
				ballX = ballPreX;
			}

			// 골대에 공을 넣으면 win += 1
			if (ballY == goalY && ballX == goalX) {
				win += 1;
				run = true;
			}

			field[manPreY][manPreX] = ROAD;
		}
		sc.close();
	}
}
