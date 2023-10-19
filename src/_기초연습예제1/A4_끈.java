package _기초연습예제1;

public class A4_끈 {
	public static void main(String[] args) {
//		[문제]
//				끈 5/8m를 모두 사용하여 정사각형 모양 한 개를 만들었다.
//				이 정사각형의 한변의 길이는 몇m인지 구하시오.
//				단, 소수점 자리는 두 자리까지 구하시오.
//			[정답]
//				0.16 m

		double around = 5.0 / 8.0;

		double result = around / 4.0;
		System.out.printf("%.2fm\n", result);
	}
}
