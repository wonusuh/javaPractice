package 배열심화_문제3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _01빙고 {
	public static void main(String[] args) {
//		1. 1부터 50사이의 랜덤 숫자 25개를 중복없이 bingo에 저장한다.
//		2. 행과 열을 입력받아 숫자를 선택한다.
//		3. 가로, 세로, 대각선으로 한 줄을 선택하면, 빙고로 게임은 종료된다.
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
//		int[][] mark = new int[maxNum][maxNum];

		// 중복없이 25개의 숫자 넣기(숫자범위 : 1 ~ 50)
		int[] temp = new int[maxNum * maxNum];
		int cnt = 0;

		while (true) {
			// 종료조건
			if (cnt > 24) {
				System.out.println("빙고!");
				break;
			}

			int num = rn.nextInt(50) + 1;
			boolean check = false;

			// 배열에 이미 있는 숫자인지 검사
			for (int i = 0; i < temp.length; i += 1) {
				if (num == temp[i]) {
					check = true;
					break;
				}

			}

			if (check) {
				continue;
			}

			temp[cnt] = num;
			cnt += 1;
		}

		System.out.println(Arrays.toString(temp));
		// 1차원배열의 값들을 2차원배열에 넣기
		for (int i = 0; i < temp.length; i += 1) {
			int y = i / maxNum;
			int x = i % maxNum;

			bingo[y][x] = temp[i];
		}

		// 빙고 출력
		for (int i = 0; i < bingo.length; i += 1) {
			for (int j = 0; j < bingo[i].length; j += 1) {
				System.out.print(bingo[i][j] + " ");
			}

			System.out.println();
		}

		// 좌표 입력받아서 O표시하기
		boolean win = false;

		while (true) {
			// mark 출력
			for (int i = 0; i < bingo.length; i += 1) {
				for (int j = 0; j < bingo[i].length; j += 1) {
					if (bingo[i][j] != 0) {
						System.out.printf("[%3d]", bingo[i][j]);
					} else {
						System.out.print("[ O ]");
					}

				}

				System.out.println();
			}

			// 승리하면 반복문 종료
			if (win) {
				System.out.println("빙고!");
				break;
			}

			System.out.print("y좌표를 입력하세요. >> ");
			int y = sc.nextInt();

			System.out.print("x좌표를 입력하세요. >> ");
			int x = sc.nextInt();

			// y, x 인덱스 예외
			if (y < 0 || y > bingo.length - 1 || x < 0 || x > bingo[0].length - 1) {
				System.out.println("좌표 범위를 확인하세요.");
				continue;
			}

			bingo[y][x] = 0;
			// 가로 승리 조건
			for (int i = 0; i < bingo[0].length; i += 1) {
				if (bingo[i][0] == bingo[i][1] && bingo[i][1] == bingo[i][2] && bingo[i][2] == bingo[i][3]
						&& bingo[i][3] == bingo[i][4]) {
					win = true;
				}

			}

			// 세로 승리 조건
			for (int i = 0; i < bingo.length; i += 1) {
				if (bingo[0][i] == bingo[1][i] && bingo[1][i] == bingo[2][i] && bingo[2][i] == bingo[3][i]
						&& bingo[3][i] == bingo[4][i]) {
					win = true;
				}
			}

			// 대각선(/) 승리 조건
			int cntO = 0;

			for (int i = 0; i < bingo[0].length; i += 1) {
				if (bingo[i][(bingo[0].length - 1) - i] == 0) {
					cntO += 1;
				}

				if (cntO == 5) {
					win = true;
					break;
				}

			}

			// 대각선(\) 승리 조건
			cntO = 0;

			for (int i = 0; i < bingo[0].length; i += 1) {
				if (bingo[i][i] == 0) {
					cntO += 1;
				}

				if (cntO == 5) {
					win = true;
					break;
				}

			}

		}

		sc.close();
	}

}
