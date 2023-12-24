package 배열심화_문제3;

public class _04주변검색_복습1 {

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

				// 9 일 때 주변에 +1 하기
				if (mine[i][j] == 9) {

//					int end = 0;
//					int start = 0;
//					int verEnd = 0;
//					int verStart = 0;

					for (int k = 0; k < mine.length; k += 1) {

						for (int l = 0; l < mine[i].length; l += 1) {

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
