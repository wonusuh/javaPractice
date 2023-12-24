package 배열심화_문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _29크레이지아케이드_2단계 {

	public static void main(String[] args) {
//		크레이지 아케이드
//		1. 맵의 크기는 7 * 7 이다. 랜덤으로 7~14개의 벽을 설치하고 랜덤으로 플레이어위치를 선정한다.
//		2. a d w s 로 이동이 가능하며, 폭탄설치e 폭파q로 설정한
//		3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
//		4. 단, 폭탄이 먼저 설치된 순서대로 터져야하며, 폭파 시 십자가 형태로 터진다.
//		5. 폭탄은 처음에 3개 까지만 동시에 설치 가능하며, 폭탄이 터지면 재설치가 가능하다.
//		6. 벽 파괴시 아이템이 랜덤하게 생성되어, 아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가한다.

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);

		final int SIZE = 7;
		final int PLAYER = 2;
		final int WALL = 3;
		final int ITEM = 4;
		final int BOMB = 9;
		final int ROAD = 0;
		int bombMax = 3;
		int cnt = 0;
		int[][] bombSequence = null;
		int[][] map = new int[SIZE][SIZE];

		// 벽 설치
		int pillar = rn.nextInt(14 - 7 + 1) + 7;

		for (int i = 0; i < pillar; i += 1) {

			int y = rn.nextInt((SIZE - 1) - 0 + 1) + 0;
			int x = rn.nextInt((SIZE - 1) - 0 + 1) + 0;

			if (map[y][x] == 0) {
				map[y][x] = WALL;
			} else {
				i -= 1;
			}
		}

		// 캐릭터
		int manY = -1;
		int manX = -1;

		while (true) {

			int yRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;
			int xRan = rn.nextInt((SIZE - 1) - 0 + 1) + 0;

			if (map[yRan][xRan] == 0) {
				map[yRan][xRan] = PLAYER;
				manY = yRan;
				manX = xRan;
			} else {
				continue;
			}
			break;
		}

		bombSequence = new int[bombMax][];

		while (true) {

			if (map[manY][manX] == ITEM) {
				bombMax += 1;
			}

			// 폭탄순서배열 재정의
			int[][] copy = bombSequence;
			bombSequence = new int[bombMax][];

			for (int i = 0; i < copy.length; i += 1) {
				bombSequence[i] = copy[i];
			}

			map[manY][manX] = PLAYER;

			// map에 폭탄 적용
			for (int i = 0; i < bombSequence.length; i += 1) {

				if (bombSequence[i] == null) {
					break;
				}
				map[bombSequence[i][0]][bombSequence[i][1]] = BOMB;
			}

			// map에 있는 아이템 수 세기
			int howMany = 0;

			for (int i = 0; i < map.length; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {

					if (map[i][j] == ITEM) {
						howMany += 1;
					}
				}
			}
			System.out.printf("> 설치한 폭탄 개수  %d\n", cnt);
			System.out.printf("> 남아있는 폭탄 개수 %d\n", bombMax - cnt);
			System.out.printf("> 설치한 벽돌 개수  %d\n", pillar);
			System.out.printf("> 획득할 아이템 개수 %d\n", howMany);

			// 출력
			for (int i = 0; i < map.length; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {

					if (map[i][j] == PLAYER) {
						System.out.printf("%-3s", "옷");
					} else if (map[i][j] == BOMB) {
						System.out.printf("%-3s", "◐");
					} else if (map[i][j] == ITEM) {
						System.out.printf("%-3s", "♥");
					} else if (map[i][j] == WALL) {
						System.out.printf("%-3s", "■");
					} else if (map[i][j] == ROAD) {
						System.out.printf("%-3s", "+");
					}
				}
				System.out.println();
			}

			// 기둥이 더 이상 없으면 승리
			if (pillar == 0) {
				System.out.println("승리!");
				break;
			}

			System.out.println("bombSequence[][] == " + Arrays.deepToString(bombSequence));
			System.out.println("설치(4) ↑(5) 폭파(6)         종료(-1)");
			System.out.print("  ←(1) ↓(2) →(3)");

			int dir = sc.nextInt();
			int manPreY = manY;
			int manPreX = manX;

			if (dir == 5) {
				// 상
				manY = manPreY - 1;
			} else if (dir == 2) {
				// 하
				manY = manPreY + 1;
			} else if (dir == 1) {
				// 좌
				manX = manPreX - 1;
			} else if (dir == 3) {
				// 우
				manX = manPreX + 1;
			} else if (dir == -1) {
				// 종료
				break;
			} else if (dir == 4) {
				// 설치

				// 최대 개수만큼 설치한 경우 더 설치할 수 없음.
				if (bombSequence[bombSequence.length - 1] != null) {
					continue;
				}

				// 폭탄 겹치기 불가능
				boolean check = false;

				for (int i = 0; i < bombSequence.length; i += 1) {

					if (bombSequence[i] == null) {
						break;
					}

					if (bombSequence[i][0] == manY && bombSequence[i][1] == manX) {
						System.err.println("폭탄 겹치기 불가능");
						check = true;
						continue;
					}
				}

				if (!check) {

					int[] temp = new int[2];

					temp[0] = manY;
					temp[1] = manX;
					bombSequence[cnt] = temp;
					cnt += 1;
				}
			} else if (dir == 6) {
				// 폭파
				pillar -= 1;

				// 폭탄이 없을 때 폭파할 수 없음
				if (cnt == 0) {
					continue;
				}

				int y = bombSequence[0][0];
				int x = bombSequence[0][1];

				map[y][x] = ROAD;

				if (y != 0) {

					if (map[y - 1][x] == WALL && map[y - 1][x] == PLAYER) {
						map[y - 1][x] = ITEM;
					}
				}

				if (y != SIZE - 1) {

					if (map[y + 1][x] == WALL && map[y + 1][x] == PLAYER) {
						map[y + 1][x] = ITEM;
					}
				}

				if (x != 0) {

					if (map[y][x - 1] == WALL && map[y][x - 1] == PLAYER) {
						map[y][x - 1] = ITEM;
					}
				}

				if (x != SIZE - 1) {

					if (map[y][x + 1] == WALL && map[y][x + 1] == PLAYER) {
						map[y][x + 1] = ITEM;
					}
				}

				// 폭탄 배열 당기기
				for (int i = 0; i < bombSequence.length - 1; i += 1) {
					bombSequence[i] = bombSequence[i + 1];
					bombSequence[i + 1] = null;
				}
				cnt -= 1;

				// 플레이어가 map에 없으면 게임 종료
				boolean alive = false;

				for (int i = 0; i < map.length; i += 1) {

					for (int j = 0; j < map[i].length; j += 1) {

						if (map[i][j] == PLAYER) {
							alive = true;
						}
					}
				}

				if (!alive) {
					System.err.println("Player has died.");
					break;
				}
			}

			// 배열의 범위를 벗어날 수 없게 하기
			if (manY < 0 || manY > SIZE - 1) {
				manY = manPreY;
			}

			if (manX < 0 || manX > SIZE - 1) {
				manX = manPreX;
			}

			// 벽으로 이동 불가능
			if (map[manY][manX] == WALL) {
				manY = manPreY;
				manX = manPreX;
			}
			map[manPreY][manPreX] = ROAD;
		}
		sc.close();
	}
}
