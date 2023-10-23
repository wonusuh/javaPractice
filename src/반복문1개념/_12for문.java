package 반복문1개념;

public class _12for문 {
	public static void main(String[] args) {
		// while문 횟수가 정해져있지 않은 반복문
		int i = 1;
		while (i <= 10) {
			System.out.println(i + " ");
			i += 1;
		}
		System.out.println("==============================");
		// 횟수가 정해져있는 반복문
		int k = 1;
		for (; k <= 10; k += 1) {
			System.out.println(k + " ");
		}

		for (;;) {
			// 무한 루프
		}
	}
}
