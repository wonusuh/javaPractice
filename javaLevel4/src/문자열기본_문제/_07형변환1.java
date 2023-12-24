package 문자열기본_문제;

import java.util.Arrays;

public class _07형변환1 {
	public static void main(String[] args) {
		String str = "11/100/89";
//		문제1] arr배열에 각 점수를 저장하고, 총점을 출력하시오
//		정답1] 200
		int[] arr = new int[3];
		int size = arr.length;
		String[] afterStr = str.split("/");
		int total = 0;

		for (int i = 0; i < size; i += 1) {
			arr[i] = Integer.parseInt(afterStr[i]);
			total += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);

//		문제2] scores 배열의 각 점수를 슬러시를 구분자로 하나의 문자열로 연결하시오
//		정답2] 11/100/89
		int[] scores = { 11, 100, 88 };
		String text = "";

		for (int i = 0; i < scores.length; i += 1) {

			if (i != 0) {
				text += "/" + scores[i];
			} else {
				text += scores[i];
			}
		}
		System.out.println(text);
	}
}
