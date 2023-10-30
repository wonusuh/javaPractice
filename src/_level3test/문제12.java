package _level3test;

public class 문제12 {
	public static void main(String[] args) {
//                item배열은 상품의 번호이다.
//                price배열은 상품의 가격이다.
//                item과 price는 한세트이다.
//        
//                order배열은 오늘 주문이 들어온 상품의 인덱스 번호이다. 
//                count배열은 order에서 주문한 상품들의 개수이다.
//                order 와 count는 한세트이다. 
//                오늘의 매출을 출력하시오.
//                
//                order : 0은 상품 1001을 의미하는 것이고, 
//                count : 3은 1001상품을 3개 구매한것이 된다.
//                즉, 매출에 1500원을 추가한다.
//                위 식대로 남은 주문도 전부 계산하시오.
//            [정답]
//                44500
//		int[] item = { 1001, 1002, 1003, 1004 };
		int[] price = { 500, 1200, 4300, 2300 };

		int[] order = { 0, 1, 3, 3, 2, 2, 1 };
		int[] count = { 3, 2, 2, 1, 3, 4, 3 };

		int earnings = 0;

		for (int i = 0; i < order.length; i += 1) {
			earnings += price[order[i]] * count[i];
		}
		System.out.println(earnings);
	}
}
