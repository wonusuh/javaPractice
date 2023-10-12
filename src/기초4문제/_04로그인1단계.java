package 기초4문제;

import java.util.Scanner;

public class _04로그인1단계 {
	public static void main(String[] args) {
		// 아이디 확인해주세요 출력
		// 비밀번호 확인해주세요 출력
		// 둘 다 일치하는경우 로그인성공 출력
		// 둘 다 혹은 둘 중 하나가 틀리면 로그인 실패 출력
		int dbId = 1234;
		int dbPw = 1111;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요 : ");
		int id = sc.nextInt();
		System.out.println("비밀번호를 입력하세요 : ");
		int pw = sc.nextInt();
		boolean pass = dbId == id && dbPw == pw;

		if (pass) {
			System.out.println("로그인 성공");
		}
		if (id != dbId) {
			System.out.println("아이디를 확인하세요");
		}
		if (pw != dbPw) {
			System.out.println("비밀번호를 확인하세요");
		}
		if (!pass) {
			System.out.println("로그인 실패");
		}
		sc.close();
	}
}
