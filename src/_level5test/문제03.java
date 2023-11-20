package _level5test;

public class 문제03 {

	public static void main(String[] args) {

		int[][] data = {

				{ 12345678 },

				{ 4005 },

				{ 230055 },

				{ 1 },

				{ 200 } };

		// 위 숫자에 한글단위명을 추가 해서 출력
		// 예) 1234만5천6백7십8
		// 예) 4천5
		// 예) 23만5십5
		// 예) 1
		// 예) 2백
		for (int i = 0; i < data.length; i += 1) {

			String tempo = "" + data[i][0];
			String result = "";
			int cnt = tempo.length();
			;

			for (int j = 0; j < tempo.length(); j += 1) {
				cnt -= 1;

				if (Integer.parseInt(tempo.substring(j, j + 1)) != 0) {
					result += tempo.substring(j, j + 1);
				}

				// 만 천 백 십
				if (cnt == 1 && Integer.parseInt(tempo.substring(j, j + 1)) != 0) {
					result += "십";
				}
				if (cnt == 2 && Integer.parseInt(tempo.substring(j, j + 1)) != 0) {
					result += "백";
				}
				if (cnt == 3 && Integer.parseInt(tempo.substring(j, j + 1)) != 0) {
					result += "천";
				}
				if (cnt == 4 && Integer.parseInt(tempo.substring(j, j + 1)) != 0) {
					result += "만";
				}
			}
			System.out.println(result);
		}
	}
}
