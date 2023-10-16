package _레벨1테스트;

import java.util.Scanner;

public class 응용4 {
	public static void main(String[] args) {
//		[문제 4]
//			숫자 2개를 입력받는다.
//			두 숫자의 곱을 구하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("곱산할 수 a 를 입력하세요 =>");
		int a = sc.nextInt();
		System.out.println("곱산할 수 b 를 입력하세요 =>");
		int b = sc.nextInt();
		System.out.println("두 수의 곱은 : " + (a * b));
		sc.close();
	}
}
