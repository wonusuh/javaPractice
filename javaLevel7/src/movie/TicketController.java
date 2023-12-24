package movie;

import java.util.Scanner;

public class TicketController {

	Scanner sc;
	SeatDAO seatDAO;
	UserDAO userDAO;
	String log;

	void init() {

		sc = new Scanner(System.in);
		seatDAO = new SeatDAO();
		seatDAO.init(10);
		userDAO = new UserDAO();
		userDAO.init();
	}

	void run() {
		init();

		while (true) {

			if (log == null) {
				System.out.print("[1]로그인 ");
				System.out.print("[2]회원가입 ");

				int sel = sc.nextInt();

				if (sel == 1) {
					log = userDAO.signIn();
				} else if (sel == 2) {
					userDAO.signUp();
				} else if (sel == -1) {
					break;
				}
			} else {
				seatDAO.printSeats();
				System.out.printf("[ %s ]로그인 중\n", userDAO.getNamebyId(log));
				System.out.print("[1]영화예매 ");
				System.out.print("[2]예매취소 ");
				System.out.print("[3]내 예매목록 ");
				System.out.println("[4]로그아웃 ");

				int sel = sc.nextInt();

				if (sel == 1) {
					seatDAO.book(log);
				} else if (sel == 2) {
					seatDAO.cancel(log);
				} else if (sel == 3) {
					seatDAO.showBookedSeats(log);
				} else if (sel == 4) {
					log = null;
				} else if (sel == -1) {
					break;
				}
			}
		}
		sc.close();
	}
}
