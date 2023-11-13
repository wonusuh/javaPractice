package 배열심화_문제2;

import java.util.Arrays;

public class _17인풋쇼핑 {

	public static void main(String[] args) {
//		nameList 배열은 상품의 이름을,
//		dataList는 각각 가격과 상품의 개수를 의미한다.
//		현재 재고 수량은 새우깡 3개, 감자깡 1개, 고래밥 1개이다.
//		아래 input 배열은 오늘 주문이 들어온 순서이다.
//		총 매출을 출력해보시오.
//		
//		정답
//			주문은 총 새우깡 2개, 감자깡 3개, 고래밥 3개가 들어왔지만,
//			실제 판매한 품목은 새우깡2개, 감자깡 1개, 고래밥 1개이다.
//			7400원
		String[] nameList = { "새우깡", "감자깡", "고래밥" };
		int[][] dataList = {
				// 가격, 재고
				{ 1000, 3 },

				{ 2300, 1 },

				{ 3100, 1 } };
		int[] input = { 1, 2, 2, 0, 0, 2, 1, 1 };
		int earnings = 0;

		for (int i = 0; i < input.length; i += 1) {

			if (dataList[input[i]][1] > 0) {
				earnings += dataList[input[i]][0];
				dataList[input[i]][1] -= 1;
				System.out.printf("%s 구매 완료.\n", nameList[input[i]]);
			} else {
				System.out.printf("%s 재고 부족.\n", nameList[input[i]]);
			}
		}
		System.out.printf("수입 == %d원\n", earnings);
		System.out.println(Arrays.deepToString(dataList));
	}
}
