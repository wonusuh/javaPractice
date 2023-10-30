package _level3test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
//		* # 영화관 좌석예매
//		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
//		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
//		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
//		 * 4. 한 좌석당 예매 가격은 12000원이다.
//		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
//		 * 예)
//		 * seat = 0 0 0 0 0 0 0
//		 * 
//		 * 좌석선택 : 1
//		 * seat = 0 1 0 0 0 0 0
//		 * 
//		 * 좌석선택 : 3
//		 * seat = 0 1 0 1 0 0 0
//		 * 
//		 * 좌석선택 : 3
//		 * seat = 0 1 0 1 0 0 0
//		 * 이미 예매가 완료된 자리입니다.
//		 * ----------------------
//		 * 매출액 : 24000원
		Scanner sc = new Scanner(System.in);

		int[] seat = new int[6];
		boolean[] check = new boolean[seat.length];
		int cnt = 0;

		while (true) {
			System.out.println(Arrays.toString(check));
			System.out.println(" 1  2  3  4  5  6");
			System.out.println(Arrays.toString(seat));
			System.out.print("예매할 좌석의 번호를 입력하세요 >> ");

			int choice = sc.nextInt() - 1;

			if (choice < 0 || choice > 5) {
				System.out.println("좌석번호를 다시 입력하세요");
				continue;
			}

			if (check[choice] == true) {
				System.out.println("이미 예매된 좌석입니다.");
				continue;
			}

			seat[choice] = 1;
			check[choice] = true;
			cnt += 1;

			if (cnt == 6) {
				System.out.println("더이상 예매가능한 좌석이 없습니다");
				System.out.println(Arrays.toString(seat));
				break;
			}

		}
		sc.close();
	}
}
