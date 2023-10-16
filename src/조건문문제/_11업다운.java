package 조건문문제;

import java.util.Random;
import java.util.Scanner;

public class _11업다운 {
	public static void main(String[] args) {
		// 1. com 은 램덤 10 ~ 90 에서 고르시오
//		2. me 숫자를 하나 입력한다
//		3. com 과 me 르 비교해서 다음과 같은 메세지를 출력한다.
		//
//			com : 15 me : 5 => up!
//			com : 3  me : 5 => down!
//			com : 5  me : 5 => bingo!
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("10 ~90에서 숫자 하나를 입력하세요");
		int me = sc.nextInt();
		int com = rn.nextInt(90 - 10 + 1) + 10;

		boolean error = 10 < me || me > 90;

		if (!error) {
			System.out.println("10~90 사이의 숫자를 입력하세요");
		}
		if (!error) {
			if (me < com) {
				System.out.println("com : " + com + "  " + "me : " + me + " => up!");
			}
			if (me == com) {
				System.out.println("com : " + com + "  " + "me : " + me + " => bingo!");
			}
			if (me > com) {
				System.out.println("com : " + com + "  " + "me : " + me + " => down!");
			}
		}
		sc.close();
	}
}
