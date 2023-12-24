package 조건문문제;

import java.util.Scanner;

public class _17ATM1단계_복습1 {
	public static void main(String[] args) {
//		ATM 1단계 : 이체하기
//		1. 이체할 계좌번호를 입력받는다
//		2. 계좌번호가 일치하면
//		3. 이체할 금액을 입력받는다
//		4. 이체할 금액 <= myMoney : 이체가능
//					myMoney - 이체할 금액
//					yourMoney + 이체할 금액
//					이체할 금액 > myMoney : 이체불가
		int myAcc = 1234;
		int myMoney = 8700;
		int yourAcc = 4321;
		int yourMoney = 12000;
		int acc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 계좌번호를 입력하세요 >>");
		int input = sc.nextInt();
		if (input != myAcc && input != yourAcc) {
			System.out.println("일치하는 계좌가 없습니다.");
		}
		if (input == myAcc) {
			acc = myAcc;
		}
		sc.close();
	}
}
