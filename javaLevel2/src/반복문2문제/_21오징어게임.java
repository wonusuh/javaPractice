package 반복문2문제;

import java.util.Random;

public class _21오징어게임 {
	public static void main(String[] args) {
//		오징어게임
//			철수는 오징어게임에 참가하였다
//			첫번째 게임은 "무궁화꽃이 피었습니다" 이다.
//			규칙은 아래와같다.
//		규칙
//			1 전체거리는 0~25까지가 있다
//			2 철수는 현재 0의 자리에 있다
//			3 철수는 매 턴 1~4의 랜덤숫자를 뽑는다. 숫자만큼 이동한다
//			4 이동거리를 누적하며, 합이 25이상이 되면 승리이며 종료한다
//			5 인형은 매 턴 3~5의 랜덤 숫자를 뽑는다
//			6 인형보다 큰 수가 나오면 움직인 것으로 간주되어 패배하며 종료한다
//			7 10 턴 안에 도착 못하면 시간 초과로 패배하며 종료한다
//			8 철수의 이동경로를 전부 출력하시오
		Random rn = new Random();
		int position = 0;
		int i = 1;
		while (true) {

			if (i > 10) {
				System.out.println("10턴 초과 패배");
				break;
			}

			int cs = rn.nextInt(4 - 1 + 1) + 1;
			int doll = rn.nextInt(5 - 3 + 1) + 3;

			System.out.println("게임 : " + i);
			System.out.println("철수의 랜덤숫자  : " + cs);
			System.out.println("인형의 랜덤 숫자 : " + doll);

			if (cs > doll) {
				System.out.println("움직임 걸림 패배");
				break;
			}

			position += cs;

			if (position >= 25) {
				position = 25;
				System.out.println("철수 승리");
				break;
			}

			System.out.println("이동성공 : 철수위치 : " + position);

			System.out.println("===================================================================");
			i += 1;
		}
	}
}
