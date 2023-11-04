package 배열심화_문제;

import java.util.Arrays;

public class _03갯수찾기 {
	public static void main(String[] args) {
//		문제
//			가장 많이 들어있는 숫자의 갯수와
//			가장 적게 들어있는 숫자의 개수를 합한 값을 출력하시오
//		정답
//			100 : 1개
//			3	: 5개
//			정답	: 6
		// 1. 중복값 없는 숫자 구하기
		// 2. 중복값 없는 숫자의 갯수 구하기
		// 3. 중복값 없는 숫자의 갯수의 min, max 구하기
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };
		int[] copy = null; // 중복 없는 arr 숫자만 들어가게하기 => 1 2 3 100
		int[] count = null; // 중복 없는 arr 숫자 갯수 들어가기 => 2 3 5 1

		copy = new int[arr.length];
		count = new int[arr.length];

		int cnt = 0;

		for (int i = 0; i < arr.length; i += 1) {

			int idx = -1;

			for (int k = 0; k < i; k += 1) {
				if (arr[i] == copy[k]) {
					idx = k;
					break;
				}
			}
			if (idx == -1) {
				copy[cnt] = arr[i];
				cnt += 1;
			}
		}
		System.out.println("copy : " + Arrays.toString(copy));

		count = new int[cnt];

		for (int i = 0; i < count.length; i += 1) {

			for (int k = 0; k < arr.length; k += 1) {
				if (copy[i] == arr[k]) {
					count[i] += 1;
				}
			}
		}
		System.out.println("count : " + Arrays.toString(count));

		int min = count[0];
		int max = count[0];
		int minIdx = 0;
		int maxIdx = 0;
		for (int i = 0; i < count.length; i += 1) {
			if (count[i] < min) {
				min = count[i];
				minIdx = i;
			}
			if (count[i] > max) {
				max = count[i];
				maxIdx = i;
			}
		}
		System.out.printf("%d : %d개\n", copy[minIdx], min);
		System.out.printf("%d : %d개\n", copy[maxIdx], max);
		System.out.println(min + max + "개");
	}
}
