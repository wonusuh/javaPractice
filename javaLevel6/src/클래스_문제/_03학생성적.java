package 클래스_문제;

import java.util.Arrays;
import java.util.Scanner;

class School {
	String name = "더조은";

	int cnt = 5;
	int[] arHaknun = { 1001, 1002, 1003, 1004, 1005 };
	int[] arScore = { 92, 38, 87, 100, 11 };
	String[] arNames = { "둘리", "고길동", "또치", "마이콜", "조던" };
}

public class _03학생성적 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		School school = new School();

		while (true) {
			System.out.println("===" + school.name + "===");
			System.out.println("1. 전교생 성적확인(저장순)");
			System.out.println("2. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적 확인");
			System.out.println("4. 성적확인하기(이름순)");
			System.out.println("5. 종료하기");
			System.out.print(">> ");
			int input = sc.nextInt();

			if (input == 1) {
				// 전교생 성적 확인
				for (int i = 0; i < school.arScore.length; i += 1) {

					System.out.printf("%s %d점\n", school.arNames[i], school.arScore[i]);
				}
			} else if (input == 2) {
				// 1등학생 성적 확인
				int max = 0;
				String first = "";

				for (int i = 0; i < school.arScore.length; i += 1) {

					if (school.arScore[i] > max) {
						max = school.arScore[i];
						first = school.arNames[i];
					}
				}
				System.out.printf("%s 학생 %d 점\n", first, max);
			} else if (input == 3) {
				// 3. 꼴등학생
				int min = 1000;
				String last = "";

				for (int i = 0; i < school.arScore.length; i += 1) {

					if (school.arScore[i] < min) {
						min = school.arScore[i];
						last = school.arNames[i];
					}
				}
				System.out.printf("%s 학생 %d 점\n", last, min);
			} else if (input == 4) {
				// 이름순 성적 확인하기
				int[] temp = { -1, -1, -1, -1, -1 };
				boolean[] check = new boolean[5];

				for (int i = 0; i < school.arNames.length; i += 1) {

					int min = 1000000;
					int idx = -1;

					for (int j = 0; j < school.arNames.length; j += 1) {

						if (check[j] == false) {
							System.out.print(i);
							System.out.print(j + " ");
							System.out.println(school.arNames[i].compareTo(school.arNames[j]));

							if (school.arNames[i].compareTo(school.arNames[j]) < min) {
								min = school.arNames[i].compareTo(school.arNames[j]);
								temp[i] = j;
								idx = j;
								System.out.println(Arrays.toString(check));
							}
						}
					}
					check[idx] = true;
				}
				System.out.println(Arrays.toString(temp));
				for (int i = temp.length - 1; i >= 0; i -= 1) {
					System.out.println(school.arNames[temp[i]] + "학생 " + school.arScore[temp[i]] + "점");
				}
			} else if (input == 5) {
				break;
			}
		}
		sc.close();
	}
}
