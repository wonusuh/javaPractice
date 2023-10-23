package _level2test;

import java.util.Scanner;

public class 문제14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fail = 0;
		int log = -1; // 로그아웃 -1, 로그인 1
		int dbId = 1111;
		int dbPw = 1234;
		boolean run = true;
		while (run) {
			if (log == -1) {
				System.out.printf("[1. 로그인]\n");
			}
			System.out.printf("[0. 종료]\n");
			int menu = sc.nextInt();
			if (menu < 0 || menu > 1) {
				System.out.println("메뉴를 다시 선택하세요(0~1)");
				continue;
			}
			if (menu == 1) {
				while (run) {
					System.out.println("id를 입력하세요 >>");
					int id = sc.nextInt();
					System.out.println("pw를 입력하세요 >>");
					int pw = sc.nextInt();
					if (id != dbId || pw != dbPw) {
						fail += 1;
						if (fail >= 3) {
							System.out.println("로그인 3회 실패. 종료합니다.");
							run = false;
							break;
						}
						System.out.println("아이디와 비밀번호를 확인하세요");
						continue;
					}
					log = 1;
					while (log == 1) {
						System.out.printf("[1. 잔액확인][2. 로그아웃][0. 종료]");
						int afterLogin = sc.nextInt();
						if (afterLogin < 0 || afterLogin > 2) {
							System.out.println("메뉴를 다시 확인하세요.");
							continue;
						}
						if (afterLogin == 1) {
							System.out.println("내 잔액 : ~원");
						} else if (afterLogin == 2) {
							System.out.println("로그아웃합니다");
							log = -1;
							break;
						} else {
							System.out.println("종료합니다");
							run = false;
							break;
						}
					}
					break;
				}
			} else if (menu == 0) {
				System.out.println("종료합니다.");
				run = false;
				break;
			}
		}
		sc.close();
	}
}
