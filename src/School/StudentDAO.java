package School;

import java.util.Arrays;

public class StudentDAO {

	Student[] stuList;
	int stuCnt, hakbun = 1000;
	Util u;

	StudentDAO() {

		u = new Util();
	}

	int getIdxbyId(String id) {

		if (stuList == null) {
			return -1;
		}

		for (int i = 0; i < stuList.length; i += 1) {

			if (id.equals(stuList[i].getStuId())) {
				return i;
			}
		}
		return -1;
	}

	void addAStudent() {
		System.out.println("학생 아이디를 입력하세요. >> ");
		String id = u.sc.next();
		u.sc.nextLine();

		if (getIdxbyId(id) != -1) {
			System.err.println("이미 존재하는 id입니다.");
			return;
		}

		System.out.println("학생 이름 입력하세요.");
		String name = u.sc.next();
		u.sc.nextLine();

		Student s = new Student();

		s.setStuNo(++hakbun);
		s.setStuId(id);
		s.setName(name);

		Student[] copy = stuList;
		stuList = new Student[++stuCnt];

		if (copy != null) {

			for (int i = 0; i < copy.length; i += 1) {
				stuList[i] = copy[i];
			}
		}
		stuList[stuCnt - 1] = s;
		System.out.println("학생 추가 완료.");
		System.out.println("stuList " + Arrays.toString(stuList));
	}

	void printAll() {

		if (stuList == null) {
			System.out.println("학생정보가 없습니다.");
			return;
		}

		for (Student s : stuList) {
			System.out.println("==========================================");
			System.out.printf("학번 %s, 아이디 %s, 이름 %s\n", s.getStuNo(), s.getStuId(), s.getName());

			if (s.getSubjects() == null) {
				continue;
			}

			for (int j = 0; j < s.getSubjects().length; j += 1) {

				System.out.print(s.getSubjects()[j].getSubName() + " ");
				System.out.println(s.getSubjects()[j].getScore());
			}
		}
	}

	int getIdxbyHakbun(int hakbun) {

		for (int i = 0; i < stuList.length; i += 1) {

			if (stuList[i].getStuNo() == hakbun) {
				return i;
			}
		}
		return -1;
	}

	void deleteAStudent(int hakbun) {

		if (stuList == null) {
			System.err.println("삭제할 학생이 없습니다.");
			return;
		}
		System.out.println("삭제할 학생의 학번을 입력하세요. >> ");

		int idx = getIdxbyHakbun(hakbun);

		for (int i = idx; i < stuCnt - 1; i += 1) {
			stuList[i] = stuList[i + 1];
		}

		Student[] copy = stuList;
		stuList = new Student[--stuCnt];

		for (int i = 0; i < stuList.length; i += 1) {
			stuList[i] = copy[i];
		}
		System.out.println("해당 학생을 삭제했습니다.");
		System.out.println(Arrays.toString(stuList));
	}

	void addToAStudent(int hakbun, Subject s) {

		int idx = -1;

		for (int i = 0; i < stuList.length; i += 1) {

			if (hakbun == stuList[i].getStuNo()) {
				idx = i;
				break;
			}
		}

		Subject[] list = stuList[idx].getSubjects();
		Subject[] copy = list;

		if (copy == null) {
			list = new Subject[1];
		} else {
			list = new Subject[copy.length + 1];

			for (int i = 0; i < copy.length; i += 1) {
				list[i] = copy[i];
			}
		}
		list[list.length - 1] = s;
		stuList[idx].setSubjects(list);
	}

	int getIdxByHakbun(int hakbun) {

		for (int i = 0; i < stuList.length; i += 1) {

			if (hakbun == stuList[i].getStuNo()) {
				return i;
			}
		}
		return -1;
	}

	void deleteASubject(int hakbun, String subName) {

		int idx = getIdxByHakbun(hakbun);
		Subject[] list = stuList[idx].getSubjects();
		Subject[] copy = list;
		list = new Subject[copy.length - 1];

		if (copy.length - 1 == 0) {
			stuList[idx].setSubjects(null);
			return;
		}

		int subIdx = -1;
		for (int i = 0; i < copy.length; i += 1) {

			if (subName.equals(copy[i].getSubName())) {
				subIdx = i;
				break;
			}
		}

		for (int i = subIdx; i < copy.length - 1; i += 1) {
			copy[i] = copy[i + 1];
		}

		for (int i = 0; i < list.length; i += 1) {
			list[i] = copy[i];
		}
		stuList[idx].setSubjects(list);
	}

	void printOnesScores(int idx) {

		for (int i = 0; i < stuList[idx].getSubjects().length; i += 1) {
			System.out.printf(
					stuList[idx].getSubjects()[i].getSubName() + " " + stuList[idx].getSubjects()[i].getScore() + " ");
		}
	}

	void showWithName(Subject[] result) {

		for (int i = 0; i < result.length; i += 1) {

			for (int j = 0; j < stuList.length; j += 1) {

				if (result[i].getStuNo() == stuList[j].getStuNo()) {
					System.out.printf("%d %s %s\n", stuList[j].getStuNo(), stuList[j].getName(), stuList[j].getStuId());
					printOnesScores(j);
					System.out.println("=======================================");
					break;
				}
			}
		}
	}
}