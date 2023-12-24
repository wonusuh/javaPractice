package 예외처리;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04예외처리4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 나이를 입력받고 해당 탄생년도 출력
		System.out.println("나이를 입력하세요. >> ");

		try {

			int age = sc.nextInt();

			System.out.println("태어난 연도는 : " + (2023 - age));
		} catch (InputMismatchException e) {
			System.err.println("정수만 입력하세요.");
		} finally {
			System.out.println("종료");
			sc.close();
		}
	}
}
