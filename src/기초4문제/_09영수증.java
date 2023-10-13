package 기초4문제;

import java.util.Scanner;
//	[문제]
//	1. 메뉴판을 출력한다.
//	2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
//	3. 현금을 입력받는다.
//	4. 입력받은 현금과 메뉴가격을 확인해 영수증을 출력한다.
//	5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.

public class _09영수증 {
	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;

		// 1. 메뉴판을 출력한다.
		System.out.println("=== 롯데리아 ===");
		System.out.println("1. 새우버거 : " + price1 + "원");
		System.out.println("2. 치즈버거 : " + price2 + "원");

		// 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요 (1)새우버거, (2)치즈버거 => ");
		int menu = sc.nextInt();

		// 메뉴를 제대로 선택했는지 체크
		boolean menuCheck = menu == 1 || menu == 2;
		if (!menuCheck) {
			System.out.println("메뉴를 다시 선택하세요 1 or 2");
		}

		// 3. 현금을 입력받는다.
		sc.close();
	}
}
