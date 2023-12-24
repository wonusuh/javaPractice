package 조건문문제;

import java.util.Random;

public class _13더가까운숫자_복습 {
	public static void main(String[] args) {
//		랜덤으로 1 ~ 150 사이의 값을 변수 a, b, c 에 넣고 값을 출력하시오
//		그리고 a 와 c 중에 어떤숫자가 b 와 더 가까운지 출력하시오
		Random rn = new Random();
		int a = rn.nextInt(150 - 1 + 1) + 1;
		int b = rn.nextInt(150 - 1 + 1) + 1;
		int c = rn.nextInt(150 - 1 + 1) + 1;
		System.out.printf("a == %d, b == %d, c == %d\n", a, b, c);
		int bToA = b - a;
		int bToC = b - c;
		if (bToA < 0) {
			bToA *= -1;
		}
		if (bToC < 0) {
			bToC *= -1;
		}
		if (bToA < bToC) {
			System.out.println("a가 b와 더 가깝다.");
		} else if (bToA > bToC) {
			System.out.println("c가 b와 더 가깝다.");
		} else if (bToA == bToC) {
			System.out.println("거리가 같다.");
		}
	}
}
