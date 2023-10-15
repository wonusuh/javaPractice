package 기초4문제;

import java.util.Random;
import java.util.Scanner;

public class _15가위바위보2단계 {
	public static void main(String[] args) {
		// 가위0 바위1 보2
		// com 은 랜덤(0~2) 만 낼 수 있다.
		// me 0~2 사이의 숫자를 입력받는다.
		// 비겼다. 내가 이겼다. 내가 졌다. 출력
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		System.out.print("가위(0), 바위(1), 보(2) 중에 하나를 입력하세요 : ");
		int me = sc.nextInt();
		int com = rn.nextInt(2 - 0 + 1) + 0;

		// 에러 판별
		boolean error = me < 0 || me > 2;
		if (error) {
			System.out.println("0 ~ 2 사이의 정수를 입력하세요. 종료합니다.");
		}

		// com==0 , me==2 => com - me == -2
		// com==1 , me==0 => com - me == 1
		// com==2 , me==1 => com - me == 1

		// 따라서 diff == 1 || diff==-2 일 때 내가 진다.

		// com - me == diff == 0 비겼다.
		// 그 외 : 내가 이겼다.
		if (!error) {
			System.out.println("com : " + com);
			System.out.println("me : " + me);
			int diff = com - me;
			if (diff == 1 || diff == -2) {
				System.out.println("내가 졌다.");
			} else if (diff == 0) {
				System.out.println("비겼다.");
			} else {
				System.out.println("내가 이겼다.");
			}
		}
		sc.close();
//		Scanner sc = new Scanner(System.in);
//		Random rd = new Random();
//
//		int com = rd.nextInt(2 - 1 + 1) + 0; // 0,1,2
//		System.out.println("com = " + com);
//		System.out.print("가위(0)바위(1)보(2) >> ");
//		int me = sc.nextInt();
//		System.out.printf("[com : %d me : %d ]\n", com, me);
//
//		// 비겼다 : com == me
//		// 내가 이겼다 : com == 0 - me == 1 => -1
//		// com == 1 - me == 2 => -1
//		// com == 2 - me == 0 => 2
//		// 컴이 이겼다
//		// com == 0 - me == 2 => -2
//		// com == 2 - me == 1 => 1
//		// com == 1 - me == 0 => 1
//
//		int diff = com - me;
//		if (diff == 1 || diff == -2) {
//			System.out.println("컴퓨터가 이겼다 ");
//		} else if (diff == 0) {
//			System.out.println("비겼다");
//		} else {
//			System.out.println("내가 이겼다");
//		}
//		sc.close();
	}
}
