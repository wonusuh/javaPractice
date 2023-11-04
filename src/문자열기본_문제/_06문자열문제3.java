package 문자열기본_문제;

public class _06문자열문제3 {
	public static void main(String[] args) {
//		문제
//			userData 는 학생번호 데이터이고,
//			scoreData는 학생점수 데이터이다.
//			1등 학생의 번호와 성적 그리고 전체평균을 출력하시오.
//		정답
//			(1) 1003번 : 43점
//			(2) 전체평균 : 21.5점
		String userData = "1001,1002,1003,1004,";
		String scoreData = "10,21,43,12";

		String[] intUser = userData.split(",");
		String[] intScore = scoreData.split(",");
		int size = intUser.length;

		int max = 0;
		String maxIdx = "";
		int total = 0;
		for (int i = 0; i < size; i += 1) {

			if (Integer.parseInt(intScore[i]) > max) {
				max = Integer.parseInt(intScore[i]);
				maxIdx = intUser[i];
			}
			total += Integer.parseInt(intScore[i]);
		}
		System.out.printf("%s번 %d점\n", maxIdx, max);
		System.out.println(total * 1.0 / size + "점");
	}
}
