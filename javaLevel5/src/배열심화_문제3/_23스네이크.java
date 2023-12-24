package 배열심화_문제3;

import java.util.Random;
import java.util.Scanner;

public class _23스네이크 {
	public static void main(String[] args) {
//		1. 10 * 10 배열을 생성한다.
//		2. 스네이크는 1234로 표시한다.
//		3. 머리는 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
//		4. 자기 몸하고 부딪히면 종료한다.
//		5. 랜덤 위치에 아이템을 생성하고, 아이템을 먹으면 꼬리가 1개 자란다.
//		6. 꼬리는 최대 8개 까지 증가할 수 있다.
//		7. 아이템 전부 먹으면 게임 종료.

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int[][] map = new int[10][10];
		int snake = 4;
		int[] y = new int[snake];
		int[] x = new int[snake];

		// 처음 뱀의 위치
		y = new int[] { 0, 0, 0, 0 };
		x = new int[] { 0, 1, 2, 3 };

		// 랜덤 위치에 아이템 생성
		int items = 8;

		for (int i = 0; i < items; i += 1) {

			int num1 = rn.nextInt(9 - 0 + 1) + 0;
			int num2 = rn.nextInt(9 - 0 + 1) + 0;

			if (map[num1][num2] == 0) {
				map[num1][num2] = -1;
			} else {
				i -= 1;
			}
		}

		while (true) {

			// 배열에 현재 뱀의 위치를 저장
			for (int i = 0; i < snake; i += 1) {
				map[y[i]][x[i]] = i + 1;
			}

			// map 출력
			for (int i = 0; i < map.length; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {

					if (map[i][j] == 1) {
						System.out.print("[■]");
					} else if (map[i][j] > 1) {
						System.out.print("[●]");
					} else if (map[i][j] == -1) {
						System.out.print("[♣]");
					} else {
						System.out.print("[ ]");
					}
				}
				System.out.println();
			}

			// items가 더이상 없으면 종료
			if (items <= 0) {
				break;
			}

			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");

			int dir = sc.nextInt();
			int preY = y[0];
			int preX = x[0];
			int tailY = y[y.length - 1];
			int tailX = x[x.length - 1];

			if (dir == 1) {
				// ←
				preX -= 1;
			} else if (dir == 2) {
				// ↓
				preY += 1;
			} else if (dir == 3) {
				// →
				preX += 1;
			} else if (dir == 5) {
				// ↑
				preY -= 1;
			} else {
				continue;
			}

			// 장애물 예외
			if (preY < 0 || preY > map.length - 1 || preX < 0 || preX > map[0].length - 1) {
				System.err.println("벽입니다.");
				continue;
			}

			// 몸통박치기
			if (map[preY][preX] > 0) {
				System.err.println("몸통박치기");
				break;
			}

			// 아이템을 먹었을 때
			if (map[preY][preX] == -1) {
				snake += 1;
				items -= 1;
				System.out.println(items);
				int[] copyY = y;
				int[] copyX = x;
				y = new int[snake];
				x = new int[snake];

				for (int i = 0; i < copyY.length; i += 1) {
					y[i] = copyY[i];
					x[i] = copyX[i];
				}
				y[y.length - 1] = snake;
				x[x.length - 1] = snake;
			}

			// 머리 움직이기 전에 몸통 움직이기
			for (int i = snake - 1; i > 0; i -= 1) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}

			// 꼬리 지우기
			map[tailY][tailX] = 0;

			// 마지막에 머리 위치 정하기
			y[0] = preY;
			x[0] = preX;
		}
		sc.close();
	}
}
