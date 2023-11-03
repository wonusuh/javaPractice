package _level3test;

import java.util.Scanner;

public class 문제9 {
	public static void main(String[] args) {
//		# 틱택토  => 잘 모르면 구글에 틱택토 검색해서 해보기, 무승부도 있음 
//		=== 틱택토 ===
//		[X][X][O]
//		[ ][O][ ]
//		[ ][ ][ ]
//		[p1]인덱스 입력 : 6
//		=== 틱택토 ===
//		[X][X][O]
//		[ ][O][ ]
//		[O][ ][ ]
//		[p1]승리
		Scanner sc = new Scanner(System.in);

		int size = 9;
		int[] game = new int[size];
		int turn = 1; // player1 player2 // 1 2
		int win = 0; // 플레이어1 승리 플레이어 2승리
		int cnt = 0;
		boolean run = true;

		while (run) {
			System.out.println("=====틱택토=====");

			// 틱택토 게임시트 출력
			for (int i = 0; i < size; i += 1) {

				if (game[i] == 1) {
					System.out.print("[O]");
				} else if (game[i] == 2) {
					System.out.print("[X]");
				} else {
					System.out.print("[ ]");
				}

				if (i % 3 == 2) {
					System.out.println();
				}
			}

			// 비기는 경우
			if (cnt == 9) {
				System.out.println("비겼다.");
				break;
			}
			System.out.printf("[%d]인덱스 입력 : ", turn);

			int idx = sc.nextInt();

			System.out.println();

			// 인덱스 범위 예외
			if (idx < 0 || idx > size - 1) {
				System.out.println("인덱스를 확인하세요.");
				continue;
			}

			// 이미 표기된 인덱스 예외
			if (game[idx] != 0) {
				System.out.println("그 인덱스에 다른 플레이어가 이미 표기했습니다.");
				continue;
			}
			game[idx] = turn;

			// 가로 승리조건
			for (int i = 0; i < size; i += 3) {
				if (game[i] == turn && game[i + 1] == turn && game[i + 2] == turn) {
					win = turn;
					System.out.print("가로 ");
				}
			}

			// 세로 승리조건
			for (int i = 0; i < size - 6; i += 1) {
				if (game[i] == turn && game[i + 3] == turn && game[i + 6] == turn) {
					win = turn;
					System.out.print("세로 ");
				}
			}

			// 대각(\) 승리조건
			if (game[0] == turn && game[4] == turn && game[8] == turn) {
				win = turn;
				System.out.print("대각(\\) ");
			}

			// 대각(/) 승리조건
			if (game[2] == turn && game[4] == turn && game[6] == turn) {
				win = turn;
				System.out.print("대각(/) ");
			}

			// 승리 출력
			if (win != 0) {
				System.out.printf("[p%d] 승리!", turn);
				run = false;
				break;
			}

			// 턴 전환하기
			if (turn == 1) {
				turn = 2;
			} else if (turn == 2) {
				turn = 1;
			}
			cnt += 1;
		}
		sc.close();
	}
}
