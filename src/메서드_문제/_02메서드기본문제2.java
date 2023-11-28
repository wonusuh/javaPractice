package 메서드_문제;

class Test02 {

	void printSum(int[] arr) {
		System.out.print("전체 합 : ");

		int sum = 0;

		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}

	void printSumMultiple4(int[] arr) {
		System.out.print("4의 배수들의 합 : ");

		int sum = 0;

		for (int i : arr) {

			if (i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	void printCountMultiple4(int[] arr) {
		System.out.print("4의 배수의 개수 : ");

		int cnt = 0;

		for (int i : arr) {

			if (i % 4 == 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}

	void printCountEven(int[] arr) {
		System.out.print("짝수의 개수 : ");

		int cnt = 0;

		for (int i : arr) {

			if (i % 2 == 0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
	}
}

public class _02메서드기본문제2 {

	public static void main(String[] args) {

		// main 메서드에서는 호출만 하시오

		int[] arr = { 87, 100, 11, 72, 92 };
		Test02 t = new Test02();

		// 1
		t.printSum(arr);

		// 2
		t.printSumMultiple4(arr);

		// 3
		t.printCountMultiple4(arr);

		// 4
		t.printCountEven(arr);
	}
}
