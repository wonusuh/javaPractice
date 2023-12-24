package 문자열기본_문제;

import java.util.Random;
import java.util.Scanner;

public class _12타자연습2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		String[] words = { "java", "mysql", "jsp", "spring" };
		boolean[] check = new boolean[words.length];
		int cnt = 0;

		while (true) {

			int num = rn.nextInt(3 - 0 + 1) + 0;
			int star = rn.nextInt(words[num].length());

			if (check[num] == true) {
				continue;
			}

			while (true) {
				System.out.print("문제 : ");

				for (int i = 0; i < words[num].length(); i += 1) {

					if (i != star) {
						System.out.print(words[num].charAt(i));
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
				System.out.print("정답 입력 >> ");

				String answer = sc.nextLine();

				if (answer.equals(words[num])) {
					check[num] = true;
					cnt += 1;
					break;
				}
			}

			if (cnt == 4) {
				System.out.println("모두 맞췄다.");
				break;
			}
		}
		sc.close();
	}
}
