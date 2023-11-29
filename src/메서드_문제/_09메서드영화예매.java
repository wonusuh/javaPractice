package 메서드_문제;

import java.util.Scanner;

class Theater {
	Scanner scan = new Scanner(System.in);
	int[] seat = new int[10];
	String name = ""; // 영화관 이름
	int cnt = 0; // 예매 수
	int money = 0; // 매출액

	// 메뉴 출력하기 ([1] 예메하기 [2] 종료하기 )
	void showMenu() {
		System.out.printf("====== %s ====== %n", name);
		System.out.println("1. 예매하기");
		System.out.println("2. 종료하기");
	}

	// 메뉴 선택하기
	int selectNum(String msg, int start, int end) {
		System.out.println(msg);
		int num = 0;
		while (true) {
			num = scan.nextInt();
			if (num < start || num > end) {
				System.out.println("입력오류");
				continue;
			}
			break;
		}
		return num;
	}

	void printSeat() {
		for (int i = 1; i <= seat.length; i += 1) {
			System.out.print("  " + i + " ");
		}
		System.out.println();
		for (int val : seat) {
			if (val == 0) {
				System.out.print("[X] ");
			} else {
				System.out.print("[O] ");
			}
		}
		System.out.println();
	}

	// 예매하기 (좌석 선택 받기 )
	void choiceSeat() {
		printSeat();
		int idx = selectNum("좌석을 선택해주세요", 1, seat.length) - 1;
		if (seat[idx] == 1) {
			System.out.println("이미 예매완료된 좌석입니다");
		} else {
			seat[idx] = 1;
			cnt += 1;
			System.out.println("=== 좌석 예매 완료===");
		}
	}

	// 매출현황 출력하기 (총 매출액 출력 )
	void showSales() {
		money = cnt * 12000;
		System.out.println(" 총 매출액 " + money + "원");
	}

	void run() {
		while (true) {
			showMenu();
			int sel = selectNum("메뉴를 선택해주세요", 1, 2);
			if (sel == 1) {
				// 예매하기
				choiceSeat();
			} else {
				// 종료하기
				showSales();
				break;
			}
		}
	}
}

public class _09메서드영화예매 {
//	 * # 영화관 좌석예매 : 클래스 + 메서드 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.2. 예매가 완료되면 해당
//	 * 좌석 값을 1로 변경한다. 3. 이미 예매가 완료된 좌석은 재구매할 수 없다. 4. 한 좌석당 예매 가격은 12000원이다. 5. 프로그램
//	 * 종료 후, 해당 영화관의 총 매출액을 출력한다. 예) seat = 0 0 0 0 0 0 0
//	 * 좌석선택 : 1 seat = 0 1 0 0 0 0 0
//	 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0
//	 * 좌석선택 : 3 seat = 0 1 0 1 0 0 0 이미 예매가 완료된 자리입니다. ---------------------- 매출액 :
//	 * 24000원
	public static void main(String[] args) {
		Theater megabox = new Theater();
		megabox.name = "메가박스";
		megabox.run();
		megabox.scan.close();
	}
}
