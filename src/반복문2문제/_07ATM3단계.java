package 반복문2문제;

import java.util.Scanner;

public class _07ATM3단계 {
	public static void main(String[] args) {
//		ATM
//		1. 입금 : 입금 보이스피싱 방지 위해 100만원까지만 입금 가능
//			입금할 금액을 입력받아, myMoney에 입금
//		2. 출금
//			출금할 금액을 입력받아, myMoney에서 출금
//			단, 출금할 금액이 myMoney 잔액을 초과할 출금불가
//		3. 이체
//			yourAcc 계좌번호를 입력받아, 이체
//			이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
//			이체 후 yourMoney 잔액 증가
//		4. 조회
//			myMoney와 yourMoney 잔액 모두 출력

		Scanner sc = new Scanner(System.in);

		int myAcc = 1111;
		int myMoney = 50000; // 계좌 금액

		int yourAcc = 2222;
		int yourMoney = 70000;

		boolean run = true;
		while (run) {
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");

			System.out.println("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel < 0 || sel > 4) {
				System.out.println("메뉴를 다시 입력해주세요");
				continue;
			}

			if (sel == 1) { // 입금
				System.out.println("=====입금=====");
				System.out.println("입금할 금액을 입력하세요");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("0 이상 금액을 입력하세요");
					continue;
				}
				if (money > 1000000) {
					System.out.println("이체한도 초과");
					continue;
				}
				myMoney += money;
				System.out.println("입금 완료");
				System.out.println("myMoney : " + myMoney);
				System.out.println("yourMoney : " + yourMoney);
			} else if (sel == 2) { // 출금
				System.out.println("=====출금=====");
				System.out.println("출금할 금액을 입력하세요");
				int money = sc.nextInt();
				if (money > myMoney) {
					System.out.println("출금 잔액 부족");
					continue;
				}
				myMoney -= money;
				System.out.println("출금 완료");
				System.out.println("myMoney : " + myMoney);
				System.out.println("yourMoney : " + yourMoney);
			} else if (sel == 3) { // 이체
				System.out.println("=====이체=====");
				System.out.println("이체 계좌를 입력하세요");
				int acc = sc.nextInt();
				if (acc != yourAcc) {
					System.out.println("계좌 입력 오류");
					continue;
				} else if (acc == myAcc) {
					System.out.println("내 계좌에는 이체 불가능");
					continue;
				}
				System.out.println("금액을 입력하세요 => ");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("1원 미만은 이체 불가능");
					continue;
				}
				if (money > myMoney) {
					System.out.println("이체 잔액 부족");
					continue;
				}
				myMoney -= money;
				yourMoney += money;
				System.out.println("이체 완료");
				System.out.println("myMoney : " + myMoney);
				System.out.println("yourMoney : " + yourMoney);
			} else if (sel == 4) { // 조회
				System.out.println("myMoney : " + myMoney);
				System.out.println("yourMoney : " + yourMoney);
			} else if (sel == 0) { // 종료
				run = false;
				System.out.println("프로그램 종료");
			}
		} // while문 끝
		sc.close();
	}
}
