package 배열2_문제;

import java.util.Scanner;

public class _01일정범위합 {
	public static void main(String[] args) {
//		문제
//			인덱스 2개를 입력받고
//			작은 인덱스부터 큰 인덱스까지의 값들의 합을 출력하시오
//			단, index1이 index2보다 더 크더라도
//			작은 인덱스부터 큰 인덱스까지의 합을 출력하시오
//			
//		예)
//			인덱스 1 입력 : 1
//			인덱스 2 입력 : 3
//			출력 : 43+ 25 +76 = 144
//			
//			인덱스 1 입력 : 4
//			인덱스 2 입력 : 1
//			출력 : 43 + 23 + 76 + 3 = 147
		Scanner sc = new Scanner(System.in);
		int[] array = { 10, 43, 25, 76, 3, 100, 56 };

		int index1 = 0;
		int index2 = 0;

		while (true) {
			System.out.println("인덱스 1 입력 >>");
			index1 = sc.nextInt();
			System.out.println("인덱스 2 입력 >>");
			index2 = sc.nextInt();

			if (index1 < 0 || index1 > array.length - 1 || index2 < 0 || index2 > array.length - 1) {
				System.out.println("범위오류");
				continue;
			}
			if (index1 == index2) {
				System.out.println("인덱스가 같을 수 없습니다.");
				continue;
			}
			break;
		}

		if (index1 > index2) {
			int temp = index1;
			index1 = index2;
			index2 = temp;
		}

		int sum = 0;
		for (int i = index1; i <= index2; i += 1) {
			if (i == index2) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + " + ");
			}
			sum += array[i];
		}
		System.out.println(" == " + sum);
		sc.close();
	}
}
