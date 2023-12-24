package _level5test;

import java.util.Random;
import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
//		스네이크
//			1. 10x10 배열을 생성한다.
//			2. 스네이크는 1234로 표시한다.
//			3. 머리는 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
//			4. 자기 몸하고 부딪히면, 사망한다.
//			5. 랜덤으로 아이템을 생성해
//			   아이템을 먹으면 꼬리가 1개 자란다.
//			6. 꼬리는 최대 8개까지 증가할 수 있다.

		Scanner scan = new Scanner(System.in);
		Random rn = new Random();
		int[][] map = new int[10][10];

		int snakeSize = 4;
		int[] y = new int[snakeSize];
		int[] x = new int[snakeSize];

		y = new int[] { 0, 0, 0, 0 };
		x = new int[] { 0, 1, 2, 3 };

		// map에 뱀 그리기
		int num = 1;
		for (int i = 0; i < y.length; i += 1) {
			map[y[i]][x[i]] = num;
			num += 1;
		}

		// 아이템 생성하기
		int item = 8;

		for (int i = 0; i < item; i += 1) {

			int ran1 = rn.nextInt((map.length - 1) - 0 + 1) + 0;
			int ran2 = rn.nextInt((map.length - 1) - 0 + 1) + 0;

			if (map[ran1][ran2] == 0) {
				map[ran1][ran2] = -1;
			} else {
				i -= 1;
			}
		}

		while (true) {

			// 뱀 출력
			int temp = 1;

			for (int i = 0; i < snakeSize; i += 1) {
				map[y[i]][x[i]] = temp;
				temp += 1;
			}

			// 출력
			for (int i = 0; i < map.length; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {
					System.out.printf("%-3d", map[i][j]);
				}
				System.out.println();
			}

			// 아이템 다 먹으면 종료
			if (item == 0) {
				System.err.println("아이템을 다 먹었습니다!");
				break;
			}

			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");
			int dir = scan.nextInt();

			int yPre = y[0];
			int xPre = x[0];
			int yTail = y[y.length - 1];
			int xTail = x[x.length - 1];

			if (dir == -1) {
				break;
			} else if (dir == 1) {
				// ←
				xPre -= 1;
			} else if (dir == 2) {
				// ↓
				yPre += 1;
			} else if (dir == 3) {
				// →
				xPre += 1;
			} else if (dir == 5) {
				// ↑
				yPre -= 1;
			}

			// 배열 밖으로 못나가게하기
			if (yPre < 0 || yPre > map.length - 1 || xPre < 0 || xPre > map.length - 1) {
				continue;
			}

			// 몸통박치기
			if (map[yPre][xPre] > 0) {
				System.err.println("몸통박치기!");
				break;
			}

			// 머리 전에 꼬리 당기기
			for (int i = y.length - 1; i > 0; i -= 1) {
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}

			// 꼬리 흔적 지우기
			map[yTail][xTail] = 0;

			// 아이템 먹었을 때 뱀 길이 늘리기
			if (map[yPre][xPre] == -1) {
				item -= 1;
				snakeSize += 1;

				int[] yCopy = y;
				int[] xCopy = x;
				y = new int[snakeSize];
				x = new int[snakeSize];

				for (int i = 0; i < yCopy.length; i += 1) {
					y[i] = yCopy[i];
					x[i] = xCopy[i];
				}
				y[y.length - 1] = yTail;
				x[x.length - 1] = xTail;
			}

			// 마지막에 머리
			y[0] = yPre;
			x[0] = xPre;
		}
		scan.close();
	}
}
