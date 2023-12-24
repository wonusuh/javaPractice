package 배열2_문제;

import java.util.Arrays;

public class _11사탕줄서기 {
	public static void main(String[] args) {
//		문제
//			아래 배열은 각 병에 들어있는 사탕의 양이다
//			사탕의 종류는 전부 다르고 한 사람당 한병에서
//			25개씩 나누어주려고한다
//			남은 사탕은 옆으로 옮겨서 다른 사람한테 나눠줄 수 있다.
//			나눠줄 수 있는 사람 수를 사람수 배열에 저장하시오.
//		정답
//			사탕 = {0,0,0,8}
//			사람수 = {3,3,1,1}
		int[] 사탕 = { 97, 53, 36, 22 };
		int[] 사람수 = { 0, 0, 0, 0 };

		for (int i = 0; i < 사탕.length; i += 1) {
			사람수[i] = 사탕[i] / 25;

			if (i == 사탕.length - 1) {
				사탕[i] = 사탕[i] % 25;
			} else {
				사탕[i + 1] += (사탕[i] % 25);
				사탕[i] = 0;
			}
		}
		System.out.println(Arrays.toString(사탕));
		System.out.println(Arrays.toString(사람수));
	}
}
