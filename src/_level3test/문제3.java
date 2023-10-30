package _level3test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
//		 * # 회원가입 
//		 * 1. 가입
//		 * . 아이디 와 비밀번호를 입력받아 가입
//		 * . 아이디 중복검사
//		 * 2. 탈퇴
//		 * . 아이디 를 입력받아 탈퇴
		Scanner scan = new Scanner(System.in);

		int[] ids = { 1001, 1002, 1003, 1004, 1005 };
		int[] pws = { 1111, 2222, 3333, 4444, 5555 };
		int cnt = 5;
		boolean run = true;

		while (run) {
			System.out.println("ids" + Arrays.toString(ids));
			System.out.println("pws" + Arrays.toString(pws));
			System.out.println("cnt" + cnt);
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.print("메뉴 선택 : ");

			int sel = scan.nextInt();

			if (sel == 1) {

				if (cnt == 5) {
					System.out.println("더이상 가입할 수 없습니다");
					continue;
				}

				System.out.print("가입 할 아이디 입력 >>");

				int id = scan.nextInt();
				boolean idCheck = true;

				for (int i = 0; i < ids.length - 1; i += 1) {
					if (id == ids[i]) {
						idCheck = false;
						break;
					}
				}

				if (idCheck) {
					System.out.print("가입할 비밀번호를 입력하세요 >> ");

					int pw = scan.nextInt();

					ids[cnt] = id;
					pws[cnt] = pw;
					cnt += 1;
				} else {
					System.out.println("이미 존재하는 아이디입니다.");
				}
			} else if (sel == 2) {
				System.out.print("탈퇴할 아이디를 입력하세요 >> ");

				int id = scan.nextInt();
				int idx = -1;

				for (int i = 0; i < ids.length; i += 1) {
					if (id == ids[i]) {
						idx = i;
						break;
					}
				}

				if (idx != -1) {
					for (int i = idx; i < cnt; i += 1) {
						if (cnt != 5) {
							ids[i] = ids[i + 1];
							pws[i] = pws[i + 1];
						} else {
							ids[i] = 0;
							pws[i] = 0;
						}
					}
					if (cnt != 5) {
						ids[cnt] = 0;
						pws[cnt] = 0;
					}
					cnt -= 1;
				} else {
					System.out.println("존재하지 않는 아이디 입니다");
				}
			} else {
				System.out.println("메뉴를 확인해주세요");
			}

		}
		scan.close();
	}
}
