package _기초연습예제1;

public class A4_정삼각형 {
	public static void main(String[] args) {
//		[문제]
//				끈 12/9m를 모두 사용하여 정삼각형 모양 한 개를 만들었다.
//				이 정삼각형의 한변의 길이를 구하시오.
//				단, 소수점 두 자리까지 출력하시오.
//			[정답]
//				0.44

		double round = 12.0 / 9.0;
		double edge = round / 3.0;
		System.out.printf("%.2f", edge);
	}
}
