package 반복문2문제;

import java.util.Scanner;

public class _11최대값 {
	public static void main(String[] args) {
//		문제
//			1. 반복문 안에서 계속해서 값을 입력받는다 (1 ~ 1000)사이의 값
//			2. 입력받은 숫자 중 가장 큰 숫자를 출력한다
//			3. -1000을 입력하면 종료한다
//			4. 최대값을 몇 번째에 입력했는지 출력한다, 최대값을 중복으로 입력했을 시
//				첫 번째로 입력한 최대값의 번수를 출력한다
//			5. 반복문 시작하자마자 종료하면 not found 출력

		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int max = 0;
		int location = 0;

		while (true) {
			System.out.println("입력 =>");
			int input = sc.nextInt();

			if (cnt == 0 && input == -1000) {
				System.out.println("not found");
				break;
			}

			if (input == -1000) {
				System.out.println("종료합니다.");
				break;
			}
			if (input < -999 || input > 1000) {
				System.out.println("다시 입력하세요. (-999~1000)");
				continue;
			}
			cnt += 1;
			if (cnt == 0) {
				max = input;
			}
			if (input > max) {
				max = input;
				location = cnt;
			}
		}
		System.out.printf("cnt == %d, location == %d, max == %d\n", cnt, location, max);
		sc.close();
	}
}
