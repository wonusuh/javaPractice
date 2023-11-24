package 클래스_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _19클배_장바구니 {

	public static void main(String[] args) {
		String[] userIdList = { "admin", "aaa", "bbb", "ccc" };

		String[] itemNameList = { "사과", "칸초", "귤", "감" };
		int[] itemPriceList = { 10000, 2000, 6500, 3300 };

		int max = 10;
		User[] userList = new User[max];
		int userCnt = 4;
		Item[] itemList = new Item[max];
		int itemCnt = 4;
		Cart[] cartList = new Cart[max];
		int cartCnt = 0;
		Scanner sc = new Scanner(System.in);

		int idx = 0;
		for (String u : userIdList) {

			User temp = new User();

			temp.id = u;
			userList[idx++] = temp;
		}

		for (int i = 0; i < itemNameList.length; i += 1) {

			Item temp = new Item();

			temp.name = itemNameList[i];
			temp.price = itemPriceList[i];

			itemList[i] = temp;
		}

		int log = -1;
		while (true) {
			System.out.println("[0] 종료");
			System.out.println("---------------------------------------");

			if (log == -1) {
				System.out.print("[1] 로그인 ");
				System.out.println("[2] 회원가입 ");
			} else {
				System.out.println("[4] 로그아웃 ");
			}
			System.out.print(">> ");
			int sel = sc.nextInt();

			if (sel == 0) {
				break;
			} else if (sel == 1 && log == -1) {
				// 로그인
				System.out.print("[로그인] 아이디 입력 : ");
				String id = sc.next();
				sc.nextLine();

				// 아이디 검색
				boolean isExist = false;

				for (int i = 0; i < userList.length; i += 1) {

					if (userList[i] == null) {
						break;
					}

					if (id.equals(userList[i].id)) {
						isExist = true;
						log = i;
						break;
					}
				}

				if (!isExist) {
					System.err.println("아이디를 찾을 수 없습니다.");
					continue;
				}

				if (id.equals("admin")) {
					// 관리자메뉴

					while (true) {
						// 아이템들 조회
						idx = 0;
						for (Item i : itemList) {

							if (i == null) {
								break;
							}
							System.out.printf("(%d) %s\n", idx++, i.name);
						}

						System.out.println("[ 관리자 메뉴 ]");
						System.out.print("[1] 아이템 추가 ");
						System.out.print("[2] 아이템 삭제 ");
						System.out.print("[3] 최신순(주문정보) ");
						System.out.print("[4] 로그아웃");
						int input = sc.nextInt();

						if (input == 4) {
							log = -1;
							break;
						} else if (input == 1) {
							// 추가

							while (true) {
								System.out.print("추가할 아이템의 이름을 입력하세요. >> ");
								String item = sc.next();
								sc.nextLine();

								// 아이템 중복 검사
								boolean alreadyExist = false;

								for (Item i : itemList) {

									if (i == null) {
										break;
									}

									if (item.equals(i.name)) {
										alreadyExist = true;
									}
								}

								if (alreadyExist) {
									System.err.println("이미 존재하는 아이템입니다.");
									continue;
								}
								Item temp = new Item();
								temp.name = item;
								itemList[itemCnt++] = temp;
								break;
							}
						} else if (input == 2) {
							// 삭제

							while (true) {
								System.out.print("삭제할 아이템의 번호를 입력하세요. >> ");
								int item = sc.nextInt();

								// 인덱스 범위 예외
								if (item < 0 || item > itemCnt - 1) {
									System.err.println("아이템 번호를 확인하세요.");
									continue;
								}

								for (int i = item; i < itemCnt - 1; i += 1) {
									itemList[i] = itemList[i + 1];
									itemList[i + 1] = null;
								}

								itemCnt -= 1;
								break;
							}
						} else if (input == 3) {
							// 최신순(주문정보)

							for (int i = cartCnt - 1; i >= 0; i -= 1) {
								System.out.printf("%s %s\n", cartList[i].userId, cartList[i].itemName);
							}
						}
					}
				} else {
					// 사용자메뉴

					while (true) {
						System.out.printf("[%s 로그인]\n", userList[log].id);
						System.out.print("[1] 쇼핑 ");
						System.out.print("[2] 주문확인 ");
						System.out.print("[3] 탈퇴 ");
						System.out.print("[4] 로그아웃 ");
						int input = sc.nextInt();

						if (input == 4) {
							log = -1;
							break;
						} else if (input == 1) {
							// 쇼핑

							while (true) {

								// 상품들 출력
								idx = 0;
								for (Item i : itemList) {

									if (i == null) {
										break;
									}
									System.out.printf("(%d) %s\n", idx++, i.name);
								}

								System.out.print("장바구니에 담을 아이템의 번호를 입력하세요. (-1)뒤로가기 >> ");
								int item = sc.nextInt();

								if (item == -1) {
									break;
								}

								// 인덱스 범위 오류
								if (item < 0 || item > itemCnt - 1) {
									System.err.println("아이템 번호를 확인하세요.");
									continue;
								}
								Cart temp = new Cart();
								temp.userId = userList[log].id;
								temp.itemName = itemList[item].name;
								cartList[cartCnt++] = temp;

							}
						} else if (input == 2) {
							// 주문확인
							for (Cart c : cartList) {

								if (c == null) {
									break;
								}

								if (c.userId.equals(userList[log].id)) {
									System.out.printf("%s %s\n", c.userId, c.itemName);
								}
							}
						} else if (input == 3) {
							// 탈퇴(그 회원 주문서 동시에 삭제)

							// userList에서 삭제하고 당기기
							for (int i = log; i < userCnt - 1; i += 1) {
								System.out.println(Arrays.deepToString(userList));
								userList[i] = userList[i + 1];
								userList[i + 1] = null;
							}
							System.out.println(Arrays.deepToString(userList));
							userCnt -= 1;

							// cartList에서 삭제하고 당기기
							System.out.println("log " + log);
							for (int i = 0; i < cartCnt; i += 1) {

								System.out.println(cartList[i].userId);
								System.out.println(userList[log].id);
								if (cartList[i].userId.equals(userList[log].id)) {

									for (int j = i; j < cartCnt; j += 1) {
										cartList[j] = cartList[j + 1];
										cartList[j + 1] = null;
									}
									cartCnt -= 1;
									i -= 1;
								}
								System.out.println(Arrays.deepToString(cartList));
							}
							log = -1;
							break;
						}
					}
				}
			} else if (sel == 2 && log == -1) {
				// 회원가입
			}
		}
		sc.close();
	}
}
