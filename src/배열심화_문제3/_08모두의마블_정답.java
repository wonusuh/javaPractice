package 배열심화_문제3;

import java.util.Scanner;

public class _08모두의마블_정답 {

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

		int p1 = 1; // 솟
		int p2 = 1; // 홋
		int win1 = 0;
		int win2 = 0;
		int size = map.length;
		int turn = 2;
		// 화면 출력

		while (true) {

			System.out.printf(" p1 [%d] p2 [%d] %n", win1, win2);
			for (int i = 0; i < size; i += 1) {
				for (int k = 0; k < size; k += 1) {
					if (map[i][k] == 17) {
						System.out.print(" ■ ");
					} else if (map[i][k] == p1 && map[i][k] == p2) {
						System.out.print(" * ");
					} else if (map[i][k] == p1) {
						System.out.print(" 솟 ");
					} else if (map[i][k] == p2) {
						System.out.print(" 홋 ");
					} else if (map[i][k] == 1) {
						System.out.print(" @ ");
					} else {
						System.out.print(" □ ");
					}
				}
				System.out.println();
			}

			if (win1 == 3 || win2 == 3) {
				turn = turn == 1 ? 2 : 1;
				System.out.printf("p%d턴 승리 !! ", turn);
				break;
			}

			System.out.printf("[p%d]턴 주사위 입력 >>", turn == 1 ? 1 : 2);
			int move = sc.nextInt();
			if (move < 1 || move > 6) {
				System.out.println("입력 오류");
				continue;
			}
			if (turn == 1) {
				p1 += move;
				if (p1 > 16) {
					win1 += 1;
					p1 %= 16; // 16 +3 => 19%16 -> 3
				}
			} else {
				p2 += move;
				if (p2 > 16) {
					win2 += 1;
					p2 %= 16;
				}
			}

			turn = turn == 1 ? 2 : 1;
		}
		sc.close();
	}
}
