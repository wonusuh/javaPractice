package _level4test;

public class 문제15 {

	public static void main(String[] args) {
//		현재 택시는 5, 5 위치에 있다.
//		배열의 왼쪽 세로 줄은 속도를 의미하고
//		배열의 오른쪽 세로 줄은 방향을 의미한다.
//		arr배열은 택시가 매번 이동한 내용을 기록한 것이다.
//		6번 모두 이동한 후 택시의 위치를 출력하시오.
//		
//		예)
//			첫 번째 속도는 4이고, 방향은 북쪽으로
//			y값이 4증가해 x = 5, y = 9가 된다.
//	[정답]
//		x = 0, y = 8

		String[][] arr = {

				{ "4", "북" },

				{ "2", "동" },

				{ "1", "남" },

				{ "5", "서" },

				{ "4", "서" },

				{ "2", "동" } };
		int x = 5;
		int y = 5;

		for (int i = 0; i < arr.length; i += 1) {

			for (int j = 0; j < arr[i].length; j += 1) {

				if (arr[i][j].equals("동")) {
					x += Integer.parseInt(arr[i][0]);
				} else if (arr[i][j].equals("서")) {
					x -= Integer.parseInt(arr[i][0]);
				} else if (arr[i][j].equals("남")) {
					y -= Integer.parseInt(arr[i][0]);
				} else if (arr[i][j].equals("북")) {
					y += Integer.parseInt(arr[i][0]);
				}
			}
			System.out.printf("x == %d, y == %d\n", x, y);
		}
	}
}
