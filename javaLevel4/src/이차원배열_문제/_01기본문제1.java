package 이차원배열_문제;

import java.util.Arrays;

public class _01기본문제1 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
//		문제1 => {{10,20,30},{40,50,60},{70,80,90}}만들기
//		문제2 전체 합출력 450
//		문제3 4의 배수만 출력 20 40 60 80
//		문제4 4의 배수의 합 출력 200
//		문제5 4의 배수의 개수 출력 4

		int temp = 10;
		int total = 0;
		int fourTimes = 0;
		int fourTimesCnt = 0;

		for (int i = 0; i < arr.length; i += 1) {

			for (int k = 0; k < arr[i].length; k += 1) {
				arr[i][k] = temp;
				total += temp;

				if (temp % 4 == 0) {
					System.out.print(temp + " ");
					fourTimes += temp;
					fourTimesCnt += 1;
				}
				temp += 10;
			}
		}
		System.out.println();
		System.out.println(Arrays.deepToString(arr));
		System.out.println(total);
		System.out.println(fourTimes);
		System.out.println(fourTimesCnt);
	}
}
