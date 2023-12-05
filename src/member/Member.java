package member;

public class Member { // 데이터 클래스 = > DTO, VO

	String id, pw, name;

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPw() {
		return pw;
	}

	void setPw(String pw) {
		this.pw = pw;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void printInfo() {
		System.out.printf("%s \t %s \t %s %n", id, pw, name);
	}
}
