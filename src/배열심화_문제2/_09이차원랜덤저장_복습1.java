package 배열심화_문제2;

import java.util.Arrays;
import java.util.Random;

public class _09이차원랜덤저장_복습1 {
	public static void main(String[] args) {
//		[문제] darr배열에 1~50 사이의 숫자 중 25개만 중복되지 않게 저장 후 출력하시오.

//		1. 1차원 배열 생성후 중복없이 랜덤으로 값 넣기
//		2. 2차원에 배열에 다시 집어넣기
		Random rn = new Random();
		int size = 5;
		int[][] darr = new int[size][size];
		;
		int[] temp = new int[size * size];

		for (int i = 0; i < temp.length;) {

			int num = rn.nextInt(50 - 1 + 1) + 1;
			System.out.print(num + " ");
			boolean dupl = false;

			for (int k = 0; k < temp.length; k += 1) {

				if (num == temp[k]) {
					dupl = true;
					System.out.print("<< 중복 ");
					break;
				}
			}

			if (!dupl) {
				temp[i] = num;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(temp));

		for (int i = 0; i < temp.length; i += 1) {

			int y = i / size;
			int x = i % size;
			System.out.println(y + " " + x);

			darr[y][x] = temp[i];
		}
		System.out.println();
		System.out.println(Arrays.deepToString(darr));
	}
}
