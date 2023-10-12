package 기초3문제;

import java.util.Scanner;

// 3과목의 평균이 60점 이상이면 합격이다.
// 단, 평균이 합격일지라도, 어느 한 과목이 50점 미만이면 불합격이다.
// 합 불을 판별하라
// 정답 false
public class _05과락 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수 : ");
		double kor = scan.nextInt();
		System.out.println("영어점수 : ");
		double eng = scan.nextInt();
		System.out.println("수학점수 : ");
		double math = scan.nextInt();
		double count = 3;
		double average = (kor + eng + math) / count;
		boolean averageBool = average >= 60;
		boolean conditions = kor >= 50 && eng > 50 && math >= 50;
		boolean passOrNot = averageBool && conditions;
		System.out.println("평균 = " + average);
		System.out.println("합불여부 = " + passOrNot);
		scan.close();
	}
}
