package 문자열기본_문제;

public class _09형변환3 {
	public static void main(String[] args) {
//		문제] 이름과 성적을 아래와같이 하나의 문자로 연결하시오
//		정답] "김철수/87,이만수/42,이영희/95"
		String[] name = { "김철수", "이만수", "이영희" };
		int[] score = { 87, 42, 95 };

		String str = "";

		for (int i = 0; i < name.length; i += 1) {
			str += name[i] + "/";
			str += score[i];
			str += ",";
		}
		System.out.println(str.substring(0, str.length() - 1));
	}
}
