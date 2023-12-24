package 배열심화_문제2;

import java.util.Arrays;

public class _16연속빈칸찾기 {

	public static void main(String[] args) {
//		arr배열은 숫자1과 0으로 구성돼있다.
//		숫자1은 이미 채워진 자리이고, 0은 비어있는 자리이다.
//		input변수값의 의미는 1부터 시작하는 위치를 의미함과 동시에
//		연속으로 1으로 채울 칸 수를 의미한다.
//		예를들어 input의 값이 3인경우, 3번째라는 의미로
//		인덱스의 값 2부터 3칸이 비어있는지(0) 확인한 후,
//		비어있으면 전부 1로 변경해야한다.
//		
//		정답
//			input = 3 => 인덱스 2부터 연속을 3칸 비어있으므로 (O)
//			input = { 0, 1, 1, 1, 1, 0, 0}
//
//			input = 4 => 인덱스 3부터 연속을 4칸 비어있지 않으므로 (X)
//			input = { 0, 1, 1, 1, 1, 0, 0}
		int[] arr = { 0, 1, 0, 0, 0, 1, 0, 0 };
		int input = 3;

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < input; i += 1) {

			if (arr[input - 1 + i] == 0) {
				arr[input - 1 + i] = 1;
			} else {
				System.out.println("변경(X)");
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
