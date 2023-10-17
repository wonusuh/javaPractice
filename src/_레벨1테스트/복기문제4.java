package _레벨1테스트;

import java.util.Scanner;

public class 복기문제4 {
	public static void main(String[] args) {
//		   [ 문제 4 ]
//		   # 영수증 출력[1단계]
//		   1. 메뉴판을 출력한다.
//		   2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
//		   3. 현금을 입력받는다.
//		   4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
//		   5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.

//			문제 4번 영수중 현금 부족 이랑 잔돈 한번만 하게 코드 중복 줄여주세요
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

//		   1. 메뉴판을 출력한다.
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

//		   2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("주문할 메뉴의 번호를 입력하세요. 1.불고기버거 2.새우버거 3.콜라 =>");
		int menu = sc.nextInt();
		sc.close();
	}
}
