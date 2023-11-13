package 배열심화_문제2;

import java.util.Arrays;

public class _14두개뽑아서더하기 {

	public static void main(String[] args) {
//		문제
//			arr 배열에서 숫자 2개씩 뽑아서 더한 값을
//			차례대로 result 배열에 저장 후 출력하시오
//			단, 자기 차례의 인덱스값은 더하지 않는다.
//			그리고 result 배열에 저장된 값들 중 중복되는 값을 전부 삭제하고 앞으로 당기시오.
//			
//			예)
//				(1) [인덱스 0]의 값 = 2 : (1,3,4,1) => 2+1 2+3 2+4 2+1
		int[] arr = { 2, 1, 3, 4, 1 };
		int[] result = new int[20];

		int idx = 0;

		for (int i = 0; i < arr.length; i += 1) {
			for (int k = 0; k < arr.length; k += 1) {
				if (i == k) {
					continue;
				}

				boolean check = true;
				int sum = arr[i] + arr[k];

				for (int j = 0; j < idx; j += 1) {
					if (sum == result[j]) {
						check = false;
						break;
					}
				}

				if (check) {
					result[idx] = sum;
					idx += 1;
				}

			}
		}

		System.out.println(Arrays.toString(result));
	}
}
