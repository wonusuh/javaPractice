package 배열1_문제;

import java.util.Scanner;

public class _03배열기본3 {
	public static void main(String[] args) {
//		문제
//			숫자 한 개를 입력받고,
//			배열 안에서 그 숫자보다 작은 값만 출력하시오.
//			
//			예)
//				입력 : 44
//				결과 : 10, 20, 30, 40
		int[] array = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 >>");
		int input = sc.nextInt();
		for (int i = 0; i < array.length; i += 1) {
			if (input > array[i]) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}
}
