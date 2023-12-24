package _레벨1테스트;

import java.util.Scanner;

public class 복기문제2 {

	public static void main(String[] args) {
		/*
		 * [문제 2] 1. 숫자 3개를 입력받는다. 2. 입력받은 3개의 숫자를 비교한다. 3. 가낭 큰 수(max)를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("a를 입력하세요");
		int a = sc.nextInt();
		System.out.println("b를 입력하세요");
		int b = sc.nextInt();
		System.out.println("c를 입력하세요");
		int c = sc.nextInt();

		int max = a;
		if (b > a) {
			max = b;
		}
		if (c > b) {
			max = c;
		}
		System.out.println("max : " + max);
		sc.close();
	}
}
