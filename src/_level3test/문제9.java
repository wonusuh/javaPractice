package _level3test;

import java.util.Scanner;

public class 문제9 {
	public static void main(String[] args) {
//				 * # 틱택토  => 잘 모르면 구글에 틱택토 검색해서 해보기, 무승부도 있음 
//				 * === 틱택토 ===
//				 * [X][X][O]
//				 * [ ][O][ ]
//				 * [ ][ ][ ]
//				 * [p1]인덱스 입력 : 6
//				 * === 틱택토 ===
//				 * [X][X][O]
//				 * [ ][O][ ]
//				 * [O][ ][ ]
//				 * [p1]승리
		Scanner sc = new Scanner(System.in);

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
