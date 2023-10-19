package _기초연습예제1;

public class A4_사과귤 {
	public static void main(String[] args) {
//		[문제]
//				귤 6개의 무게는 840g, 사과 3개의 무게는  750g 이다.
//				귤 5개와 사과 4개의 무게를 구하시오.
//			[정답]
//				1,700g

		double orangeTotal = 840;
		double appleTotal = 750;

		double orange = orangeTotal / 6;
		double apple = appleTotal / 3;

		double result = orange * 5 + apple * 4;
		System.out.println(result + "g");
	}
}
