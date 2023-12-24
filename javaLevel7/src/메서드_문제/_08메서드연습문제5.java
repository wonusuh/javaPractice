package 메서드_문제;

import java.util.Arrays;

class Return4 {
//문제
//아래 main()메서드 내의 student 배열은
//순서대로 이름 지역 번호를 의미한다.
//이러한 데이터를 아래 순서대로 result배열에 저장하여 리턴해주는 run메서드를
//작성하라.
//학생번호 이름 지역 국어 수학 영어 총합 평균

	String[][] run(String[][] stu, String[][] sco) {

		String[][] result = new String[stu.length][8];

		// 계산 안해도 되는 값들 넣기
		for (int i = 0; i < result.length; i += 1) {
			result[i][0] = stu[i][2];
			result[i][1] = stu[i][0];
			result[i][2] = stu[i][1];
		}

		// 그 외의 값들 넣기
		for (int i = 0; i < sco.length; i += 1) {

			for (int j = 0; j < result.length; j += 1) {

				if (sco[i][0].equals(result[j][0])) {

					if (sco[i][1].equals("국어")) {
						result[j][3] = sco[i][2];
					} else if (sco[i][1].equals("수학")) {
						result[j][4] = sco[i][2];
					} else {
						result[j][5] = sco[i][2];
					}
				}
			}

		}

		// 총합과 평균 넣기

		for (int j = 0; j < result.length; j += 1) {
			int total = 0;
			total += Integer.parseInt(result[j][3]) + Integer.parseInt(result[j][4]) + Integer.parseInt(result[j][5]);
			result[j][6] = "" + total;
			result[j][7] = "" + Math.round((total / 3.0) * 100) / 100.0;
		}
		return result;
	}
}

public class _08메서드연습문제5 {

	public static void main(String[] args) {

		Return4 re = new Return4();
		String[][] student = {

				{ "김철만", "신촌", "1001" },

				{ "오상덕", "강남", "1002" },

				{ "민철이", "대치", "1003" },

				{ "유재석", "강동", "1004" } };
		String[][] score = {

				{ "1001", "국어", "20" },

				{ "1002", "국어", "50" },

				{ "1003", "국어", "60" },

				{ "1004", "국어", "17" },

				{ "1001", "수학", "65" },

				{ "1002", "수학", "15" },

				{ "1003", "수학", "80" },

				{ "1004", "수학", "70" },

				{ "1001", "영어", "43" },

				{ "1002", "영어", "90" },

				{ "1003", "영어", "30" },

				{ "1004", "영어", "70" } };
		String result[][] = re.run(student, score); // re.run(student,score);
		System.out.println(Arrays.deepToString(result));
	}
}
