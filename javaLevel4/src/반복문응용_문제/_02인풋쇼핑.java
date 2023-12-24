package 반복문응용_문제;

import java.util.Arrays;

public class _02인풋쇼핑 {
	public static void main(String[] args) {
//		문제
//			아래 3개의 배열은 각각 다음과 같은 역할을 한다.
//			nameList = 상품이름
//			priceList = 상품가격
//			countList = 상품개수
//			
//		즉, 현재 재고는 새우깡 3개, 감자깡 1개, 고래밥 1개 있다.
//		
//		input 배열은 오늘 주문이 들어온 순서이다
//		주문이 들어올 때마다 countList 배열의 값을 1감소시킨다
//		총 매출을 출력해보자
//		
//		예) 첫번째 1 ==> 감자깡의 개수는 1개 이므로 판매할 수 있다.
//		예) 두번째 2 ==> 고래밥의 개수는 1개 이므로 판매할 수 있다.
//		예) 세번째 2 ==> 고래밥의 개수가 이미 두번쨰에서 구입해서 
//			0이 되므로 판매불가.
//		예) 나머지도 계산해보자

//		정답
//			주문은 총 새우깡2개, 감자깡 3개, 고래밥 3개 들어왔지만
//			재고 수량은 그보다 부족하기때문에
//			실제 판매한 품목은 새우2 감자1 고래1
//			
//			7400
//		String[] nameList = { "새우깡", "감자깡", "고래밥" };
		int[] priceList = { 1000, 2100, 3300 };
		int[] countList = { 3, 1, 1 };

		int[] input = { 1, 2, 2, 0, 0, 2, 1, 1 };
		int[] sel = { 0, 0, 0 };

		for (int i = 0; i < input.length; i += 1) {
			if (input[i] == 0 && countList[0] != 0) {
				countList[0] -= 1;
				sel[0] += 1;
			}
			if (input[i] == 1 && countList[1] != 0) {
				countList[1] -= 1;
				sel[1] += 1;
			}
			if (input[i] == 2 && countList[2] != 0) {
				countList[2] -= 1;
				sel[2] += 1;
			}
			System.out.println(i);
		}

		int earnings = 0;

		for (int i = 0; i < sel.length; i += 1) {
			earnings += sel[i] * priceList[i];
		}
		System.out.println(Arrays.toString(countList));
		System.out.println(Arrays.toString(sel));
		System.out.println(earnings);
	}
}
