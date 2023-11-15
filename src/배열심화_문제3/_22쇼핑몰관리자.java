package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _22쇼핑몰관리자 {

	public static void main(String[] args) {
//		1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
//		2. 카테고리는 각 행의 첫 번째 열에 저장한다.
//		3. 아이템은 각 행의 두번째 열에 저장한다.
//			단, 아이템은 여러개를 추가할 수 있도록 / 를 구분자로 연결해준다.
//			
//			예)
//			[
//			 {"과일", "사과/포도/"},
//			 {"과자", "홈런볼/조리퐁/"},
//			 ]
		String data = "과일,사과/포도\n";
		data += "과자,홈런볼/조리퐁\n";
		data += "음료,콜라/사이다/나랑드\n";
		data += "육류,소고기/돼지고기/오리고기/닭고기\n";

		String[][] items = new String[10][2];
		Scanner sc = new Scanner(System.in);
		String[] datas = data.split("\n");

		for (int i = 0; i < datas.length; i++) {

			String[] temp = new String[2];
			temp = datas[i].split(",");

			items[i][0] = temp[0];
			items[i][1] = temp[1];
		}

		int itemCount = 4;

		while (true) {
			System.out.println("items" + itemCount + Arrays.deepToString(items));
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리"); // 카테고리 추가 삭제 구현
			System.out.println("[2]아이템 관리"); // 아이템 추가 삭제 구현
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]데이터 저장"); // 다시 하나의 String data로 만들기
			System.out.println("[5]종료");
			System.out.print(": ");
			int sel = sc.nextInt();
			if (sel == 1) {
				// 카테고리 관리

				while (true) {
					System.out.println("[카테고리 관리]");

					// 카테고리 모두 출력
					for (int i = 0; i < items.length; i += 1) {

						// null 만나면 break;
						if (items[i][0] == null) {
							break;
						}

						System.out.printf("[%d] %s\n", i + 1, items[i][0]);
					}
					System.out.println("(1)추가 (2)삭제 (3)뒤로");
					System.out.print(">> ");

					int input = sc.nextInt();

					if (input == 1) {
						System.out.print("추가할 카테고리의 이름을 입력하세요 >> ");

						String cat = sc.next();
						sc.nextLine();

						// 중복검사
						boolean check = false;

						for (int i = 0; i < itemCount; i += 1) {

							if (cat.equals(items[i][0])) {
								check = true;
							}
						}

						if (check) {
							System.err.println("이미 같은 카테고리가 있습니다.");
							continue;
						}

						// items에 추가하고 cnt+
						items[itemCount][0] = cat;
						items[itemCount][1] = "";
						itemCount += 1;
					} else if (input == 2) {
						// 카테고리 삭제
						System.out.print("삭제할 카테고리의 번호를 입력하세요. >> ");

						int del = sc.nextInt() - 1;

						// 인덱스 예외
						if (del < 0 || del + 1 > itemCount) {
							System.err.println("카테고리 번호를 확인하세요");
							continue;
						}

						for (int i = del; i < itemCount; i += 1) {
							items[i] = items[i + 1];
						}
						itemCount -= 1;
					} else if (input == 3) {
						break;
					}
				}
			} else if (sel == 2) {
				// 아이템관리

				while (true) {
					System.out.println("[아이템 관리]");

					// 카테고리 모두 출력
					for (int i = 0; i < items.length; i += 1) {

						// null 만나면 break;
						if (items[i][0] == null) {
							break;
						}
						System.out.printf("[%d] %s\n", i + 1, items[i][0]);
					}
					System.out.print("[관리] 카테고리 번호 입력 >> ");

					int input = sc.nextInt() - 1;

					// 인덱스 예외
					if (input < 0 || input + 1 > itemCount) {
						System.err.println("카테고리 번호를 확인하세요");
						continue;
					}
					System.out.printf("[%s]\n", items[input][0]);
					String[] temp = items[input][1].split("/");

					for (int i = 0; i < temp.length; i += 1) {
						System.out.println(temp[i]);
					}

					// 아이템이 없을 시
					boolean empty = false;

					if (items[input][1].equals("")) {
						empty = true;
						System.err.println("[메세지] 아이템 없음.");
					}
					System.out.print("(1)추가 (2)삭제 (3)뒤로 >> ");

					int choice = sc.nextInt();

					if (choice == 1) {
						// 아이템 추가
						System.out.print("[추가] 아이템 입력 >> ");

						String add = sc.next();
						sc.nextLine();

						// 아이템 중복 검사
						boolean itemDupl = false;

						for (int i = 0; i < temp.length; i += 1) {

							if (add.equals(temp[i])) {
								itemDupl = true;
							}
						}

						if (itemDupl) {
							System.err.println("같은 이름의 아이템이 존재합니다.");
							continue;
						}

						if (!empty) {
							items[input][1] += "/" + add;
						} else {
							items[input][1] += add;
						}
					} else if (choice == 2) {
						// 아이템 삭제

						System.out.print("삭제할 아이템을 입력하세요 >> ");

						String item = sc.next();
						sc.nextLine();

						// 삭제할 아이템이 있는지 검사
						boolean exist = false;
						int idx = -1;

						for (int i = 0; i < temp.length; i += 1) {

							if (item.equals(temp[i])) {
								exist = true;
								idx = i;
							}
						}

						if (exist) {

							temp[idx] = null;

							// temp배열을 다시 String으로 만들기
							String tempTemp = "";

							for (int i = 0; i < temp.length; i += 1) {

								if (temp[i] == null) {
									continue;
								}

								tempTemp += temp[i];
							}
							items[input][1] = tempTemp;
						} else {
							System.err.println("찾는 아이템이 없습니다.");
						}
					} else if (choice == 3) {
						// 뒤로
						break;
					}
				}
			} else if (sel == 3) {
				// 전체품목출력
				System.out.println("[전체 품목 출력]");

				for (int i = 0; i < itemCount; i += 1) {

					if (items[i][0] == null) {
						break;
					}
					System.out.printf("[ %d ]", i + 1);
					System.out.printf("%s : %s\n", items[i][0], items[i][1]);
				}
			} else if (sel == 4) {
				// 데이터 저장
				String temp = "";

				for (int i = 0; i < items.length; i += 1) {

					if (items[i][0] == null) {
						break;
					}
					temp += items[i][0] + "," + items[i][1] + "\n";
				}
				data = temp;
				System.out.println(data);
			} else if (sel == 5) {
				// 종료
				break;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(data);
		sc.close();
	}
}
