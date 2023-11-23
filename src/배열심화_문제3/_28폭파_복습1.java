package 배열심화_문제3;

import java.util.Scanner;

public class _28폭파_복습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 5;
		int bomb = 9;
		int wall = 4;
		int road = 0;
		int map[][] = {

				{ 0, 0, 0, 0, 9 },

				{ 0, 0, 4, 4, 0 },

				{ 0, 9, 9, 9, 0 },

				{ 4, 0, 0, 0, 0 },

				{ 9, 0, 0, 0, 0 } };
		int cnt = 5; // 설치된 폭탄 개수
		int bombs[][] = new int[cnt][2]; // {y,x} 설치순서대로 누적됨
		bombs[0][0] = 2;
		bombs[0][1] = 2;

		bombs[1][0] = 0;
		bombs[1][1] = 4;

		bombs[2][0] = 4;
		bombs[2][1] = 0;

		bombs[3][0] = 2;
		bombs[3][1] = 3;

		bombs[4][0] = 2;
		bombs[4][1] = 1;
		sc.close();
	}
}
