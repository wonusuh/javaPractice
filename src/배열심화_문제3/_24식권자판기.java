package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _24식권자판기 {

	public static void main(String[] args) {
//		식권 자판기 프로그램
//		1)관리자 2)사용자
//		관리자 => 1) 식권충전 2)잔돈충전 3)뒤로가기
//		사용자 => 1)구입 => 입금금액입력 => 구매매수입력 => 잔돈출력
//				2) 뒤로가기
//		조건) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장 출력
//		회면
//		식권가격 : 3200원
//		식권 : ??매 (매진시 매진)
//				50000원 : ??매
//				10000원 : ??매
//				5000원 : ??매
//				1000원 : ??매
//				500원 : ??개
//				100원 : ??개

		Scanner sc = new Scanner(System.in);
		int[] money = { 50000, 10000, 5000, 1000, 500, 100 };
		int[] charges = { 1, 1, 1, 1, 5, 10 };
		int tickets = 50; // 남은 식권의 개수
		int price = 3200; // 식권 한 개의 가격

		while (true) {

			int total = charges[0] * money[0] + charges[1] * money[1] + charges[2] * money[2] + charges[3] * money[3]
					+ charges[4] * money[4] + charges[5] * money[5];

			System.out.println("매대 현금 총액 = " + total);
			System.out.printf("50000원지폐  %-2d매\n", charges[0]);
			System.out.printf("10000원지폐  %-2d매\n", charges[1]);
			System.out.printf("5000원지폐   %-2d매\n", charges[2]);
			System.out.printf("1000원지폐   %-2d매\n", charges[3]);
			System.out.printf("500원동전    %-2d개\n", charges[4]);
			System.out.printf("100원동전    %-2d개\n", charges[5]);
			System.out.printf("남은식권의개수 %-2d장\n", tickets);
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			System.out.print("메뉴 선택 : ");

			int sel = sc.nextInt();

			if (sel == 1) {
				// 관리자

				while (true) {
					System.out.println("====================");
					System.out.println("====================");
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					System.out.print("메뉴 선택 : ");

					int choice = sc.nextInt();

					if (choice == 1) {
						// 식권 충전
						System.out.print("몇 장 충전하시겠습니까? >> ");

						int ticket = sc.nextInt();

						tickets += ticket;
					} else if (choice == 2) {
						// 잔돈 충전

						while (true) {
							System.out.println("매대 현금 총액 = " + total);
							System.out.printf("1) 50000원지폐  %-2d매\n", charges[0]);
							System.out.printf("2) 10000원지폐  %-2d매\n", charges[1]);
							System.out.printf("3) 5000원지폐   %-2d매\n", charges[2]);
							System.out.printf("4) 1000원지폐   %-2d매\n", charges[3]);
							System.out.printf("5) 500원동전    %-2d개\n", charges[4]);
							System.out.printf("6) 100원동전    %-2d개\n", charges[5]);
							System.out.println("0) 뒤로가기");
							System.out.print("선택하세요. >> ");

							int charge = sc.nextInt() - 1;

							if (charge == -1) {
								break;
							}

							if (charge < 0 || charge > 5) {
								System.err.println("메뉴를 확인하세요.");
								continue;
							}

							System.out.print("잔돈을 얼마나 충전하시겠습니까? >> ");

							int howMany = sc.nextInt();

							charges[charge] += howMany;
						}
					} else if (choice == 3) {
						// 뒤로가기
						break;
					}
				}
			} else if (sel == 2) {
				// 사용자

				while (true) {
					System.out.println("====================");
					System.out.println("====================");
					System.out.println("1)식권구입");
					System.out.println("2)뒤로가기");
					System.out.print("메뉴 선택 : ");

					int choice = sc.nextInt();

					if (choice == 1) {
						// 식권구입
						System.out.println("식권 한 장의 가격 == " + price);
						System.out.println("남은 식권 == " + tickets);
						System.out.print("식권을 몇 장 구매하시겠습니까? >> ");

						int howMany = sc.nextInt();
						int value = price * howMany;

						// 남은 식권보다 적으면
						if (howMany > tickets) {
							System.err.println("식권이 부족합니다.");
							continue;
						}
						System.out.println("총 금액은 : " + value);
						System.out.print("현금을 입력하세요 >> ");

						int cash = sc.nextInt();
						int temp = cash;
						int[] cashCopy = charges;

						// 10원짜리 입금
						if (temp % 100 != 0) {
							System.err.println("10원짜리를 입금하실 수 없습니다.");
							continue;
						}

						while (temp > 0) {
							System.out.println(Arrays.toString(cashCopy));
							System.out.println(temp);

							// 50000
							while (temp >= 50000) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 50000 >= 1) {
									cashCopy[0] += 1;
									temp -= 50000;
								}

								if (temp < 50000) {
									break;
								}
							}

							// 10000
							while (temp >= 10000) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 10000 >= 1) {
									cashCopy[1] += 1;
									temp -= 10000;
								}

								if (temp < 10000) {
									break;
								}
							}

							// 5000
							while (temp >= 5000) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 5000 >= 1) {
									cashCopy[2] += 1;
									temp -= 5000;
								}

								if (temp < 5000) {
									break;
								}
							}

							// 1000
							while (temp >= 1000) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 1000 >= 1) {
									cashCopy[3] += 1;
									temp -= 1000;
								}

								if (temp < 1000) {
									break;
								}
							}

							// 500
							while (temp >= 500) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 500 >= 1) {
									cashCopy[4] += 1;
									temp -= 500;
								}

								if (temp < 500) {
									break;
								}
							}

							// 100
							while (temp >= 100) {
								System.out.println(Arrays.toString(cashCopy));
								System.out.println(temp);

								if (temp / 100 >= 1) {
									cashCopy[5] += 1;
									temp -= 100;
								}

								if (temp == 0) {
									break;
								}
							}
							System.out.println(temp + Arrays.toString(cashCopy));
						}
						charges = cashCopy;
						System.out.println("total " + total);
						System.out.println("temp" + temp);

						int change = cash - value;

						int[] copy = charges;

						while (change > 0) {
							System.out.println(Arrays.toString(copy));
							System.out.println(change);

							// 50000
							while (change >= 50000) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 50000 >= 1) {
									copy[0] -= 1;
									change -= 50000;
								}

								if (copy[0] == 0) {
									break;
								}
							}

							// 10000
							while (change >= 10000) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 10000 >= 1) {
									copy[1] -= 1;
									change -= 10000;
								}

								if (copy[1] == 0) {
									break;
								}
							}

							// 5000
							while (change >= 5000) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 5000 >= 1) {
									copy[2] -= 1;
									change -= 5000;
								}

								if (copy[2] == 0) {
									break;
								}
							}

							// 1000
							while (change >= 1000) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 1000 >= 1) {
									copy[3] -= 1;
									change -= 1000;
								}

								if (copy[3] == 0) {
									break;
								}
							}

							// 500
							while (change >= 500) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 500 >= 1) {
									copy[4] -= 1;
									change -= 500;
								}

								if (copy[4] == 0) {
									break;
								}
							}

							// 100
							while (change >= 100) {
								System.out.println(Arrays.toString(copy));
								System.out.println(change);

								if (change / 100 >= 1) {
									copy[5] -= 1;
									change -= 100;
								}

								if (copy[5] == 0) {
									break;
								}
							}

							System.out.println(change);

							if (change > 0) {
								System.err.println("매대에 잔돈이 부족합니다.");
								break;
							}

							charges = copy;
							System.out.println(Arrays.toString(charges));
							System.out.println("total " + total);
							System.out.println("Happy Meal!");

							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}

						tickets -= howMany;
					} else if (choice == 2) {
						// 뒤로가기
						break;
					}
				}
			} else {
				// 그 외
				break;
			}
		}
		sc.close();
	}
}
