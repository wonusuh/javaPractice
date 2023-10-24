package 배열1_문제;

import java.util.Scanner;

public class _11암기_검색예외처리 {
	public static void main(String[] args) {
//		문제
//			값을 입력받고 인덱스를 출력하시오.
		// 단, 없는 값이면 -1을 출력하시오
//			예)
//				입력 : 67
//				결과 : 4
		int[] array = { 10, 543, 52, 24, 67 };

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 >>");
		int input = sc.nextInt();
		int index = -1;

		for (int i = 0; i < array.length; i += 1) {
			if (input == array[i]) {
				index = i;
			}
		}
		System.out.println(index);
		sc.close();
	}
}
