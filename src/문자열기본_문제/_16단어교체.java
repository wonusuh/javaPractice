package 문자열기본_문제;

import java.util.Scanner;

public class _16단어교체 {
	public static void main(String[] args) {
//		문제
//			변경하고싶은 단어를 입력받아
//			원하는 단어로 교체하시오.
//			
//			예)
//				단어 선택 : Life
//				단어 입력 : Your Leg
//				
//				Your Leg is too short.
		Scanner sc = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);

		// 마침표 제거
		text = text.substring(0, text.length() - 1);

		System.out.print("바뀌어질 단어를 입력하세요 : ");
		String word = sc.nextLine();

		int size = word.length();
		boolean check = false;

		// 범위 : 시작값 - 끝값 + 1

		int firstIdx = 0;
		int lastIdx = 0;

		for (int i = 0; i <= text.length() - size; i += 1) {
			System.out.println(text.substring(i, i + size));

			if (word.equals(text.substring(i, i + size))) {
				firstIdx = i;
				lastIdx = i + size;
				check = true;
				break;
			}
		}
		System.out.println(check);

		if (check) {
//			System.out.println(firstIdx);
//			System.out.println(lastIdx);

			String before = text.substring(0, firstIdx);
			String after = text.substring(lastIdx);

//			System.out.println("before : " + before);
//			System.out.println("after : " + after);

			System.out.print("바꿀 단어를 입력하세요 >> ");
			String replacement = sc.nextLine();

			text = before + replacement + after + ".";
			System.out.println(text);
		}
		sc.close();
	}
}
