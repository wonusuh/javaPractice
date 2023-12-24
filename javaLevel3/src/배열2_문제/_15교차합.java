package 배열2_문제;

import java.util.Arrays;

public class _15교차합 {
	public static void main(String[] args) {
//		문제
//			arr1은 앞에서부터 뒤로 반복한다
//			arr2은 뒤에서부터 앞으로 거꾸로 반복한다
//			b 에 arr1과 arr2 각각의 값의 합을 저장 후 출력한다.
//		정답
//			b = {40, 49, 58, 67, 76}
		int[] arr1 = { 11, 21, 31, 41, 51 };
		int[] arr2 = { 25, 26, 27, 28, 29 };
		int[] b = new int[5];
		for (int i = 0; i < arr1.length; i += 1) {
			b[i] = arr1[i] + arr2[(arr1.length - 1) - i];
			System.out.println(i + Arrays.toString(b));
		}
	}
}
