package member;

import java.util.Scanner;

public class MemberDAO {// crud

	Scanner sc;
	Member[] memberList;
	int cnt;

	void init() {

		sc = new Scanner(System.in);
	}

	int isExist(String id) {

		int idx = -1;

		for (int i = 0; i < memberList.length; i += 1) {

			if (id.equals(memberList[i].getId())) {
				idx = i;
				break;
			}
		}
		return idx;
	}

	void join() {// 추가
		init();

		System.out.println("id를 입력하세요. >> ");
		String id = sc.next();
		sc.nextLine();

		if (memberList != null && isExist(id) != -1) {
			System.err.println("이미 사용중인 아이디 입니다.");
			return;
		}

		System.out.println("pw를 입력하세요. >> ");
		String pw = sc.next();
		sc.nextLine();

		System.out.println("name를 입력하세요. >> ");
		String name = sc.next();
		sc.nextLine();

		Member[] copy = memberList;
		memberList = new Member[cnt + 1];

		if (copy != null) {

			for (int i = 0; i < copy.length; i += 1) {// 가변배열
				memberList[i] = copy[i];
			}
		}

		Member m = new Member();

		m.setId(id);
		m.setPw(pw);
		m.setName(name);
		System.out.println("추가성공");
		memberList[cnt++] = m;
	}

	void delete() {// 삭제
		init();

		if (memberList == null) {
			System.err.println("회원이 0명입니다.");
			return;
		}

		System.out.println("삭제할 아이디를 입력하세요. >> ");
		String id = sc.next();
		sc.nextLine();

		if (isExist(id) != -1) {

			for (int i = isExist(id); i < memberList.length - 1; i += 1) {
				memberList[i] = memberList[i + 1];
			}

			Member[] copy = memberList;
			memberList = new Member[cnt - 1];

			for (int i = 0; i < memberList.length; i += 1) {
				memberList[i] = copy[i];
			}
			cnt--;
			System.out.println("삭제 성공");
		} else {
			System.err.println("존재하지 않는 아이디입니다.");
		}
	}

	void modify() {// 수정
		init();

		if (memberList == null) {
			System.err.println("회원이 존재하지 않습니다.");
			return;
		}

		System.out.println("수정은 재 로그인이 필요합니다.");
		System.out.println("id를 입력하세요. >> ");
		String id = sc.next();
		sc.nextLine();

		if (isExist(id) != -1) {
			System.out.println("pw를 입력하세요. >> ");
			String pw = sc.next();
			sc.nextLine();

			System.out.println("name를 입력하세요. >> ");
			String name = sc.next();
			sc.nextLine();

			if (memberList[isExist(id)].getPw().equals(pw) && memberList[isExist(id)].getName().equals(name)) {
				System.out.println("수정할 name을 입력하세요. >> ");
				String modifyTo = sc.next();
				sc.nextLine();

				memberList[isExist(id)].setName(modifyTo);
				System.out.println("수정 완료");
			} else {
				System.out.println("pw와 name을 확인하세요.");
				return;
			}
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
	}

	void showAll() {// 출력

		for (int i = 0; i < memberList.length; i += 1) {

			if (memberList[i] == null) {
				break;
			}
			memberList[i].printInfo();
			System.out.println();
		}
	}
}
