package 컬렉션벡터;

import java.util.Scanner;
import java.util.Vector;

class Seat {

	int num;
	boolean check;

	/**
	 * @return the num
	 */
	int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the check
	 */
	boolean isCheck() {
		return check;
	}

	/**
	 * @param check the check to set
	 */
	void setCheck(boolean check) {
		this.check = check;
	}
}

class SeatDAO {

	Scanner scan;
	Vector<Seat> list;
	int size, cnt, earnings;

	SeatDAO(int size) {

		scan = new Scanner(System.in);
		list = new Vector<Seat>();
		this.size = size;

		for (int i = 0; i < size; i += 1) {

			Seat temp = new Seat();

			temp.num = i + 1;
			list.add(temp);
		}
	}

	void chooseSeat() {
		System.out.print("좌석을 선택하세요. >> ");

		int idx = scan.nextInt() - 1;

		if (idx < 0 || idx > size - 1) {
			System.out.println("존재하지 않는 좌석입니다.");
			return;
		}

		if (list.get(idx).isCheck()) {
			System.out.println("이미 예매 된 좌석입니다.");
			return;
		}
		list.get(idx).setCheck(true);
		cnt += 1;
		earnings += 12000;
		System.out.println("좌석을 예매했습니다.");
	}

	void printSeats() {
		System.out.println("1  2  3  4  5  6  7  8  9  10");

		for (int i = 0; i < size; i += 1) {

			if (list.get(i).check) {
				System.out.print("■  ");
			} else {
				System.out.print("□  ");
			}
		}
		System.out.println();
	}

	boolean isFull() {

		if (cnt == size) {
			System.out.println("더이상 예매할 수 있는 좌석이 없습니다.");
			printEarnings();
			return true;
		}
		return false;
	}

	void printEarnings() {
		System.out.printf("총 예매 수 : %d\n", cnt);
		System.out.printf("매출액 : %d\n", earnings);
	}

	void run() {

		while (true) {
			printSeats();
			System.out.println("[1]예매");
			System.out.println("[0]종료");

			int sel = scan.nextInt();

			if (sel == 0) {
				printEarnings();
				break;
			} else if (sel == 1) {

				if (isFull())
					break;
				chooseSeat();
			}
		}
	}
}

public class _05자리예매 {
	public static void main(String[] args) {

		SeatDAO dao = new SeatDAO(10);

		dao.run();
		dao.scan.close();
	}
}
