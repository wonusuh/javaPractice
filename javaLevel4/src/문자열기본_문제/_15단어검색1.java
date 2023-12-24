package 문자열기본_문제;

import java.util.Scanner;

public class _15단어검색1 {
	public static void main(String[] args) {
//		단어 검색
//		1. 단어를 입력받아 text변수 문장속에 해당 단어가 있는지를 검사한다.
//		2. 단어가 있으면 true, 단어가 없으면 false 출력.
		Scanner sc = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		// 마침표 제거
		text = text.substring(0, text.length() - 1);

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = sc.nextLine();

		int size = word.length();
		boolean check = false;

		// 범위 : 시작값 - 끝값 + 1
		for (int i = 0; i <= text.length() - size + 1; i += 1) {
			System.out.println(text.substring(i, i + size));

			if (word.equals(text.substring(i, i + size))) {
				check = true;
				break;
			}
		}
		System.out.println(check);
		sc.close();
	}
}
