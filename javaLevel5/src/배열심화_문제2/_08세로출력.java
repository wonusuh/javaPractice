package 배열심화_문제2;

public class _08세로출력 {

	public static void main(String[] args) {
//		문제
//			yList 의 값들은 data의 세로 인덱스를 의미한다.
//			yList 의 값들이 가르키는 세로줄을 출력하시오.
//		정답
//			yList[0] = 1 : 0 0 2 1 4 1 1
//			~
//			~
//			~
//			yList[4] = 0 : 0 0 0 3 2 4 4
//			yList[5] = 1 : 0 0 2 1 4 1 1
		int[][] data = {

				{ 0, 0, 0, 0, 0 },

				{ 0, 0, 0, 0, 3 },

				{ 0, 2, 0, 0, 3 },

				{ 3, 1, 3, 0, 1 },

				{ 1, 4, 2, 0, 2 },

				{ 4, 1, 4, 0, 4 },

				{ 2, 1, 4, 3, 3 } };
		int[] yList = { 1, 3, 2, 2, 0, 1 };

		for (int i = 0; i < yList.length; i += 1) {
			System.out.printf("yList[%d] = %d : ", i, yList[i]);

			for (int j = 0; j < data.length; j += 1) {
				System.out.print(data[j][yList[i]] + " ");
			}
			System.out.println();
		}
	}
}
