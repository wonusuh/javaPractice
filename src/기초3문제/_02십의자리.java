package 기초3문제;

public class _02십의자리 {
	public static void main(String[] args) {
//		  [문제] 아래 변수 a 의 값이 10의 자리가 홀수이면, true 를 출력하시오. 
//		  10의 자리가 짝수면 false 가 나온다

		int a = 3340;
		System.out.println(a % 10);
		System.out.println(a % 100 / 10);
		System.out.println(a % 1000 / 100);
		System.out.println(a % 10000 / 1000);

		boolean result = a % 100 / 10 % 2 != 0;
		System.out.println(result);
	}
}
