package 클래스배열_문제;

import java.util.Scanner;

class SeatVO {
	int num;// 죄석번호
	boolean check;// 예매 여부

	void init(int num) {
		this.num = num;
	}

	void showNum() {
		System.out.print(num + " ");
	}

	void printData() {
		if (check) {
			System.out.print("■ ");
		} else {
			System.out.print("□ ");
		}
	}
}

class SeatDAO {
	Scanner sc = new Scanner(System.in);
	SeatVO[] seatList;
	String name;
	int size = 8, cnt, money;

	void init() {
		name = "메가박스";
		seatList = new SeatVO[size];
		for (int i = 0; i < seatList.length; i += 1) {
			seatList[i] = new SeatVO();
		}
	}

	void showMenu() {
		System.out.print("[1]예매하기 [2]종료 ");
	}

	void showSeats() {
		System.out.println("1 2 3 4 5 6 7 8");
		for (SeatVO vo : seatList) {
			vo.printData();
		}
		System.out.println();
	}

	void selectSeat() {
		while (true) {
			showSeats();
			System.out.println("예매할 좌석을 선택하세요.(1~8)");
			int sel = sc.nextInt() - 1;
			if (sel < 0 || sel > seatList.length - 1) {
				System.err.println("존재하지않는 좌석입니다.");
				continue;
			}
			if (!seatList[sel].check) {
				seatList[sel].num = 1;
				seatList[sel].check = true;
				cnt += 1;
				money += 12000;
				return;
			}
			System.err.println("이미 예매 된 좌석입니다.");
		}
	}

	boolean checkFull() {
		boolean check = false;
		if (cnt == seatList.length) {
			check = true;
		}
		return check;
	}

	void showEarnings() {
		System.out.println(money);
	}

	void run() {
		init();
		while (true) {
			while (true) {
				showSeats();
				if (checkFull()) {
					showEarnings();
					return;
				}
				showMenu();// 메뉴 출력
				int sel = sc.nextInt();// 메뉴 선택
				if (sel == 1) {
					break;
				} else if (sel == 2) {// 종료 -> 매출액 출력
					showEarnings();
					return;
				}
			}
			selectSeat();// 예매하기
		}
	}
}

public class _02클배영화예매 {
	public static void main(String[] args) {
		SeatDAO dao = new SeatDAO();
		dao.run();
		dao.sc.close();
	}
}
