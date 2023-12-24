package 배열심화_문제2;

import java.util.Scanner;

public class _20인형뽑기1 {

	public static void main(String[] args) {
//		1. machine 베열은 인형뽑기 기계의 데이터이다 (7 * 5)
//		2. 인형의 번호는 다음과 같다.
//		[1 : 호랑이][2 : 곰][3 : 사자][5 : 기린]
//		1) 숫자 0은 비어있는곳을 의미한다.
//		2) 숫자0이 아닌곳은 인형을 의미한다.
		int[][] machine = {

				{ 0, 0, 0, 0, 0 },

				{ 0, 0, 0, 0, 3 },

				{ 0, 2, 0, 0, 3 },

				{ 3, 1, 3, 0, 1 },

				{ 1, 4, 2, 0, 2 },

				{ 4, 1, 4, 0, 4 },

				{ 2, 1, 4, 3, 3 } };
		String[] nameList = { "호랑이", "곰", "사자", "기린" };
		Scanner sc = new Scanner(System.in);

		while (true) {

			for (int i = 0; i < machine.length; i += 1) {

				for (int j = 0; j < machine[i].length; j += 1) {
					System.out.print(machine[i][j] + " ");
				}
				System.out.println();
			}

			if (machine[machine.length - 1][0] == 0 && machine[machine.length - 1][1] == 0
					&& machine[machine.length - 1][2] == 0 && machine[machine.length - 1][3] == 0
					&& machine[machine.length - 1][4] == 0) {
				System.out.println("더이상 인형이 없습니다.");
				break;
			}

			System.out.print("뽑을 위치의 인덱스를 입력하세요 >> ");

			int input = sc.nextInt();

			if (input < 0 || input > machine.length - 1) {
				System.out.println("인덱스를 다시 입력하세요");
				continue;
			}

			for (int i = 0; i < machine.length; i += 1) {

				if (i == machine.length - 1 && machine[i][input] == 0) {
					System.out.println("꽝");
				}

				if (machine[i][input] != 0) {
					System.out.println(nameList[machine[i][input] - 1]);
					machine[i][input] = 0;
					break;
				}
			}
		}
		sc.close();
	}
}
