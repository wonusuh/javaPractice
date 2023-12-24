package _level4test;

public class 문제7 {
	public static void main(String[] args) {
		String[][] student = {
				// 번호 이름 성별 국어 수학
				{ "1002", "이영희", "여", "70", "30" },

				{ "1001", "이만수", "남", "100", "40" },

				{ "1003", "김민정", "여", "64", "15" },

				{ "1004", "이철민", "남", "53", "87" },

				{ "1005", "오만석", "남", "49", "80" },

				{ "1006", "최이슬", "여", "14", "90" } };
		// [문제1] 여학생들 점수 총합과 남학생들의 점수 총합을 비교하고 점수가 더 큰쪽을 출력
		// [정답1] 남성 = 409
		int girls = 0;
		int boys = 0;
		for (int i = 0; i < student.length; i += 1) {

			if (student[i][2].equals("여")) {
				girls += Integer.parseInt(student[i][3]);
				girls += Integer.parseInt(student[i][4]);
			} else if (student[i][2].equals("남")) {
				boys += Integer.parseInt(student[i][3]);
				boys += Integer.parseInt(student[i][4]);
			}
		}
		System.out.println(girls > boys ? "여성 = " + girls : "남성 = " + boys);
		System.out.println();

		// [문제2] 평균이 60점 이상이면 합격 : 합격생들 번호, 이름, 점수 출력
		// [정답2]
		// 1001번 = 이만수, 70.0점
		// 1004번 = 이철민, 70.0점
		// 1005번 = 오만석, 64.5점
		for (int i = 0; i < student.length; i += 1) {
			if ((Double.parseDouble(student[i][3]) + Double.parseDouble(student[i][4])) / 2 >= 60) {
				System.out.print(student[i][0] + "번 = ");
				System.out.print(student[i][1] + ", ");
				System.out.print((Double.parseDouble(student[i][3]) + Double.parseDouble(student[i][4])) / 2 + "점");
				System.out.println();
			}
		}
		System.out.println();

		// [문제3] 국어점수가 수학점수 보다 큰 학생들 번호, 이름 출력
		// [정답3]
		// 1001번 = 이만수
		// 1002번 = 이영희
		// 1003번 = 김민정
		for (int i = 0; i < student.length; i += 1) {
			if (Double.parseDouble(student[i][3]) > Double.parseDouble(student[i][4])) {
				System.out.print(student[i][0] + "번 = ");
				System.out.print(student[i][1]);
				System.out.println();
			}
		}
		System.out.println();

		// [문제4] 1등 번호, 이름 출력 (여러명이면 전부 출력)
		// [정답4]
		// 1001번 = 이만수
		// 1004번 = 이철민
		int firstScore = 0;

		for (int i = 0; i < student.length; i += 1) {

			if (Integer.parseInt(student[i][3]) + Integer.parseInt(student[i][4]) >= firstScore) {
				firstScore = Integer.parseInt(student[i][3]) + Integer.parseInt(student[i][4]);
			}
		}

		// 최고점과 같은 점수인 학생들을 모두 출력
		for (int i = 0; i < student.length; i += 1) {

			if (firstScore == Integer.parseInt(student[i][3]) + Integer.parseInt(student[i][4])) {
				System.out.printf("%s번 = %s\n", student[i][0], student[i][1]);
			}
		}
	}
}
