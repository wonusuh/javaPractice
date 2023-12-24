package _level2test;

import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int br = 0;
		boolean run = true;
		while (run) {
			while (run) {
				System.out.println("p1을 입력하세요(1~3)");
				int p1 = sc.nextInt();

				if (p1 < 1 || p1 > 3) {
					System.out.println("p1 다시 입력하세요 1~3");
					continue;
				}
				br += p1;
				if (br >= 31) {
					System.out.println("p2 승리!!");
					run = false;
					break;
				}
				i += 1;
				System.out.printf("%d턴 : p1(%d) br(%d)\n", i, p1, br);
				break;
			}
			while (run) {
				System.out.println("p2을 입력하세요(1~3)");
				int p2 = sc.nextInt();

				if (p2 < 1 || p2 > 3) {
					System.out.println("p2 다시 입력하세요 1~3");
					continue;
				}
				br += p2;
				if (br >= 31) {
					System.out.println("p1 승리!!");
					run = false;
					break;
				}
				i += 1;
				System.out.printf("%d턴 : p2(%d) br(%d)\n", i, p2, br);
				break;
			}
		}
		sc.close();
	}
}
