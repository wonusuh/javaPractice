package _기초연습예제1;

public class A4_연봉 {
	public static void main(String[] args) {
//		/*
//		[문제]
//			월급이 100원이다. 연봉은 얼마인지 구하시오.
//			단, 세금 10%를 제외하고 구하시오.
//		[정답]
//			1,080원
//	 */

		double month = 100.0;

		double salary = month * 12;
		double tax = 0.1;

		double afterTax = salary - (salary * tax);
		System.out.printf("%.0f원|\n", afterTax);
	}
}
