package 클래스배열_문제;

class Student { // data 담고 있는 DTO , VO

	int stuNo;
	String name; // 학생이름
	Subject[] subjects; // 과목들

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject[] getSubjects() {
		return subjects;
	}

	public void setSubjects(Subject[] subjects) {
		this.subjects = subjects;
	}
}

class Subject {

	int stuNo;
	String name; // 과목이름
	int score; // 점수

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

class StudentDAO {// 여러 학생관련된 CRUD : create read update delete : 추가 출력 수정 삭제

	Student[] stulist;

	void init(String data) {

		String[] datas = data.split("\n");
		stulist = new Student[datas.length];

		for (int i = 0; i < datas.length; i++) {

			String[] splitted = datas[i].split("/");
			Student s = new Student();

			s.setStuNo(Integer.parseInt(splitted[0]));
			s.setName(splitted[1]);
			stulist[i] = s;
		}
	}
}

class SubjectDAO {// 여러 과목관련된 CRUD :

	Subject[] sublist;

	public Subject[] getSublist() {
		return sublist;
	}

	public void setSublist(Subject[] sublist) {
		this.sublist = sublist;
	}

	void init(String data) {

		String[] datas = data.split("\n");
		sublist = new Subject[datas.length];

		for (int i = 0; i < datas.length; i += 1) {

			String[] splitted = datas[i].split("/");
			Subject s = new Subject();

			s.setStuNo(Integer.parseInt(splitted[0]));
			s.setName(splitted[1]);
			s.setScore(Integer.parseInt(splitted[2]));
			sublist[i] = s;
		}
	}
}

// 전체 데이터를 다루는 곳 :여러 DAO 모이는 곳 => Service 
class SchoolMng {

	StudentDAO stuDAO = new StudentDAO();
	SubjectDAO subDAO = new SubjectDAO();

	void showStus() {

		for (Student s : stuDAO.stulist) {
			System.out.printf("%d %s\n", s.getStuNo(), s.getName());

			for (int j = 0; j < s.getSubjects().length; j += 1) {
				System.out.print(s.getSubjects()[j].name + " ");
				System.out.println(s.getSubjects()[j].score);
			}
			System.out.println("------------------------");
		}
	}

	void setArr() {

		for (Student s : stuDAO.stulist) {

			int size = 0;

			for (int j = 0; j < subDAO.sublist.length; j += 1) {

				if (subDAO.sublist[j].stuNo == s.stuNo) {
					size++;
				}
			}

			Subject[] temp = new Subject[size];

			s.setSubjects(temp);
		}
	}

	void setScore() {

		for (int i = 0; i < stuDAO.stulist.length; i += 1) {

			int cnt = 0;
			Subject[] temp = stuDAO.stulist[i].getSubjects();
			for (int j = 0; j < subDAO.sublist.length; j += 1) {

				if (stuDAO.stulist[i].getStuNo() == subDAO.sublist[j].stuNo) {

					Subject tempTemp = new Subject();

					tempTemp.stuNo = subDAO.sublist[j].getStuNo();
					tempTemp.name = subDAO.sublist[j].getName();
					tempTemp.score = subDAO.sublist[j].getScore();
					temp[cnt++] = tempTemp;
				}
			}
		}
	}

	void run(String stuData, String subData) {
		stuDAO.init(stuData);
		subDAO.init(subData);
		setArr();
		setScore();
		showStus();
	}
}

public class _08_2연습 {

	public static void main(String[] args) {

		String stuData = "1001/이만수\n";
		stuData += "1002/김철만\n";
		stuData += "1003/오수정\n";
		String subData = "";
		subData += "1001/국어/10\n";
		subData += "1001/수학/32\n";
		subData += "1002/국어/23\n";
		subData += "1002/수학/35\n";
		subData += "1002/영어/46\n";
		subData += "1003/수학/60\n";
		subData += "1003/영어/100\n";

		SchoolMng school = new SchoolMng();

		school.run(stuData, subData);
	}
}
