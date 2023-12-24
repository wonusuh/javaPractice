package 배열심화_문제3;

import java.util.Arrays;

public class _02장바구니검색 {

	public static void main(String[] args) {
//		문제1
//			회원별로 아이템 구매목록을 출력하시오.
//		정답1
//			이만수(고래밥 3개, 칸쵸1)
//			김철민(고래밥 1개)
//			이영희(고래밥 1개, 새우깡 2개)

//		문제2
//			아이템별로 구입한 회원이름을 출력하시오.
//		정답2
//			고래밥(이만수, 김철민, 이영희)
//			새우깡(이영희)
//			칸쵸(이만수)
		String itemData = "1001/고래밥,1002/새우깡,1003/칸쵸";
		String userData = "3001/이만수,3002/김철민,3003/이영희";

		String cartData = "";
		cartData += "3001/1001\n";
		cartData += "3001/1001\n";
		cartData += "3003/1002\n";
		cartData += "3001/1001\n";
		cartData += "3001/1003\n";
		cartData += "3003/1002\n";
		cartData += "3003/1001\n";
		cartData += "3002/1001";

		String[] items = itemData.split(",");
		String[] users = userData.split(",");

		int[] itemNum = new int[3];
		String[] itemName = new String[3];
		int[] userNum = new int[3];
		String[] userName = new String[3];

		for (int i = 0; i < items.length; i += 1) {

			String[] temp = new String[2];
			temp = items[i].split("/");
			itemNum[i] = Integer.parseInt(temp[0]);
			itemName[i] = temp[1];

			String[] temp2 = new String[2];
			temp2 = users[i].split("/");
			userNum[i] = Integer.parseInt(temp2[0]);
			userName[i] = temp2[1];
		}
		System.out.println(Arrays.toString(itemNum));
//		System.out.println(Arrays.toString(itemName));
		System.out.println(Arrays.toString(userNum));
//		System.out.println(Arrays.toString(userName));

		String[] cart = cartData.split("\n");
		System.out.println(Arrays.toString(cart));

		int[] ms = { 0, 0, 0 };
		int[] cm = { 0, 0, 0 };
		int[] yh = { 0, 0, 0 };
		int[][] people = {

				ms,

				cm,

				yh };

		// 2차원 배열에 cnt 하기
		for (int i = 0; i < cart.length; i += 1) {

			// 사람 검색
			int iIdx = -1;
			for (int j = 0; j < userNum.length; j += 1) {

				if (Integer.parseInt(cart[i].substring(0, 4)) == userNum[j]) {
					iIdx = j;
				}
			}

			// 물건 검색
			int jIdx = -1;
			for (int j = 0; j < userNum.length; j += 1) {
				if (Integer.parseInt(cart[i].substring(5, 9)) == itemNum[j]) {
					jIdx = j;
				}
			}
			people[iIdx][jIdx] += 1;
		}
		System.out.println(Arrays.deepToString(people));

		// 회원별로 출력하기
		for (int i = 0; i < people.length; i += 1) {
			System.out.print(userName[i] + "( ");

			for (int j = 0; j < people[i].length; j += 1) {

				if (people[i][j] != 0) {
					System.out.printf("%s %d개 ", itemName[j], people[i][j]);
				}
			}
			System.out.println(")");
		}
		System.out.println();

		// 아이템별로 출력하기
//		int[] ms = { 3, 0, 1 };
//		int[] cm = { 1, 0, 0 };
//		int[] yh = { 1, 2, 0 };
		for (int i = 0; i < people.length; i += 1) {
			System.out.print(itemName[i] + "( ");

			for (int j = 0; j < people[i].length; j += 1) {

				if (people[j][i] != 0) {
					System.out.print(userName[j] + " ");
				}
			}
			System.out.println(")");
		}
		// 향상된 for문
	}
}
