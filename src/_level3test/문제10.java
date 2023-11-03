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
		p1[idx1] = 1;
		p2[idx2] = 2;

		Scanner sc = new Scanner(System.in);

		int p1cnt = 0;
		int p2cnt = 0;

		while (true) {
			System.out.printf("[p1] %d바퀴 [p2] %d바퀴\n", p1cnt, p1cnt);
			System.out.println("game" + Arrays.toString(game));
			System.out.println(" p1 " + Arrays.toString(p1));
			System.out.println(" p2 " + Arrays.toString(p2));
			System.out.printf("[%d턴] 입력(0~3) >> ", turn);

			int input = sc.nextInt();

			if (p1cnt == 3 || p2cnt == 3) {
				System.out.printf("[%d] 승리!", turn);
				break;
			}
		}
		sc.close();
	}
}
