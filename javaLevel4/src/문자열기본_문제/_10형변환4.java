package 문자열기본_문제;

import java.util.Arrays;

public class _10형변환4 {
	public static void main(String[] args) {
//		문제
//			아래 데이터에서 꼴등을 삭제 후 다시 문자열로 변경하시오
//			1) 문자열을 잘라서 배열에 저장한다
//			2) 배열에서 꼴등을 삭제한다
//			3) 삭제한 배열을 다시 문자열로 만든다
//		
//		정답
//			str = "김철수/87,이영희/95"
		String str = "김철수/87,이만수/42,이영희/95";
		String[] data = str.split(",");
		int scores[] = new int[data.length];

		for (int i = 0; i < data.length; i += 1) {
			String[] info = data[i].split("/"); // [김철수 , 87]
			scores[i] = Integer.valueOf(info[1]);
		}

		System.out.println(Arrays.toString(data));

		int min = scores[0];
		int minIdx = 0;

		for (int i = 0; i < scores.length; i += 1) {
			if (min > scores[i]) {
				min = scores[i];
				minIdx = i;
			}
		}

		System.out.println(minIdx);
		str = "";
		for (int i = 0; i < scores.length; i += 1) {
			if (i != minIdx) {
				str += data[i] + ",";
			}
		}
		str = str.substring(0, str.length() - 1);

		System.out.println(str);
	}
}
