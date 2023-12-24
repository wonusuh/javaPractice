package _레벨1테스트;

import java.util.Random;
import java.util.Scanner;

public class 응용7 {
	public static void main(String[] args) {
//		[문제 7]
//				1. 철수는 지금 모두의 마블 게임을 하고있다.
//				2. 게임은 0 ~ 20까지 이동할 수 있는 거리가 있다.
//				3. 현재 철수의 차례이다.
//				4. 철수의 위치는 시작점으로부터 9만큼 이동한 상태이다.
//				5. 1 ~ 6의 숫자가 있는 주사위 2개를 던진다.
//				6. 주사위 숫자의 합만큼 이동할 수 있다.
//				7. 다음 이동할 철수의 위치를 출력하시오.

//				8. 조건
//					1) 두 주사위 숫자가 서로 다를 경우에는
//					   현재 위치에서 주사위 숫자의 합만큼 이동한다.
//					   예) 3, 5 => 8만큼 이동
//					2) 두 주사위의 숫자가 같은 경우 보너스로 이동거리 6이 추가된다.
//					   예) 2, 2 => 4 + 6 만큼 이동
//					3) 14, 15, 16 번의 위치에 함정이 있다.
//					   함정에 걸리면 다시 주사위 2개를 던지고
//					   그 합이 6이하이면 [패널티] 처음 위치(0)로 이동한다.
//					   그 합이 7이상이면 [패널티 없음] 함정을 탈출한다.(현재자리 유지)
//					4) 20 이상의 값이 나오면 "승리"를 출력한다.

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int dice1 = rn.nextInt(6 - 1 + 1) + 1;
		System.out.println("첫 번째 주사위 : " + dice1);
		int dice2 = rn.nextInt(6 - 1 + 1) + 1;
		System.out.println("두 번째 주사위 : " + dice2);

		int location = 9;

		if (dice1 != dice2) {
			location = location + (dice1 + dice2);
		} else {
			location = location + (dice1 + dice2 + 6);
		}
		if (location == 14 || location == 15 || location == 16) {
			System.out.println("현재 철수의 위치 : " + location + " 주사위를 또 던집니다.");
			dice1 = rn.nextInt(6 - 1 + 1) + 1;
			dice2 = rn.nextInt(6 - 1 + 1) + 1;
			if (dice1 + dice2 <= 6) {
				System.out.println("주사위합 : " + (dice1 + dice2));
				System.out.println("패널티");
				location = 0;
			} else if (dice1 + dice2 >= 7) {
				System.out.println("주사위합 : " + (dice1 + dice2));
				System.out.println("패널티 없음");
			}
		}
		System.out.println("현재 철수의 위치 : " + location);
		if (location >= 20) {
			System.out.println("승리");
		}
		sc.close();
	}
}
