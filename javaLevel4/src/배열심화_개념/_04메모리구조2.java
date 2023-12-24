package 배열심화_개념;

import java.util.Arrays;

public class _04메모리구조2 {
	public static void main(String[] args) {

		// heap 메모리는 new를 하지 않으면 방을 만들지않는다

		int[] arr = { 10, 20, 30, 40, 50 };

		arr[1] = 200;

//		System.out.println(arr[1]);
		System.out.println(Arrays.toString(arr));

		int[] temp = arr;

		temp[1] = 0;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));

		System.out.println(arr);
		System.out.println(temp);

		// 참조변수 => 주소값을 저장하는 변수
		// 비교연산자 == != 사용할 수 있다

		System.out.println(arr == temp);
	}
}
