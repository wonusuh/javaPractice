package 배열심화_문제2;

import java.util.Arrays;
import java.util.Random;

public class _09이차원랜덤저장 {

	public static void main(String[] args) {
//		[문제] darr배열에 1~50 사이의 숫자 중 25개만 중복되지 않게 저장 후 출력하시오.

//		1. 1차원 배열 생성후 중복없이 랜덤으로 값 넣기
//		2. 2차원에 배열에 다시 집어넣기
		Random rd = new Random();
		int size = 5;
		int[][] darr = new int[size][size];

		int[] temp = new int[size * size];

		int cnt = 0;
		for (int i = 0; i < temp.length;) {
			int rdNum = rd.nextInt(50) + 1;
			boolean check = true;
			for (int k = 0; k < cnt; k += 1) {
				if (rdNum == temp[k]) {
					check = false;
					break;
				}
			}
			if (check) {
				temp[cnt] = rdNum;
				i += 1;
				cnt += 1;
			}

		}
		// 0 ~ 24 12/5 => 2 12%5 => 2
		// 0 1 2 3 4
		// 5 6 7 8 9
		// 10 11 12 13 14
		// 0 ~ 4
		// 0 ~ 4
		System.out.println(Arrays.toString(temp));

		for (int i = 0; i < temp.length; i += 1) {
			int y = i / size;
			int x = i % size;
			darr[y][x] = temp[i];

		}
		for (int i = 0; i < size; i += 1) {
			System.out.println(Arrays.toString(darr[i]));
		}
	}
}
