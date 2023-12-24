package 배열1_문제;

import java.util.Scanner;

public class _10검색값 {
	public static void main(String[] args) {
//		문제
//			값을 입력받고 인덱스를 출력하시오
//			예)
//				입력 : 67
//				결과 : 4
		int[] array = { 10, 543, 52, 24, 67 };

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		int input = sc.nextInt();

		for (int i = 0; i < array.length; i += 1) {
			if (input == array[i]) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
