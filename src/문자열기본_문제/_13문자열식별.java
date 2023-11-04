package 문자열기본_문제;

import java.util.Scanner;

public class _13문자열식별 {
	public static void main(String[] args) {
//		문자열 속 숫자검사
//		예) adklajsiod
//				문자만있다
//		예) 123123
//			숫자만있다
//		예) dasd12312asd
//			문자와 숫자가 섞여있다

//		심화
//			오름차순으로 연속된 숫자 있는지 123
//			내림차순으로 연속된 숫자 있는지 321
//			같은 숫자가 연속으로 있는지 333
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("입력 : ");

			String text = sc.next();

			if (text.equals("끝")) {
				break;
			}
			System.out.printf("%d %c \n", (int) text.charAt(0), text.charAt(0));

			boolean haveNum = false;
			boolean haveChar = false;

			for (int i = 0; i < text.length(); i += 1) {

				if ((int) text.charAt(i) <= 57 && (int) text.charAt(i) >= 48) {
					haveNum = true;
				}

				if ((int) text.charAt(i) > 57 || (int) text.charAt(i) < 48) {
					haveChar = true;
				}
			}

			if (haveNum && !haveChar) {
				System.out.println("숫자만있다");
			}

			if (!haveNum && haveChar) {
				System.out.println("문자만있다");
			}

			if (haveNum && haveChar) {
				System.out.println("숫자와 문자가 둘 다 있다");
			}

			//
			String freq = "";
			for (int i = 0; i < text.length() - 1; i += 1) {
				if (text.charAt(i) == text.charAt(i + 1)) {
					freq += text.charAt(i);
				}
			}
			System.out.print("연속되는 숫자 : " + freq);

			String asc = "";

			System.out.println();
		}
		sc.close();
	}
}
