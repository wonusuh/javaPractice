package 이차원배열_문제;

import java.util.Arrays;

public class _03기본문제3_복습1 {
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

		for (int i = 0; i < arr.length; i += 1) {

			for (int k = 0; k < arr[0].length; k += 1) {
				garo[i] += arr[i][k];
				sero[k] += arr[i][k];
				System.out.println("garo : " + Arrays.toString(garo));
				System.out.println("sero : " + Arrays.toString(sero));
			}
		}
	}
}
