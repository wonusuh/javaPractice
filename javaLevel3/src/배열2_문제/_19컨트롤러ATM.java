package 배열2_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _19컨트롤러ATM {
	public static void main(String[] args) {
//		문제
//			ATM 전체 기능 구현
//			1. 회원가입
//				1) id 와 pw 를 입력받아 가입한다
//				2) 가입 시 돈 1000원이 부여된다
//				3) id 중복검사를 진행한다
//			2. 회원탈퇴
//				1) 로그인 이후에만 이용할 수 있다
//			3. 로그인
//				1) 로그아웃 상태에서만 이용할 수 있다
//				2) id 와 pw 를 입력받아 로그인한다
//			4. 로그아웃
//				1) 로그인 후에만 이용할 수 있다.
//			5. 입금
//				1) 로그인 후에만 이용할 수 있다.
//			6. 이체
//				1) 로그인 후에만 이용할 수 있다.
//			7. 잔액 조회
//				1) 로그인 후에만 이용할 수 있다.
		Scanner sc = new Scanner(System.in);
		int max = 5; // 0 1 2 3 4
//		int[] idList = { 11, 22, 33, 44, 55 }; // 1111
//		int[] pwList = { 1, 2, 3, 4, 5 }; // 1234
//		int[] moneyList = { 1000, 2000, 3000, 4000, 5000 }; // 1000 계좌 잔돈
		int[] idList = new int[max]; // 1111
		int[] pwList = new int[max]; // 1234
		int[] moneyList = new int[max]; // 1000 계좌 잔돈
		int count = 0; // 실제 회원 수
		int log = -1;
		int idx = -1;

		while (true) {
			System.out.println(Arrays.toString(idList));
			System.out.println(Arrays.toString(pwList));
			System.out.println(Arrays.toString(moneyList));
			System.out.println("[" + log + "]");
			if (log == -1) {
				System.out.println("[로그인 해주세요]");
				System.out.println("[1]회원가입 [2]로그인 [3]전체회원목록");
			} else {
				System.out.println("[4]입금 [5]송금 [6]비밀번호수정 [7]회원탈퇴 [8]로그아웃 [0]종료");
			}
			int menu = sc.nextInt();

			if (menu == 1 && log == -1) {
				if (count == 5) {
					System.out.println("회원수는 최대 5명까지 입니다");
					continue;
				}
				System.out.print("신규 등록할 id를 입력하세요 >> ");
				int id = sc.nextInt();

				// id 중복 검사
				boolean idCheck = false;

				for (int i = 0; i < count; i += 1) {
					if (id == idList[i]) {
						idCheck = true;
						break;
					}
				}
				if (idCheck == false) {
					System.out.print("pw를 설정하세요 >> ");
					int pw = sc.nextInt();

					idList[count] = id;
					pwList[count] = pw;
					moneyList[count] = 1000;
					count += 1;
					System.out.println("idLIst : " + Arrays.toString(idList));
					System.out.println("pwList : " + Arrays.toString(pwList));
					System.out.println("moneyList : " + Arrays.toString(moneyList));
				} else {
					System.out.println("id가 중복되었습니다");
					continue;
				}
			} else if (menu == 2 && log == -1) {
				System.out.print("id를 입력하세요 >>");
				int id = sc.nextInt();

				for (int i = 0; i < count; i += 1) {
					if (id == idList[i]) {
						idx = i;
					}
				}
				if (idx != -1) {
					System.out.print("pw를 입력하세요 >>");
					int pw = sc.nextInt();

					if (pw == pwList[idx]) {
						System.out.println("로그인 성공");
						log = idList[idx];
					} else {
						System.out.println("pw를 확인하세요");
						continue;
					}
				} else {
					System.out.println("id를 확인하세요");
					continue;
				}
			} else if (menu == 3 && log == -1) {
				System.out.print("[ ");
				for (int i = 0; i < count; i += 1) {
					System.out.print(idList[i] + " ");
				}
				System.out.println("]");
			} else if (menu == 4 && log != -1) {
				System.out.print("입금할 금액을 입력하세요 >> ");
				int amount = sc.nextInt();

				if (amount < 1) {
					System.out.println("1원 이상만 입금 가능합니다");
					continue;
				}
				moneyList[idx] += amount;
				System.out.println("잔액 : " + moneyList[idx]);
			} else if (menu == 5 && log != -1) {
				// 송금
				System.out.print("송금할 계좌를 입력하세요 >> ");
				int acc = sc.nextInt();

				if (acc == idList[idx]) {
					System.out.println("자신에게는 송금할 수 없습니다.");
					continue;
				}
				int receiverIdx = -1;
				for (int i = 0; i < count - 1; i += 1) {
					if (acc == idList[i]) {
						receiverIdx = i;
					}
				}

				System.out.print("송금할 금액을 입력하세요 >> ");
				int amount = sc.nextInt();

				if (amount > moneyList[idx]) {
					System.out.println("잔액 부족");
					continue;
				}

				moneyList[idx] -= amount;
				moneyList[receiverIdx] += amount;
			} else if (menu == 6 && log != -1) {
				// 비밀번호 수정
				System.out.print("수정 할 비밀번호를 입력하세요 >> ");
				int changing = sc.nextInt();

				pwList[idx] = changing;
			} else if (menu == 7 && log != -1) {
				// 회원 탈퇴
				for (int i = idx; i < count; i += 1) {
					if (i == count) {
						idList[i] = 0;
					} else {
						idList[i] = idList[i + 1];
						idList[i + 1] = 0;
					}
				}
				for (int i = idx; i < count; i += 1) {
					pwList[i] = pwList[i + 1];
					pwList[i + 1] = 0;
				}
				for (int i = idx; i < count; i += 1) {
					moneyList[i] = moneyList[i + 1];
					moneyList[i + 1] = 0;
				}
				log = -1;
				count -= 1;
			} else if (menu == 8 && log != -1) {
			} else if (menu == 0 && log != -1) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("메뉴를 다시선택하세요.");
				continue;
			}
		}
		sc.close();
	}
}
