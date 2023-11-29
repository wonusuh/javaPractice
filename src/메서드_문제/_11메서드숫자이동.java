package 메서드_문제;

import java.util.Scanner;

class NumberGame {
	Scanner scan = new Scanner(System.in);
	int[] move = { 1, 1, 0, 0, 8, 0, 1, 0, 0, 1 };
	int pIdx = 4;

	void display() {
		for (int i : this.move) {
			if (i == 0) {
				System.out.print("___");
			} else if (i == 1) {
				System.out.print("_|_");
			} else {
				System.out.print("옷");
			}
		}
	}

	void showMenu() {
		System.out.println();
		System.out.print("[1]좌 ");
		System.out.print("[2]우 ");
	}

	void selMenu(int input) {
		if (input == 1) {
			goLeft();
		} else if (input == 2) {
			goRight();
		}
	}

	void goLeft() {// 좌로 이동
		int pre = this.pIdx;
		this.pIdx = pre - 1;
		if (this.pIdx < 0) {
			this.pIdx = this.move.length - 1;
		}
		if (this.move[this.pIdx] == 1) {
			System.out.print("벽을 부수겠습니까? >> 1.yes 2.no");
			int input = this.scan.nextInt();
			if (input == 2) {
				this.pIdx = pre;
				return;
			}
		}
		this.move[this.pIdx] = 8;
		this.move[pre] = 0;
	}

	void goRight() {// 우로 이동
		int pre = this.pIdx;
		this.pIdx = pre + 1;
		if (this.pIdx > this.move.length - 1) {
			this.pIdx = 0;
		}
		if (this.move[this.pIdx] == 1) {
			System.out.print("벽을 부수겠습니까? >> 1.yes 2.no");
			int input = this.scan.nextInt();
			if (input == 2) {
				this.pIdx = pre;
				return;
			}
		}
		this.move[this.pIdx] = 8;
		this.move[pre] = 0;
	}

	void run() {
		while (true) {
			display();// 게임화면
			showMenu();// 메뉴출력
			int input = this.scan.nextInt();
			selMenu(input);// 메뉴선택
		}
	}
}

public class _11메서드숫자이동 {
	public static void main(String[] args) {
		NumberGame g = new NumberGame();
		g.run();
		g.scan.close();
	}
}
