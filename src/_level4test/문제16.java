package _level4test;

import java.util.Scanner;

public class 문제16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 100; // 최대인원
		String[] idList = new String[max];
		String[] pwList = new String[max];
		String[] nameList = new String[max];

		int cnt = 0;

		while (true) {
			System.out.println("[1]회원가입"); // 중복 id 체크 // 이름 필수 3글자~10글자 이하 숫자 안됨 , 패스워드(4글자 이상) 연속 같은 4글자 안됨
			System.out.println("[2]회원삭제"); // 회원 id와 비밀번호를 입력하면 회원 삭제 => 삭제시 뒤에 데이터 땡기기
			System.out.println("[3]회원수정"); // 회원 이름 검색해서 회원 수정은 비밀번호 수정
			System.out.println("[4]회원출력"); // 회원 id를 검색해서 해당 회원 정보 출력
			System.out.println("[0]종료");

			int menu = sc.nextInt();

			if (menu == 0) {
				break;
			} else if (menu == 1) {
				// 중복 id 체크
				// 이름 필수 3글자~10글자 이하
				// 숫자 안됨
				// 패스워드(4글자 이상)
				// 연속 같은 4글자 안됨
			} else if (menu == 2) {
			} else if (menu == 3) {
			} else if (menu == 4) {
			}
		}
		sc.close();
	}
}
