package 배열2_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _09전파 {
	public static void main(String[] args) {
//		문제
//			인덱스를 입력받고 해당 인덱스의 값을 0으로 변경하시오
//			
//			예)
//				인덱스 입력 :1
//				arr = {9, 0, 9, 9, 9}

//		심화		if문 3개 => if문 2개
//				인덱스를 입력받고 인덱스의 값을 0으로 변경하시오
//				해당 값 양 옆의 값들도 0으로 변경하시오
		Scanner sc = new Scanner(System.in);
		int[] arr = { 9, 9, 9, 9, 9 };
		int input = 0;

		while (true) {
			System.out.println("0으로 변경 할 위치의 인덱스를 입력하세요 >>");
			input = sc.nextInt();
			if (input < 0 || input > arr.length - 1) {
				System.out.println("인덱스 범위를 확인하세요");
				continue;
			}
			break;
		}
		if (input - 1 >= 0) {
			arr[input - 1] = 0;
		}
		if (input + 1 < arr.length) {
			arr[input + 1] = 0;
		}
		arr[input] = 0;
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
