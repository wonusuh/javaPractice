package _level2test;

import java.util.Scanner;

public class 문제4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;

		System.out.println("자리별 홀수의 개수를 구할 정수를 입력하세요(1~10000) >>");
		while (true) {
			int input = sc.nextInt();
			int firstInput = input;
			if (input < 1 || input > 10000) {
				System.out.println("다시 입력하세요(1~10000)");
				continue;
			}
			while (true) {
				System.out.println(input);
				if (input % 2 != 0) {
					odd += 1;
				}
				if (input / 10 == 0) {
					System.out.printf("%d : %d개", firstInput, odd);
					break;
				}
				input /= 10;
			}
			break;
		}
		sc.close();
	}
}
