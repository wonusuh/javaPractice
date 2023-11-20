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
			System.out.println("     ↑(5)");
			System.out.print("←(1) ↓(2) →(3)");
			int dir = scan.nextInt();
			int yPre = y[0];
			int xPre = x[0];

			if (dir == -1) {
				break;
			} else if (dir == 1) {
				// ←
				x[0] = xPre - 1;
				if (x[0] < 0) {
					x[0] = xPre;
				}
			} else if (dir == 2) {
				// ↓
				y[0] = yPre + 1;
				if (y[0] > map.length - 1) {
					y[0] = yPre;
				}
			} else if (dir == 3) {
				// →
				x[0] = xPre += 1;
				if (x[0] > map.length - 1) {
					x[0] = xPre;
				}
			} else if (dir == 5) {
				// ↑
				y[0] = yPre - 1;
				if (y[0] < 0) {
					y[0] = yPre;
				}
			}

			// 꼬리 당기기
			for (int i = y.length - 1; i > 1; i -= 1) {
				System.out.println(x[i]);
				y[i] = y[i - 1];
				x[i] = x[i - 1];
			}
		}
		scan.close();
	}
}
