package School_정답;

import java.util.Random;

public class SubjectDAO {
	Subject[] subList;
	Util sc;
	int cnt;

	SubjectDAO() {
		sc = new Util();
	}

	void addSubject(Subject sub) {

		if (cnt == 0) {
			subList = new Subject[1];
		} else {
			Subject[] temp = subList;
			subList = new Subject[cnt + 1];
			int idx = 0;
			for (int i = 0; i < cnt; i += 1) {
				subList[idx++] = temp[i];
			}
		}
		subList[cnt] = sub;
		cnt += 1;

	}

	void addSubjectsFromData(String data) {
		String[] temp = data.split("\n");
		subList = new Subject[temp.length];
		cnt = temp.length;

		for (int i = 0; i < cnt; i += 1) {
			String[] info = temp[i].split("/");
			Subject s = new Subject(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]));
			subList[i] = s;
		}
	}

	void deleteAllSubjectsInOneStudent(Student stu) {
		if (stu.subjects == null)
			return;
		for (int i = 0; i < cnt; i += 1) {
			if (stu.stuNo == subList[i].stuNo) {
				deleteSubject(i);
			}
		}
	}

	void addOneSubjectToOneStudent(Student stu) {

		Random rd = new Random();

		String name = sc.getValue(" 추가 과목");
		Subject subject = findSubNameByStudent(stu, name);
		if (subject != null) {
			System.out.println("해당 과목이 존재하지않습니다");
			return;
		}
		Subject sub = new Subject(stu.stuNo, name, rd.nextInt(51) + 50);

		addSubject(sub);

		stu.subjects = getAllSubjectsFromOneStudent(stu);

	}

	boolean deleteOneSubjectToOneStudent(Student stu) {
		if (stu.subjects == null) {
			System.out.println("과목 데이터가 없습니다");
			return false;
		}
		String name = sc.getValue("삭제 과목");
		Subject sub = findSubNameByStudent(stu, name);
		if (sub == null) {
			System.out.println("해당 과목이 존재하지않습니다");
			return false;
		}
		deleteSubject(getSubIdxBySubject(sub));
		stu.subjects = getAllSubjectsFromOneStudent(stu);
		return true;
	}

	int getSubIdxBySubject(Subject sub) {
		for (int i = 0; i < cnt; i += 1) {
			if (sub == subList[i]) {
				return i;
			}
		}
		return -1;
	}

	void getStuListByOneSubject(StudentDAO stuDAO) {

		String name = sc.getValue("찾을 과목 이름");
		int cnt = 0;
		for (Subject sub : subList) {
			if (sub.subName.equals(name)) {
				cnt += 1;
			}
		}
		if (cnt == 0) {
			System.out.println("해당 과목은 학생 데이터가 없습니다");
			return;
		}

		int[] stuList = new int[cnt];
		int idx = 0;
		for (Subject sub : subList) {
			if (sub.subName.equals(name)) {
				stuList[idx++] = sub.stuNo;
			}
		}

		stuDAO.printStudentByOneSubject(stuList);

	}

	double getAvgSubScoreByStudent(Student stu) {
		double score = 0;
		if (stu.subjects == null)
			return 0;
		for (Subject sub : stu.subjects) {
			score += sub.score;
		}

		return score * 1.0 / stu.subjects.length;
	}

	Subject findSubNameByStudent(Student stu, String name) {
		if (stu.subjects == null)
			return null;
		for (Subject s : stu.subjects) {
			if (name.equals(s.subName)) {
				return s;
			}
		}
		return null;
	}

	void deleteSubject(int delIdx) {
		if (cnt == 1) {
			subList = null;
			cnt = 0;
			return;
		}

		Subject[] temp = subList;
		subList = new Subject[cnt - 1];
		int idx = 0;
		for (int i = 0; i < cnt; i += 1) {
			if (delIdx != i) {
				subList[idx++] = temp[i];
			}
		}
		cnt -= 1;

	}

	Subject[] getAllSubjectsFromOneStudent(Student stu) {
		int cnt = 0;
		for (Subject sub : subList) {
			if (stu.stuNo == sub.stuNo) {
				cnt += 1;
			}
		}

		if (cnt == 0)
			return null;
		Subject[] list = new Subject[cnt];

		int idx = 0;
		for (Subject sub : subList) {
			if (stu.stuNo == sub.stuNo) {
				list[idx++] = sub;
			}
		}
		return list;
	}

	String saveAsFileData() {
		if (cnt == 0)
			return "";
		String data = "";
		for (Subject sub : subList) {
			data += sub.saveToData();
		}
		return data;
	}

}
