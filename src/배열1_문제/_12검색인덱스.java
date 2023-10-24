package 배열1_문제;

import java.util.Scanner;

public class _12검색인덱스 {
	public static void main(String[] args) {
//		문제
//			인덱스를 입력받고 값을 출력하세요
//			예)
//				입력 : 3
//				결과 : 24
		int[] array = { 10, 543, 52, 24, 67 };

		Scanner sc = new Scanner(System.in);
		System.out.println("인덱스를 입력하세요 >>");
		int index = sc.nextInt();

		if (index < 0 || index > array.length) {
			System.out.println("배열범위오류");
		} else {
			System.out.println(array[index]);
		}
		sc.close();
	}
}
