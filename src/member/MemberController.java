package member;

import java.util.Scanner;

public class MemberController {

	Scanner sc;
	MemberDAO dao;

	void init() {
		sc = new Scanner(System.in);
		dao = new MemberDAO();
	}

	void run() {
		init();

		while (true) {
			System.out.println("[1]추가 [2]삭제 [3]수정 [4]출력 [0]종료");
			int sel = sc.nextInt();

			if (sel == 1) {
				dao.join();
			} else if (sel == 2) {
				dao.delete();
			} else if (sel == 3) {
				dao.modify();
			} else if (sel == 4) {
				dao.showAll();
			} else if (sel == 0) {
				break;
			}
		}
	}
}
