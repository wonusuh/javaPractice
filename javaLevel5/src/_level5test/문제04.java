package _level5test;

import java.util.Scanner;

public class 문제04 {

	public static void main(String[] args) {
//		아래 명령어를 선택할 때마다
//		block 배열을 90도 회전시키시오.
//		
//		[1.left_turn] [2.right_turn]
//		
//		예)
//			입력 : 1
//			
//			4 8 12 16
//			3 7 11 15
//			2 6 10 14
//			1 5 9  13

		int[][] block = {

				{ 1, 2, 3, 4 },

				{ 5, 6, 7, 8 },

				{ 9, 10, 11, 12 },

				{ 13, 14, 15, 16 } };
		Scanner sc = new Scanner(System.in);

		while (true) {

			int[][] tempo = new int[block.length][block[0].length];

			// 출력
			for (int i = 0; i < block.length; i += 1) {

				for (int j = 0; j < block[i].length; j += 1) {
					System.out.printf("%-3d", block[i][j]);
				}
				System.out.println();
			}
			System.out.println("[1.left_turn] [2.right_turn]");
			System.out.print(">> ");

			int input = sc.nextInt();

			if (input == -1) {
				break;
			} else if (input == 1) {
				// left

				for (int i = 0; i < tempo.length; i += 1) {

					for (int j = 0; j < tempo[i].length; j += 1) {
						tempo[i][j] = block[j][(block.length - 1) - i];
					}
				}
			} else if (input == 2) {
				// right

				for (int i = 0; i < tempo.length; i += 1) {

					for (int j = 0; j < tempo[i].length; j += 1) {
						tempo[i][j] = block[(block.length - 1) - j][i];
					}
				}
			}
			block = tempo;
		}
		sc.close();
	}
}
