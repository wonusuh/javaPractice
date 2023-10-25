package 배열2_문제;

import java.util.Arrays;

public class _08사탕나눠주기 {
	public static void main(String[] args) {
//		문제
//			아래 배열은 각 병에 들어있는 사탕의 양이다.
//			사탕의 종류는 전부 다르고 한 사람당 한 병에서 25개씩 나눠주려고한다
//			남은 사탕은 옆으로 옮기지 않고 오로지 한 종류씩만 나눠준다고 할 때,
//			나눠줄 수 있는 사람 수를 사람 수 배열에 저장하시오
//			나눠주고 남은 사탕은 나머지 배열에 순차적으로 저장하시오
//		정답
//			사람수 = {3, 2, 1, 0}
//			나머지 = {5, 3, 11, 22}
		int[] 사탕 = { 80, 53, 36, 22 };
		int[] 사람수 = { 0, 0, 0, 0 };
		int[] 나머지 = { 0, 0, 0, 0 };
		for (int i = 0; i < 사탕.length; i += 1) {
			사람수[i] = 사탕[i] / 25;
			나머지[i] = 사탕[i] % 25;
		}
		System.out.println(Arrays.toString(사람수));
		System.out.println(Arrays.toString(나머지));
	}
}
