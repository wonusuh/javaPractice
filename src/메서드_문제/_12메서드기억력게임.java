package 메서드_문제;

import java.util.Random;
import java.util.Scanner;

class MemoryGame {
	Scanner sc = new Scanner(System.in);
	Random rn = new Random();
	String[] front, back;
	final int SIZE = 10;// 배열 크기
	int cnt, temp1 = -1, temp2 = -1;// 정답 맞춘 횟수
	boolean[] check = new boolean[SIZE];

	void makeFrontBack() {
		this.front = new String[10];
		this.back = new String[10];
		String a = "★";
		String b = "●";
		String c = "◆";
		String d = "■";
		String e = "▲";
		for (int i = 0; i < this.front.length; i += 2) {
			if (i == 0) {
				front[i] = a;
				front[i + 1] = a;
				back[i] = a;
				back[i + 1] = a;
			} else if (i == 2) {
				front[i] = b;
				front[i + 1] = b;
				back[i] = b;
				back[i + 1] = b;
			} else if (i == 4) {
				front[i] = c;
				front[i + 1] = c;
				back[i] = c;
				back[i + 1] = c;
			} else if (i == 6) {
				front[i] = d;
				front[i + 1] = d;
				back[i] = d;
				back[i + 1] = d;
			} else if (i == 8) {
				front[i] = e;
				front[i + 1] = e;
				back[i] = e;
				back[i + 1] = e;
			} else if (i == 2) {
				front[i] = b;
				front[i + 1] = b;
			}
		}
	}

	void shuffle() {
		for (int i = 0; i < 100; i += 1) {
			int num = this.rn.nextInt(9 - 0 + 1) + 0;
			String tempF = this.front[0];
			String tempB = this.back[0];
			this.front[0] = this.front[num];
			this.back[0] = this.back[num];
			this.front[num] = tempF;
			this.back[num] = tempB;
		}
	}

	void displayFront() {
		for (String s : front) {// 프론트 출력
			System.out.print(s + "    ");
		}
		System.out.println();
	}

	void display() {
		int cnt = 1;
		for (int i = 0; i < 10; i += 1) {// 인덱스 출력
			System.out.print(cnt++ + "    ");
		}
		System.out.println();
		for (int i = 0; i < check.length; i += 1) {// 백 출력
			if (!check[i]) {
				System.out.print("[]   ");
			} else {
				System.out.print(back[i] + "    ");
			}
		}
		System.out.println();
	}

	boolean alreadyOpened(int one, int two) {
		boolean already = false;
		if (this.check[one] || this.check[two]) {
			already = true;
		}
		return already;
	}

	boolean isItOut(int one, int two) {
		boolean out = false;
		if (one < 0 || one > SIZE - 1 || two < 0 || two > SIZE - 1) {
			out = true;
		}
		return out;
	}

	void answer() {
		System.out.println("(1~10)인덱스1 입력 >> ");
		int idx1 = this.sc.nextInt() - 1;
		System.out.println("(1~10)인덱스2 입력 >> ");
		int idx2 = this.sc.nextInt() - 1;
		if (isItOut(idx1, idx2)) {
			System.err.println("카드번호를 확인하세요.");
			return;
		}
		if (alreadyOpened(idx1, idx2)) {
			System.err.println("이미 오픈된 카드입니다.");
			return;
		}
		if (idx1 == idx2) {
			System.err.println("서로 다른 카드를 입력하세요.");
			return;
		}
		if (this.front[idx1].equals(this.front[idx2])) {
			System.err.println("정답!");
			check[idx1] = true;
			check[idx2] = true;
			this.cnt += 1;
		} else {
			System.err.println("오답!");
			System.out.printf("%d %s, %d %s\n", idx1 + 1, this.front[idx1], idx2 + 1, this.front[idx2]);
			check[idx1] = true;
			check[idx2] = true;
			this.temp1 = idx1;
			this.temp2 = idx2;
		}
	}

	void run() {
		makeFrontBack();
		shuffle();
		displayFront();
		while (true) {
			display();
			if (this.temp1 != -1 && this.temp2 != -1) {
				this.check[this.temp1] = false;
				this.check[this.temp2] = false;
				this.temp1 = -1;
				this.temp2 = -1;
			}
			answer();
			if (this.cnt == 5) {
				System.out.println("게임종료");
				break;
			}
		}
	}
}

public class _12메서드기억력게임 {
	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();
		mg.run();
		mg.sc.close();
	}
}
