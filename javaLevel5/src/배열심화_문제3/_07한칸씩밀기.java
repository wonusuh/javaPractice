package 배열심화_문제3;

import java.util.Scanner;

public class _07한칸씩밀기 {

	public static void main(String[] args) {
//		동서남북으로 움직이시오.

		String arr[][] = {

				{ "A", "B", "C", "D", "E" },

				{ "1", "2", "3", "4", "5" },

				{ "a", "b", "c", "d", "e" } };
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 출력
			for (int i = 0; i < arr.length; i += 1) {

				for (int j = 0; j < arr[i].length; j += 1) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			System.out.print("입력 (동/서/남/북) >> ");

			String input = sc.nextLine();

			if (input.equals("동")) {

				// 제일 동쪽 값 임시 저장하기
				String one = arr[0][4];
				String two = arr[1][4];
				String three = arr[2][4];

				for (int i = 0; i < arr.length; i += 1) {

					for (int j = arr[i].length - 1; j > 0; j -= 1) {
						arr[i][j] = arr[i][j - 1];
					}
				}

				// 제일 서쪽에 값 넣기
				arr[0][0] = one;
				arr[1][0] = two;
				arr[2][0] = three;
			} else if (input.equals("서")) {

				// 제일 서쪽 값 임시 저장하기
				String one = arr[0][0];
				String two = arr[1][0];
				String three = arr[2][0];

				for (int i = 0; i < arr.length; i += 1) {

					for (int j = 0; j < arr[i].length - 1; j += 1) {
						arr[i][j] = arr[i][j + 1];
					}
				}

				// 제일 동쪽에 값 넣기
				arr[0][4] = one;
				arr[1][4] = two;
				arr[2][4] = three;
			} else if (input.equals("남")) {

				// 배열에 맨 아랫줄 저장하기
				String[] temp = new String[arr[2].length];

				for (int i = 0; i < arr[2].length; i += 1) {
					temp[i] = arr[2][i];
				}

				for (int i = arr.length - 1; i > 0; i -= 1) {

					for (int j = 0; j < arr[i].length; j += 1) {
						arr[i][j] = arr[i - 1][j];
					}
				}

				// 맨 아래줄을 맨 윗줄에 넣기
				for (int i = 0; i < arr[0].length; i += 1) {
					arr[0][i] = temp[i];
				}
			} else if (input.equals("북")) {

				// 배열에 맨 윗줄 저장하기
				String[] temp = new String[arr[0].length];

				for (int i = 0; i < arr[0].length; i += 1) {
					temp[i] = arr[0][i];
				}

				for (int i = 0; i < arr.length - 1; i += 1) {

					for (int j = 0; j < arr[i].length; j += 1) {
						arr[i][j] = arr[i + 1][j];
					}
				}

				// 맨 윗줄을 맨 아랫줄에 넣기
				for (int i = 0; i < arr[2].length; i += 1) {
					arr[2][i] = temp[i];
				}
			} else {
				break;
			}
		}
		sc.close();
	}
}
