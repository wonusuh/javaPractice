package 배열심화_문제2;

import java.util.Arrays;

public class _05배열이동1 {
	public static void main(String[] args) {
//		문제
//			아래 class1부터 class5 배열은 각 반의 시험점수를 저장한 것이다.
//			각 반의 총점이 높은 순서대로 세 반을 뽑아서 win배열에 저장 후,
//			win 배열의 모든 내용을 출력하시오.
//		정답
//			win = 
//			[50, 45, 25, 87, 49]
//			[70, 84, 64, 21 ,11]
//			[65, 14, 24, 75, 25]
		int[][] classList = {

				{ 10, 54, 65, 22, 15 },

				{ 65, 14, 24, 75, 25 },

				{ 50, 45, 25, 87, 49 },

				{ 11, 66, 5, 21, 95 },

				{ 70, 84, 64, 21, 11 } };
		int[][] win = new int[3][]; // [null, null, null]

		for (int k = 0; k < classList.length; k += 1) {
			int max = 0;
			int idx = 0;
			for (int i = k; i < classList.length; i += 1) {

				int sum = 0;
				for (int j = 0; j < classList[i].length; j += 1) {
					sum += classList[i][j];
				}

				System.out.println(k + " " + sum);
				if (sum > max) {
					max = sum;
					idx = i;
				}
			}

			int[] temp = classList[k];
			classList[k] = classList[idx];
			classList[idx] = temp;
		}
		System.out.println(Arrays.deepToString(classList));

		for (int i = 0; i < win.length; i += 1) {
			win[i] = classList[i];
		}
		System.out.println(Arrays.deepToString(win));
	}
}
