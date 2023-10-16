package 조건문문제;

import java.util.Scanner;

public class _02홀짝 {
	public static void main(String[] args) {
		// 정수 입력받아서
		// 홀수인지 짝수인지 출력하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("홀짝 판별할 정수를 입력하세요 : ");
		int evenOdd = sc.nextInt();
		if (evenOdd % 2 == 0) {
			System.out.println("짝수");
		}
		if (evenOdd % 2 != 0) {
			System.out.println("홀수");
		}
		sc.close();
	}
}
