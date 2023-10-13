package 기초4문제;

import java.util.Scanner;

public class _17ATM1단계 {
	public static void main(String[] args) {
//		ATM 1단계 : 이체하기
//		1. 이체할 계좌번호를 입력받는다
//		2. 계좌번호가 일치하면
//		3. 이체할 금액을 입력받는다
//		4. 이체할 금액 <= myMoney : 이체가능
//					myMoney - 이체할 금액
//					yourMoney + 이체할 금액
//					이체할 금액 > myMoney : 이체불가
		// int myAcc = 1234;
		int myMoney = 8700;

		int yourAcc = 4321;
		int yourMoney = 12000;

		// 1. 이체할 계좌번호를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("이체 할 계좌번호를 입력하세요 : ");
		int input = sc.nextInt();

		boolean accountCheck = input == yourAcc;
		if (!accountCheck) {
			System.out.println("계좌를 확인하세요");
			System.out.println("종료합니다");
		}

		// 2. 계좌번호가 일치하면
		if (accountCheck) {
			// 3. 이체할 금액을 입력받는다
			System.out.println(myMoney + " <= myMoney : 이체가능");
			System.out.println("이체 할 금액을 입력하세요 : ");
			int sendingAmount = sc.nextInt();
			boolean amountCheck = sendingAmount >= 1;
			if (amountCheck) {
				if (!(sendingAmount > myMoney)) {
					myMoney = myMoney - sendingAmount;
					yourMoney = yourMoney + sendingAmount;
					System.out.println("이체 성공");
					System.out.println("잔액 : " + myMoney);
				} else {
					System.out.println("잔액 부족");
				}
			} else {
				System.out.println("금액을 확인하세요");
			}
		}
		sc.close();
	}
}
