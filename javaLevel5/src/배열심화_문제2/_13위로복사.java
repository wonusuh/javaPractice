package 배열심화_문제2;

import java.util.Arrays;

public class _13위로복사 {
	public static void main(String[] args) {
//		다음과 같은 배열이 있다 배열의 값들을 한 칸씩 위로 올리고 맨아래칸은 ""으로 채운다.
//		예)
//			[▦, ▦, ▦, ▦, ▦],
//			[♬, ♬, ♬, ♬, ♬],
//			[, , , , ]
		String arr[][] = {

				{ "○", "○", "○", "○", "○" },

				{ "▦", "▦", "▦", "▦", "▦" },

				{ "♬", "♬", "♬", "♬", "♬" } };

		for (int i = 0; i < arr.length; i += 1) {

			for (int j = 0; j < arr[i].length; j += 1) {

				if (i != arr.length - 1) {
					arr[i][j] = arr[i + 1][j];
				} else {
					arr[i][j] = "";
				}
				System.out.println(Arrays.deepToString(arr));
			}
		}
	}
}
