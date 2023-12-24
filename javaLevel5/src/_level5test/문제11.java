package _level5test;

import java.util.Random;
import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
//		 * # 소코반
//		 * 1. 캐릭터가 공을 움직여 골대에 넣으면 종료되는 게임이다.
//		 * 2. 벽의 개수를 입력받아 벽을 설치한다.
//		 * 3. 공과 골대 그리고 캐릭터의 위치 값을 랜덤으로 설치한다.
//		 * 4. 벽(9), 공(3), 캐릭터(2) 그리고 골대(7)의 설치가 끝나면 본격적으로 게임이 시작된다.
//		 * 5. 캐릭터튼 상하좌우로 이동이 가능해 이동하면서 공을 밀어내어 골대에 넣어야 한다.
//		 * 6. 심화 할 수 있는 사람은 심화까지 하기 
//		 * 0 0 0 0 0 0 0 
//		 * 0 0 0 9 9 0 0 
//		 * 0 0 0 0 0 0 9 
//		 * 0 0 0 0 0 0 0  
//		 * 0 0 2 3 7 9 0 
//		 * 0 0 0 0 0 0 0  
//		 * 9 0 0 0 0 0 0
//		 * 
//		 * 상(1)하(2)좌(3)우(4) 입력 : 4
//		 * 
//		 * 0 0 0 0 0 0 0 
//		 * 0 0 0 9 9 0 0 
//		 * 0 0 0 0 0 0 9 
//		 * 0 0 0 0 0 0 0  
//		 * 0 0 0 2 3 9 0 
//		 * 0 0 0 0 0 0 0  
//		 * 9 0 0 0 0 0 0
//		 * 
//		 * 게임종료

		final int WALL = 9;
		final int BALL = 3;
		final int CHARACTOR = 2;
		final int GOAL = 7;
		final int ROAD = 0;
		int size = 7;
		Random rn = new Random();
		int cnt = rn.nextInt(3 - 1 + 1) + 1; // 게임 플레이 횟수

		int[][] field = new int[size][size];
		Scanner sc = new Scanner(System.in);

		// 필드에 벽 생성
		while (true) {
			System.out.print("생성할 벽의 개수를 입력하세요.(15개 미만) >> ");
			int pillar = sc.nextInt();

			if (pillar < 0 || pillar > 15) {
				System.out.println("0~14를 입력하세요.");
				continue;
			}

			for (int i = 0; i < pillar;) {

				int ran1 = rn.nextInt((field.length - 1) - 0 + 1) + 0;
				int ran2 = rn.nextInt((field.length - 1) - 0 + 1) + 0;

				if (field[ran1][ran2] == 0) {
					field[ran1][ran2] = WALL;
					i += 1;
				}
			}
			break;
		}

		// 골대 생성
		int goalY = -1;
		int goalX = -1;

		while (true) {

			int ran1 = rn.nextInt((field.length - 1) - 0 + 1) + 0;
			int ran2 = rn.nextInt((field.length - 1) - 0 + 1) + 0;

			if (field[ran1][ran2] == 0) {
				field[ran1][ran2] = GOAL;
				goalY = ran1;
				goalX = ran2;
			} else {
				continue;
			}
			break;
		}

		int charY = -1;
		int charX = -1;
		int ballY = -1;
		int ballX = -1;

		boolean isNew = true;

		while (true) {
			System.out.printf("남은 게임 횟수 : %d\n", cnt);
			field[goalY][goalX] = GOAL;

			while (isNew) {

				// 캐릭터 생성
				while (true) {

					int ran1 = rn.nextInt((field.length - 1) - 0 + 1) + 0;
					int ran2 = rn.nextInt((field.length - 1) - 0 + 1) + 0;

					if (field[ran1][ran2] == 0) {
						field[ran1][ran2] = CHARACTOR;
						charY = ran1;
						charX = ran2;
					} else {
						continue;
					}
					break;
				}

				// 공 생성
				while (true) {

					int ran1 = rn.nextInt((field.length - 1 - 1) - 1 + 1) + 1;
					int ran2 = rn.nextInt((field.length - 1 - 1) - 1 + 1) + 1;

					if (field[ran1][ran2] == 0) {
						field[ran1][ran2] = BALL;
						ballY = ran1;
						ballX = ran2;
					} else {
						continue;
					}
					break;
				}
				isNew = false;
				break;
			}

			// 출력
			for (int i = 0; i < field.length; i += 1) {

				for (int j = 0; j < field[i].length; j += 1) {
					if (field[i][j] == CHARACTOR) {
						System.out.printf("%-3s", "옷");
					} else if (field[i][j] == WALL) {
						System.out.printf("%-3s", "■");
					} else if (field[i][j] == BALL) {
						System.out.printf("%-3s", "●");
					} else if (field[i][j] == GOAL) {
						System.out.printf("%-3s", "○");
					} else {
						System.out.printf("%-3s", "+");
					}
				}
				System.out.println();
			}

			// game횟수가 0이 되면 종료
			if (cnt == 0) {
				System.out.println("게임 종료.");
				break;
			}

			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");
			int dir = sc.nextInt();

			int yPre = charY;
			int xPre = charX;
			int yPreBall = ballY;
			int xPreBall = ballX;

			if (dir == -1) {
				break;
			} else if (dir == 1) {
				// ←
				xPre -= 1;

				if (field[yPre][xPre] == BALL) {
					xPreBall -= 1;
				}
			} else if (dir == 2) {
				// ↓
				yPre += 1;

				if (field[yPre][xPre] == BALL) {
					yPreBall += 1;
				}
			} else if (dir == 3) {
				// →
				xPre += 1;

				if (field[yPre][xPre] == BALL) {
					xPreBall += 1;
				}
			} else if (dir == 5) {
				// ↑
				yPre -= 1;

				if (field[yPre][xPre] == BALL) {
					yPreBall -= 1;
				}
			} else {
				continue;
			}

			// 캐릭터와 공이 field 밖으로 못나가게하기
			if (yPre < 0 || yPre > field.length - 1 || xPre < 0 || xPre > field.length - 1 || yPreBall < 0
					|| yPreBall > field.length - 1 || xPreBall < 0 || xPreBall > field.length - 1) {
				continue;
			}

			// 기둥 예외
			if (field[yPre][xPre] == WALL || field[yPreBall][xPreBall] == WALL) {
				continue;
			}

			// 골 인 하면 다시시작
			boolean check = false;
			if (field[yPreBall][xPreBall] == GOAL) {
				isNew = true;
				check = true;
				cnt -= 1;
			}

			field[yPreBall][xPreBall] = BALL;
			field[yPre][xPre] = CHARACTOR;
			field[charY][charX] = ROAD; // 캐릭터의 이전 위치 지우기

			ballY = yPreBall;
			ballX = xPreBall;
			charY = yPre;
			charX = xPre;
			if (check) {
				field[charY][charX] = ROAD;
			}
		}
		sc.close();
	}
}
