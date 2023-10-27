package 배열2_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _22카드맞추기 {
	public static void main(String[] args) {
//		카드 맞추기 - 기억력 게임
//		1. 같은 숫자의 위치르 2개 입력해 정답을 맞추는 게임이다
//		2. 배열을 1000번 섞는다(셔플)
//		3. 사용자가 인덱스 번호를 2개를 입력해서 그 값을 비교한다
//		4. 두 인덱스 값이 맞으면 즉, 정답을 맞추면 back에 해당 숫자를 저장해,
//		back에 모든 수가 채워지면 게임은 종료된다.
//		
//		예)
//			front = [1,1,2,2,3,3,4,4,5,5]
//			back  = [0,0,0,0,0,0,0,0,0,0]
//			입력1 : 0
//			입력2 : 4
//	}
//			front = [1,3,2,5,1,4,3,2,4,5]
//			back  = [1,0,0,0,1,0,0,0,0,0]
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[front.length];
		int cnt = 0;
		int idx1 = -1;
		int idx2 = -1;

		// 셔플
		for (int i = 0; i < 1000; i += 1) {
			int idx = rn.nextInt(front.length);

			int temp = front[0];
			front[0] = front[idx];
			front[idx] = temp;
		}

		while (true) {
			System.out.println("front : " + Arrays.toString(front));
			System.out.println("back : " + Arrays.toString(back));
			System.out.print("인덱스1 >> ");
			idx1 = sc.nextInt();

			if (idx1 < 0 || idx1 > front.length - 1) {
				System.out.println("인덱스1 범위오류");
				continue;
			}
			System.out.print("인덱스2 >> ");
			idx2 = sc.nextInt();

			if (idx2 < 0 || idx2 > front.length - 1) {
				System.out.println("인덱스2 범위오류");
				continue;
			}

			if (idx1 == idx2) {
				System.out.println("같은 인덱스를 입력할 수 없습니다");
				continue;
			}

			if (back[idx1] != 0 || back[idx2] != 0) {
				System.out.println("이미 뒤집어진 카드가 존재합니다");
				continue;
			}

			if (front[idx1] == front[idx2]) {
				back[idx1] = front[idx1];
				back[idx2] = front[idx2];
				cnt += 1;
			} else {
				System.out.printf("idx%d == %d, idx%d == %d\n", idx1, front[idx1], idx2, front[idx2]);
			}
			if (cnt == 5) {
				System.out.println("게임 종료");
				break;
			}
		}
		System.out.println(Arrays.toString(back));
		sc.close();
	}
}
