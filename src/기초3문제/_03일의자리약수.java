package 기초3문제;

public class _03일의자리약수 {
	public static void main(String[] args) {
//		/*
//        [문제] 
//            아래 변수의 a 의 값이 
//            1의 자리가 25의 약수이면, true 를 출력하시오.
//        [정답]
//            false
//    */
		int a = 123456;
		int answer = a % 10;
		boolean result = 25 % answer == 0;
		System.out.println(result);
	}
}
