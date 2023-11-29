package 메서드_문제;

import java.util.Arrays;

class Return2 {

	int[] run(String[][] data) {

		// 몇 개짜리 배열을 만들지 값들 찾기
		int length = 0;

		for (String[] s : data) {

			if (Integer.parseInt(s[1]) >= 60) {
				length += 1;
			}
		}

		// 배열을 만들어서 값들 넣기
		int[] temp = new int[length];
		int cnt = 0;

		for (String[] s : data) {

			if (Integer.parseInt(s[1]) >= 60) {
				temp[cnt++] = Integer.parseInt(s[0]);
			}
		}
		return temp;
	}
}

public class _06메서드연습문제3 {

	public static void main(String[] args) {

		Return2 re = new Return2();
		String[][] data = {

				{ "1001", "34" },

				{ "1002", "46" },

				{ "1003", "81" },

				{ "1004", "10" } };
		int[] result = re.run(data); // re.run(data);

		System.out.println(Arrays.toString(result));
	}
}
