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

		while (true) {

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
			

			if (turn == 1) {
			} else if (turn == 2) {
			}

			if (cnt == 9) {
				System.out.println("비겼다");
				break;
			}
		}
		sc.close();
	}
}
