package 클래스_문제;

import java.util.Scanner;

public class _13클배_학생_과목 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numList = { 1001, 1002, 1003 };
		String[] nameList = { "이만수", "김철만", "오수정" };

		int[] stuNumList = { 1001, 1001, 1002, 1002, 1002, 1003 };
		String[] subList = { "국어", "수학", "국어", "수학", "영어", "수학" };
		int[] scoreList = { 100, 32, 23, 35, 46, 60 };
		int[] rankList = { 0, 0, 0, 0, 0, 0 };

		// Studnent객체들을 만들어서 배열에 넣기
		Student[] st = new Student[numList.length];

		for (int i = 0; i < numList.length; i += 1) {

			Student temp = new Student();

			temp.number = numList[i];
			temp.name = nameList[i];

			st[i] = temp;
		}

		// Subject객체들을 만들어서 배열에 넣기
		Subject[] su = new Subject[stuNumList.length];

		for (int i = 0; i < stuNumList.length; i += 1) {

			Subject temp = new Subject();

			temp.stuNum = stuNumList[i];
			temp.score = scoreList[i];
			temp.rank = rankList[i];
			temp.name = subList[i];

			su[i] = temp;
		}

		while (true) {
			System.out.println("[1] 학생 정보 출력");
			System.out.println("[2] 과목 정보 출력");
			System.out.println("[3] 과목별 랭킹 저장");
			System.out.println("[4] 과목별 랭킹 + 이름 출력");
			System.out.println("[5] 과목별 랭킹 1등의 이름 과목 점수 출력");
			System.out.print("[0] 종료");
			int sel = sc.nextInt();

			if (sel == 0) {
				break;
			} else if (sel == 1) {
				// 학생 정보 출력
				for (int i = 0; i < st.length; i += 1) {
					System.out.printf("%d %s", st[i].number, st[i].name);
					System.out.println();
				}
			} else if (sel == 2) {
				// 과목 정보 출력
				for (int i = 0; i < su.length; i += 1) {
					System.out.printf("%d %s %d %d", su[i].stuNum, su[i].name, su[i].score, su[i].rank);
					System.out.println();
				}
			} else if (sel == 3) {
				// 과목별 랭킹 저장

				for (int i = 0; i < su.length; i += 1) {

					int rank = 1;

					for (int j = 0; j < su.length; j += 1) {

						if (su[i].name.equals(su[j].name)) {

							if (su[j].score > su[i].score) {
								rank += 1;
							}
						}
					}
					su[i].rank = rank;
				}
			} else if (sel == 4) {
				// 과목별 랭킹 + 이름 출력

				for (int i = 0; i < su.length; i += 1) {

					// 학생 찾기
					String temp = "";
					for (int j = 0; j < st.length; j += 1) {

						if (su[i].stuNum == st[j].number) {
							temp = st[j].name;
						}
					}
					System.out.printf("%d %s %d점 %d등 %s", su[i].stuNum, su[i].name, su[i].score, su[i].rank, temp);
					System.out.println();
				}
			} else if (sel == 5) {
				// 과목별 랭킹 1등의 이름 과목 점수 출력
				for (int i = 0; i < su.length; i += 1) {

					if (su[i].rank == 1) {
						// 학생 찾기
						String temp = "";
						for (int j = 0; j < st.length; j += 1) {

							if (su[i].stuNum == st[j].number) {
								temp = st[j].name;
							}
						}
						System.out.printf("%d %s %d점 %d등 %s", su[i].stuNum, su[i].name, su[i].score, su[i].rank, temp);
						System.out.println();
					}
				}

			}
		}
		sc.close();
	}
}
