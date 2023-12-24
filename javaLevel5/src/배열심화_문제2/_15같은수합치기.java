package 배열심화_문제2;

import java.util.Arrays;

public class _15같은수합치기 {

	public static void main(String[] args) {
//		문제
//			input 배열의 데이터를 순차적으로 arr에 저장하는데,
//			만약 저장하려는 수와 그 앞의 수가 서로 같으면 합친다. (계속 중첩 적용)
//			마지막 arr의 값을 출력하시오.
//		정답
//			arr = {32, 0, 0, 0, 0, 0, 0}
		int[] input = { 8, 4, 2, 2, 4, 4, 8 };
		int[] arr = new int[input.length];
		int arrIdx = 1;

		arr[0] = input[0];

		for (int i = 1; i < input.length; i += 1) {
			arr[arrIdx] = input[i];

			while (arrIdx != 0 && arr[arrIdx - 1] == arr[arrIdx]) {
				arr[arrIdx - 1] = arr[arrIdx - 1] + arr[arrIdx];
				arr[arrIdx] = 0;
				arrIdx -= 1;
			}
			arrIdx += 1;
			System.out.println(Arrays.toString(arr));
		}
	}
}
