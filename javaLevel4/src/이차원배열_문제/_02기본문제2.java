package 이차원배열_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _02기본문제2 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];

		int k = 1;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
//		문제1 인덱스 2개를 입력받아 값 출력
//		예 인덱스1입력 : 1, 인덱스2입력 2
//				값 출력 : 60;
//		
//		문제2 값을 입력받아 인덱스 두 개 출력
//		예 값입력 60
//		인덱스1 : 1, 인덱스2 :2
//		
//		문제3 가장 큰 값의 인덱스 2개 출력
//		 2 2
//		
//		문제4 값 2개를 입력받아 값 교체
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====문제1=====");
			System.out.print("인덱스1 입력 : ");
			int idx1 = sc.nextInt();
			System.out.print("인덱스2 입력 : ");
			int idx2 = sc.nextInt();

			// 인덱스 범위 예외
			if (idx1 < 0 || idx1 > arr.length - 1 || idx2 < 0 || idx2 > arr.length - 1) {
				System.out.println("인덱스 범위 예외");
				continue;
			}
			System.out.println("값 출력 : " + arr[idx1][idx2]);

			System.out.println("=====문제2=====");
			System.out.print("인덱스를 찾을 값 입력 : ");

			int value = sc.nextInt();
			boolean checkVal = false;

			for (int i = 0; i < arr.length; i += 1) {

				for (int j = 0; j < arr[i].length; j += 1) {
					if (value == arr[i][j]) {
						System.out.println(i + " " + j);
						checkVal = true;
						break;
					}
				}
			}

			if (!checkVal) {
				System.out.println("찾는 값이 없습니다");
			}

			System.out.println("=====문제3=====");
			System.out.print("가장 큰 값의 인덱스 둘을 출력합니다. ");

			int max = 0;
			int maxI = -1;
			int maxJ = -1;

			for (int i = 0; i < arr.length; i += 1) {

				for (int j = 0; j < arr[i].length; j += 1) {
					if (max < arr[i][j]) {
						max = arr[i][j];
						maxI = i;
						maxJ = j;
					}
				}
			}
			System.out.println(maxI + " " + maxJ);

			System.out.println("=====문제4=====");
			System.out.print("찾을 값을 입력하세요 >> ");

			int before = sc.nextInt();
			int beforeI = -1;
			int beforeJ = -1;
			boolean check1 = false;

			for (int i = 0; i < arr.length; i += 1) {

				for (int j = 0; j < arr[i].length; j += 1) {
					if (before == arr[i][j]) {
						beforeI = i;
						beforeJ = j;
						check1 = true;
					}
				}
			}
			System.out.print("자리를 바꿀 위치의 값을 입력하세요 >> ");

			int after = sc.nextInt();
			int afterI = -1;
			int afterJ = -1;
			boolean check2 = false;

			for (int i = 0; i < arr.length; i += 1) {

				for (int j = 0; j < arr[i].length; j += 1) {
					if (after == arr[i][j]) {
						afterI = i;
						afterJ = j;
						check2 = true;
					}
				}
			}
//			int tempI = -1;
//			int tempJ = -1;
//			tempI = beforeI;
//			tempJ = beforeJ;
//			beforeI = afterI;
//			beforeJ = afterJ;
//			afterI = tempI;
//			afterJ = tempJ;
			if (check1 && check2) {
				int temp = arr[beforeI][beforeJ];
				arr[beforeI][beforeJ] = arr[afterI][afterJ];
				arr[afterI][afterJ] = temp;
				System.out.println(Arrays.deepToString(arr));
			} else {
				System.out.println("찾는 값이 없습니다.");
			}

			break;
		}
		sc.close();
	}
}
