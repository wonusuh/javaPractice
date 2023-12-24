package 배열2_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _12값교체 {
	public static void main(String[] args) {
//		문제
//			값 2개를 입력받아 arr배열에서 두 값을 교체하시오
//			단, 없는 값을 입력했을 시 예외처리를 하시오
//			
//			예)
//				값 1 입력 : 40
//				값 2 입력 : 20
//				결과 : {10, 40 ,30, 20, 50}
//				
//				값 1 입력 : 87
//				값 2 입력 : 20
//				결과 : 값을 잘못입력했습니다
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		int idx1 = -1;
		int idx2 = -1;
		while (true) {
			int val1 = 0;
			System.out.println("교체할 값 1 입력>>");
			val1 = sc.nextInt();
			int val2 = 0;
			System.out.println("교체할 값 2 입력>>");
			val2 = sc.nextInt();

			for (int i = 0; i < arr.length; i += 1) {
				if (arr[i] == val1) {
					idx1 = i;
				}
			}
			for (int i = 0; i < arr.length; i += 1) {
				if (arr[i] == val2) {
					idx2 = i;
				}
			}
			if (idx1 == -1 || idx2 == -1) {
				System.out.println("값이 없습니다");
				continue;
			}
			break;
		}
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
