package 배열심화_문제3;

import java.util.Random;
import java.util.Scanner;

public class _01빙고_정답 {

	public static void main(String[] args) {
//			1. 1부터 50사이의 랜덤 숫자 25개를 중복없이 bingo에 저장한다.
//			2. 행과 열을 입력받아 숫자를 선택한다.
//			3. 가로, 세로, 대각선으로 한 줄을 선택하면, 빙고로 게임은 종료된다.
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int maxNum = 5;

		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];

		// 1부터 50까지 랜덤 숫자 중복 없이 저장
		int[] temp = new int[maxNum * maxNum]; // 25
		for (int i = 0; i < temp.length;) {
			int rNum = ran.nextInt(50) + 1;
			boolean check = true;
			for (int k = 0; k < i; k += 1) {
				if (rNum == temp[k]) {
					check = false;
					break;
				}
			}

			if (check) {
				temp[i] = rNum;
				i += 1;
			}

		}

		// System.out.println(Arrays.toString(temp));

//		for(int i =0; i < temp.length;i+=1) {
//			int y = i / maxNum;
//			int x = i % maxNum;
//			bingo[y][x] = temp[i];
//		}
//		
		int idx = 0;
		for (int i = 0; i < maxNum; i += 1) {
			for (int k = 0; k < maxNum; k += 1) {
				bingo[i][k] = temp[idx];
				idx += 1;
			}
		}

		boolean win = false;

		while (true) {

			for (int i = 0; i < maxNum; i += 1) {
				for (int k = 0; k < maxNum; k += 1) {
					if (mark[i][k] == 1) {
						System.out.print("[ O ]");
					} else {
						System.out.printf("[%3d]", bingo[i][k]);
					}
				}
				System.out.println();
			}

			// 승리종료
			if (win) {
				System.out.println("BINGO!!");
				System.out.println("게임종료");
				break;
			}

			System.out.print("y 좌표 >> ");
			int y = scan.nextInt();
			System.out.print("x 좌표 >> ");
			int x = scan.nextInt();

			if (y < 0 || x < 0 || y >= maxNum || x >= maxNum) {
				System.out.println("인덱스 범위오류");
				continue;
			}
			if (mark[y][x] != 0) {
				System.out.println("이미 표시된 숫자값");
				continue;
			}
			mark[y][x] = 1;

			// 가로체크
			for (int i = 0; i < maxNum; i += 1) {
				int cnt = 0;
				for (int k = 0; k < maxNum; k += 1) {
					if (mark[i][k] == 1) {
						cnt += 1;
					}
				}
				if (cnt == 5) {
					win = true;
					break;
				}
			}

			if (win)
				continue;

			// 세로체크
			for (int i = 0; i < maxNum; i += 1) {
				int cnt = 0;
				for (int k = 0; k < maxNum; k += 1) {
					if (mark[k][i] == 1) {
						cnt += 1;
					}
				}
				if (cnt == 5) {
					win = true;
					break;
				}
			}

			if (win)
				continue;

			// 대각선 \
			int cnt = 0;
			for (int i = 0; i < maxNum; i += 1) {
				if (mark[i][i] == 1) {
					cnt += 1;
				}
			}

			if (cnt == 5) {
				win = true;
			}

			if (win)
				continue;

			// 대각선/
			cnt = 0;
			for (int i = 0; i < maxNum; i += 1) {
				if (mark[i][maxNum - 1 - i] == 1) {
					cnt += 1;
				}
			}
			if (cnt == 5) {
				win = true;
			}

		}
		scan.close();
	}
}
