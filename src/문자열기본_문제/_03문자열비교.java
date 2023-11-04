package 문자열기본_문제;

import java.util.Scanner;

public class _03문자열비교 {
	public static void main(String[] args) {
//		문제
//			equals() 메서드 없이 문자의 일치여부를 비교하시오
//			
//			예)
//			코끼리
//				입력 : 티라노사우르스
//				출력 : false
		String question = "코끼리";
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(question);
			System.out.print("위 동물의 이름을 입력하세요 >> ");

			String input = sc.nextLine();

			for (int i = 0; i < question.length(); i += 1) {
				if (question.charAt(i) != input.charAt(i)) {
					System.out.println("오답");
					break;
				}
			}

			if (input.equals("끝")) {
				break;
			}
		}
		sc.close();
	}
}
