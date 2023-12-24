package movie;

import java.util.Scanner;

public class UserDAO {

	Scanner sc;
	User[] userList;

	void init() {

		sc = new Scanner(System.in);
		String userData = "qwer/1234/개똥이,asdf/1111/점박이,abcd/2222/바둑이";
		String[] datas = userData.split(",");
		userList = new User[datas.length];

		for (int i = 0; i < userList.length; i += 1) {

			String[] splitted = datas[i].split("/");
			User u = new User();

			u.setId(splitted[0]);
			u.setPw(splitted[1]);
			u.setName(splitted[2]);
			userList[i] = u;
		}
	}

	String getNamebyId(String id) {

		for (int i = 0; i < userList.length; i += 1) {

			if (id.equals(userList[i].getId())) {
				return userList[i].getName();
			}
		}
		return null;
	}

	int findId(String id) {

		for (int i = 0; i < userList.length; i += 1) {

			if (userList[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	String signIn() {
		System.out.println("[로그인]");
		System.out.println("id를 입력하세요. >> ");

		String id = sc.next();
		sc.nextLine();

		if (findId(id) == -1) {
			System.err.println("아이디를 찾을 수 없습니다.");
			return null;
		} else {
			System.out.println("pw를 입력하세요. >> ");
			String pw = sc.next();
			sc.nextLine();

			if (pw.equals(userList[findId(id)].getPw())) {
				return userList[findId(id)].getId();
			} else {
				System.err.println("pw를 확인하세요.");
				return null;
			}
		}
	}

	void signUp() {
		System.out.println("[회원가입]");
		System.out.println("가입할 id를 입력하세요. >> ");

		String id = sc.next();
		sc.nextLine();

		if (findId(id) != -1) {
			System.err.println("이미 사용중인 아이디 입니다.");
			return;
		} else {

			User[] copy = userList;
			userList = new User[copy.length + 1];

			for (int i = 0; i < copy.length; i += 1) {
				userList[i] = copy[i];
			}

			User u = new User();

			u.setId(id);

			System.out.println("pw를 입력하세요. >> ");
			String pw = sc.next();
			sc.nextLine();
			u.setPw(pw);

			System.out.println("name를 입력하세요. >> ");
			String name = sc.next();
			sc.nextLine();
			u.setName(name);

			userList[userList.length - 1] = u;
		}
	}
}
