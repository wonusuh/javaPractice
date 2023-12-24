package _level4test;

import java.util.Arrays;

public class 문제3 {
	public static void main(String[] args) {
//		아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경하시오.
//		1) 문자열을 잘라서 배열에 저장한다.
//		2) 배열에서 꼴등을 삭제한다.
//		3) 삭제한배열을 다시 문자열로 만든다.
		// [정답]
		// str = "김철수/87,이영희/95";
		String str = "김철수/87,이만수/42,이영희/95";
		String[] members = str.split(",");
		String[] names = new String[3];
		int[] scores = new int[3];

		for (int i = 0; i < members.length; i += 1) {

			String[] temp = new String[1];
			temp = members[i].split("/");

			names[i] = temp[0];
			scores[i] = Integer.parseInt(temp[1]);
		}
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(scores));

		// 최소값 찾기
		int min = 100;
		int minIdx = -1;

		for (int i = 0; i < scores.length; i += 1) {

			if (scores[i] < min) {
				min = scores[i];
				minIdx = i;
			}
		}
		System.out.println(min);
		System.out.println(minIdx);

		// 최소값이 아닐때만 str에 더한다
		str = "";

		for (int i = 0; i < scores.length; i += 1) {

			if (i != minIdx) {
				str += names[i] + "/" + scores[i];

				if (i != scores.length - 1) {
					str += ",";
				}
			}
		}
		System.out.println(str);
	}
}
