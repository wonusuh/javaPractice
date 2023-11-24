package 클래스_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _18클배_카트2 {

	public static void main(String[] args) {

		String[] userIdList = { "aaa", "bbb", "ccc" };

		String[] itemNameList = { "사과", "칸초", "귤", "감" };
		int[] itemPriceList = { 10000, 2000, 6500, 3300 };

		String[] cartUserIdList = { "aaa", "ccc", "aaa", "bbb", "aaa", "ccc" };
		String[] cartItemNameList = { "칸초", "귤", "칸초", "사과", "감", "사과" };

		Scanner sc = new Scanner(System.in);

		User[] us = new User[userIdList.length];
		for (int i = 0; i < us.length; i += 1) {

			User temp = new User();

			temp.id = userIdList[i];
			us[i] = temp;
		}

		Item[] it = new Item[itemNameList.length];
		for (int i = 0; i < it.length; i += 1) {

			Item temp = new Item();

			temp.name = itemNameList[i];
			temp.price = itemPriceList[i];
			it[i] = temp;
		}

		Cart[] cr = new Cart[cartUserIdList.length];
		for (int i = 0; i < cr.length; i += 1) {

			Cart temp = new Cart();

			temp.userId = cartUserIdList[i];
			temp.itemName = cartItemNameList[i];
			cr[i] = temp;
		}

		while (true) {
			System.out.println("[0] 종료");
			System.out.println("[1] 전체출력");
			System.out.println("[2] 회원 aaa가 주문한 각 아이템들의 이름과 가격들을 출력");
			System.out.println("[3] 카트내용을 전부 출력(회원 별 아이템 전체와 아이템 가격을 출력)");
			System.out.println("[4] 주문한 아이템 갯수가 가장 많은 회원 출력");
			System.out.println("[5] 주문한 아이템 총액이 가장 큰 회원 출력");
			int sel = sc.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) {
				// 전체출력
				System.out.println("==============================");
				System.out.print("회원 아이디 [ ");
				for (User u : us) {
					System.out.print(u.id + " ");
				}
				System.out.println(" ]");
				System.out.println("==============================");
				for (Item i : it) {
					System.out.printf("%s(%d) ", i.name, i.price);
				}
				System.out.println();
				System.out.println("==============================");
				System.out.println("[장바구니 전체]");
				for (Cart c : cr) {
					System.out.printf("%s --> %s\n", c.userId, c.itemName);
				}
				System.out.println("==============================");
			} else if (sel == 2) {
				// aaa가 주문한 아이템들의 이름과 가격들을 출력

				for (int i = 0; i < cr.length; i += 1) {

					if (cr[i].userId.equals("aaa")) {

						int price = 0;
						for (int j = 0; j < it.length; j += 1) {

							if (cr[i].itemName.equals(it[j].name)) {
								price = it[j].price;
							}
						}
						System.out.printf("%s ---> %d\n", cr[i].itemName, price);
					}
				}
			} else if (sel == 3) {
				// 카트 내용을 전부출력
				System.out.println("[장바구니 전체]");
				for (Cart c : cr) {

					int price = 0;
					for (Item i : it) {

						if (c.itemName.equals(i.name)) {
							price = i.price;
						}
					}

					System.out.printf("%s --> %s (%d원)\n", c.userId, c.itemName, price);
				}
			} else if (sel == 4) {
				// 주문한 아이템 갯수가 가장 많은 회원 출력
				int[] result = new int[userIdList.length];

				for (Cart c : cr) {

					int idx = -1;

					for (int j = 0; j < us.length; j += 1) {

						if (c.userId.equals(us[j].id)) {
							idx = j;
						}
					}
					result[idx] += 1;
				}

				int max = 0;
				int idx = -1;

				for (int i = 0; i < result.length; i += 1) {

					if (result[i] > max) {
						idx = i;
						max = result[i];
					}
				}
				System.out.printf("[최다 개수 주문 회원 : %s]\n", us[idx].id);
			} else if (sel == 5) {
				// 총액이 가장 큰 회원 출력
				int[] result = new int[userIdList.length];

				for (Cart c : cr) {

					int idx = -1;
					int value = 0;

					// id 찾기
					for (int j = 0; j < us.length; j += 1) {

						if (c.userId.equals(us[j].id)) {
							idx = j;
						}
					}

					// 가격 찾기
					for (int j = 0; j < it.length; j += 1) {

						if (c.itemName.equals(it[j].name)) {
							value = it[j].price;
						}
					}
					result[idx] += value;
				}
				System.out.println(Arrays.toString(result));
				int idx = -1;
				int max = 0;

				for (int i = 0; i < result.length; i += 1) {

					if (result[i] > max) {
						max = result[i];
						idx = i;
					}
				}
				System.out.printf("[ 최대 금액 주문 회원 : %s ]\n", us[idx].id);
			}
		}
		sc.close();
	}
}
