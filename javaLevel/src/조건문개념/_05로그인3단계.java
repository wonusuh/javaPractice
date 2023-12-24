package 조건문개념;

import java.util.Scanner;

public class _05로그인3단계 {
	public static void main(String[] args) {
		// 로그인을 중첩 if문으로 다시 표현하시오.
		Scanner sc = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		
		System.out.println("아이디를 입력하세요 : ");
		int id = sc.nextInt();
		System.out.println("비밀번호를 입력하세요 : ");
		int pw = sc.nextInt();

		if (id == dbId) {
			if (pw == dbPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
				System.out.println("비밀번호를 확인하세요");
			}
		} else {
			System.out.println("로그인 실패");
			System.out.println("아이디를 확인하세요");
		}
		sc.close();
	}
}
