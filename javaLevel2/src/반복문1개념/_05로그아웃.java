package 반복문1개념;

import java.util.Scanner;

public class _05로그아웃 {
	public static void main(String[] args) {
//		문제
//			1. 로그인
//			- 로그인 후, 재 로그인 불가함
//			- 로그아웃 상태에서만 이용 가능
//			2. 로그아웃
//			-로그인 후 이용가능
//			3. 로그인, 로그아웃 관리는 log변수를 이용한다
//			예) -1(로그아웃), 1111(id1), 2222(id2)

		Scanner scan = new Scanner(System.in);

		int id1 = 1111;
		int pw1 = 1234;

		int id2 = 2222;
		int pw2 = 2345;

		int log = -1; // -1(로그아웃), 1111(id1), 2222(id2)

		boolean run = true;
		while (run) {
			if (log == -1) {
				System.out.println("로그아웃 상태");
			} else if (log == 1111) {
				System.out.println("1111님 로그인상태");
			} else {
				System.out.println("2222님 로그인상태");
			}

			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1 && log == -1) {

				System.out.print("id>>");
				int id = scan.nextInt();
				System.out.print("pw>>");
				int pw = scan.nextInt();
				if (id == id1 && pw == pw1) {
					System.out.println("1111님 로그인 성공 ");
					log = 1111;
				} else if (id == id2 && pw == pw2) {
					System.out.println("2222님 로그인 성공");
					log = 2222;
				} else {
					System.out.println("로그인 실패");
				}

			} else if (sel == 2 && log != -1) {

				log = -1;
				System.out.println("로그아웃 성공 ");

			} else if (sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			} else if (sel < 0 || sel > 2) {
				System.out.println("번호 입력오류");
			} else {
				if (log == -1) {
					System.out.println("로그인 후 이용해주세요");
				} else {
					System.out.println("로그아웃 후 이용해주세요");
				}
			}

			System.out.println("--------------");
		}
		scan.close();
	}
}
