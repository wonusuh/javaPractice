package 클래스_문제;

import java.util.Scanner;

class LadderGame {
	int ladder[][] = {

			{ 0, 0, 0, 0, 0 },

			{ 1, 1, 0, 1, 1 },

			{ 0, 0, 0, 0, 0 },

			{ 0, 0, 1, 1, 0 },

			{ 1, 1, 0, 1, 1 },

			{ 0, 1, 1, 0, 0 },

			{ 0, 0, 1, 1, 0 },

			{ 0, 0, 0, 1, 1 },

			{ 0, 0, 0, 0, 0 } };
	int x, y;
	String[] menu = { "죠스떡볶이", "CU편의점", "마라탕", "김밥천국", "명인만두" };
}

public class _08사다리게임2 {

	public static void main(String[] args) {

		LadderGame ld = new LadderGame();
		Scanner sc = new Scanner(System.in);

		System.out.println("[오늘의 점심메뉴]");

		// 사다리 출력
		System.out.println(" 1  2  3  4  5");
		for (int i = 0; i < ld.ladder.length; i += 1) {

			for (int j = 0; j < ld.ladder[i].length; j += 1) {

				if (ld.ladder[i][j] == 0) {
					System.out.print(" │ ");
				} else {

					if (j != ld.ladder[i].length - 1 && ld.ladder[i][j + 1] == 1) {
						System.out.print(" ├─");
					} else if (j != 0 && ld.ladder[i][j - 1] == 1) {
						System.out.print("─┤ ");
					}
				}
			}
			System.out.println();
		}
		System.out.print("번호 선택 [1~5] : ");
		int x = sc.nextInt() - 1;

		for (int i = 0; i < ld.ladder.length; i += 1) {

			if (ld.ladder[i][x] == 1) {

				if (x == 0) {
					x += 1;
				} else if (x == ld.ladder[i].length - 1) {
					x -= 1;
				} else {

					if (ld.ladder[i][x - 1] == 1) {
						x -= 1;
					} else if (ld.ladder[i][x + 1] == 1) {
						x += 1;
					}
				}
			}
			ld.ladder[i][x] = 2;
		}

		// 결과 출력
		for (int i = 0; i < ld.ladder.length; i += 1) {

			for (int j = 0; j < ld.ladder[i].length; j += 1) {

				if (ld.ladder[i][j] == 0) {
					System.out.print(" │ ");
				} else if (ld.ladder[i][j] == 1) {

					if (j == 0) {
						System.out.print(" ├─");
					} else if (j == ld.ladder[i].length - 1) {
						System.out.print("─┤ ");
					} else {

						if (ld.ladder[i][j - 1] != 0) {
							System.out.print("─┤ ");
						} else if (ld.ladder[i][j + 1] != 0) {
							System.out.print(" ├─");
						}
					}
				} else if (ld.ladder[i][j] == 2) {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

		// 글씨 세로로 출력
		for (int i = 0; i < 5; i += 1) {

			for (int j = 0; j < 5; j += 1) {

				if (i >= ld.menu[j].length()) {
					System.out.print("   ");
				} else {
					System.out.print(i + "" + j + ld.menu[j].substring(i, i + 1) + "  ");
				}
			}
			System.out.println();
		}
		System.out.printf("오늘은 %s 가자~", ld.menu[x]);
		sc.close();
	}
}
