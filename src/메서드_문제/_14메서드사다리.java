package 메서드_문제;

import java.util.Scanner;

class GameLadder {
	Scanner sc = new Scanner(System.in);
	int[][] ladder = {

			{ 0, 0, 0, 0, 0 },

			{ 1, 1, 0, 1, 1 },

			{ 0, 0, 0, 0, 0 },

			{ 0, 0, 1, 1, 0 },

			{ 1, 1, 0, 1, 1 },

			{ 0, 1, 1, 0, 0 },

			{ 0, 0, 1, 1, 0 },

			{ 0, 0, 0, 1, 1 },

			{ 0, 0, 0, 0, 0 } };
	String[] menu;
	String selectedMenu = "";

	void init() {
		menu = new String[5];
		for (int i = 0; i < menu.length; i += 1) {
			menu[i] = "";
		}
	}

	void setMenus() {
		int idx = 0;
		while (idx < 5) {
			System.out.printf("%d번 메뉴를 입력하세요. >> ", idx + 1);
			String menu = sc.next();
			sc.nextLine();
			if (isExist(menu)) {
				System.err.println("메뉴가 중복됐습니다.");
				continue;
			}
			this.menu[idx++] = menu;
		}
	}

	boolean isExist(String menu) {// 메뉴중복 검사
		boolean dupl = false;
		for (String s : this.menu) {
			if (s.equals(menu)) {
				dupl = true;
			}
		}
		return dupl;
	}

	void displayLadder() {
		for (int i = 0; i < ladder.length; i += 1) {
			for (int j = 0; j < ladder[i].length; j += 1) {
				if (ladder[i][j] == 0) {
					System.out.print(" │ ");
				} else if (ladder[i][j] == 1) {
					if (j == 0) {
						System.out.print(" ├─");
					} else if (j == 4) {
						System.out.print("─┤ ");
					} else {
						if (ladder[i][j - 1] != 0) {
							System.out.print("─┤ ");
						} else if (ladder[i][j + 1] != 0) {
							System.out.print(" ├─");
						}
					}
				} else if (ladder[i][j] == 2) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		System.out.println(" 1  2  3  4  5");
	}

	int getNumber() {
		while (true) {
			System.out.println("번호선택 >> ");
			int input = sc.nextInt() - 1;
			if (input < 0 || input > ladder[0].length - 1) {
				System.err.println("번호를 확인하세요.");
				continue;
			}
			return input;
		}
	}

	void moveOnLadder(int x) {
		for (int i = 0; i < ladder.length; i += 1) {
			if (ladder[i][x] == 1) {
				if (x != 0 && x != 4) {
					if (ladder[i][x - 1] == 1) {
						x -= 1;
					} else if (ladder[i][x + 1] == 1) {
						x += 1;
					}
				} else if (x == 0) {
					x += 1;
				} else if (x == 4) {
					x -= 1;
				}
			}
			ladder[i][x] = 2;
		}
		this.selectedMenu = this.menu[x];
	}

	void printSelectedMenu() {
		System.out.printf("오늘은 %s 가자~\n", this.selectedMenu);
	}

	void showInVertical() {
		int idx = 0, cnt = 0;
	}

	void run() {
		init();
		setMenus();
		displayLadder();
		moveOnLadder(getNumber());
		displayLadder();
		showInVertical();
		printSelectedMenu();
	}
}

public class _14메서드사다리 {
	public static void main(String[] args) {
		GameLadder e = new GameLadder();
		e.run();
		e.sc.close();
	}
}
