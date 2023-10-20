package 반복문2문제;

public class _15학생빨간구슬 {
	public static void main(String[] args) {
//		문제
//			파란구슬 50개와 빨간구슬 70개를 최대한 많은 학생들에게 똑같이 나누어줬더니
//			파란구슬은 5개가 남고 빨간구슬은 2개가 부족할 떄 다음 물음에 답하시오
//			1. 학생 수는 얼마인지 구하시오
//			2. 학생 한명 당 받게되는 빨간구슬의 개수를 구하시오
//			3. 학생 한명 당 받게되는 파란구슬의 개수를 구하시오
//		정답
//			1. 학생 수 =9명
//			2. 학생 한명당 파란구슬수 5개
//			3. 학생 한명당 빨간구슬수 7개
		int blueBalls = 50 - 5;
		int redBalls = 70 + 2;
		int answer = 0;

		int i = 1;
		while (i <= blueBalls) {
			if (blueBalls % i == 0 && redBalls % i == 0) {
				answer = i;
				System.out.println(i);
			}
			i += 1;
		}
		int blueCnt = (blueBalls + 5) / answer;
		int redCnt = (redBalls - 2) / answer;
		System.out.println("학생수 : " + answer);
		System.out.println("한 명당 파란구슬 : " + blueCnt);
		System.out.println("한 명당 빨간구슬 : " + redCnt);
	}
}
