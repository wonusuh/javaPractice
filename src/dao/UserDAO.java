package dao;

import java.util.ArrayList;

import Utils.InputManager;
import vo.User;

public class UserDAO {
	public ArrayList<User> userList;
	InputManager im;

	public UserDAO() { // 생성자 입니다.
		userList = new ArrayList<User>();
		im = InputManager.getInstance();
	}

	public void putDataIn(String data) { // 받아온 데이터를 배열에 저장합니다.
		String[] datas = data.split("\n");
		for (String str : datas) {
			String[] splitted = str.split("/");
			User u = new User();
			u.setUserId(splitted[0]);
			u.setUserPw(splitted[1]);
			u.setUserName(splitted[2]);
			userList.add(u);
		}
	}

	public void manageUser(CartDAO cartDAO) { // 유저를 관리합니다.
		while (true) {
			System.out.println("-----------------------------------------------------------");
			showAllUsers();
			System.out.println("[1. 유저 삭제하기] [0. 뒤로가기]");
			int sel = im.getValue(0, 1);
			if (sel == 1) { // 1. 유저 삭제하기
				deleteAUser();
			} else if (sel == 0) { // 0. 뒤로가기
				break;
			}
		}
	}

	private void showAllUsers() { // userList의 모든 객체를 출력합니다.
		for (User u : userList) {
			System.out.printf("(id : %s)    (pw : %s)    (name : %s)\n", u.getUserId(), u.getUserPw(), u.getUserName());
		}
	}

	public User findAUserById(String id) { // id와 일치하는 인스턴스의 주소를 리턴합니다.
		for (User u : userList) {
			if (u.getUserId().equals(id)) {
				System.out.println("id가 존재합니다.");
				return u;
			}
		}
		System.out.println("id가 존재하지 않습니다.");
		return null;
	}

	private void deleteAUser() { // id를 입력받아 회원 한 명을 배열에서 삭제합니다.
		System.out.print("삭제할 유저의 id를 입력하세요. >> ");
		String id = im.sc.next();
		im.sc.nextLine();
		if (id.equals("admin")) {
			System.out.println("관리자는 삭제할 수 없습니다.");
			return;
		}
		if (findAUserById(id) != null) {
			System.out.println(id + " 삭제했습니다.");
			userList.remove(findAUserById(id));
		}
	}

	public void signUp() { // id를 입력받아 회원 인스턴스 한 명을 배열에 추가합니다.
		System.out.println("[ 가입하기 ]");
		System.out.print("id를 입력하세요. >> ");
		String id = im.sc.next();
		im.sc.nextLine();
		if (findAUserById(id) != null)
			return;
		System.out.print("pw를 입력하세요. >> ");
		String pw = im.sc.next();
		System.out.print("name를 입력하세요. >> ");
		String name = im.sc.next();
		User temp = new User();
		temp.setUserId(id);
		temp.setUserPw(pw);
		temp.setUserName(name);
		userList.add(temp);
		System.out.println("가입에 성공했습니다.");
	}
}
