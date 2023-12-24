package 문자열기본;

import java.util.Scanner;

public class _02문자열저장 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "서원우";
		System.out.println(name + "입력 >> ");
		String copyName = sc.next();

		System.out.println("name : " + name);
		System.out.println("copyName : " + copyName);
		System.out.println(name == copyName);
		sc.close();
	}
}
