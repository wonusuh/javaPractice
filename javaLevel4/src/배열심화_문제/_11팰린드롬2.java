package 배열심화_문제;

import java.util.Arrays;

public class _11팰린드롬2 {

	public static void main(String[] args) {
//		문제
//			아래 배열에서 0이나 1을 제외한 나머지 값들이 팰린드롬인지 출력하시오
//		정답
//			1과 0을 전부 제외하면 3 2 2 3 이므로 팰린드롬이다.
		int[] arr = { 1, 3, 1, 0, 2, 1, 5, 3, 0 }; // 3223(O) 3423(x)
		int[] copy = new int[arr.length]; // 3 2 2 3
		boolean check = true;
		int cnt = 0;

		for (int i = 0; i < arr.length; i += 1) {
			if (arr[i] != 0 && arr[i] != 1) {
				copy[cnt] = arr[i];
				cnt += 1;
			}
		}

		System.out.println(Arrays.toString(copy));
		System.out.println(cnt);
		if (cnt % 2 != 0) {
			check = false;
		}

		if (check) {

			for (int i = 0; i < cnt; i += 1) { // 0 1 2 3
				// System.out.printf("%d %d \n" , i , cnt-1-i);
				if (copy[i] != copy[cnt - 1 - i]) {
					check = false;
					break;
				}
			}

		}

		System.out.println(check ? "팰린드롬이다" : "펠린드롬이 아니다 ");

	}
}
