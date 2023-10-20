package 반복문2문제;

import java.util.Random;

public class _20즉석복권 {
	public static void main(String[] args) {
//		문제
//			랜덤으로 1 또는 7을 10번 출력한다
//			7이 연속으로 3번 이상이면 당첨 아니면 꽝을 출력하시오
//		예시
//			7 7 1 1 1 7 1 1 1 1: 꽝
//			1 7 7 7 1 1 7 1 1 1: 당첨

//		힌트1) 0, 1 => 0 -> 7 ==> 1, 7
//		힌트2) 3연속으로 7이 나오지 않는다면 cnt 초기화해주기
		Random rn = new Random();

		int cnt = 0;
		int seven = 0;
		boolean lucky = false;

		while (true) {
			int num = rn.nextInt(7 - 1 + 1) + 1;

			if (num == 1 || num == 7) {
				cnt += 1;
				System.out.print(num + " ");
			}

			if (num == 1) {
				seven = 0;
			}

			if (num == 7) {
				seven += 1;
			}

			if (seven >= 3) {
				lucky = true;
			}

			if (cnt == 10) {
				break;
			}

		}
		if (lucky) {
			System.out.println(": \"당첨\"");
		} else {
			System.out.println(": \"꽝\"");
		}
		System.out.println("seven == " + seven);
	}
}
