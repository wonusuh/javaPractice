package 배열2_문제;

import java.util.Arrays;

public class _03뒤의값과교환 {
	public static void main(String[] args) {
//		문제
//			arr의 반복을 순차적으로 하되
//			3번째마다 바로 뒤의 값과 위치를 교환후 출력하시오
//		정답
//			교환 후 : [10, 20, 40, 30, 50, 70, 60, 80]
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int cnt = 0;
		for (int i = 0; i < arr.length; i += 1) {
			cnt += 1;
			if (cnt == 3) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				cnt = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
