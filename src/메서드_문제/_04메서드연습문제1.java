package 메서드_문제;

import java.util.Random;
import java.util.Scanner;

class Score {

	Random rn = new Random();
	int[][] students = new int[5][];
	Scanner sc = new Scanner(System.in);

	void createScores(int[] hak, int[] sco) {

		for (int i = 0; i < this.students.length; i += 1) {

			if (this.students[i] == null) {
				this.students[i] = new int[2];
			}
			this.students[i][0] = hak[i];
			this.students[i][1] = rn.nextInt(100 - 0 + 1) + 0;
		}
	}

	void showTotAndAver() {
		System.out.println("q2");

		int total = 0;
		double average = 0.0;
		int cnt = 0;

		for (int i = 0; i < this.students.length; i += 1) {
			total += this.students[i][1];
			cnt += 1;
		}
		average = total * 1.0 / cnt;
		System.out.printf("총점(%d) 평균(%.2f)\n", total, average);
	}

	void showPassed() {
		System.out.println("q3");

		int cnt = 0;

		for (int[] i : this.students) {

			if (i[1] >= 60) {
				cnt += 1;
			}
		}
		System.out.println(cnt + "명");
	}

	void scoreByIdx() {
		System.out.println("q4");

		for (int i = 0; i < this.students.length; i += 1) {
			System.out.print(this.students[i][1] + " ");
		}
		System.out.print("인덱스를 입력하세요. >> ");
		int input = this.sc.nextInt();

		System.out.println(this.students[input][1]);
	}

	void idxByScore() {
		System.out.println("q5");

		for (int i = 0; i < this.students.length; i += 1) {
			System.out.print(this.students[i][1] + " ");
		}
		System.out.print("점수를 입력하세요. >> ");
		int input = this.sc.nextInt();

		for (int i = 0; i < this.students.length; i += 1) {

			if (this.students[i][1] == input) {
				System.out.print(i + " ");
			}
		}
	}

	void scoreByHak() {
		System.out.println("q6");

		for (int i = 0; i < this.students.length; i += 1) {
			System.out.print(this.students[i][0] + ":" + this.students[i][1] + " ");
		}
		System.out.print("학번을 입력하세요. >> ");
		int input = this.sc.nextInt();

		for (int i = 0; i < this.students.length; i += 1) {

			if (input == this.students[i][0]) {
				System.out.println(this.students[i][1]);
			}
		}
	}

	void showFirst() {

		int max = 0;
		int hak = -1;

		for (int[] i : this.students) {

			if (i[1] > max) {
				max = i[1];
				hak = i[0];
			}
		}
		System.out.printf("1등: %d, %d점\n", hak, max);
	}
}

public class _04메서드연습문제1 {

	public static void main(String[] args) {

		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];
		Score s = new Score();

//문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장
//예 1)  87 11 92 14 47
		s.createScores(hakbuns, scores);
//문제2) 전교생의 총점과 평균 출력
//예 2) 총점(251) 평균(50.2)
		s.showTotAndAver();
//문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
//예 3) 2명
		s.showPassed();
//문제4) 인덱스를 입력받아 성적 출력
//정답4) 인덱스 입력 : 1 성적  : 11점
		s.scoreByIdx();
//문제5) 성적을 입력받아 인덱스 출력
//정답5) 성적 입력 : 11 인덱스 : 1
		s.idxByScore();
//문제6) 학번을 입력받아 성적 출력
//정답6) 학번 입력 : 1003 성적 : 45점
		s.scoreByHak();
//문제7) 1등학생의 학번과 성적 출력
//정답7) 1004번(98점)
		s.showFirst();
		s.sc.close();
	}
}
