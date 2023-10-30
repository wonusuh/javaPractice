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
//		 *    
//		 *  [p2]1~3 입력 : 1
//		 *  1 2 3 4 5 6 7 8 
//		 *  0 1 0 0 0 0 0 0 
//		 *  0 0 0 2 0 0 0 0 
//		 *  
//		 *  [p1]1~3 입력 : 3
//		 *  [p1]이 p2를 잡았다!
//		 *  1 2 3 4 5 6 7 8 
//		 *  0 0 0 0 1 0 0 0 
//		 *  2 0 0 0 0 0 0 0 
		Scanner sc = new Scanner(System.in);
		int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int size = 9;
		int[] game = new int[size];
		int turn = 1; // player1 player2 // 1 2
		int win = 0; // 플레이어1 승리 플레이어 2승리
		int cnt = 0;
		while (true) {
			if (cnt == 9) {
				System.out.println("무승부 ");
				break;
			}

			// 게임판 출력
			for (int i = 0; i < size; i += 1) {
				if (game[i] == 0) {
					System.out.print("[ ]");
				} else if (game[i] == 1) {
					System.out.print("[O]");
				} else {
					System.out.print("[X]");
				}

				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.println();

			System.out.printf("[player %d 턴] \n", turn);
			System.out.println("인덱스(1-9)>>");
			int idx = sc.nextInt() - 1; // 0-8
			if (idx < 0 || idx >= size) {
				System.out.println("인덱스 오류");
				continue;
			}
			if (game[idx] != 0) {
				System.out.println("이미 선택된 번호");
				continue;
			}

			game[idx] = turn == 1 ? 1 : 2;

			// 승리조건
			// 가로
			for (int i = 0; i < size; i += 3) { // 0 3 6
				if (game[i] == turn && game[i + 1] == turn && game[i + 2] == turn) {
					win = turn;
					System.out.println("가로승리");
				}

			}

			// 세로
			for (int i = 0; i < 3; i += 1) { // 0 1 2
				if (game[i] == turn && game[i + 3] == turn && game[i + 6] == turn) {
					win = turn;
					System.out.println("세로승리");
				}

			}

			// 대각선 \
			if (game[0] == turn && game[4] == turn && game[8] == turn) {
				win = turn;
				System.out.println("대각선 \\ 승리");
			}
			// 대각선 /
			if (game[2] == turn && game[4] == turn && game[6] == turn) {
				win = turn;
				System.out.println("대각선 / 승리");
			}

			if (win != 0) {
				System.out.printf("[player %d] 승리 \n", win);
				break;
			}

			turn = turn == 1 ? 2 : 1;
			cnt += 1;

		}

		// 게임판 출력
		for (int i = 0; i < size; i += 1) {
			if (game[i] == 0) {
				System.out.print("[ ]");
			} else if (game[i] == 1) {
				System.out.print("[O]");
			} else {
				System.out.print("[X]");
			}

			if (i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();
	}
}
