package 배열심화_문제3;

import java.util.Scanner;

public class _13달팽이 {

	public static void main(String[] args) {
		// 사이즈를 입력받아서 다음과 같이 출력하시오
		// 예 : 사이즈 5
//1  2  3  4  5
//16 17 18 19 6
//15 24 25 20 7
//14 23 22 21 8
//13 12 11 10 9

		Scanner sc = new Scanner(System.in);
		System.out.print("사이즈 입력 >> ");

		int size = sc.nextInt();
		int[][] arr = new int[size][size];

		int dir = 0;
		int num = 1;
		int count = size * size; // 25
		int y = 0;
		int x = 0;
		arr[y][x] = num;
		while (count > 1) {
			int px = x;
			int py = y;
			System.out.printf("py %d px %d %n", py, px);
			if (dir == 4) {
				dir = 0;
			}
			if (dir == 0) {
				// x 증가
				if (px < size - 1) {
					px += 1;
				}
			} else if (dir == 1) {
				// y 증가
				if (py < size - 1) {
					py += 1;
				}
			} else if (dir == 2) {
				// x 감소
				if (px > 0) {
					px -= 1;
				}
			} else if (dir == 3) {
				// y 감소
				if (py > 0) {
					py -= 1;
				}
			}
			if (arr[py][px] != 0) {
				dir += 1;
			} else {
				// arr[py][px] == 0
				num += 1;
				x = px;
				y = py;
				arr[y][x] = num;
				count -= 1;
			}

		}

		for (int[] nums : arr) {
			for (int number : nums) {
				System.out.printf("%-4d", number);
			}
			System.out.println();
		}
		sc.close();
	}
}