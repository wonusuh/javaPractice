package myexercise.chap01ex.q9;

import java.util.Scanner;

public class Difference {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("두 정수를 받아 b - a 를 구합니다. (단, b > a)");
		System.out.println("a값 : ");
		int a = 0, b = 0;
		a = stdIn.nextInt();
		while (true) {
			System.out.println("b값 : ");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("b > a 이어야 합니다. 다시 입력하세요.");
		}
		System.out.println("b - a 는 : " + (b - a));
		stdIn.close();
	}
}
