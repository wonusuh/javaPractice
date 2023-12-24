package 기초3문제;

import java.util.Scanner;

// 아이디와 비밀번호를 입력받아 로그인 시키시오
public class _08로그인문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int joinId = 1234;
		int joinPw = 4321;
		System.out.print("아이디를 입력하세요 : ");
		int id = scan.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int pw = scan.nextInt();
		boolean verify = id == joinId && pw == joinPw;
		System.out.println("로그인 성공 여부 : " + verify);
		scan.close();
	}
}
