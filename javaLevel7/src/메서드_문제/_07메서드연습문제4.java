package 메서드_문제;

import java.util.Arrays;

class Return3 {

	int[][] run(String[][] data) {

		// 몇 개짜리 배열을 만들지 값들 찾기
		int length = 0;

		for (String[] s : data) {

			if (Integer.parseInt(s[1]) >= 60) {
				length += 1;
			}
		}

		// 배열을 만들어서 값들 넣기
		int[][] temp = new int[length][2];
		int cnt = 0;

		for (String[] s : data) {

			if (Integer.parseInt(s[1]) >= 60) {
				temp[cnt][0] = Integer.parseInt(s[0]);
				temp[cnt++][1] = Integer.parseInt(s[1]);
			}
		}
		return temp;
	}
}

public class _07메서드연습문제4 {

	public static void main(String[] args) {

		Return3 re = new Return3();
		String[][] data = {

				{ "1001", "34" },

				{ "1002", "86" },

				{ "1003", "81" },

				{ "1004", "10" } };
		int[][] result = re.run(data); // re.run(data);

		System.out.println(Arrays.deepToString(result));
	}
}
