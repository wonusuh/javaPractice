package _기초연습예제1;

public class A3_인형공장 {
	public static void main(String[] args) {
//	[문제]
//		인형 공장에서 인형 100개를 생산하는데 불량을 염두해두고 10개씩 더 만든다.
//		인형을 350개 주문받았을 때 인형은 총 몇 개 생산해야 하는가?
//	[정답]
//		385개

		// 100 : 10 = 1 : n
		// 100n = 10
		// n =10/100;
		double oneRate = 1.1;
		System.out.println(oneRate);
		double dolls = 350.0;
		System.out.printf("%.0f개\n", dolls * oneRate);
	}
}
