package 기초4문제;

import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 1. Id가 틀린 경우, "Id를 확인해주세요"라는 메세지를 출력한다.
 * 2. Pw가 틀린 경우, "Pw를 확인해주세요"라는 메세지를 출력한다.
 * 3. Id와 Pw와 모두 일치하는 경우, "로그인 성공"라는 메세지를 출력한다.
 * 4. id와 pw가 둘다 틀린경우 그리고 둘중 한개라도 틀린경우 로그인 실패 출력
 */
public class _04로그인2단계 {
	public static void main(String[] args) {
		// id를 입력받아 dbId와 일치 할 경우에 pw를 입력할 수 있다.
		// id가 틀린경우 id 확인하세요 출력
		// pw 틀린경우 pw를 확인해주세요 출력
		// 둘 다 일치하면 로그인 성공 출력
		// 둘 다 틀린경우, 둘 중 하나라도 틀린 경우 로그인 실패 출력
		int dbId = 1234;
		int dbPw = 1111;
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요.");
		int id = sc.nextInt();
		if (id == dbId) {
			System.out.println("패스워드를 입력하세요 : ");
			int pw = sc.nextInt();
			if (pw == dbPw) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호를 확인하세요");
			}
		} else {
			System.out.println("아이디를 확인하세요");
		}
		sc.close();
	}
}
