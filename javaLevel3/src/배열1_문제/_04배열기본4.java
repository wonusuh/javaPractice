package 배열1_문제;

import java.util.Scanner;

public class _04배열기본4 {
	public static void main(String[] args) {
//			문제
//				인덱스를 입력받고,
//				그 인덱스보다 작은 인덱스의 값만 출력하시오
//				
//				예)
//					입력 : 2
//					결과 : 10, 20
		Scanner sc = new Scanner(System.in);
		int[] array = { 10, 20, 30, 40, 50 };
		System.out.print("입력 : ");
		int input = sc.nextInt();
		for (int i = 0; i < array.length; i += 1) {
			if (input > array[i]) {
				System.out.print(i != 0 ? ", " + array[i] : array[i]);
			}
		}
		sc.close();
	}
}
