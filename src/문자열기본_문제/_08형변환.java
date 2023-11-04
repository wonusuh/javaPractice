package 문자열기본_문제;

import java.util.Arrays;

public class _08형변환 {
	public static void main(String[] args) {
//		[문제] 이름은 name배열에, 성적은 score배열에 각각 저장 및 출력하시오.
		String str = "김철수/87,이만수/42,이영희/95";

		String[] name = new String[3]; // 김철수, 이만수, 이영희
		int[] score = new int[3]; // 87, 42, 95
//
//		int cnt = 0;
//		for (int i = 0; i < str.length() - 1; i += 7) {
//			name[cnt] = str.substring(i, i + 3);
//
//			score[cnt] = Integer.parseInt(str.substring(i + 4, i + 6));
//
//			cnt += 1;
//		}
		String[] temp = str.split(",");


		for (int i = 0; i < temp.length; i += 1) {
			String[] names = temp[i].split("/");
			name[i] = names[0];
			score[i] = Integer.parseInt(names[1]);
		}

		System.out.println(str);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));
	}
}
