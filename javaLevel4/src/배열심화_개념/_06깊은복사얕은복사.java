package 배열심화_개념;

import java.util.Arrays;

public class _06깊은복사얕은복사 {
	public static void main(String[] args) {
		// 1. 얕은복사 => 주소값 복사
		// reference type
		// 같은 주소를 공유하기때문에 값을 바꾸면 다른쪽도 영향을 받음

		// 2. 깊은 복사 => 새로운 주소를 만들어서 그 주소에 값을 복사한다
		// primary types : 깊은 복사

		// 참조변수에서 깊은복사 하는 법
		int[] arr = { 10, 20 };
		System.out.println(Arrays.toString(arr));

		int value = 50;
		int cnt = arr.length;

		// 1. 얕은 복사를 먼저 한다
		int[] copy = arr;
		arr = new int[cnt + 1]; // [0, 0, 0]

		for (int i = 0; i < copy.length; i += 1) {
			arr[i] = copy[i];
		}
		arr[arr.length - 1] = value;

		System.out.println(Arrays.toString(arr));
	}
}
