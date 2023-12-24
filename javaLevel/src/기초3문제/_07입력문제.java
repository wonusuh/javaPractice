package 기초3문제;

import java.util.Scanner;

public class _07입력문제 {

	public static void main(String[] args) {
		// 문제 1) 숫자 2개를 입력받아, 합 출력

		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력

		// 문제 3) 숫자 1개를 입력받아 3의 배수이거나 45의 약수이면 true 출력
		
		// 문제1) 숫자 2개를 입력받아 합출력
		// 문제2) 숫자 1개를 입력받아 홀수이면 true 출력
		// 문제3) 숫자 1개를 입력받아 3의 배수이거나 45의 약수이면 true 출력
		Scanner scan = new Scanner(System.in);

		// 문제1
		System.out.print("문제1) 첫 번째 숫자a를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("문제1) 첫 번째 숫자b를 입력하세요 : ");
		int b = scan.nextInt();
		System.out.println("문제1) 두 수의 합은 : " + (a + b));

		// 문제2
		System.out.print("문제2) 홀수인지 아닌지 판별할 숫자를 입력하세요 : ");
		int num = scan.nextInt();
		boolean odd = num % 2 != 0;
		System.out.println("문제2) 홀수인지 아닌지 판별 : " + odd);

		// 문제 3
		System.out.print("3의 배수이거나 45의 약수 인지 판별할 숫자를 입력하세요 : ");
		int num2 = scan.nextInt();
		boolean discrim = num2 % 3 == 0 || 45 % num2 == 0;
		System.out.println("판별 결과 : " + discrim);
		scan.close();
	}
}
