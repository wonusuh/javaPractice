package 배열2_문제;

import java.util.Arrays;

public class _18채팅관리 {
	public static void main(String[] args) {
//		문제1
//			arr1 배열의 값들을 앞으로 한칸씩 당기고 맨 뒤에 a 의 값을 저장
//		정답1
//			arr1 = {20, 30, 40, 50 ,90}
//		문제2
//			arr2 배열을 뒤로 하나씩 밀어낸 후 맨 앞에 b 의 값을 저장한다
//		정답2
//			arr2 = {60, 10, 20, 30, 40}
		int[] arr1 = { 10, 20, 30, 40, 50 };
		int a = 90;
		int[] arr2 = { 10, 20, 30, 40, 50 };
		int b = 60;

		for (int i = 0; i < arr1.length; i += 1) {
			if (i != arr1.length - 1) {
				arr1[i] = arr1[i + 1];
			} else {
				arr1[i] = a;
			}
			System.out.println(i + Arrays.toString(arr1));
		}

		System.out.println("===========");

//		int[] = arr2 = {60, 10, 20, 30, 40}
		for (int i = arr1.length - 1; i >= 0 + 1; i -= 1) {
			arr2[i] = arr2[i - 1];
		}
		arr2[0] = b;
		System.out.println(Arrays.toString(arr2));
	}
}
