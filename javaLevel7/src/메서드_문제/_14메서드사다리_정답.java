package 메서드_문제;

import java.util.Scanner;

class GameLadder2 {

	Scanner sc = new Scanner(System.in);

	int ladder[][] = { { 0, 0, 0, 0, 0 }, { 1, 1, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1 },
			{ 0, 1, 1, 0, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };

	int size = 5;
	String[] menu;

	int getIntValue(String msg, int start, int end) {
		System.out.println(msg);
		while (true) {
			int input = sc.nextInt();
			sc.nextLine();
			if (input < start || input > end) {
				System.out.printf("%d - %d 사이의 값 입력 %n");
			}

			return input;
		}
	}

	String getStringValue(String msg) {
		System.out.println(msg);
		while (true) {
			String input = sc.nextLine();
			if (input.isBlank() || input.isBlank()) {
				continue;
			}
			return input;
		}
	}

	void setMenu() {
		menu = new String[size];
		for (int i = 0; i < size;) {
			String name = getStringValue((i + 1) + " 번 메뉴");
			if (hasSameValue(name, menu)) {
				System.out.println("중복된 메뉴가 있습니다");
				continue;
			}
			menu[i] = name;
			i += 1;
		}
	}

	boolean hasSameValue(String name, String[] arr) {
		for (String val : arr) {
			if (val == null)
				return false;
			if (val.equals(name)) {
				return true;
			}
		}
		return false;
	}

	void printOneLadder(int y, int x, int bx) {

		for (int k = 0; k < ladder[y].length; k += 1) {
			if (k == x || k == bx) {
				System.out.print(" * ");
			} else if (k != 0 && ladder[y][k] == 1 && ladder[y][k - 1] == 1) {
				System.out.print("─┤ ");
			} else if (k != size - 1 && ladder[y][k] == 1 && ladder[y][k + 1] == 1) {
				System.out.print(" ├─");
			} else {
				System.out.print(" │ ");
			}
		}
		System.out.println();
	}

	void printInitGame() {
		for (int i = 0; i < ladder.length; i += 1) {
			printOneLadder(i, -1, -1);

		}
		for (int i = 1; i <= size; i += 1) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
	}

	int moveLadder(int x) {
		for (int i = 0; i < ladder.length; i += 1) {
			int bx = x;
			if (x != size - 1 && ladder[i][x] == 1 && ladder[i][x + 1] == 1) {
				x += 1;
			} else if (x != 0 && ladder[i][x] == 1 && ladder[i][x - 1] == 1) {
				x -= 1;
			}
			printOneLadder(i, x, bx);

		}

		return x;
	}

	void run() {
		setMenu();
		printInitGame();

		int x = getIntValue("값을 선택하시오 >> ", 1, 5) - 1;
		// System.out.println("x = " + x);

		x = moveLadder(x);
		printMenu();
		System.out.printf("오늘은 %s 가자~! ", menu[x]);

	}

	void printMenu() {
		int cnt = 0;
		int idx = 0;
		for (int i = 0; i < menu.length; i += 1) {
			if (idx < menu[i].length()) {
				System.out.print(menu[i].charAt(idx) + "  ");
			} else {
				System.out.print("   ");
				cnt += 1;
				if (cnt == 5) {
					break;
				}
			}
			if (i == menu.length - 1) {
				cnt = 1;
				i = -1;
				System.out.println();
				idx += 1;
			}
		}
		System.out.println();
	}
}

public class _14메서드사다리_정답 {
	public static void main(String[] args) {
		GameLadder2 e = new GameLadder2();
		e.run();
		e.sc.close();
	}
}
