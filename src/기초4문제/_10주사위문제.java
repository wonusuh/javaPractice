package 기초4문제;

import java.util.Random;

// 철수는 주사위를 2개 가지고있다.
// 주사위는 눈금이 1~6까지 있다.
//철수가 주사위 2개를 던졌을 때 그 합을 출력하시오
//단, 주사위 눈금이 서로 같으면 6을 추가로 더하시오
//[예]
//		1, 2 ==> 3
//		1, 1 ==> 2 + 6
public class _10주사위문제 {
	public static void main(String[] args) {
		Random rn = new Random();
		// 랜덤 범위 사용 공식 : 갯수 = 끝값 - 시작값 + 1
		// rn.nextInt(갯수) + 시작값;
		// 3 - -3 => 6 + 1 => 7
		int dice1 = rn.nextInt(6 - 1 + 1) + 1;
		System.out.println("dice1 = " + dice1);
		int dice2 = rn.nextInt(6 - 1 + 1) + 1;
		System.out.println("dice2 = " + dice2);
		int sum = 0;

		boolean error = dice1 < 1 || dice1 > 6 || dice2 < 1 || dice2 > 6;

		if (error) {
			System.out.println("주사위의 값이 범위를 벗어납니다.");
		}

		if (!error) {
			if (dice1 == dice2) {
				sum = dice1 + dice2 + 6;
				System.out.println("두 주사위의 합은 : " + sum);
			} else {
				sum = dice1 + dice2;
				System.out.println("두 주사위의 합은 : " + sum);
			}
		}
	}
}
