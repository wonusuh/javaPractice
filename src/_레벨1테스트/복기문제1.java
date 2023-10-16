package _레벨1테스트;

import java.util.Scanner;

public class 복기문제1 {
	public static void main(String[] args) {
		/*
		 * [문제 1] 숫자 2개를 입력받는다. 첫번째 저장한 값고 두번째 저장한 값을 서로 교체해서 다시 저장하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 a를입력하세요 =>");
		int a = sc.nextInt();
		System.out.println("정수 b를입력하세요 =>");
		int b = sc.nextInt();

		int c = a;
		a = b;
		b = c;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		sc.close();
	}
}
