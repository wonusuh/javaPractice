package _level3test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제10 {
	public static void main(String[] args) {
//		 * # 미니마블
//		 * 1. 플레이어는 p1과 p2 2명이다.
//		 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
//		 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
//		 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
//		 * 4. 먼저 3바퀴를 돌면 이긴다.

//		 *  [p2]1~3 입력 : 1
//		 *  1 2 3 4 5 6 7 8 
//		 *  0 1 0 0 0 0 0 0 
//		 *  0 0 0 2 0 0 0 0 

//		 *  [p1]1~3 입력 : 3
//		 *  [p1]이 p2를 잡았다!
//		 *  1 2 3 4 5 6 7 8 
//		 *  0 0 0 0 1 0 0 0 
//		 *  2 0 0 0 0 0 0 0 
		int[] game = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int turn = 1;

		int idx1 = 0;
		int idx2 = 0;

		Scanner sc = new Scanner(System.in);

		int p1cnt = 0;
		int p2cnt = 0;

		while (true) {
			p1[idx1] = 1;
			p2[idx2] = 2;
			System.out.println();
			System.out.printf("[p1] %d바퀴 [p2] %d바퀴\n", p1cnt, p2cnt);
			System.out.println("game" + Arrays.toString(game));
			System.out.println(" p1 " + Arrays.toString(p1));
			System.out.println(" p2 " + Arrays.toString(p2));
			System.out.printf("[%d턴] 입력(1~3) >> ", turn);

			int input = sc.nextInt();

			if (input < 0 || input > 3) {
				System.out.println("[이동 범위는 (1~3)입니다.]");
				continue;
			}

			// 한 턴 전의 인덱스를 보관하는 변수
			int beforeIdx1 = idx1;
			int beforeIdx2 = idx2;

			// 플레이어 이동
			if (turn == 1) {

				idx1 += input;

				if (idx1 > game.length - 1) {
					idx1 -= game.length;
					p1cnt += 1;
				}
			} else {

				idx2 += input;

				if (idx2 > game.length - 1) {
					idx2 -= game.length;
					p2cnt += 1;
				}
			}

			// 붙잡히면 0번방으로 이동
			if (idx1 == idx2) {
				System.out.printf("[p%d]가 붙잡았다!\n", turn);

				if (turn == 1) {
					idx2 = 0;
				} else {
					idx1 = 0;
				}
			}

			p1[beforeIdx1] = 0;
			p2[beforeIdx2] = 0;

			// 3바퀴 돌면 승리
			if (p1cnt == 3 || p2cnt == 3) {
				System.out.printf("[%d] 승리!", turn);
				break;
			}

			// 턴 전환
			if (turn == 1) {
				turn = 2;
			} else {
				turn = 1;
			}
		}
		sc.close();
	}
}
