package 클래스배열_문제;

import java.util.Scanner;

class Tic {// 가로 한 줄을 한 개의 객체로 본다.
	int[] line = new int[3];

	int[] getLine() {
		return line;
	}
}

class Tictactoe {// 게임 구현
	Tic[] tics;// 3개
	Scanner sc = new Scanner(System.in);
	int turn = 1, cnt;
	String condition;

	void init() {
		tics = new Tic[3];
		for (int i = 0; i < tics.length; i += 1) {
			tics[i] = new Tic();
		}
	}

	void showGame() {
		for (Tic i : tics) {
			for (int j : i.getLine()) {
				if (j == 0) {
					System.out.print("[ ]");
				} else if (j == 1) {
					System.out.print("[O]");
				} else if (j == 2) {
					System.out.print("[X]");
				}
			}
			System.out.println();
		}
	}

	boolean isOutOf(int y, int x) {
		boolean check = false;
		if (y < 0 || y > tics.length - 1 || x < 0 || x > tics.length - 1) {
			check = true;
		}
		return check;
	}

	boolean isWritten(int y, int x) {
		boolean check = false;
		if (tics[y].line[x] != 0) {
			check = true;
		}
		return check;
	}

	void writeOX() {
		int y, x;
		while (true) {
			System.out.printf("[p%d]의 턴\n", turn);
			System.out.print("y좌표를 입력하세요. >> ");
			y = sc.nextInt();
			System.out.print("x좌표를 입력하세요. >> ");
			x = sc.nextInt();
			if (isOutOf(y, x)) {
				System.err.println("인덱스를 확인하세요.");
				continue;
			}
			if (isWritten(y, x)) {
				System.err.println("다른 플레이어가 이미 표기한 위치입니다.");
				continue;
			}
			break;
		}
		tics[y].line[x] = turn == 1 ? 1 : 2;
		cnt += 1;
	}

	void changeTurn() {
		turn = turn == 1 ? 2 : 1;
	}

	boolean isDraw() {
		boolean check = false;
		if (cnt >= 9) {
			System.out.println("비겼습니다.");
			check = true;
		}
		return check;
	}

	boolean isVertical() {
		boolean check = false;
		for (Tic t : tics) {
			if (t.line[0] != 0 && t.line[0] == t.line[1] && t.line[1] == t.line[2]) {
				check = true;
				condition = "가로";
			}
		}
		return check;
	}

	boolean isHorizon() {
		boolean check = false;
		for (int i = 0; i < tics[0].line.length; i += 1) {
			if (tics[0].line[i] != 0 && tics[0].line[i] == tics[1].line[i] && tics[1].line[i] == tics[2].line[i]) {
				check = true;
				condition = "세로";
			}
		}
		return check;
	}

	boolean isBackSlash() {
		boolean check = false;
		if (tics[0].line[0] != 0 && tics[0].line[0] == tics[1].line[1] && tics[1].line[1] == tics[2].line[2]) {
			check = true;
			condition = "\\";
		}
		return check;
	}

	boolean isSlash() {
		boolean check = false;
		if (tics[0].line[2] != 0 && tics[0].line[2] == tics[1].line[1] && tics[1].line[1] == tics[2].line[0]) {
			check = true;
			condition = "/";
		}
		return check;
	}

	void run() {
		init();
		while (true) {
			showGame();
			if (isHorizon() || isVertical() || isBackSlash() || isSlash()) {
				turn = turn == 1 ? 2 : 1;
				System.out.printf("[p%d] %s 승리!", turn, condition);
				break;
			}
			if (isDraw())
				break;
			writeOX();
			changeTurn();
		}
	}
}

public class _07클배틱택토 {
	public static void main(String[] args) {
		Tictactoe ttt = new Tictactoe();
		ttt.run();
		ttt.sc.close();
	}
}
