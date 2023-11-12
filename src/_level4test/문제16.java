package _level4test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 10; // 최대인원
		String[] idList = new String[max];
		String[] pwList = new String[max];
//		String[] nameList = new String[max];

		int cnt = 0;

		while (true) {
			System.out.println("idList" + Arrays.toString(idList));
			System.out.println("pwList" + Arrays.toString(pwList));
			System.out.println("[1]회원가입"); // 중복 id 체크 // 이름 필수 3글자~10글자 이하 숫자 안됨 , 패스워드(4글자 이상) 연속 같은 4글자 안됨
			System.out.println("[2]회원삭제"); // 회원 id와 비밀번호를 입력하면 회원 삭제 => 삭제시 뒤에 데이터 땡기기
			System.out.println("[3]회원수정"); // 회원 이름 검색해서 회원 수정은 비밀번호 수정
			System.out.println("[4]회원출력"); // 회원 id를 검색해서 해당 회원 정보 출력
			System.out.println("[0]종료 ");

			int menu = sc.nextInt();

			if (menu == 0) {
				break;
			} else if (menu == 1) {

				while (true) {
					System.out.println();
					System.out.println("(1) id는 숫자를 포함할 수 없습니다.");
					System.out.println("(2) 4자 이상 10글자 이하.");
					System.out.println("(3) 연속으로 4글자가 같으면 안됩니다.");
					System.out.println("가입할 id를 입력하세요. >> ");

					// 버퍼 초기화를 어떻게 해야하나ㅣ?
					String id = sc.next();
					sc.nextLine();

					// 이름 필수 4글자 이상 ~ 10글자 이하
					if (id.length() <= 3 || id.length() >= 11) {
						System.err.println("id는 4글자 이상 ~ 10글자 이하 이어야합니다.");
						continue;
					}

					// 숫자 안됨
					String numbers = "1234567890";
					boolean hasNum = false;

					for (int i = 0; i < id.length(); i += 1) {

						if (hasNum) {
							break;
						}

						for (int j = 0; j < numbers.length(); j += 1) {

							if (hasNum) {
								break;
							}

							if (id.subSequence(i, i + 1).equals(numbers.substring(j, j + 1))) {
								hasNum = true;
								break;
							}
						}
					}

					if (hasNum) {
						System.err.println("id는 숫자를 포함할 수 없습니다.");
						continue;
					}

					// 연속 같은 4글자 안됨
					int cntFour = 0;
					boolean four = false;

					for (int i = 1; i < id.length(); i += 1) {

						if (id.subSequence(i, i + 1).equals(id.substring(i - 1, i))) {
							cntFour += 1;
						}

						if (cntFour == 3) {
							four = true;
							break;
						}
					}

					if (four) {
						System.err.println("연속으로 4글자가 같으면 안됩니다.");
						continue;
					}

					// 중복 id 체크
					boolean idDuplicated = false;

					for (int i = 0; i < idList.length; i += 1) {

						if (id.equals(idList[i])) {
							System.err.println(idList[i] + " 는 이미 사용중인 아이디입니다!");
							idDuplicated = true;
						}
					}

					if (idDuplicated) {
						continue;
					}

					// 패스워드(4글자 이상)
					String pw;

					while (true) {
						System.out.print("pw를 정하세요. (4글자 이상) >> ");
						pw = sc.next();
						sc.nextLine();

						if (pw.length() < 4) {
							System.err.println("pw는 4글자 이상이어야합니다.");
							continue;
						}
						break;
					}

					idList[cnt] = id;
					pwList[cnt] = pw;
					cnt += 1;
					break;
				}
			} else if (menu == 2) {

				// 회원 id와 비밀번호를 입력하면 회원 삭제 => 삭제시 뒤에 데이터 땡기기
				System.out.print("삭제할 id를 입력하세요 >> ");
				String del = sc.next();
				sc.nextLine();

				int idx = -1;

				for (int i = 0; i < cnt; i += 1) {

					if (idList[i].equals(del)) {
						idx = i;
						break;
					}
				}

				if (idx != -1) {
					System.out.print("pw를 입력하세요. >> ");
					String delPw = sc.next();
					sc.nextLine();

					if (delPw.equals(pwList[idx])) {

						for (int i = idx; i < cnt; i += 1) {
							idList[i] = idList[i + 1];
							pwList[i] = pwList[i + 1];
						}
						cnt -= 1;
						System.err.println("삭제되었습니다!");
					} else {
						System.err.println("비밀번호를 확인하세요.");
					}
				} else {
					System.err.println("존재하지않는 id입니다.");
				}
			} else if (menu == 3) {

				// 회원 이름 검색해서 회원 수정은 비밀번호 수정
				System.out.print("pw를 수정할 id를 입력하세요 >> ");
				String adjust = sc.next();
				sc.nextLine();

				int idx = -1;

				for (int i = 0; i < cnt; i += 1) {

					if (idList[i].equals(adjust)) {
						idx = i;
						break;
					}
				}

				if (idx != -1) {
					System.out.print("pw를 확인합니다. >> ");
					String check = sc.next();
					sc.nextLine();

					if (check.equals(pwList[idx])) {
						System.out.print("수정할 pw를 입력하세요. (4글자 이상) >> ");
						String modify = sc.next();
						sc.nextLine();

						if (modify.length() < 4) {
							System.out.println("pw는 4글자 이상이어야합니다.");
							continue;
						}
						pwList[idx] = modify;
						System.err.println("수정되었습니다!");
					} else {
						System.err.println("비밀번호를 확인하세요.");
					}
				} else {
					System.err.println("존재하지않는 id입니다.");
				}
			} else if (menu == 4) {

				// 회원 출력
				for (int i = 0; i < cnt; i += 1) {
					System.out.print(idList[i] + " ");
				}
			}
		}
		sc.close();
	}
}
