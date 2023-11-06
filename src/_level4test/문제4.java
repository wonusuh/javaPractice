package _level4test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
		int data[] = { 5, 5, 6, 8, 2, 7 };

		// 값을 입력받고 삭제
		// 조건) 만약에 같은값이 있으면 전부 삭제
		// 예) 2 ==> 5,5,6,8,6
		// 예) 5 ==> 6,8,2,6
		Scanner sc = new Scanner(System.in);

		System.out.println(Arrays.toString(data));
		System.out.print("삭제할 값을 입력하세요 >> ");
		int input = sc.nextInt();

		// 최종 배열의 길이에서 뺼 값
		int cnt = 0;

		for (int i = 0; i < data.length; i += 1) {

			if (data[i] == input && i != data.length - 1) {

				for (int k = i; k < data.length - 1; k += 1) {
					data[k] = data[k + 1];
					data[k + 1] = 0;
				}
				cnt += 1;
				i -= 1;
			} else if (i == data.length - 1) {
				// 마지막 방인경우
				data[i] = 0;
				cnt += 1;
			}
			System.out.println(Arrays.toString(data));
		}

		// cnt만큼 줄어든 크기의 배열로 다시 만들기
		int[] copy = data;
		data = new int[copy.length - cnt];

		for (int i = 0; i < data.length; i += 1) {
			data[i] = copy[i];
		}
		System.out.println("data : " + Arrays.toString(data));
		sc.close();
	}
}
