//package 클래스배열_문제;
//
//// data 담고 있는 DTO , VO 
//class Student {
//	int stuNo;
//	String name; // 학생이름
//	Subject[] subjects; // 과목들
//
//	void init(String stuNo, String name) {
//		this.stuNo = Integer.parseInt(stuNo);
//		this.name = name;
//	}
//
//	void printInfo() {
//		System.out.println(getData());
//		System.out.println("-----------------");
//	}
//
//	String getData() {
//		String data = name + "\n";
//		if (subjects == null)
//			return data;
//		for (Subject sub : subjects) {
//			if (sub == null)
//				return data;
//			data += sub.getInfo();
//		}
//		return data;
//	}
//}
//
//class Subject {
//	int stuNo;
//	String name; // 과목이름
//	int score; // 점수
//
//	void init(String stuNo, String name, String score) {
//		this.stuNo = Integer.parseInt(stuNo);
//		this.name = name;
//		this.score = Integer.parseInt(score);
//	}
//
//	String getInfo() {
//		return name + " " + score + "점 \n";
//	}
//}
//
//// 여러 학생관련된 CRUD : create read update delete : 추가 출력 수정 삭제 
//class StudentDAO {
//	int cnt;
//	Student[] stulist;
//
//	void init(String data) {
//		String[] temp = data.split("\n");
//		stulist = new Student[temp.length];
//		cnt = stulist.length;
//
//		for (int i = 0; i < cnt; i += 1) {
//			String[] info = temp[i].split("/");
//			Student stu = new Student();
//			stu.init(info[0], info[1]);
//			stulist[i] = stu;
//		}
//	}
//
//	void printAllStudent() {
//		for (Student stu : stulist) {
//			stu.printInfo();
//		}
//	}
//
//	void updateOneStuSubjects(Student stu, Subject[] list) {
//		stu.subjects = list;
//	}
//
//	void getAllSubjectList(SubjectDAO subDAO) {
//		for (Student stu : stulist) {
//			Subject[] oneStuList = subDAO.getOneStudentSubList(stu.stuNo);
//			updateOneStuSubjects(stu, oneStuList);
//		}
//	}
//
//}
//
//// 여러 과목관련된 CRUD : 
//class SubjectDAO {
//	int cnt;
//	Subject[] sublist;
//
//	void init(String data) {
//		String[] temp = data.split("\n");
//		sublist = new Subject[temp.length];
//		cnt = sublist.length;
//		for (int i = 0; i < cnt; i += 1) {
//			String[] info = temp[i].split("/");
//			sublist[i] = new Subject();
//			sublist[i].init(info[0], info[1], info[2]);
//		}
//	}
//
//	Subject[] getOneStudentSubList(int stuNo) {
//		int size = 0;
//		for (int i = 0; i < cnt; i += 1) {
//			if (sublist[i].stuNo == stuNo) {
//				size += 1;
//			}
//		}
//		Subject[] temp = new Subject[size];
//		int idx = 0;
//		for (int i = 0; i < cnt; i += 1) {
//			if (sublist[i].stuNo == stuNo) {
//				temp[idx++] = sublist[i];
//			}
//		}
//
//		return temp;
//	}
//}
//
//// 전체 데이터를 다루는 곳 :여러 DAO 모이는 곳 => Service 
//class SchoolMng {
//	StudentDAO stuDAO = new StudentDAO();
//	SubjectDAO subDAO = new SubjectDAO();
//
//	void run(String stuData, String subData) {
//		stuDAO.init(stuData);
//		subDAO.init(subData);
//		// joinData(); // 1번째 방법
//		stuDAO.getAllSubjectList(subDAO);
//		stuDAO.printAllStudent();
//		// 학생 리스트랑 과목 리스트를 전부가 접근 가능하다
//		// System.out.println(subDAO.sublist);
//		// System.out.println(stuDAO.stulist);
//	}
//
//	void joinData() {
//		for (Student stu : stuDAO.stulist) {
//			Subject[] oneStuList = subDAO.getOneStudentSubList(stu.stuNo);
//			stuDAO.updateOneStuSubjects(stu, oneStuList);
//		}
//	}
//}
//
//public class _08학생성적관리DAO {
//	public static void main(String[] args) {
//		String stuData = "1001/이만수\n";
//		stuData += "1002/김철만\n";
//		stuData += "1003/오수정\n";
//		String subData = "";
//		subData += "1001/국어/10\n";
//		subData += "1001/수학/32\n";
//		subData += "1002/국어/23\n";
//		subData += "1002/수학/35\n";
//		subData += "1002/영어/46\n";
//		subData += "1003/수학/60\n";
//		subData += "1003/영어/100\n";
//		SchoolMng school = new SchoolMng();
//		school.run(stuData, subData);
//
//	}
//}
