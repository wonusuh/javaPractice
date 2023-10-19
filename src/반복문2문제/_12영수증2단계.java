package 반복문2문제;

import java.util.Scanner;

public class _12영수증2단계 {
	public static void main(String[] args) {
//		문제
//			1. 5번 주문을 받는다
//			2. 주문이 끝난 후, 돈을 입력받는다
//			3. 각 메뉴별 주문 수량과 총 금액을 출력한다.
//			4. 주문이 성공할때까지 돈 입력받는다.
//			예)
//				메뉴선택 : 1
//				메뉴선택 : 1
//				메뉴선택 : 3
//				메뉴선택 : 2
//				메뉴선택 : 2
//				
//			=== 롯데리아 영수증 ===
//			1. 새우버거 : 2개
//			2. 치즈버거 : 2개
//			3. 콜라  : 1개
//			4. 총 금액: 31300원
//			5. 잔돈 : 700원
		Scanner sc = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 불고기 버거 : " + price1 + "원");
		System.out.println("2. 새우   버거 : " + price2 + "원");
		System.out.println("3. 콜      라 : " + price3 + "원");

		int i = 1;
		int total = 0;
		int bul = 0;
		int shrimp = 0;
		int cola = 0;

		while (i <= 5) {
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();

			if (menu < 1 || menu > 3) {
				System.out.println("메뉴를 다시 선택하세요 1~3");
				continue;
			}
			if (menu == 1) {
				total += price1;
				bul += 1;
			} else if (menu == 2) {
				total += price2;
				shrimp += 1;
			} else {
				total += price3;
				cola += 1;
			}
			i += 1;
		}
		System.out.println("필요한 금액 : " + total);

		int cash = 0;
		while (true) {
			System.out.println("현금을 입력하세요 >>");
			cash = sc.nextInt();
			if (cash <= 0) {
				System.out.println("현금을 1이상 입력하세요");
				continue;
			}
			if (cash < total) {
				System.out.println("현금이 부족합니다 현금을 더 넣으세요");
				continue;
			}
			break;
		}
		int num = 0;
		System.out.println("=====롯데리아 영수증=====");
		if (bul != 0) {
			System.out.printf("%d. 불고기버거 %d개\n", num += 1, bul);
		}
		if (shrimp != 0) {
			System.out.printf("%d. 새우버거 %d개\n", num += 1, shrimp);
		}
		if (cola != 0) {
			System.out.printf("%d. 콜라 %d개\n", num += 1, cola);
		}

		System.out.printf("%d. 총 금액 :%d\n", num += 1, total);

		if ((cash - total) != 0) {
			System.out.printf("%d. 잔돈 : %d\n", num += 1, (cash - total));
		}
		sc.close();
	}
}
