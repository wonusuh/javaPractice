package 배열2_문제;

import java.util.Arrays;

public class _11사탕줄서기_복습1 {
	public static void main(String[] args) {
//		문제
//		아래 배열은 각 병에 들어있는 사탕의 양이다
//		사탕의 종류는 전부 다르고 한 사람당 한병에서
//		25개씩 나누어주려고한다
//		남은 사탕은 옆으로 옮겨서 다른 사람한테 나눠줄 수 있다.
//		나눠줄 수 있는 사람 수를 사람수 배열에 저장하시오.
//	정답
//		사탕 = {0, 0, 0, 8}
//		사람수 = {3, 3, 1, 1}
		int[] candies = { 97, 53, 36, 22 };
		int[] people = { 0, 0, 0, 0 };

		for (int i = 0; i < candies.length; i += 1) {
			people[i] = candies[i] / 25;

			if (i == candies.length - 1) {
				candies[i] = candies[i] % 25;
			} else {
				candies[i + 1] += candies[i] % 25;
				candies[i] = 0;
			}
			System.out.println(Arrays.toString(candies));
		}
		System.out.println("==========");
		System.out.println(Arrays.toString(candies));
		System.out.println(Arrays.toString(people));
	}
}
