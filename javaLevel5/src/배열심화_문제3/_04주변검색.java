package 배열심화_문제3;

public class _04주변검색 {
	public static void main(String[] args) {
//		아래 mine배열의 숫자 0의 자리에
//		주변 8방향을 검사해서 9의 개수를 저장하고 출력하시오.
//	정답
//		{2 9 2}
//		{9 4 9}
//		{1 3 9}
		int[][] mine = {

				{ 0, 9, 0 },

				{ 9, 0, 9 },

				{ 0, 0, 9 } };

		for (int i = 0; i < mine.length; i += 1) {

			for (int j = 0; j < mine[i].length; j += 1) {

				if (mine[i][j] == 0) {

					int verStart = i - 1 < 0 ? 0 : i - 1;
					int verEnd = i + 1 > 2 ? 2 : i + 1;
					int start = j - 1 < 0 ? 0 : j - 1;
					int end = j + 1 > 2 ? 2 : j + 1;

					for (int k = verStart; k <= verEnd; k += 1) {

						for (int l = start; l <= end; l += 1) {

							if (mine[k][l] == 9) {
								mine[i][j] += 1;
							}
						}
					}
				}
			}
		}

		// 결과 출력
		for (int i = 0; i < mine.length; i += 1) {

			for (int j = 0; j < mine[i].length; j += 1) {
				System.out.print(mine[i][j] + " ");
			}
			System.out.println();
		}
	}
}
