package 배열심화_문제3;

import java.util.Scanner;

public class _20회전 {

	public static void main(String[] args) {
		// 문제 아래 명령어를 입력받을때마다 block배열을 90도 회전해보세요.
//		[1. turn left] [2.turn right]

		int block[][] = {

				{ 1, 2, 3, 4 },

				{ 5, 6, 7, 8 },

				{ 9, 10, 11, 12 },

				{ 13, 14, 15, 16 } };
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 출력
			for (int i = 0; i < block.length; i += 1) {

				for (int j = 0; j < block[i].length; j += 1) {
					System.out.printf("%-3d", block[i][j]);
				}
				System.out.println();
			}
			System.out.println("[1. turn left] [2. turn right]");
			System.out.print(">> ");

			int input = sc.nextInt();
			int temp[][] = new int[block.length][block[0].length];

			if (input == 1) {
				// 왼

				for (int i = 0; i < block.length; i += 1) {

					for (int j = 0; j < block[i].length; j += 1) {
						temp[i][j] = block[j][block.length - 1 - i];
					}
				}
				block = temp;
			} else if (input == 2) {
				// 오른

				for (int i = 0; i < block.length; i += 1) {

					for (int j = 0; j < block[i].length; j += 1) {
						temp[i][j] = block[block.length - 1 - j][i];
					}
				}
				block = temp;
			} else {
				// 종료
				break;
			}
		}
		sc.close();
	}
}
