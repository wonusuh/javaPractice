package 클래스_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//[1 to 50]
//1. 구글에서 1 to 50 이라고 검색한다
//2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
//3. 숫자 1~25는 front 배열에 저장하고
//	숫자 26~50은 back 배열에 저장한다
class Game1to50 {
	final int SIZE = 25;
	int[] front = new int[SIZE];
	int[] back = new int[SIZE];
}

public class _05game1to50 {

	public static void main(String[] args) {

		Game1to50 g = new Game1to50();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);

		// 랜덤으로 배열에 집어넣기
		for (int i = 0; i < g.front.length;) {

			int num = rn.nextInt(25 - 1 + 1) + 1;
			boolean dupl = false;

			for (int j = 0; j < g.front.length; j += 1) {
				if (num == g.front[j]) {
					dupl = true;
					break;
				}
			}

			if (!dupl) {
				g.front[i] = num;
				g.back[i] = num + g.SIZE;
				i += 1;
			}
		}

		int cnt = 1;

		while (true) {
			System.out.println("front[] " + Arrays.toString(g.front));
			System.out.println(" back[] " + Arrays.toString(g.back));

			// 출력
			for (int i = 0; i < g.front.length; i += 1) {
				System.out.printf("%2d(%2d) ", i, g.front[i]);

				if (i % 5 == 4) {
					System.out.println();
				}
			}

			if (cnt == 51) {
				break;
			}

			System.out.printf("%d의 인덱스를 입력하세요. >> ", cnt);
			int idx = sc.nextInt();

			if (g.front[idx] == cnt) {
				System.out.println("정답!");

				if (cnt > 25) {
					g.front[idx] = 0;
				} else {
					g.front[idx] = g.back[idx];
				}
				cnt += 1;
				continue;
			}
			System.err.println("오답!");
		}
		sc.close();
	}
}
