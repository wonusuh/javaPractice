package 기초4문제;

import java.util.Scanner;

public class _09영수증 {
	public static void main(String[] args) {
		// 메뉴판을 출력한다
		// 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		// 현금을 입력받는다
		// 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
		// 현금이 부족한경우 현금부족 출력
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 새우버거 : " + price1 + "원");
		System.out.println("2. 치즈버거 : " + price2 + "원");
		System.out.println("원하는 메뉴를 입력하세요 (1)새우버거, (2)치즈버거");
		int menu = sc.nextInt();
		System.out.println("현금을 입력하세요");
		int cash = sc.nextInt();
		boolean error = menu == 1 && menu == 2;

		if (error) {
			System.out.println("메뉴를 다시 입력하세요 1 or 2");
		}

		if (!error) {
			if (menu == 1) {
				if (cash >= price1) {
					System.out.println("새우버거를 구매합니다.");
				} else {
					System.out.println("현금이 부족합니다");
				}
			}
			if (menu == 2) {
				if (cash >= price2) {
					System.out.println("치즈버거를 구매합니다");
				} else {
					System.out.println("현금이 부족합니다");
				}
			}
		}
	}
}
