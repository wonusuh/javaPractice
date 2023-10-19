package 반복문1개념;

import java.util.Scanner;

public class _06continue {
	public static void main(String[] args) {

		/*
		 * # 베스킨라빈스31 1. p1과 p2가 번갈아가면서 1~3을 입력한다. 2. br은 p1과 p2의 입력값을 누적해서 저장한다. 3. br이
		 * 31을 넘으면 게임은 종료된다. 4. 승리자를 출력한다. 5. 1에서 3사이의 값을 입력받지 못하면 해당 플레이어에게 다시 값 입력받아온다
		 * 
		 * 예) 1턴 : p1(2) br(2) 2턴 : p2(1) br(3) 3턴 : p1(3) br(6) ...
		 */
		Scanner sc = new Scanner(System.in);
		int p1 = 0;
		int p2 = 0;

		// int player =0;
		int br = 0; // 누적된 값 31 반복문 멈추기
		int turn = 0; // 0일때[p1] 1일때[p2]

		while (true) {
			System.out.println("br = " + br);
			if (turn == 0) {
				System.out.println("[p1 턴 ]");
				System.out.print("1-3 값 입력>> ");
				p1 = sc.nextInt();

				if (p1 < 1 || p1 > 3) {
					System.out.println("입력오류");
				} else {
					br += p1;
					turn = 1;
				}

			} else {
				System.out.println("[p2 턴 ]");
				System.out.print("1-3 값 입력>> ");
				p2 = sc.nextInt();
				if (p2 < 1 || p2 > 3) {
					System.out.println("입력오류");
					continue; // 밑에 코드 실행하지 않고 반복문 처음으로 돌아간다
					// else 대용으로 사용한다 => 필터링 => 오류값을 먼저 적고
					// 오류가 아닐때만 밑에줄 실행하게 만든다
				}

				// p2 >=1 && p2 <=3
				br += p2;
				turn = 0;

			}

			if (br >= 31) {
				System.out.println("게임종료");
				break; // 즉시종료
			}
			System.out.println("-----------");

		} // while 문끝

		if (turn == 0) {
			System.out.println("p1이 이겼다");
		} else {
			System.out.println("p2이 이겼다");
		}
		sc.close();
	}
}