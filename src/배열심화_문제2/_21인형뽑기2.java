package 배열심화_문제2;

public class _21인형뽑기2 {
	public static void main(String[] args) {
		// [문제] 아래에서부터 뽑기
		int[][] machine = {

				{ 0, 0, 0, 0, 0 },

				{ 0, 0, 0, 0, 3 },

				{ 0, 2, 0, 0, 3 },

				{ 3, 1, 3, 0, 1 },

				{ 1, 4, 2, 0, 2 },

				{ 4, 1, 4, 0, 4 },

				{ 2, 1, 4, 3, 3 } };
		String[] nameList = { "호랑이", "곰", "사자", "기린" };
		int[] input = { 1, 0, 0, 3, 3, 4, 4 };

		for (int i = 0; i < input.length; i += 1) {

			// 인형뽑기 출력
			for (int j = 0; j < machine.length; j += 1) {

				for (int k = 0; k < machine[j].length; k += 1) {
					System.out.print(machine[j][k] + " ");
				}
				System.out.println();
			}

			// 당첨된 인형 하나만 출력
			System.out.println("input == " + input[i]);
			if (machine[machine.length - 1][input[i]] != 0) {
				System.out.println(nameList[machine[machine.length - 1][input[i]] - 1] + " 당첨!");
			} else {
				System.out.println("꽝!");
			}

			// 인형들 아래로 당기기
			for (int j = machine.length - 1; j > 0; j -= 1) {

				if (machine[j][input[i]] != 0) {
					machine[j][input[i]] = machine[j - 1][input[i]];
				} else {
					break;
				}
			}
			System.out.println("==========");
		}
	}
}
