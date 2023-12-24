package 배열심화_문제;

import java.util.Arrays;

public class _02가로세로합 {
	public static void main(String[] args) {
//		아래 배열은 1~9 사이의 숫자가 섞여서 저장되어 있는
//		길이가 9인 배열이다.
//		
//			   arr 배열을 아래와 같이 사각형 모양으로 출력하고,
//		[문제1] 각 줄의 가로합을 garo배열에 차례대로 저장하고 출력하시오.
//		[정답1] garo = {12, 14, 19}
//			
//		[문제2] 각 줄의 세로합을 sero배열에 차례대로 저장하고 출력하시오.
//		[정답2] sero = {19, 12, 14}
		int arr[] = { // 0 1 2
				2, 4, 6, // 3 4 5
				8, 1, 5, // 6 7 8
				9, 7, 3 };

		int[] garo = { 0, 0, 0 }; // {2+4+6 , 8+1+5 , 9+7+3}
		int[] sero = { 0, 0, 0 }; // {2+8+9 , 4+1+7 , 6+5+3}

		int garoIdx = 0;

		for (int i = 0; i < arr.length; i += 1) {
			garo[garoIdx] += arr[i];
			if (i % 3 == 2) {
				garoIdx += 1;
			}
		}

		int seroIdx = 0;
		for (int i = 0; i < arr.length; i += 1) {
			sero[seroIdx] += arr[i];
			seroIdx += 1;
			if (i % 3 == 2) {
				seroIdx = 0;
			}
		}

		for (int i = 0; i < garo.length; i += 1) {
			// System.out.printf("%d %d %d \n" , i*3 , i*3+1 , i*3+2);
			// System.out.println("==================");
			// System.out.printf("%d %d %d \n" , i , i+3 , i+6);
			// System.out.println("==================");
			garo[i] = arr[i * 3] + arr[i * 3 + 1] + arr[i * 3 + 2];
			sero[i] = arr[i] + arr[i + 3] + arr[i + 6];
		}

		System.out.println(Arrays.toString(garo));
		System.out.println(Arrays.toString(sero));
	}
}
