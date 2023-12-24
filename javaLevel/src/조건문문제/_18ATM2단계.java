package 조건문문제;

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

		boolean pass = false;
		boolean error = false;

		int menu = sc.nextInt();
		if (menu < 1 || menu > 2) {
			System.out.println("메뉴를 다시 선택하세요.");
		} else if (menu == 2) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("계좌번호를 입력하세요 => ");
			int inputAcc = sc.nextInt();
			System.out.println("비밀번호를 입력하세요 => ");
			int inputPw = sc.nextInt();

			if (inputAcc != account || inputPw != password) {
				System.out.println("로그인 실패");
			} else {
				pass = true;
			}
		}

		if (pass) {
			// 1. 로그인 성공할때만 ==> 1.입금 2.출금 3.조회
			System.out.println("할 업무를 선택하세요 (1.입금 2.출금 3.조회) => ");
			int task = sc.nextInt();
			if (task < 1 || task > 3) {
				System.out.println("업무를 다시 확인하세요.");
			} else if (task == 1 || task == 2) {
				System.out.println("금액 입력 => ");
				int money = sc.nextInt();
				int dbMoney = 0;
				if (task == 1) {
					dbMoney = cash;
				} else if (task == 2) {
					dbMoney = balance;
				}
				if (money < 0) {
					System.out.println("음수값 오류");
					error = true;
				} else if (money > dbMoney) {
					System.out.println("돈이 부족합니다");
					error = true;
				}
				if (!error) {
					if (task == 1) {
						cash -= money;
						balance += money;
					} else if (task == 2) {
						balance -= money;
						cash += money;
					}
					System.out.println("현재 지갑에 있는 돈 : " + cash);
					System.out.println("현재 계좌에 있는 돈 : " + balance);
				}
			} else {
				System.out.println("조회");
				System.out.println("계좌 잔액 : " + balance);
			}
		}
		sc.close();
	}
}
