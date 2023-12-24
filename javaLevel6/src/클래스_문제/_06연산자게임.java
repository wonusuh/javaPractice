package 클래스_문제;

import java.util.Scanner;

class MathGame {
	int arr[][] = {

			{ 5, 9, 0 },

			{ 3, 7, 1 },

			{ 8, 4, 2 },

			{ 4, 4, 3 },

			{ 2, 2, 0 },

			{ 4, 6, 0 },

			{ 9, 2, 3 } };
	int answerCnt;
}

public class _06연산자게임 {

	public static void main(String[] args) {

		MathGame m = new MathGame();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < m.arr.length; i += 1) {

			int result = -123;

			if (m.arr[i][2] == 0) {
				result = m.arr[i][0] + m.arr[i][1];
			} else if (m.arr[i][2] == 1) {
				result = m.arr[i][0] - m.arr[i][1];
			} else if (m.arr[i][2] == 2) {
				result = m.arr[i][0] * m.arr[i][1];
			} else if (m.arr[i][2] == 3) {
				result = m.arr[i][0] % m.arr[i][1];
			}

			System.out.printf("(%d) %d ? %d == %d\n", i + 1, m.arr[i][0], m.arr[i][1], result);
			System.out.println("[1] + [2] - [3] * [4] %");
			System.out.print(">> ");
			int answer = sc.nextInt();

			int myResult = -123;

			if (answer == 1) {
				myResult = m.arr[i][0] + m.arr[i][1];
			} else if (answer == 2) {
				myResult = m.arr[i][0] - m.arr[i][1];
			} else if (answer == 3) {
				myResult = m.arr[i][0] * m.arr[i][1];
			} else if (answer == 4) {
				myResult = m.arr[i][0] % m.arr[i][1];
			}

			if (myResult == result) {
				System.out.println("정답!");
				m.answerCnt += 1;
			} else {
				System.err.println("오답!");
			}
		}
		System.out.println("맞춘 갯수 : " + m.answerCnt);
		sc.close();
	}
}
