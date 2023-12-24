package _기초연습예제1;

public class A5_우유 {
	public static void main(String[] args) {
//		[문제]
//				다음은 오늘 우유상점의 매출결과이다.
//				오전에는 전체 우유의 16%를 팔았다.
//				오후에는 전체 우유의 15%를 팔았다.
//				현재 남은 우유는 345개이다.
//				오늘 전체 우유 수를 구하시오.
//			[정답]
//				500개

		double am = 16.0;
		System.out.println("am == " + am);
		double pm = 15.0;
		System.out.println("pm == " + pm);

//		double remain = 345.0;

		// 69% : 345개 = 31% : n개
		// 345/31 = 69n
		// n = 345/31/69

//		double milkLeft = 345.0;

		System.out.println(345.0 / 31.0 / 69.0);
	}
}
