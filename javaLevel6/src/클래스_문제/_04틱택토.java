package 클래스_문제;

import java.util.Scanner;

class Tictactoe {
	int size = 3;
	String[][] game = new String[size][size];
	int turn = 0;
	int win = 0;
}

public class _04틱택토 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Tictactoe ttt = new Tictactoe();

		while (true) {

			// p1 턴 부터 시작
			if (ttt.turn == 0) {
				ttt.turn = 1;
			}

			// 출력
			for (int i = 0; i < ttt.game.length; i += 1) {

				for (int j = 0; j < ttt.game[i].length; j += 1) {

					if (ttt.game[i][j] == null) {
						ttt.game[i][j] = "[ ]";
					}
					System.out.print(ttt.game[i][j]);
				}
				System.out.println();
			}

			// 승리조건
			if (ttt.win != 0) {

				if (ttt.win == 1) {
					ttt.win = 2;
				} else {
					ttt.win = 1;
				}
				System.out.printf("p%d 승리!", ttt.win);
				break;
			}

			System.out.printf("[p%d]턴\n", ttt.turn);

			System.out.print("y좌표를 입력하세요. >> ");
			int y = sc.nextInt();

			System.out.print("x좌표를 입력하세요. >> ");
			int x = sc.nextInt();

			// 인덱스값 예외
			if (y < 0 || y > ttt.size - 1 || x < 0 || x > ttt.size - 1) {
				System.err.println("인덱스 범위를 확인하세요.");
				continue;
			}

			// 다른 플레이어가 이미 표기한 경우
			if (!ttt.game[y][x].equals("[ ]")) {
				System.err.println("다른 플레이어가 이미 표기했습니다.");
				continue;
			}

			if (ttt.turn == 1) {
				ttt.game[y][x] = "[O]";
				ttt.turn = 2;
			} else {
				ttt.game[y][x] = "[X]";
				ttt.turn = 1;
			}

			// 대각선 \ 승리
			if (!ttt.game[0][0].equals("[ ]")
					&& (ttt.game[0][0].equals(ttt.game[1][1]) && ttt.game[1][1].equals(ttt.game[2][2]))) {
				ttt.win = ttt.turn;
			}

			// 대각선 / 승리
			if (!ttt.game[0][2].equals("[ ]")
					&& (ttt.game[0][2].equals(ttt.game[1][1]) && ttt.game[1][1].equals(ttt.game[2][0]))) {
				ttt.win = ttt.turn;
			}

			// 가로승리
			for (int i = 0; i < ttt.size; i += 1) {

				if (!ttt.game[i][0].equals("[ ]")
						&& (ttt.game[i][0] == ttt.game[i][1] && ttt.game[i][1] == ttt.game[i][2])) {
					ttt.win = ttt.turn;
				}
			}

			// 세로승리
			for (int i = 0; i < ttt.size; i += 1) {

				if (!ttt.game[0][i].equals("[ ]")
						&& (ttt.game[0][i] == ttt.game[1][i] && ttt.game[1][i] == ttt.game[2][i])) {
					ttt.win = ttt.turn;
				}
			}

			if (y == -1 || x == -1) {
				break;
			}
		}
		sc.close();
	}
}
