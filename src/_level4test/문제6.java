package _level4test;

public class 문제6 {
	public static void main(String[] args) {
		int[][] arr = {
				// 번호 국어 수학 영어
				{ 1001, 100, 20, 32 },

				{ 1002, 40, 43, 12 },

				{ 1003, 60, 21, 42 },

				{ 1004, 76, 54, 55 },

				{ 1005, 23, 11, 76 } };
		// [문제1] 모든 점수의 총합 출력
		// [정답1] 665
		int total = 0;
		for (int i = 0; i < arr.length; i += 1) {

			for (int k = 1; k < arr[i].length; k += 1) {
				total += arr[i][k];
			}
		}
		System.out.println("모든 점수의 총합 : " + total);

		// [문제2] 수학1등 번호 출력
		// [문제2] 1004
		int mathMax = 0;
		int maxIdx = -1;
		for (int i = 0; i < arr.length; i += 1) {

			if (arr[i][2] > mathMax) {
				mathMax = arr[i][2];
				maxIdx = i;
			}
		}
		System.out.println("수학1등 번호 : " + arr[maxIdx][0]);

		// [문제3] 전체1등 번호 출력
		// [정답3] 1004
		int firstSum = 0;
		int firstNum = 0;
		for (int i = 0; i < arr.length; i += 1) {

			int sum = 0;
			for (int k = 1; k < arr[i].length; k += 1) {
				sum += arr[i][k];
			}

			if (sum > firstSum) {
				firstSum = sum;
				firstNum = arr[i][0];
			}
		}
		System.out.println("전체1등 번호 : " + firstNum);

		// [문제4] 수학점수가 국어점수 보다 높은 번호 출력
		// [정답4] 1002
		System.out.print("수학점수가 국어점수보다 높은 학생들 : ");
		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i][2] > arr[i][1]) {
				System.out.println(arr[i][0] + " ");
			}
		}

		// [문제5] 총 점수가 높은 순서대로 번호들을 출력
		// [정답5] 1004 1001 1003 1005 1002
		// 정렬시키기
		for (int m = 0; m < arr.length; m += 1) {

			int max = 0;
			int idx = -1;
			for (int i = m; i < arr.length; i += 1) {

				int sum = 0;
				for (int k = 1; k < arr[i].length; k += 1) {
					sum += arr[i][k];
				}

				if (sum > max) {
					max = sum;
					idx = i;
				}
			}
			int[] temp = arr[m];
			arr[m] = arr[idx];
			arr[idx] = temp;
		}

		// 출력
		System.out.print("총 점수가 높은 순서대로 정렬 : ");
		for (int i = 0; i < arr.length; i += 1) {
			System.out.print(arr[i][0] + " ");
		}
	}
}
