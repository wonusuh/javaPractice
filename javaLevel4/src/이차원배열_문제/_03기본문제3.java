package 이차원배열_문제;

import java.util.Arrays;

public class _03기본문제3 {
	public static void main(String[] args) {
		int[][] arr = {

				{ 101, 102, 103, 104 },

				{ 201, 202, 203, 204 },

				{ 301, 302, 303, 304 }

		};

		int[] garo = new int[3];
		int[] sero = new int[4];
////		문제1) 가로합 출력 : 410, 810, 1210
////		문제2) 세로합 출력 : 603, 606, 609, 612
//
//		for (int i = 0; i < garo.length; i += 1) {
//
//			int sum = 0;
//
//			for (int k = 0; k < arr[i].length; k += 1) {
//				sum += arr[i][k];
//			}
//			garo[i] = sum;
//			System.out.println(Arrays.toString(garo));
//		}
////
//		for (int i = 0; i < sero.length; i += 1) {
//
//			int sum = 0;
//
//			for (int k = 0; k < 3; k += 1) {
//				sum += arr[k][i];
//			}
//			sero[i] = sum;
//			System.out.println(Arrays.toString(sero));
//		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				garo[i] += arr[i][j];
				sero[j] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));
	}
}
