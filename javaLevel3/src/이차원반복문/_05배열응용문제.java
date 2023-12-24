package 이차원반복문;

import java.util.Arrays;
import java.util.Scanner;

public class _05배열응용문제 {
	public static void main(String[] args) {
//		숫자를 5개 입력받고 arr 배열안에 입력한 값이 있을때마다
//		b배열안에 해당 값의 인덱스를 차례때로 저장하려고 한다
//		inputs에 사용자가 입력한 값을 차례대로 저장한다
//		조건) 만약에 입력한 숫자가 arr 에 없으면 인덱스 대신 -1 저장
//		예) 10, 20, 10, 1, 50
//		b = {0, 1, 0, -1, 4}
//		예) 30, 40, 1, 10, 2
//		b = {2, 3, -1, 0, -1}
		int arr[] = { 10, 20, 30, 40, 50 };
		int inputs[] = new int[5];
		int b[] = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i += 1) {
			System.out.print("값 입력 >> ");
			int input = sc.nextInt();

			inputs[i] = input;
			int idx = -1;

			for (int k = 0; k < arr.length; k += 1) {
				if (input == arr[k]) {
					idx = k;
					break;
				}
			}
			b[i] = idx;
		}
		System.out.println("inputs : " + Arrays.toString(inputs));
		System.out.println("b : " + Arrays.toString(b));
		sc.close();
	}
}