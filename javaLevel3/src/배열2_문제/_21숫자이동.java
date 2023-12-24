package 배열2_문제;

import java.util.Scanner;

public class _21숫자이동 {
	public static void main(String[] args) {
//		문제
//			1. game배열에 숫자 2는 플레이어이다
//			2. 플레이어는 좌(1), 우(2)로 이동이 가능하다.
//			3. 단, 벽(숫자1)을 만나면 이동할 수 없다.
//			4. 벽을 만나면 숫자 9을 입력해 벽을 깰 수 있다
//			5. 좌, 우 끝에 벽을 만나면 더 이상 움직일 수 없다.
		Scanner sc = new Scanner(System.in);
		// ==========
		// 0 1 2 3 4 5 6 7 8
		int[] game = { 0, 0, 1, 0, 2, 0, 1, 0, 1 };
		// 3 4
		// {0, 0, 0, 2, 0, 0, 0, 0, 0};
		int pIdx = 4; // 현재 플레이어 위치
		int player = 2;
		int road = 0;
		int wall = 1;
		boolean run = true;
		while (run) {
			// 게임 화면 출력
			for (int i = 0; i < game.length; i += 1) {
				if (game[i] == road) {
					System.out.print("__");
				} else if (game[i] == player) {
					System.out.print("옷");
				} else {
					System.out.print("벽");
				}
			}
			System.out.println();

			System.out.println("1.왼쪽 2.오른쪽");
			int move = sc.nextInt();
			if (move < 1 || move > 2) {
				System.out.println("메뉴 에러");
				continue;
			}
			int idx = pIdx; // 기존의 위치값 복사 : 되돌아가려고

			game[pIdx] = road; // 기존 플레이어를 길로 변경
			if (move == 1) { // 왼쪽으로 pIdx 이동
				if (pIdx > 0) {
					pIdx -= 1; // 0 -1 => -1
				} else {
					pIdx = game.length - 1; // 마지막 방번호
				}

			} else if (move == 2) { // 오른쪽으로 pIdx 이동
				if (pIdx < game.length - 1) { // ? < 8
					pIdx += 1; // 8+ 1 => 범위에러
				} else {
					pIdx = 0;
				}
			}

			if (game[pIdx] == wall) {
				System.out.println("벽을 격파하시겠습니까?");
				System.out.println("1.격파 2.되돌아가기");
				move = sc.nextInt();
				if (move == 1) {
					game[pIdx] = road;
				} else {
					System.out.println("되돌아갑니다 ");
				}
				// 기존 위치로 다시 pIdx 수정
				pIdx = idx; // 격파 할때는 플레이어 이동 안함
			}

			game[pIdx] = player; // 길을 플레이어로 변경

		}
		sc.close();
	}
}
