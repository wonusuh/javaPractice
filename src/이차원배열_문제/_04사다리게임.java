package 이차원배열_문제;

import java.util.Scanner;

public class _04사다리게임 {
	public static void main(String[] args) {
//		사다리 게임
//		1. 인덱스 0~4를 하나 선택한다.
//		2. 숫자 0을 만나면 그냥 아래로 내려간다.
//		3. 숫자 1을 만나면 오른쪽으로 이동 후 내려간다.
//		4. 숫자 2를 만나면 왼쪽으로 이동 후 내려간다.
//		5. 오늘의 메뉴 출력.
		Scanner sc = new Scanner(System.in);
		String menu[] = { "떡", "햄", "치", "쫄", "된" };

		int ladder[][] = {

				{ 0, 0, 0, 0, 0 },

				{ 1, 2, 0, 1, 2 },

				{ 0, 1, 2, 0, 0 },

				{ 0, 0, 1, 2, 0 },

				{ 1, 2, 0, 0, 0 },

				{ 0, 1, 2, 0, 0 },

				{ 1, 2, 0, 0, 0 },

				{ 0, 0, 0, 1, 2 },

				{ 0, 0, 0, 0, 0 },

		};
		int x = 0;
		int y = 0;

		for (int i = 0; i < menu.length; i += 1) {
			System.out.printf("(%d)", i);
		}
		System.out.println();

		for (int i = 0; i < ladder.length; i += 1) {

			for (int k = 0; k < ladder[i].length; k += 1) {
				if (ladder[i][k] == 0) {
					System.out.print(" │ ");
				} else if (ladder[i][k] == 1) {
					System.out.print(" ├─");
				} else if (ladder[i][k] == 2) {
					System.out.print("─┤ ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < menu.length; i += 1) {
			System.out.print(" " + menu[i] + " ");
		}

		System.out.print("0 ~ 4 중에 선택 >> ");
		x = sc.nextInt();

		// x값 이동시키기
		for (y = 0; y < ladder.length; y += 1) {

			if (ladder[y][x] == 1) {
				ladder[y][x] = 3;
				ladder[y][x + 1] = 3;
				x += 1;
			} else if (ladder[y][x] == 2) {
				ladder[y][x] = 3;
				ladder[y][x - 1] = 3;
				x -= 1;
			} else if (ladder[y][x] == 0) {
				ladder[y][x] = 3;
			}
			System.out.print(x);
		}
		System.out.println();

		// 선택된 메뉴 출력
		System.out.println("오늘의 메뉴 : " + menu[x]);

		for (int i = 0; i < ladder.length; i += 1) {

			for (int k = 0; k < ladder[i].length; k += 1) {
				if (ladder[i][k] == 0) {
					System.out.print(" │ ");
				} else if (ladder[i][k] == 1) {
					System.out.print(" ├─");
				} else if (ladder[i][k] == 2) {
					System.out.print("─┤ ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
