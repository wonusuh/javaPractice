package 배열심화_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _08게임1to18 {
	public static void main(String[] args) {
//		[1 to 50을 ==> 1 to 18]
//		1. 구글에서 1 to 50 이라고 검색한다
//		2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
//		3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다
//		4. 숫자 1~9는 front 배열에 저장하고
//			숫자 10~18은 back 배열에 저장한다
		final int SIZE = 9;
		int gameNum = 1;

		int[] front = new int[SIZE]; // 1~9 랜덤으로 넣기
		int[] back = new int[SIZE]; // 10~18 랜덤으로 넣기

		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		// front 셔플
		for (int i = 0; i < front.length; i += 1) {
			front[i] = i + 1;
		}
		for (int i = 0; i < 50; i += 1) {
			int idx = rn.nextInt(8 - 0 + 1) + 0;

			int temp = front[0];
			front[0] = front[idx];
			front[idx] = temp;
		}
		for (int i = 0; i < back.length; i += 1) {
			back[i] = front[i] + 9;
		}
//	
		System.out.println("front" + Arrays.toString(front));
		System.out.println("back" + Arrays.toString(back));

		while (true) {
			for (int i = 0; i < front.length; i += 1) {
				System.out.print(front[i] + "\t");
				if (i % 3 == 2) {
					System.out.println();
				}
			}
			System.out.printf("%d의 인덱스 입력 : ", gameNum);

			int input = sc.nextInt();

			if (input < 0 || input > 8) {
				System.out.println("인덱스 범위 오류");
				continue;
			}

			if (gameNum <= 9) {
				if (front[input] == gameNum) {
					front[input] = back[input];
					gameNum += 1;
				} else {
					System.out.println("오답");
					continue;
				}
			}
			if (gameNum > 9) {
				if (front[input] == gameNum) {
					front[input] = 0;
					gameNum += 1;
				} else {
					System.out.println("오답");
					continue;
				}
			}
			if (gameNum == 19) {
				for (int i = 0; i < front.length; i += 1) {
					System.out.print(front[i] + "    ");
					if (i % 3 == 2) {
						System.out.println();
					}
				}
				System.out.println("종료합니다");
				break;
			}
		}
		sc.close();
	}
}
