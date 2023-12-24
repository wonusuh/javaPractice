package 반복문2문제;

import java.util.Random;

public class _05랜덤점수통계 {
	public static void main(String[] args) {
//		문제
//			1. 10회 반복한다
//			2. 1~100사이의 랜덤수를 저장한다
//			3. 성적이 60점 이상이면 합격생이다
//			===========================
//			1.  전교생(10명)의 총점과 평균을 출력한다
//			2 .합격자 수를 출력한다
//			3. 1등학생의 번호와 성적을 출력한다

		Random rn = new Random();
		int i = 1;
		int pass = 0;
		double average = 0;
		int firstScore = 0;
		int hakbun = 0;

		while (i <= 10) {
			int num = rn.nextInt(100 - 1 + 1) + 1;

			average += num;

			if (num >= 60) {
				pass += 1;
			}

			if (num > firstScore) {
				firstScore = num;
				hakbun = i;
			}

			System.out.print(num + " ");
			i += 1;
		}
		System.out.println();
		System.out.printf("average : %.2f\n", average / 10.0);
		System.out.println("pass : " + pass);
		System.out.println("번호" + hakbun + ") " + "firstScore : " + firstScore);
	}
}
