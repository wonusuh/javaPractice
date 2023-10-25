package 배열2_문제;

import java.util.Arrays;

public class _04일이삼일이삼 {
	public static void main(String[] args) {
//		문제
//			아래 배열에 숫자 1, 2, 3, 1, 2, 3, 1, 2를
//			순차적으로 저장하고 출력하시오
//		정답
//			arr = {1, 2, 3, 1, 2, 3, 1, 2}
		int arr[] = new int[8];
		int cnt = 0;
		for (int i = 0; i < arr.length; i += 1) {
			cnt += 1;
			arr[i] = cnt;
			if (cnt == 3) {
				cnt = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
