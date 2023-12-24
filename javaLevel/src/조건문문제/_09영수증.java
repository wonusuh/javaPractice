package 조건문문제;

import java.util.Scanner;
//	[문제]
//	1. 메뉴판을 출력한다.
//	2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
//	3. 현금을 입력받는다.
//	4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
//	5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.

public class _09영수증 {
	public static void main(String[] args) {
		int shrimp = 8700;
		int cheese = 6200;

		// 1. 메뉴판을 출력한다.
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 새우버거 : " + shrimp + "원");
		System.out.println("2. 치즈버거 : " + cheese + "원");

		// 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요. (1)새우버거, (2)치즈버거 => ");
		int menu = sc.nextInt();

//		3. 현금을 입력받는다.
		System.out.println("현금을 입력하세요 =>");
		int cash = sc.nextInt();
		int balance = 0;

		if (menu == 1) {
			if (cash >= shrimp) {
				cash -= shrimp;
				balance += cash;
				System.out.println("새우버거 주문 완료");
				System.out.println("잔돈 : " + balance);
			} else if (cash < shrimp) {
				System.out.println("현금이 부족합니다");
			}
		}
		if (menu == 2) {
			if (cash >= cheese) {
				cash -= cheese;
				balance += cash;
				System.out.println("치즈버거 주문 완료");
				System.out.println("잔돈 : " + balance);
			} else if (cash < cheese) {
				System.out.println("현금이 부족합니다");
			}
		}
		sc.close();
	}
}
