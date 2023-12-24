package School;

import java.util.Arrays;

public class SubjectDAO {

	Subject[] subList;
	Util u;
	int size;

	SubjectDAO() {

		u = new Util();
	}

	boolean isTheSubExist(int hakbun, String subName) {

		if (subList == null) {
			return false;
		}

		for (int i = 0; i < subList.length; i += 1) {

			if (subList[i].getStuNo() == hakbun && subList[i].getSubName().equals(subName)) {
				System.out.println("해당학생의 해당과목이 존재합니다.");
				return true;
			}
		}
		return false;
	}

	Subject addASubject(int hakbun) {
		System.out.println("추가할 과목을 입력하세요. >> ");
		String subName = u.sc.next();
		u.sc.nextLine();

		if (isTheSubExist(hakbun, subName)) {
			return null;
		}

		Subject s = new Subject();

		s.setStuNo(hakbun);
		s.setSubName(subName);
		s.setScore(u.rn.nextInt(100 - 50 + 1) + 50);

		Subject[] copy = subList;
		subList = new Subject[++size];

		if (copy != null) {

			for (int i = 0; i < copy.length; i += 1) {
				subList[i] = copy[i];
			}
		}
		subList[size - 1] = s;
		System.out.println(Arrays.toString(subList));
		System.out.printf("%s %d\n", s.getSubName(), s.getScore());
		System.out.println("과목 추가 성공");
		return s;
	}

	void deleteSubjects(int hakbun) {

		if (subList == null) {
			return;
		}

		for (int i = 0; i < subList.length; i += 1) {

			if (hakbun == subList[i].getStuNo()) {

				for (int j = i; j < subList.length - 1; j += 1) {
					subList[j] = subList[j + 1];
					System.out.println(Arrays.toString(subList));
				}
				size -= 1;
				i -= 1;
			}
		}

		Subject[] copy = subList;
		System.out.println("size " + size);
		subList = new Subject[size];

		for (int i = 0; i < subList.length; i += 1) {
			subList[i] = copy[i];
		}

		// 출력
		for (int i = 0; i < size; i += 1) {
			System.out.printf("%d %s %d\n", subList[i].getStuNo(), subList[i].getSubName(), subList[i].getScore());
		}
	}

	boolean isTheSubExist(String subName) {
		
		for (Subject s : subList) {

			if (s.getSubName().equals(subName)) {
				return true;
			}
		}
		return false;
	}

	Subject[] showStudentsWithTheSubject(String subName) {

		// 해당 과목을 가진 학생수 세기
		int cnt = 0;

		for (int i = 0; i < subList.length; i += 1) {

			if (subName.equals(subList[i].getSubName())) {
				cnt += 1;
			}
		}

		// cnt크기의 배열 만들기
		Subject[] result = new Subject[cnt];

		for (int i = 0; i < result.length; i += 1) {

			if (subName.equals(subList[i].getSubName())) {
				result[i] = subList[i];
				System.out.println(Arrays.toString(result));
			}
		}

		// 정렬하기(오름차순)
		for (int i = 0; i < result.length; i += 1) {

			int min = 101, idx = -1;

			for (int j = i; j < result.length; j += 1) {

				if (result[j].getScore() < min) {
					min = result[j].getScore();
					idx = j;
				}
			}

			Subject temp = result[i];

			result[i] = result[idx];
			result[idx] = temp;
		}
		return result;
	}
}
