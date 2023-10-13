package 기초4문제;

import java.util.Random;

public class _16자리수대결 {
	public static void main(String[] args) {
//			10000~90000 사이의 랜덤숫자 2개를 저장한다
//			각각의 랜덤숫자의 백의자리의 숫자를 비교해서 백의자리가
//			서로 같으면 equal 을 출력한다

		Random rn = new Random();
		int num1 = rn.nextInt(90000 - 10000 + 1) + 10000;
		System.out.println("num1 : " + num1);
		int num2 = rn.nextInt(90000 - 10000 + 1) + 10000;
		System.out.println("num2 : " + num2);

		// 랜덤수 생성해서 백의자리 확인
		int num1Hundred = num1 % 1000 / 100;
		System.out.println("num1Hundred : " + num1Hundred);
		int num2Hundred = num2 % 1000 / 100;
		System.out.println("num2Hundred : " + num2Hundred);

		// 비교
		if (num1Hundred == num2Hundred) {
			System.out.println("equal");
		} else if (num1Hundred > num2Hundred) {
			System.out.println("백의 자리가 더 큰 수의 전체수 : " + num1);
		} else {
			System.out.println("백의 자리가 더 큰 수의 전체수 : " + num2);
		}
	}
}
