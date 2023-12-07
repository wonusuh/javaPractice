package School;

public class Student {

	String stuId, name;
	int stuNo;
	Subject[] subjects;

	String getStuId() {
		return stuId;
	}

	void setStuId(String stuId) {
		this.stuId = stuId;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getStuNo() {
		return stuNo;
	}

	void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	Subject[] getSubjects() {
		return subjects;
	}

	void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
}
