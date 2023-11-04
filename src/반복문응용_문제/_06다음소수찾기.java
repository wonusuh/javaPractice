package 반복문응용_문제;

import java.util.Scanner;

public class _06다음소수찾기 {
	public static void main(String[] args) {
//		문제
//			숫자를 한 개 입력받아서 입력받은 숫자보다 큰 첫 번째 소수를 출력한다

//			예) enter number ? 1000 1000보다 큰 첫 번째 소수는 1009
//			예) enter number ? 500 500보다 큰 첫 번째 소수는 503
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number ? >> ");

		int input = sc.nextInt();

		while (true) {
			input += 1;

			int cnt = 0;

			for (int i = 1; i <= input; i += 1) {
				if (input % i == 0) {
					cnt += 1;
				}
			}

			if (cnt == 2) {
				System.out.println(input);
				break;
			}
		}
		sc.close();
	}
}
