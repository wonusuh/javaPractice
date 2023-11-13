package 배열심화_문제2;

public class _12문자열검색 {

	public static void main(String[] args) {
		String[][] student = {

				{ "1001", "이만수", "남" },

				{ "1002", "이영희", "여" },

				{ "1003", "김민정", "여" },

				{ "1004", "이철민", "남" },

				{ "1005", "오만석", "남" },

				{ "1006", "최이슬", "여" }, };
		int[][] score = {
				// 번호 국어 수학
				{ 1005, 49, 100 },

				{ 1001, 49, 100 },

//				{ 1001, 10, 20 },

				{ 1003, 64, 65 },

				{ 1002, 70, 30 },

				{ 1004, 13, 87 },

				{ 1006, 14, 90 }, };
		int fScore = 0;
		int mScore = 0;
		String quiz2 = "";
		String quiz3 = "";
		String quiz4 = "";
		int max = 0;
		int size = student.length; // 6

		for (int i = 0; i < size; i += 1) {

			int num = Integer.parseInt(student[i][0]);
			int idx = -1;

			for (int k = 0; k < size; k += 1) {

				if (num == score[k][0]) {
					idx = k;
					break;
				}
			}

//			System.out.printf("i = %d , idx = %d \n", i, idx);
//			System.out.printf(" 학번 1= %d , 학번2 = %s \n", score[idx][0], student[i][0]);
			// i => student 학생 // idx => score 학생점수

			// 문제 1
			int hap = score[idx][1] + score[idx][2];

			if (student[i][2].equals("남")) {
				mScore += hap;
			} else {
				fScore += hap;
			}

			// 문제 2
			double avg = hap / 2.0;

			if (avg >= 60) {
				quiz2 += String.format("%s번 %s, %.1f점 %n", student[i][0], student[i][1], avg);
			}

			// 문제 3
			if (score[idx][1] > score[idx][2]) {
				quiz3 += String.format("%s번 %s \n", student[i][0], student[i][1]);
			}

			// 문제 4
			if (hap > max) {
				max = hap;
			}
		}

		// [문제1] 여학생들 점수총합과 남학생들의 점수총합을 비교하고 점수가 더 큰쪽을 출력
		// [정답1] 여성 = 333
		if (mScore != fScore) {
			System.out.println(mScore > fScore ? "남=" + mScore : "여=" + fScore);
		} else {
			System.out.println("같다");
		}

		// [문제2] 평균이 60점이상이면 합격 : 합격생들 번호 이름 점수 출력
		// [정답2]
		// 1003번 김민정, 64.5점
		// 1005번 오만석, 74.5점
		System.out.println(quiz2);

		// [문제3] 국어점수가 수학점수 보다 큰 학생들 번호 이름 출력
		// [정답3] 1002번 이영희
		System.out.println(quiz3);

		// [문제4] 1등 번호, 이름 출력 (여러명이면 전부 출력)
		// [정답4] 1005번 오만석
		for (int i = 0; i < size; i += 1) {

			if (max != score[i][1] + score[i][2]) {
				continue;
			}

			for (int k = 0; k < size; k += 1) {

				if (student[k][0].equals(score[i][0] + "")) {
					quiz4 += String.format("%s번 %s %n", student[k][0], student[k][1]);
				}
			}
		}
		System.out.println(quiz4);
	}
}
