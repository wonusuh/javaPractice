package 메서드_문제;

import java.util.Scanner;

class TicTacToe {
	Scanner sc = new Scanner(System.in);
	String[][] game;
	String condition = "";
	int size = 3, turn = 1, win, cnt;

	void init() {// 초기값
		game = new String[size][size];
		for (int i = 0; i < game.length; i += 1) {
			for (int j = 0; j < game[i].length; j += 1) {
				game[i][j] = "[ ]";
			}
		}
	}

	void display() {// 게임 화면 출력
		for (int i = 0; i < game.length; i += 1) {
			for (int j = 0; j < game[i].length; j += 1) {
				System.out.print(game[i][j]);
			}
			System.out.println();
		}
	}

	boolean checkIdxRange(int one, int two) {
		boolean check = false;
		if (one < 0 || one > size - 1 || two < 0 || two > size - 1) {
			check = true;
		}
		return check;
	}

	void writeOX(int y, int x) {
		if (turn == 1) {
			game[y][x] = "[O]";
			turn = 2;
		} else if (turn == 2) {
			game[y][x] = "[X]";
			turn = 1;
		}
		cnt += 1;
	}

	boolean alreadyWritten(int y, int x) {
		boolean already = false;
		if (!game[y][x].equals("[ ]")) {
			already = true;
		}
		return already;
	}

	void checkVertical() {
		for (int i = 0; i < size; i += 1) {
			if (!game[0][i].equals("[ ]") && (game[0][i] == game[1][i] && game[1][i] == game[2][i])) {
				win = turn;
				condition = "세로";
			}
		}
	}

	void checkHorizon() {
		for (int i = 0; i < size; i += 1) {
			if (!game[i][0].equals("[ ]") && (game[i][0] == game[i][1] && game[i][1] == game[i][2])) {
				win = turn;
				condition = "가로";
			}
		}
	}

	void printWhosTurn() {
		if (turn == 1) {
			System.out.println("[O]턴");
		} else if (turn == 2) {
			System.out.println("[X]턴");
		}
	}

	void checkBackslash() {
		if (!game[0][0].equals("[ ]") && (game[0][0].equals(game[1][1]) && game[1][1].equals(game[2][2]))) {
			win = turn;
			condition = "\\";
		}
	}

	void checkSlash() {
		if (!game[0][2].equals("[ ]") && (game[0][2].equals(game[1][1]) && game[1][1].equals(game[2][0]))) {
			win = turn;
			condition = "/";
		}
	}

	boolean win() {
		boolean temp = false;
		if (win != 0) {
			temp = true;
		}
		return temp;
	}

	boolean checkDraw() {
		boolean temp = false;
		if (cnt >= 9) {
			temp = true;
		}
		return temp;
	}

	void run() {
		init();
		while (true) {
			display();
			checkHorizon();
			checkVertical();
			checkBackslash();
			checkSlash();
			if (checkDraw()) {
				System.out.println("비겼습니다.");
				break;
			}
			if (win()) {
				if (turn == 1) {
					turn = 2;
				} else if (turn == 2) {
					turn = 1;
				}
				System.out.printf("p%s %s 승리", turn, condition);
				break;
			}
			printWhosTurn();
			System.out.print("y좌표 입력 >> ");
			int y = sc.nextInt();
			System.out.print("x좌표 입력 >> ");
			int x = sc.nextInt();
			if (checkIdxRange(y, x)) {
				System.err.println("인덱스 범위를 다시 입력하세요.");
				continue;
			}
			if (alreadyWritten(y, x)) {
				System.out.println("다른 플레이어가 이미 표기했습니다.");
				continue;
			}
			writeOX(y, x);
		}
	}
}

public class _13메서드틱택토 {
	public static void main(String[] args) {
		TicTacToe tic = new TicTacToe();
		tic.run();
		tic.sc.close();
	}
}
