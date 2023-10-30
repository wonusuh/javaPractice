package _level3test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
//				인덱스를 입력받고 해당 인덱스의 값을  0으로 변경
//				
//				추가조건 : 해당 값 양옆의 값들도 8로 변경 
//				단, 0, 4 인덱스일경우는 양옆중 한개만 8로 변경 
//				
//				(예) 1 ==> {8,0,8,9,9}
//				(예) 4 ==> {9,9,9,8,0}
		int arr[] = { 9, 9, 9, 9, 9 };

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.print("인덱스를 입력하세요 >>");

			int idx = sc.nextInt();

			if (idx < 0 || idx > 4) {
				break;
			}

			if (idx != 0 && idx != arr.length - 1) {
				arr[idx - 1] = 8;
				arr[idx + 1] = 8;
			}
			if (idx == 0) {
				arr[idx + 1] = 8;
			}
			if (idx == arr.length - 1) {
				arr[idx - 1] = 8;
			}
			arr[idx] = 0;
		}
		sc.close();
	}
}
