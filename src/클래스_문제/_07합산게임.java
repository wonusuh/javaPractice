package 클래스_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class AddGame {
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];
	int total;
}

public class _07합산게임 {

	public static void main(String[] args) {
//더하기 게임
//1. 1부터 10 사이의 랜덤한 값을 중복없이 game에 6개 저장한다.
//2. 6개의 배열의 인덱스를 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해
//	스 인덱스의 값의 합을 출력한다.
//3. 사용자는 중복없이 3 개의 인덱스를 골라 그 합을 맞추는 게임이다.
		AddGame ad = new AddGame();
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);

		// game에 랜덤 숫자들 넣기
		for (int i = 0; i < ad.game.length;) {

			int num = rn.nextInt(10 - 1 + 1) + 1;
			boolean dupl = false;

			for (int j = 0; j < ad.game.length; j += 1) {

				if (num == ad.game[j]) {
					dupl = true;
					break;
				}
			}

			if (!dupl) {
				ad.game[i] = num;
				i += 1;
			}
		}

		// idx 에 game의 랜덤한 인덱스의 값을 넣기
		for (int i = 0; i < ad.idx.length;) {

			int num = rn.nextInt((ad.game.length - 1) - 0 + 1) + 0;
			boolean dupl = false;

			for (int j = 0; j < ad.idx.length; j += 1) {

				if (ad.game[num] == ad.idx[j]) {
					dupl = true;
					break;
				}
			}

			if (!dupl) {
				ad.idx[i] = ad.game[num];
				ad.total += ad.game[num];
				i += 1;
			}
		}

		System.out.println("[더하기 게임]");
		System.out.print("숫자카드 >>> ");
		for (int i = 0; i < ad.game.length; i += 1) {
			System.out.printf("%d ", ad.game[i]);
		}
		System.out.println();
		System.out.printf("합 == %d\n", ad.total);
		System.out.print("치트키 >>> ");
		System.out.println(Arrays.toString(ad.idx));

		while (true) {

			int cnt = 1;
			ad.myIdx = new int[3];

			while (true) {
				System.out.printf("%d.인덱스 입력 : ", cnt);
				int idx1 = sc.nextInt();
				ad.myIdx[0] = ad.game[idx1];
				cnt += 1;

				while (true) {
					System.out.printf("%d.인덱스 입력 : ", cnt);
					int idx2 = sc.nextInt();
					ad.myIdx[1] = ad.game[idx2];

					if (ad.myIdx[0] == ad.game[idx2]) {
						continue;
					}
					cnt += 1;
					break;
				}

				while (true) {
					System.out.printf("%d.인덱스 입력 : ", cnt);
					int idx3 = sc.nextInt();
					ad.myIdx[2] = ad.game[idx3];

					if (ad.myIdx[0] == ad.game[idx3] || ad.myIdx[1] == ad.game[idx3]) {
						continue;
					}
					break;
				}
				break;
			}

			System.out.println(Arrays.toString(ad.myIdx));
			System.out.println(ad.total);
			if (ad.myIdx[0] + ad.myIdx[1] + ad.myIdx[2] == ad.total) {
				System.out.println("정답!");
				break;
			} else {
				System.err.println("오답!");
			}
		}
		sc.close();
	}
}
