package _level2test;

import java.util.Random;

public class 문제2 {
	public static void main(String[] args) {
		Random rn = new Random();
		int max = 0;
		int first = 0;
		int pass = 0;
		double total = 0.0;
		int i = 0;
		for (i = 1; i < 11; i += 1) {
			int score = rn.nextInt(100 - 1 + 1) + 1;
			total += score;
			if (score >= 60) {
				pass += 1;
			}
			if (score > max) {
				max = score;
				first = i;
			}
			System.out.printf("%d학생 %d점\n", i, score);
		}
		System.out.println();
		System.out.printf("전체평균 : %.2f점\n", total / (i * 1.0));
		System.out.println("합격자수 : " + pass + "명");
		System.out.printf("%d번학생 최고점수%d\n", first, max);
	}
}
