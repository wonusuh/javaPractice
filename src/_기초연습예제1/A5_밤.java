package _기초연습예제1;

public class A5_밤 {
	public static void main(String[] args) {
//		[문제]
//			철수가 1시간 40분 동안 일정한 빠르기로 주은 밤의 무게가 11kg이다.
//			3분동안 주은 밤은 몇 kg인지 구하시오.
//			단, 소수점 두 자리까지 출력하시오.
//		[정답]
//			0.33 kg

		double bamInOne = 11.0 / 100.0;
		double bamInThree = bamInOne * 3.0;
		System.out.printf("%.2f kg\n", bamInThree);
	}
}
