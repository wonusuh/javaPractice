package _level5test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제06 {

	public static void main(String[] args) {
		// 식권 자판기 프로그램
		// 1) 관리자 2) 사용자
		// 관리자 ==> 1) 식권충전 2) 잔돈 충전 3)뒤로가기
		// 사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력 ==> 잔돈출력
		// 2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력
		// 화면
		// 식권 가격 : 3200원
		// 식권 : ??매 (매진시 매진)
		// 50000원 : ?? 매 // 10000원 : ?? 매 // 5000원 : ?? 매
		// 1000원 : ?? 매 // 500원 : ?? 개

		Scanner scan = new Scanner(System.in);

		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };

		int tickets = 5; // 식권 개수
		int price = 3200; // 식권 가격

		while (true) {

			int total = 0;

			for (int i = 0; i < money.length; i += 1) {
				total += money[i] * charges[i];
			}
			System.out.println("total == " + total);
			System.out.printf("50000원권 : %d개, ", charges[0]);
			System.out.printf("10000원권 : %d개, ", charges[1]);
			System.out.printf("5000원권 : %d개\n", charges[2]);
			System.out.printf("1000원권 : %d개, ", charges[3]);
			System.out.printf("500원권 : %d개, ", charges[4]);
			System.out.printf("100원권 : %d개\n", charges[5]);

			if (tickets == 0)
				System.err.println("매진");
			else
				System.out.printf("식권 : %d매\n", tickets);
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			if (sel == 1) {
				// [1] 관리자

				while (true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					System.out.print("메뉴 선택 >> ");
					int choice = scan.nextInt();

					if (choice == 1) {
						System.out.print("충전할 식권의 개수를 입력하세요. >> ");
						int howMany = scan.nextInt();

						tickets += howMany;
					} else if (choice == 2) {
						// 지폐와 동전 충전

						while (true) {
							System.out.println("[잔돈 충전하기]");
							System.out.println("0) 50000원권");
							System.out.println("1) 10000원권");
							System.out.println("2) 5000원권");
							System.out.println("3) 1000원권");
							System.out.println("4) 500원권");
							System.out.println("5) 100원권");
							System.out.println("6) 뒤로가기");

							System.out.print("선택하세요. >> ");
							int input = scan.nextInt();

							// 메뉴선택 예외
							if (input < 0 || input > 6) {
								System.err.println("메뉴를 다시 확인하세요");
								continue;
							}

							// 6) 뒤로가기
							if (input == 6) {
								break;
							}

							System.out.println("몇 개나 충전할까요?");
							int howMany = scan.nextInt();

							charges[input] += howMany;
						}
					} else if (choice == 3) {
						// 3) 뒤로가기

						break;
					}
				}

			} else if (sel == 2) {
				// [2]사용자

				while (true) {
					System.out.println("=====구입=====");
					System.out.printf("남은 식권의 개수 %d, 식권 한 개의 가격 : %d원\n", tickets, price);
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");

					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();

					if (choice == 1) {
						// 1) 구입

						if (tickets == 0) {
							System.err.println("현재 식권이 매진입니다.");
							break;
						}

						System.out.print("식권을 몇 개 구입하시겠습니까? >> ");
						int howMany = scan.nextInt();
						int value = price * howMany;

						if (howMany > tickets) {
							System.err.println("식권이 부족합니다.");
							continue;
						}

						System.out.println("가격 : " + value);
						System.out.print("입금할 금액을 입력하세요. >> ");
						int input = scan.nextInt();
						int change = input - value;

						if (input % 100 != 0) {
							System.err.println("10원짜리는 입금할 수 없습니다.");
							continue;
						}

						// 50000
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[0]) {
								charges[0] -= 1;
								change -= money[0];
							}

							if (change < money[0] || charges[0] == 0)
								break;
						}

						// 10000
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[1]) {
								charges[1] -= 1;
								change -= money[1];
							}

							if (change < money[1] || charges[1] == 0)
								break;
						}

						// 5000
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[2]) {
								charges[2] -= 1;
								change -= money[2];
							}

							if (change < money[2] || charges[2] == 0)
								break;
						}

						// 1000
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[3]) {
								charges[3] -= 1;
								change -= money[3];
							}

							if (change < money[3] || charges[3] == 0)
								break;
						}

						// 500
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[4]) {
								charges[4] -= 1;
								change -= money[4];
							}

							if (change < money[4] || charges[4] == 0)
								break;
						}

						// 100
						while (true) {
							System.out.println("change == " + change);
							System.out.println(Arrays.toString(charges));
							if (change >= money[5]) {
								charges[5] -= 1;
								change -= money[5];
							}

							if (change < money[5] || charges[5] == 0)
								break;
						}

						System.out.println("change == " + change);
						if (change > 0) {
							System.err.println("잔돈 부족. 매점에 문의하세요");
							break;
						}
						tickets -= howMany;

						// input 만큼 잔돈 채워넣기

						// 50000
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[0]) {
								charges[0] += 1;
								input -= money[0];
							}

							if (input < money[0])
								break;
						}

						// 10000
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[1]) {
								charges[1] += 1;
								input -= money[1];
							}

							if (input < money[1])
								break;
						}

						// 5000
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[2]) {
								charges[2] += 1;
								input -= money[2];
							}

							if (input < money[2])
								break;
						}

						// 1000
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[3]) {
								charges[3] += 1;
								input -= money[3];
							}

							if (input < money[3])
								break;
						}

						// 500
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[4]) {
								charges[4] += 1;
								input -= money[4];
							}

							if (input < money[4])
								break;
						}

						// 100
						while (true) {
							System.out.println("input == " + input);
							System.out.println(Arrays.toString(charges));
							if (input >= money[5]) {
								charges[5] += 1;
								input -= money[5];
							}

							if (input < money[5])
								break;
						}
					} else if (choice == 2) {
						// 뒤로가기
						break;
					}
				}
			} else {
				break;
			}
		}
		scan.close();
	}
}
