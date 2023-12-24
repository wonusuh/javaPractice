package 문자열기본;

import java.util.Scanner;

public class _03문자열비교 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name1 = "서원우";
		System.out.println(name1 + "입력 >> ");
		String copyName = sc.next();

		System.out.println(name1.equals(copyName));

		sc.close();
	}
}
