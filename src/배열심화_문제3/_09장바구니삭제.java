package 배열심화_문제3;

import java.util.Arrays;

public class _09장바구니삭제 {

	public static void main(String[] args) {
//		cart데이터는 현재 장바구니 상황이다.
//		
//		input데이터는 삭제를 요청한 데이터이다.
//		qwer은 아이디이고, 3은 삭제할 위치이다.
//		qwer입장에서는 본인 아이템은 3개밖에 없으니,
//		칸쵸를 지우기위해 3을 선택했지만 전체 데이터에서는 5번째아이템이다.
//		
//		마찬가지로 abcd는 콜라와 사이다를 구입했고,
//		콜라를 지우기위해 1번을 선택했지만
//		실제로는 3번 아이템이 삭제돼야한다.
//		
//		삭제 후 cart배열의 정보를 출력하시오.
//	정답
//		qwer/고래밥
//		qwer/새우깡
//		java/칸쵸
//		java/고래밥
//		abcd/사이다

//		String item = "칸쵸/새우깡/고래밥/콜라/사이다";
//		String id = "qwer/abcd/java";

		String cart = "";
		cart += "qwer/고래밥\n";
		cart += "qwer/새우깡\n";
		cart += "abcd/콜라\n";
		cart += "java/칸쵸\n";
		cart += "qwer/칸쵸\n";
		cart += "java/고래밥\n";
		cart += "abcd/사이다";

		String[][] input = {

				{ "qwer", "3" },

				{ "abcd", "1" } };
//		String[] items = item.split("/");
//		String[] ids = id.split("/");
		String[] temp = cart.split("\n");

//		System.out.println(Arrays.toString(temp));

		String[][] data = new String[temp.length][];

		for (int i = 0; i < temp.length; i += 1) {

			String[] temp2 = new String[2];

			temp2 = temp[i].split("/");
			data[i] = temp2;
		}
		System.out.println(Arrays.deepToString(data));

		for (int i = 0; i < input.length; i += 1) {

			// 몇 번째에 있는지 세기
			int cnt = 0;

			for (int j = 0; j < data.length; j += 1) {

				if (input[i][0].equals(data[j][0])) {
					cnt += 1;
					System.out.println(cnt);
				}

				if (cnt == Integer.parseInt(input[i][1])) {
					data[j][0] = "X";
					data[j][1] = "X";
					break;
				}
			}
		}
		System.out.println(Arrays.deepToString(data));

		String result = "";

		for (int i = 0; i < data.length; i += 1) {

			if (data[i][0].equals("X")) {
				continue;
			}
			result += data[i][0] + "/" + data[i][1] + "\n";
		}
		System.out.println(result);
	}
}
