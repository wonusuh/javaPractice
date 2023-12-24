package 문자열기본_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _15단어검색2 {
	public static void main(String[] args) {
//		단어 검색
//		1. 단어를 입력받아 text변수 문장속에 해당 단어가 있는지를 검사한다.
//		2. 단어가 있으면 true, 단어가 없으면 false 출력.
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		text = text.substring(0, text.length() - 1);
		System.out.println(text);
		char[] arr = new char[text.length()];

		for (int i = 0; i < text.length(); i += 1) {
			arr[i] += text.charAt(i);
		}

		System.out.println(Arrays.toString(arr));

		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		boolean check = false;

		for (int i = 0; i < arr.length - word.length() + 1; i += 1) {

			if (arr[i] != word.charAt(0)) {
				continue;
			}

			int count = 0;
			for (int k = 0; k < word.length(); k += 1) {
				if (arr[i + k] == word.charAt(k)) {
					count += 1;
				}
			}
			if (count == word.length()) {
				check = true;
				break;
			}

		}

		System.out.println(check);
		scan.close();
	}
}
