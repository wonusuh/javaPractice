package movie;

import java.util.Scanner;

public class SeatDAO {

	Seat[] seatList;
	Scanner sc;

	void init(int amount) {
		sc = new Scanner(System.in);

		seatList = new Seat[amount];

		for (int i = 0; i < seatList.length; i += 1) {

			Seat s = new Seat();

			s.setNumber(i);
			seatList[i] = s;
		}
	}

	boolean didIBook(String log) {

		for (Seat s : seatList) {

			if (log.equals(s.getUserId())) {
				return true;
			}
		}
		return false;
	}

	void printSeats() {
		System.out.println("1  2  3  4  5  6  7  8  9  10");

		for (int i = 0; i < seatList.length; i += 1) {

			if (seatList[i].isCheck()) {
				System.out.print("■  ");
			} else {
				System.out.print("□  ");
			}
		}
		System.out.println();
	}

	void book(String log) {

		int sel;

		while (true) {
			printSeats();
			System.out.println("좌석을 선택하세요. >>");

			sel = sc.nextInt() - 1;

			if (sel < 0 || sel > seatList.length - 1) {
				System.err.println("좌석번호를 다시 확인하세요.");
				continue;
			}

			if (seatList[sel].isCheck()) {
				System.err.println("이미 예매된 좌석입니다.");
				continue;
			}
			break;
		}
		seatList[sel].setCheck(true);
		seatList[sel].setUserId(log);
		System.out.println("예매 완료");
	}

	void cancel(String log) {

		if (!didIBook(log)) {
			System.err.println("[ 내가 예매한 좌석이 없습니다. ]");
			return;
		}

		for (Seat s : seatList) {

			if (s.getUserId() != null && s.getUserId().equals(log)) {
				s.setCheck(false);
				s.setUserId(null);
			}
		}
		System.out.println("모두 취소 완료");
	}

	void showBookedSeats(String log) {

		if (!didIBook(log)) {
			System.err.println("[ 내가 예매한 좌석이 없습니다. ]");
			return;
		}
		System.out.println("==========내가 예매한 좌석들==========");
		System.out.println("1  2  3  4  5  6  7  8  9  10");

		for (int i = 0; i < seatList.length; i += 1) {

			if (seatList[i].getUserId() != null && seatList[i].getUserId().equals(log)) {
				System.out.print("■  ");
			} else {
				System.out.print("□  ");
			}
		}
		System.out.println();
		System.out.println("==============================");
	}
}
