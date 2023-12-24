package 배열심화_문제2;

import java.util.Arrays;

public class _06문자열정렬 {
	public static void main(String[] args) {
//		문제
//			사전순으로 이름을 정렬해 출력하시오.
//			compareTo 메서드 사용하면 사전순으로 정렬 가능.
//		정답
//			김유신, 마동석, 서동요, 자바킹, 홍길동
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };

		for (int i = 0; i < names.length; i += 1) {

			for (int j = i; j < names.length; j += 1) {

				if (names[i].compareTo(names[j]) > 0) {

					String temp = names[i];

					names[i] = names[j];
					names[j] = temp;
				}
				System.out.println(Arrays.toString(names));
			}
		}
	}
}
