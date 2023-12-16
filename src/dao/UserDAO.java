package dao;

import java.util.ArrayList;

import vo.User;

public class UserDAO {
	private ArrayList<User> userList;

	public UserDAO() { // 생성자 입니다.
		userList = new ArrayList<User>();
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
}
