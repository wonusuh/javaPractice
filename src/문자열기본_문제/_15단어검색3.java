package 문자열기본_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _15단어검색3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		text = text.substring(0, text.length() - 1);

		String[] data = text.split(" ");

		System.out.println(Arrays.toString(data));
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		boolean check = false;

		for (int i = 0; i < data.length; i += 1) {

			if (check) {
				break;
			}

			int idx = 0;

			for (int k = 0; k < data[i].length(); k += 1) {

				// life
				if (word.charAt(idx) == data[i].charAt(k)) {
					idx += 1;
				} else {
					idx = 0;
				}

				if (idx == word.length()) {
					check = true;
					break;
				}
			}
		}
		System.out.println(check);
		scan.close();
	}
}
