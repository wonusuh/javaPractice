package 반복문2문제;

import java.util.Scanner;

public class _14ATM4단계 {
	public static void main(String[] args) {
//		1. 로그인
//			로그인 후 재 로그인 불가
//			로그아웃 상태에서만 이용 가능
//		2. 로그아웃
//			로그인 후 이용가능
//		3. 입금
//			로그인 후 이용가능
//		4. 출금
//			로그인 후 이용가능
//		5. 이체
//			로그인 후 이용가능
		// 나 자신에게 이체 불가
//		6. 조회
//			로그인 후 이용가능
//		7. 종료
		Scanner sc = new Scanner(System.in);
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;

		// 힌트 : dbAcc1 로그인성공 myAcc = dbAcc1 myMoney = dbMoney1
		// 힌트 : dbAcc2 로그인성공 myAcc = dbAcc2 myMoney = dbMoney2
		int myAcc = 0;
		int myMoney = 0;
		int yourAcc = 0;
		int yourMoney = 0;

		int log = -1;
		// -1(로그아웃), 1(dbacc1로그인), 2(dbAcc2로그인)
		boolean run = true;
		while (run) {
			if (log == -1) {
				System.out.println("1.로그인");
			} else {
				System.out.println("2.로그아웃");
				System.out.println("3.입금");
				System.out.println("4.출금");
				System.out.println("5.이체");
				System.out.println("6.조회");
			}
			System.out.println("0.종료");

			System.out.println("메뉴를 선택하세요 >>");
			int sel = sc.nextInt();

			if (sel == 1) {
				if (log != -1) {
					System.out.println("[ 접근 오류 ]이미 로그인 중입니다");
					continue;
				}
				System.out.println("로그인 합니다");
				System.out.println("계좌번호를 입력하세요");
				int acc = sc.nextInt();
				System.out.println("비밀번호를 입력하세요");
				int pw = sc.nextInt();
				if (acc == dbAcc1 && pw == dbPw1) {
					System.out.println("dbAcc1 로그인");
					log = 1;
					myAcc = dbAcc1;
					myMoney = dbMoney1;
					yourAcc = dbAcc2;
					yourMoney = dbMoney2;
				} else if (acc == dbAcc2 && pw == dbPw2) {
					System.out.println("dbAcc2 로그인");
					log = 2;
					myAcc = dbAcc2;
					myMoney = dbMoney2;
					yourAcc = dbAcc1;
					yourMoney = dbMoney1;
				} else {
					System.out.println("계좌번호와 비밀번호를 확인하세요");
				}
			} else if (sel == 2) {
				if (log == -1) {
					System.out.println("이미 로그아웃 중입니다.");
					continue;
				}
				System.out.println("로그아웃 합니다");
				if (log == 1) {
					dbMoney1 = myMoney;
					dbMoney2 = yourMoney;
				} else if (log == 2) {
					dbMoney2 = myMoney;
					dbMoney1 = yourMoney;
				}
				log = -1;
			} else if (sel == 3) {
				System.out.println("입금");
				if (log == -1) {
					System.out.println("[ 접근오류 ]로그인중이 아닙니다. 로그인 하세요");
					continue;
				}
				System.out.println("입금 할 금액을 입력하세요 >>");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("입금 가능 금액은 1원 이상입니다.");
					continue;
				}
				myMoney += money;
				System.out.printf("입금 완료. 내계좌 : %d 상대계좌 : %d\n", myMoney, yourMoney);
			} else if (sel == 4) {
				if (log == -1) {
					System.out.println("로그인 후 이용하세요");
					continue;
				}
				System.out.println("출금 할 금액을 입력하세요 >>");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("출금 가능 금액은 1원 이상입니다.");
					continue;
				}
				if (money > myMoney) {
					System.out.println("출금 잔액 부족");
					continue;
				}
				myMoney -= money;
				System.out.printf("출금 완료. 내계좌 : %d 상대계좌 : %d\n", myMoney, yourMoney);
			} else if (sel == 5) {
				if (log == -1) {
					System.out.println("로그인 후 이용하세요");
					continue;
				}
				System.out.println("이체받을 사람의 계좌번호를 입력하세요");
				int inputAcc = sc.nextInt();
				if (inputAcc == myAcc) {
					System.out.println("나 자신에게는 이체할 수 없습니다.");
					continue;
				}
				System.out.println("이체할 금액을 입력하세요 >>");
				int money = sc.nextInt();
				if (money <= 0) {
					System.out.println("1원 이상만 이체할 수 있습니다.");
					continue;
				}
				if (money > myMoney) {
					System.out.println("이체 잔액 부족");
					continue;
				}
				myMoney -= money;
				yourMoney += money;
				System.out.printf("이체 완료. 내계좌 : %d 상대계좌 : %d\n", myMoney, yourMoney);
			} else if (sel == 6) {
				if (log == -1) {
					System.out.println("조회는 로그인 후 이용 가능");
					continue;
				}
				System.out.println("조회");
				System.out.printf("내계좌 : %d 내잔액 : %d\n", myAcc, myMoney);
				System.out.printf("내상대 : %d 상대잔액 : %d\n", yourAcc, yourMoney);
			} else if (sel == 0) {
				System.out.println("종료");
				run = false;
			} else {
				System.out.println("메뉴를 다시 선택하세요");
				continue;
			}
		}
		sc.close();
	}
}
