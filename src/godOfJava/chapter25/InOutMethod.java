package godOfJava.chapter25;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
//		int choice = scann.nextInt();
		System.out.println(scann.nextInt());
		
		System.out.println("문자열을 입력하세요");
		String s = scann.next();
		System.out.println(s);
	}

}
