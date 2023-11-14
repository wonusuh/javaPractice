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

		System.out.print("사이즈를 입력하세요. >> ");

		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int dir = 0;
		int num = 1;

		int cnt = size * size;
		int y = 0;
		int x = 0;

		while (cnt > 0) {

			num += 1;
			cnt -= 1;
		}
		sc.close();
	}
}
