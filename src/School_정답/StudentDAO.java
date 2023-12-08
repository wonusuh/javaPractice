package School_정답;

public class StudentDAO {
	Util sc;
	Student[] stuList;
	int cnt;
	int maxNo;

	StudentDAO() {
		sc = new Util();
		maxNo = 1001;
	}

	void addStudentsFromData(String data) {
		String[] temp = data.split("\n");
		stuList = new Student[temp.length];
		cnt = stuList.length;

		for (int i = 0; i < cnt; i += 1) {
			String[] info = temp[i].split("/");
			Student stu = new Student(Integer.parseInt(info[0]), info[1], info[2]);
			stuList[i] = stu;
		}

	}

	void insertStudent(Student stu) {
		if (cnt == 0) {
			stuList = new Student[cnt + 1];
		} else {
			Student[] temp = stuList;
			stuList = new Student[cnt + 1];
			int idx = 0;
			for (int i = 0; i < cnt; i += 1) {
				stuList[idx++] = temp[i];
			}
		}
		stuList[cnt] = stu;
		cnt += 1;
	}

	String saveAsFileData() {
		if (cnt == 0)
			return "";
		String data = "";
		for (Student s : stuList) {
			data += s.saveToData();
		}
		return data;
	}

	boolean hasStudentData() {
		if (stuList == null) {
			System.out.println("데이터가 존재하지않습니다");
			return false;
		}
		return true;
	}

	Student getOneStudentById(String id) {
		if (cnt == 0)
			return null;
		for (Student stu : stuList) {
			if (stu.stuId.equals(id)) {
				return stu;
			}
		}
		return null;
	}

	void addOneStudent() {
		String id = sc.getValue("아이디");
		Student s = getOneStudentById(id);
		if (s != null) {
			System.out.println("이미 존재하는 아이디가 있습니다");
			return;
		}
		String name = sc.getValue("이름");

		Student stu = new Student(++maxNo, name, id);
		System.out.println(stu);
		insertStudent(stu);

		System.out.println("학생한명 추가완료");

	}

	void deleteOneStudent(SubjectDAO subDAO) {
		if (!hasStudentData())
			return;
		String id = sc.getValue("아이디");
		Student stu = getOneStudentById(id);
		if (stu == null) {
			System.out.println("존재 하지 않는 아이디");
			return;
		}

		int delIdx = getStudentIdx(stu);
		subDAO.deleteAllSubjectsInOneStudent(stu); // 과목삭제

		removeOneStudent(delIdx); // 학생삭제
		System.out.println(stu.stuName + " 학생 삭제 완료");

	}

	int getStudentIdx(Student stu) {
		if (stu == null)
			return -1;
		for (int i = 0; i < cnt; i += 1) {
			if (stu == stuList[i]) {
				return i;
			}
		}
		return -1;
	}

	void removeOneStudent(int delIdx) {
		if (cnt == 1) {
			stuList = null;
			cnt = 0;
			return;
		}
		Student[] temp = stuList;
		stuList = new Student[cnt - 1];
		int idx = 0;
		for (int i = 0; i < cnt; i += 1) {
			if (i != delIdx) {
				stuList[idx++] = temp[i];
			}
		}

		cnt -= 1;

	}

	void addOneSubjectToOneStudent(SubjectDAO subDAO) {
		if (!hasStudentData())
			return;

		Student stu = findOneStudentByStuNum();
		if (stu == null) {
			System.out.println("해당 학번 학생이 없습니다");
			return;
		}

		subDAO.addOneSubjectToOneStudent(stu);

		System.out.println(stu);
		System.out.println("과목 추가 완료 ");
	}

	void deleteOneSubjectToOneStudent(SubjectDAO subDAO) {
		if (!hasStudentData())
			return;

		Student stu = findOneStudentByStuNum();
		if (stu == null) {
			System.out.println("해당 학번 학생이 없습니다");
			return;
		}

		if (!subDAO.deleteOneSubjectToOneStudent(stu)) {
			return;
		}
		System.out.println(stu);
		System.out.println("과목 삭제 완료 ");

	}

	Student findOneStudentByStuNum() {
		int num = sc.getValue("학번", 1001, maxNo);
		for (Student stu : stuList) {
			if (num == stu.stuNo) {
				return stu;
			}
		}
		return null;
	}

	void updateMaxStuNo() {
		if (cnt == 0)
			return;
		int maxNo = 0;
		for (Student s : stuList) {
			if (maxNo < s.stuNo) {
				maxNo = s.stuNo;
			}
		}
		this.maxNo = maxNo;
	}

	void printAllStudentByScore(SubjectDAO subDAO) {

		Student[] temp = new Student[cnt];
		double[] scores = new double[cnt];
		for (int i = 0; i < cnt; i += 1) {
			temp[i] = stuList[i];
			scores[i] = subDAO.getAvgSubScoreByStudent(temp[i]);
		}

		for (int i = 0; i < cnt; i += 1) {
			double max = scores[i];
			for (int k = i; k < cnt; k += 1) {
				if (max < scores[k]) {
					max = scores[k];
					Student stu = temp[i];
					temp[i] = temp[k];
					temp[k] = stu;

					double score = scores[i];
					scores[i] = scores[k];
					scores[k] = score;
				}
			}
		}

		for (int i = 0; i < cnt; i += 1) {
			System.out.printf("%s 평균 %.2f점 %n", temp[i], scores[i]);
			System.out.println("--------------");
		}

	}

	void printStudentByOneSubject(int[] stuNoList) {

		Student[] temp = new Student[stuNoList.length];

		for (int i = 0; i < temp.length; i += 1) {
			temp[i] = getStudentByStuNo(stuNoList[i]);
		}

		for (int i = 0; i < temp.length; i += 1) {
			String name = temp[i].stuName;
			for (int k = i; k < temp.length; k += 1) {
				if (temp[k].stuName.compareTo(name) < 0) {
					name = temp[k].stuName;
					Student student = temp[k];
					temp[k] = temp[i];
					temp[i] = student;
				}
			}
		}

		for (Student s : temp) {
			System.out.println(s);
		}

	}

	Student getStudentByStuNo(int stuNo) {
		if (cnt == 0)
			return null;
		for (Student s : stuList) {
			if (stuNo == s.stuNo) {
				return s;
			}
		}
		return null;
	}

	void joinSubjectData(SubjectDAO subDAO) {
		if (!hasStudentData())
			return;
		for (Student s : stuList) {
			s.subjects = subDAO.getAllSubjectsFromOneStudent(s);
		}

	}

	void printAllStudent() {
		if (!hasStudentData())
			return;
		for (Student s : stuList) {
			System.out.println(s);
		}
	}

}
