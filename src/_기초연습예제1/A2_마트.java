package _기초연습예제1;

public class A2_마트 {
	public static void main(String[] args) {
//		[문제]
//				철수는 현금 10,000원을 가지고 여정 마트에 갔다.
//				사과 한 개의 가격은 200원이고, 귤 한 개의 가격은 110원이다.
//				사과 3개와 귤 10개를 사려고 한다.
//				모두 사면 거스름돈은 얼마인지 구하시오.
//			[정답]
//				8,300원
		int cash = 10000;
		int apple = 200;
		int orange = 110;

		int change = cash - (apple * 3 + orange * 10);
		System.out.println("거스름돈은 : " + change);
	}
}
