package 배열심화_문제2;

import java.util.Arrays;

public class _18압축풀기 {

	public static void main(String[] args) {
//아래 arr배열은 압축한 데이터이다
//데이터는 2개씩 짝을 이룬다는 규칙이 있다.
//(1) 앞의 숫자 : 데이터
//(2) 뒤의 숫자 : 그 데이터의 개수
//
//예)
//{3, 2} => 33
//{5, 6} => 555555
//~~~
//결국 실제 데이터는 3355555524444 인 것이다.
//
//아래 temp배열에 위 데이터의 크기만큼 생성하고,
//각각의 값을 저장 후 출력하시오.
//
//정답
//	temp = {3 3 5 5 5 5 5 5 2 4 4 4}
		int[][] arr = {

				{ 3, 2 },

				{ 5, 6 },

				{ 2, 1 },

				{ 4, 3 } };
		int[] temp = null;
		int cnt = 0;

		for (int i = 0; i < arr.length; i += 1) {
			cnt += arr[i][1];
		}

		temp = new int[cnt];
		int idx = 0;

		for (int i = 0; i < arr.length; i += 1) {

			for (int j = 0; j < arr[i][1]; j += 1) {
				temp[idx] = arr[i][0];
				idx += 1;
			}
			System.out.println(Arrays.toString(temp));
		}
	}
}
