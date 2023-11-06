package _level4test;

import java.util.Scanner;

public class 문제1 {
	public static void main(String[] args) {
//		* # 단어 교체하기(replace)
//		 * 1. text변수 문장 속에서 변경하고 싶은 단어를 입력받아,
//		 * 2. 교체해주는 기능을 구현한다.
//		 * 예)
//		 * 		Life is too short.
//		 * 		변경하고 싶은 단어입력 : Life
//		 * 		바꿀 단어입력 : Time
//		 * 
//		 * 		Time is too short. // 해당 문자 출력 
//		 *     // Life 이미 Time 으로 바꿨기때문에 다시 life 입력하면 못찾아야함
		Scanner scan = new Scanner(System.in);
		String text = "Life is too short.";
		System.out.println(text);

		// 마침표 없애기
		text = text.substring(0, (text.length() - 1));

		System.out.print("변경하고 싶은 단어를 검색하세요 : ");
		String word = scan.nextLine();
		int size = word.length();

		// 단어가 있는지 검사
		boolean check = false;
		int firstIdx = -1;
		int lastIdx = -1;

		for (int i = 0; i < text.length() - size + 1; i += 1) {

			if (text.substring(i, i + size).equals(word)) {
				check = true;
				firstIdx = i;
				lastIdx = i + size;
			}
		}

		if (check) {
			String before = text.substring(0, firstIdx);
			String after = text.substring(lastIdx);

			System.out.println("어떤 단어로 교체하시겠습니까?");
			String replacement = scan.nextLine();

			text = before + replacement + after + ".";
			System.out.println(text);
		} else {
			System.out.println("찾는 단어가 없습니다.");
		}
		scan.close();
	}
}
