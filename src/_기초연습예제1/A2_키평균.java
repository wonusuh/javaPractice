package _기초연습예제1;

public class A2_키평균 {
	public static void main(String[] args) {
//		[문제]
//				세 학생의 키는 다음과 같다.
//				민수 : 184
//				철수 : 165
//				영희 : 160
//				
//				세 학생 키의 평균에서 키가 가장 작은 학생의 차이는 얼마인지 구하시오.
//				단, 소수점 두 자리까지 출력하시오.
//			[정답]
//				9.67
		int ms = 184;
		int ch = 165;
		int yh = 160;
		double average = (ms + ch + yh) * 1.0 / 3;

		int min = ms;
		if (min > ch) {
			min = ch;
		}
		if (min > yh) {
			min = yh;
		}
		System.out.printf("%.2f", average - min);
	}
}
