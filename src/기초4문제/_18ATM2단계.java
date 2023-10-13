package 기초4문제;

import java.util.Scanner;

public class _18ATM2단계 {
	public static void main(String[] args) {
		// 1. 로그인 성공할때만 ==> 1.입금 2.출금 3.조회

		// 지갑에 있는돈
		int cash = 20000; // 입금시 감소, 출금시 증가
		// 계좌에 있는돈
		int balance = 30000; // 입금시 증가, 출금시 감소

		int account = 11111; // 로그인 시 사용
		int password = 1234; // 로그인시 사용

		Scanner sc = new Scanner(System.in);
		System.out.println("===더조은 ATM===");
		System.out.println("1.로그인하기 2.종료하기");
		int loginOrOff = sc.nextInt();
		if (loginOrOff == 1) {
			System.out.println("계좌번호를 입력하세요 : ");
			int accVerify = sc.nextInt();
			System.out.println("비밀번호를 입력하세요 : ");
			int passVerify = sc.nextInt();
			if (accVerify == account && passVerify == password) {
				System.out.println("로그인 성공");
				System.out.println("션택하세요 : 1.입금 2.출금 3.조회");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.println("입금하기");
					System.out.println("내 지갑에 있는 돈 : " + cash);
					System.out.println("내 계좌의 잔액 : " + balance);
					System.out.println("입금 할 금액을 입력하세요 : ");
					int in = sc.nextInt();
					if (in >= 1) {
						balance = balance + in;
						System.out.println("입금 성공");
						System.out.println("내 계좌의 잔액 : " + balance);
					} else {
						System.out.println("입금 가능한 금액은 1원 이상입니다.");
						System.out.println("종료합니다");
					}
				} else if (menu == 2) {
					System.out.println("출금하기");
					System.out.println("내 계좌의 잔액 : " + balance);
					System.out.println("출금할 금액을 입력하세요 : ");
					int out = sc.nextInt();
					boolean outCheck = balance >= out && out > 0;
					if (outCheck) {
						balance = balance - out;
						System.out.println("출금 성공");
						System.out.println("내 계좌의 잔액 : " + balance);
					}
					if (!outCheck) {
						System.out.println("출금은 잔액을 초과할 수 없고, 1원 이상만 가능합니다.");
					}
				} else if (menu == 3) {
					System.out.println("조회하기");
					System.out.println("내 계좌의 잔액 : " + balance);
				} else {
					System.out.println("메뉴를 확인하세요 : 1.입금 2.출금 3.조회");
					System.out.println("종료합니다.");
				}
			} else {
				System.out.println("계좌나 비밀번호가 일치하지 않습니다.");
				System.out.println("종료합니다.");
			}
		} else if (loginOrOff == 2) {
			System.out.println("종료합니다");
		} else {
			System.out.println("올바른 수를 입력하세요.");
			System.out.println("종료합니다.");
		}
		sc.close();
	}
}
