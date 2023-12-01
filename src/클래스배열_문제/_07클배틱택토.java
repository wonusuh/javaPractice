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
	int turn = 1, win;

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

	void writeOX() {
		while (true) {
			System.out.printf("[p%d]의 턴\n", turn);
			System.out.print("y좌표를 입력하세요. >> ");
			int y = sc.nextInt();
			System.out.print("x좌표를 입력하세요. >> ");
			int x = sc.nextInt();
			if (isOutOf(y, x)) {
				System.err.println("인덱스를 확인하세요.");
				continue;
			}
			break;
		}
	}

	void run() {
		init();
		showGame();
		while (true) {
			writeOX();
			break;
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
