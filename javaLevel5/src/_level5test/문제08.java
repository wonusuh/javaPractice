package _level5test;

import java.util.Scanner;

public class 문제08 {

	public static void main(String[] args) {
//				 * [달팽이]
//				 * 아래와같이 출력하시오.
//				 * 
//				 * 
//				 * 1	2	3	4	5	
//				 * 16	17	18	19	6	
//				 * 15	24	25	20	7	
//				 * 14	23	22	21	8	
//				 * 13	12	11	10	9

		Scanner sc = new Scanner(System.in);
		System.out.print("달팽이의 size를 입력하세요. >> ");
		int size = sc.nextInt();

		int[][] snail = new int[size][size];
		int dir = 0;
		int num = 1;
		int y = 0;
		int x = 0;

		for (int i = 0; i < size * size; i += 1) {
			snail[y][x] = num;

			int yPre = y;
			int xPre = x;

			if (dir == 0) {
				// 동
				x = xPre + 1;

				if (x > size - 1 || snail[y][x] != 0) {
					x = xPre;
					y += 1;
					dir = 1;
				}
			} else if (dir == 1) {
				// 남
				y = yPre + 1;

				if (y > size - 1 || snail[y][x] != 0) {
					y = yPre;
					x -= 1;
					dir = 2;
				}
			} else if (dir == 2) {
				// 서
				x = xPre - 1;

				if (x < 0 || snail[y][x] != 0) {
					x = xPre;
					y -= 1;
					dir = 3;
				}
			} else if (dir == 3) {
				// 북
				y = yPre - 1;

				if (y < 0 || snail[y][x] != 0) {
					y = yPre;
					x += 1;
					dir = 0;
				}
			}
			num += 1;
		}

		// 달팽이 출력
		for (int i = 0; i < snail.length; i += 1) {

			for (int j = 0; j < snail[i].length; j += 1) {
				System.out.printf("%-3d", snail[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
