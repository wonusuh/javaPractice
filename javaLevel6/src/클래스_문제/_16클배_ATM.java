package 클래스_문제;

import java.util.Scanner;

class Member {
	String id, name;
	int number;
}

class Account {
	String accNum, password, memberId;
	int money;
}

public class _16클배_ATM {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] memberData = {

				{ "1001", "qwer", "김철수" },

				{ "1002", "mmkk11", "이영희" },

				{ "1003", "javaking123", "최민수" } };
		String[][] accountData = {

				{ "111111111", "1234", "100000", "qwer" },

				{ "222222222", "1234", "200000", "mmkk11" },

				{ "333333333", "1234", "300000", "mmkk11" },

				{ "444444444", "1234", "400000", "javaking123" },

				{ "555555555", "1234", "500000", "qwer" },

				{ "666666666", "1234", "600000", "qwer" } };

		// 클래스배열에 데이터 넣기
		Member[] m = new Member[memberData.length];

		for (int i = 0; i < m.length; i += 1) {

			Member temp = new Member();

			temp.number = Integer.parseInt(memberData[i][0]);
			temp.id = memberData[i][1];
			temp.name = memberData[i][2];

			m[i] = temp;
		}

		Account[] a = new Account[accountData.length];

		for (int i = 0; i < a.length; i += 1) {

			Account temp = new Account();

			temp.accNum = accountData[i][0];
			temp.password = accountData[i][1];
			temp.money = Integer.parseInt(accountData[i][2]);
			temp.memberId = accountData[i][3];

			a[i] = temp;
		}

		while (true) {
			String menu = "";
			menu += "[0] 종료\n";
			menu += "[1] 위data배열들의 값들을 클래스배열에 저장후 출력\n";
			menu += "[2] 회원아이디를 입력받고 계좌별 잔액출력\n";
			menu += "[3] 이체계좌와 이체받을 계좌를 입력해서 5000원 송금후 전체출력 : 입력값 예외처리\n";
			System.out.print(menu);
			System.out.print(">> ");
			int sel = sc.nextInt();

			if (sel == 0) {
				break;
			} else if (sel == 1) {
				// 출력
				System.out.println("회원번호     아이디     이름");
				for (Member temp : m) {
					System.out.printf("%d %s %s\n", temp.number, temp.id, temp.name);
				}
				System.out.println();

				System.out.println("계좌번호    비밀번호   아이디  돈");
				for (Account temp : a) {
					System.out.printf("%s %s %s %d\n", temp.accNum, temp.password, temp.memberId, temp.money);
				}
			} else if (sel == 2) {
				// 아이디 입력받아서 잔액 조회
				String id;

				while (true) {
					System.out.print("잔액 조회할 아이디를 입력하세요 >> ");
					id = sc.next();
					sc.nextLine();

					// id가 있는지 검색
					boolean isExist = false;

					for (Account temp : a) {

						if (temp.memberId.equals(id)) {
							isExist = true;
						}
					}

					if (!isExist) {
						System.err.println("아이디 조회 실패.");
						continue;
					}
					break;
				}

				System.out.println("계좌번호          잔돈");
				for (Account temp : a) {

					if (id.equals(temp.memberId)) {
						System.out.printf("%s     %s원\n", temp.accNum, temp.money);
					}
				}
			} else if (sel == 3) {
				// 5천원 이체하기

				while (true) {
					System.out.print("계좌1 입력 >> ");
					String my = sc.next();
					sc.nextLine();

					System.out.print("계좌2 입력 >> ");
					String your = sc.next();
					sc.nextLine();

					// 같은 계좌 입력시
					if (my.equals(your)) {
						System.err.println("자신에게 입금할 수 없습니다.");
						continue;
					}

					// 계좌가 있는지 검색
					boolean isThereMy = false;
					boolean isThereYour = false;

					for (Account temp : a) {

						if (temp.accNum.equals(my)) {
							isThereMy = true;
						}

						if (temp.accNum.equals(your)) {
							isThereYour = true;
						}
					}

					// 계좌를 찾지 못한경우
					if (!isThereMy || !isThereYour) {
						System.err.println("계좌를 확인하세요.");
						continue;
					}

					// 배열에서 첫 번째로 만나는 my에서 -5천원
					for (Account temp : a) {

						if (temp.accNum.equals(my)) {
							temp.money -= 5000;
							break;
						}
					}

					// 배열에서 첫 번째로 만나는 your에서 +5천원
					for (Account temp : a) {

						if (temp.accNum.equals(your)) {
							temp.money += 5000;
							break;
						}
					}
					break;
				}
			}
		}
		sc.close();
	}
}
