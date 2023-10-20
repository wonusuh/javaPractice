package 반복문2문제;

public class _16학생수 {
	public static void main(String[] args) {
//		문제
//			a중학교에서 1학년으로 입학하는 학생들은
//			8줄 12줄 18줄로 세워도
//			항상 5명이 남는다
//			1학년 전체 학생수를 구하라
//			단, 학생수는 200이상 250명 미만이다.
//		정답
//			221명
		int i = 200;
		int answer = 0;
		while (i < 250) { // 250 미만
			if (i % 8 == 5 && i % 12 == 5 && i % 18 == 5) {
				System.out.println(i);
				answer = i;
			}
			i += 1;
		}
		System.out.println("학생수는 : " + answer + "명");
	}
}
