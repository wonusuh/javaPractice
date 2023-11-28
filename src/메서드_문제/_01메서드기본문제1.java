package 메서드_문제;

class Test01 {

	void printEvenOdd(int a) {
		System.out.print("[q1]");

		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	void printSum(int x, int y) {
		System.out.print("[q2]");
		System.out.printf("%d ~ %d 총합 == ", x, y);

		if (x > y) {

			int temp = x;

			x = y;
			y = temp;
		}

		int sum = 0;

		for (int i = x; i <= y; i += 1) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printPrimes(int num) {
		System.out.print("[q3]");
		System.out.print(num + "까지의 소수는 => ");

		for (int i = 0; i <= num; i += 1) {

			int cnt = 0;

			for (int j = 1; j <= i; j += 1) {

				if (i % j == 0) {
					cnt += 1;
				}
			}

			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
	}
}

public class _01메서드기본문제1 {

	public static void main(String[] args) {

		Test01 t = new Test01();

		// 문제1) test01에서 a가 홀수인지 짝수인지 출력
		int a = 19;

		t.printEvenOdd(a);

		// 문제2) x부터 y까지 합을 출력하는 메서드 단 x=10, y=1일때도 돼야함
		int x = 10;
		int y = 1;

		t.printSum(x, y);
		t.printSum(y, x);

		// 문제3) num 까지의 소수를 전부 출력
		int num = 30;

		t.printPrimes(num);
	}
}
