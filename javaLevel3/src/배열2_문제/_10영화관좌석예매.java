package 배열2_문제;

import java.util.Scanner;

public class _10영화관좌석예매 {

	public static void main(String[] args) {
//		영화관 좌석예매
//		1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다
//		2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
//		3. 이미 예매가 완료된 좌석은 재구매할 수 없다
//		4. 한 좌석당 예매 가격은 12000원이다
//		5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
//		예)
//		seat = 0 0 0 0 0 0 0
//		
//		좌석선택 : 1
//		seat = 0 1 0 0 0 0 0
//		
//		좌석선택 : 3
//		seat = 0 1 0 1 0 0 0
//		
//		좌석선택 : 3
//		seat = 0 1 0 1 0 0 0
//		이미 예매가 완료된 자리입니다.
//		매출액 24000원
		Scanner sc = new Scanner(System.in);
		int[] seat = new int[7];
		int sales = 0;
		boolean run = true;
		while (run) {
			System.out.println("=더조은 영화관=");
			System.out.println("1. 좌석예매");
			System.out.println("2. 종료");

			System.out.print("메뉴선택 : ");
			int sel = sc.nextInt();

			if (sel == 1) {
				System.out.println(" 1  2  3  4  5  6  7");
				for (int i = 0; i < seat.length; i += 1) {
					if (seat[i] == 0) {
						System.out.print("[0]");
					} else {
						System.out.print("[1]");
					}
				}
				System.out.println();
				while (true) {
					System.out.println("좌석 선택 1~7>>");
					int input = sc.nextInt() - 1;
					if (input < 0 || input > seat.length - 1) {
						System.out.println("좌석범위 오류");
						continue;
					}
					if (seat[input] == 1) {
						System.out.println("이미 예약된 좌석입니다");
						break;
					}
					seat[input] = 1;
					System.out.println("[좌석 예매 완료]");
					sales += 12000;
					break;
				}
			} else if (sel == 2) {
				System.out.println("매출액 " + sales + "원");
				run = false;
			} else {
				System.out.println("메뉴를 다시 선택하세요");
				continue;
			}
		}
		sc.close();
	}
}
