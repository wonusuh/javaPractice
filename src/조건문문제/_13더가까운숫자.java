package 조건문문제;

import java.util.Random;

public class _13더가까운숫자 {
	public static void main(String[] args) {
//		랜덤으로 1~150 사이의 값을 변수 a,b,c 에 넣고 값을 출력하시오
//		그리고 a 와 c 중에 어떤숫자가 b 와 더 가까운지 출력하시오
		Random rn = new Random();
		System.out.println("1~150 사이의 정수 a, b, c 를 비교합니다");
		int a = rn.nextInt(150 - 1 + 1) + 1;
		System.out.println("a : " + a);
		int b = rn.nextInt(150 - 1 + 1) + 1;
		System.out.println("b : " + b);
		int c = rn.nextInt(150 - 1 + 1) + 1;
		System.out.println("c : " + c);
		int ab = 0;
		int cb = 0;

		if (a < b) {
			ab = b - a;
		}
		if (a > b) {
			ab = a - b;
		}
		if (c < b) {
			cb = b - c;
		}
		if (c > b) {
			cb = c - b;
		}

		if (ab < cb) {
			System.out.println("a가 b에 더 가깝다");
		}
		if (ab > cb) {
			System.out.println("c가 b에 더 가깝다");
		}
		if (ab == cb) {
			System.out.println("같다");
		}
	}
}
