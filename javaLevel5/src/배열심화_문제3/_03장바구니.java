package 배열심화_문제3;

import java.util.Scanner;

public class _03장바구니 {
	public static void main(String[] args) {
//		문제
//			1. 로그인 후, 쇼핑 메뉴를 선택하면 
//				다음과 같은 상품 목록을 출력한다.
//				(1)사과 (2)바나나 (3)딸기
//			2. 번호를 선택해 상품을 장바구니에 담는다.
//			3. 로그인 회원의 아이디는 cartList배열의 0열에 저장한다.
//			4. 해당 회원이 구매한 상품은 cartList배열의 1열에 저장한다.
//			
//				예)
//					{qwer, 사과}
//					{javaking, 사과}
//					{abcd, 사과}
//					{qwer, 딸기}
//					{qwer, 사과}
//					~
//					~
//					~
//			5. 장바구니 메뉴를 선택하면, 로그인 한 회원의 구매 물품만 출력한다.
//				예)
//					qwer = 사과, 딸기, 사과
		Scanner sc = new Scanner(System.in);

		String[] idList = { "qwer", "javaking", "abcd" };
		String[] pwList = { "1111", "2222", "3333" };

		final int MAX_SIZE = 100;
		String[][] cartList = new String[MAX_SIZE][2];

		String[] items = { "사과", "바나나", "딸기" };

		int log = -1;
		int count = 0;
		while (true) {
//			System.out.println(Arrays.deepToString(cartList));
			System.out.println("[MEGA MART]");
			if (log == -1) {
				System.out.println("[1]로 그 인");
			} else {
				System.out.println("[2]로그아웃");
				System.out.println("[3]쇼	핑");
			}
			System.out.println("[4]장바구니");
			System.out.println("[0]종	료");

			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();

			if (sel == 1 && log == -1) {
				// 로그인하기
				System.out.print("id를 입력하세요 >> ");
				String id = sc.next();

				System.out.print("pw를 입력하세요 >> ");
				String pw = sc.next();

				boolean idCheck = false;
				boolean pwCheck = false;
				int idx = -1;

				for (int i = 0; i < idList.length; i += 1) {
					if (id.equals(idList[i])) {
						idCheck = true;
						idx = i;
					}
				}

				if (idx == -1) {
					System.err.println("아이디를 확인하세요.");
					continue;
				}

				if (pw.equals(pwList[idx])) {
					pwCheck = true;
				}

				if (idCheck && pwCheck) {
					System.out.printf("%s로그인 성공\n", idList[idx]);
					log = idx;
				} else {
					System.err.println("로그인 실패.");
				}

			} else if (sel == 2 && log != -1) {
				// 로그아웃하기
				log = -1;
			} else if (sel == 3 && log != -1) {
				// 쇼핑
				int app = 0;
				int ban = 0;
				int str = 0;

				while (true) {
					System.out.println("(1)사과 (2)바나나 (3)딸기 (0)종료");
					int choice = sc.nextInt();

					if (choice == 1) {
						cartList[count][0] = idList[log];
						cartList[count][1] = items[choice - 1];
						app += 1;
						System.out.printf("%s %d개 구입완료.\n", items[choice - 1], app);
					} else if (choice == 2) {
						cartList[count][0] = idList[log];
						cartList[count][1] = items[choice - 1];
						ban += 1;
						System.out.printf("%s %d개 구입완료.\n", items[choice - 1], ban);
					} else if (choice == 3) {
						cartList[count][0] = idList[log];
						cartList[count][1] = items[choice - 1];
						str += 1;
						System.out.printf("%s %d개 구입완료.\n", items[choice - 1], str);
					} else if (choice == 0) {
						break;
					} else {
						continue;
					}

					count += 1;
				}

			} else if (sel == 4) {
				// 장바구니
				if (log != -1) {
					for (int i = 0; i < cartList.length; i += 1) {
						if (cartList[i][0] == null) {
							break;
						}

						if (cartList[i][0].equals(idList[log])) {
							System.out.print(cartList[i][0]);
							System.out.println(cartList[i][1]);
						}
					}

				} else {
					for (int i = 0; i < cartList.length; i += 1) {
						if (cartList[i][0] == null) {
							break;
						}

						System.out.print(cartList[i][0]);
						System.out.println(cartList[i][1]);
					}

				}

			} else if (sel == 0) {
				System.out.println("프로그램 종료.");
				break;
			} else {
				continue;
			}

		}

		sc.close();
	}

}
