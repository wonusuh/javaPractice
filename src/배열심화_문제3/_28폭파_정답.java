package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _28폭파_정답 {

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

		while (true) {

			for (int[] bombData : bombs) {
				System.out.println(Arrays.toString(bombData));
			}
			System.out.println("===========");

			for (int[] datas : map) {

				for (int data : datas) {

					if (data == bomb) {
						System.out.print("@ ");
					} else if (data == wall) {
						System.out.print("□ ");
					} else {
						System.out.print("+ ");
					}
				}
				System.out.println();
			}
			System.out.println("5번 폭파");

			int sel = sc.nextInt();

			if (sel != 5) {
				break;
			}

			if (cnt == 0) {
				System.out.println("게임 종료");
				break;
			}

			// 5번을 눌럿고 폭파할 폭탄이 있다는 의미
			int bombCnt = 1;
			boolean check = false;

			while (bombCnt > 0) {

				// 첫번째 폭탄 터지기
				int y = bombs[0][0];
				int x = bombs[0][1];

				for (int[] bombData : bombs) {
					System.out.println(Arrays.toString(bombData));
				}
				System.out.println("===========");

				// 주변에 폭탄이 더 있는지 체크 -1
				for (int i = -1; i <= 1; i += 1) { // -1 0 1
													// 1
					if (y + i >= 0 && y + i < size) {

						if (map[y + i][x] == bomb && i != 0) {
							y = y + i; // 옆에 폭탄의 위치값으로 y 값 재정의
							check = true;
						} else {
							map[y + i][x] = road;
						}
					}

					if (x + i >= 0 && x + i < size) {

						if (map[y][x + i] == bomb && i != 0) {
							x = x + i;
							check = true;
						} else {
							map[y][x + i] = road;
						}
					}
				}

				// 근처 폭탄도 같이 폭파하기
				if (check) {

					// 근처 폭탄의 인덱스 위치를 첫번째로 이동
					bombs[0][0] = y;
					bombs[0][1] = x;

					// 기존에 폭탄 위치를 제외하고 뒤에 있는 폭탄 땡기기
					for (int i = 1; i < cnt; i += 1) {

						if (bombs[i][0] == y && bombs[i][1] == x) { // 기존에 있던 옆 폭탄의 순위 인덱스 위치

							// 땡기기
							for (int k = i; k < cnt - 1; k += 1) {
								bombs[k] = bombs[k + 1];
							}
						}
					}
					bombCnt += 1; // 폭탄이 한개 더 증가했으니깐 bombCnt 증가
					check = false;
				} else { // 주변에 폭탄이 없을때

					for (int i = 0; i < cnt - 1; i += 1) {
						bombs[i] = bombs[i + 1];
					}
				}

				bombs[cnt - 1] = new int[2];

				cnt -= 1;
				bombCnt -= 1;
			}
			System.out.println("!!!!!!!!Bomb!!!!!!!!!");
		}
		sc.close();
	}
}
