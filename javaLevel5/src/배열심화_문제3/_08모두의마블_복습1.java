package 배열심화_문제3;

import java.util.Random;
import java.util.Scanner;

public class _08모두의마블_복습1 {

	public static void main(String[] args) {
//		아래 그림을 참고해 배열을 생성한다.
//		2인용 게임으로 서로 번갈아가며 주사위를 던진다. (랜덤으로)
//		주사위의 숫자만큼 이동하여, 3바퀴를 먼저 돌면
//		승리하는 게임이다.
//		단, 이동할 때 외곽으로만 이동할 수 있다.
//		   □    □    □    솟    □
//	       □    ■    ■    ■    홋
//	       □    ■    ■    ■    □
//	       □    ■    ■    ■    □
//	       □    □    □    □    □

		int map[][] = {

				{ 1, 2, 3, 4, 5, },

				{ 16, 17, 17, 17, 6, },

				{ 15, 17, 17, 17, 7, },

				{ 14, 17, 17, 17, 8, },

				{ 13, 12, 11, 10, 9, } };
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int p1 = 1; // 솟
		int p2 = 1; // 홋
		int win1 = 0;
		int win2 = 0;
		int size = map.length;
		int turn = 1;

		while (true) {

			// 경기장 출력
			for (int i = 0; i < size; i += 1) {

				for (int j = 0; j < map[i].length; j += 1) {

					if (map[i][j] == p1 && map[i][j] == p2) {
						System.out.print(" * ");
					} else if (map[i][j] == p1) {
						System.out.print(" 솟 ");
					} else if (map[i][j] == p2) {
						System.out.print(" 홋 ");
					} else if (map[i][j] == 17) {
						System.out.print(" ■ ");
					} else {
						System.out.print(" □ ");
					}
				}
				System.out.println();
			}

			// 세 바퀴 돌면 승리
			if (win1 == 3 || win2 == 3) {
				System.out.printf("[p%d] 승리!", turn);
				break;
			}

			// 턴 전환
			if (turn == 1) {
				turn = 2;
			} else {
				turn = 1;
			}
			System.out.printf("[p1]%d바퀴 [p2]%d바퀴", win1, win2);
			System.out.printf(" press Enter >> [p%d]턴 주사위", turn);

			int move = rn.nextInt(6) + 1;
			System.out.println(move);
			String enter = sc.nextLine();

			// 공백이 아닌값을 입력하면 종료
			if (enter != "") {
				break;
			}

			if (turn == 1) {
				p1 += move;

				if (p1 > 16) {
					p1 = p1 % 16;
					win1 += 1;
				}
			} else {
				p2 += move;

				if (p2 > 16) {
					p2 %= 16;
					win2 += 1;
				}
			}
		}
		sc.close();
	}
}
