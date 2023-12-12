package SchoolVer2_서원우;

import java.util.ArrayList;

public class SubjectDAO {

	ArrayList<Subject> subList;
	Utils ut;

	SubjectDAO() { // 기본생성자
		subList = new ArrayList<Subject>();
		ut = new Utils();
	}

	void putDataIn(String data) { // 로드해온 데이터를 subList에 넣습니다.

		String[] datas = data.split("\n");

		for (int i = 0; i < datas.length; i += 1) {

			String[] splitted = datas[i].split("/");
			Subject temp = new Subject();

			temp.setStuNo(Integer.parseInt(splitted[0]));
			temp.setSubName(splitted[1]);
			temp.setScore(Integer.parseInt(splitted[2]));
			subList.add(temp);
		}
	}

	void showAllInfo(ArrayList<Student> stuList) { // 학생들의 모든 정보를 평균의 내림차순으로 정렬

		if (stuList.size() == 0) {
			System.out.println("학생이 존재하지 않습니다.");
			return;
		}

		ArrayList<Student> temp = new ArrayList<Student>();
		for (int i = 0; i < stuList.size(); i += 1) {
			temp.add(stuList.get(i));
		}

		double[] averageArr = new double[stuList.size()]; // 평균을 저장할 임시 배열
		for (int i = 0; i < stuList.size(); i += 1) {

			int total = 0;
			double cnt = 0.0;
			for (Subject sub : subList) {
				if (stuList.get(i).getStuNo() == sub.getStuNo()) {
					total += sub.getScore();
					cnt += 1.0;
				}
			}
			if (total != 0)
				averageArr[i] = total * 1.0 / cnt;
		}

		for (int i = 0; i < temp.size(); i += 1) { // 내림차순으로 정렬합니다.
			double max = 0.0;
			int idx = -1;
			for (int j = i; j < temp.size(); j += 1) {
				if (averageArr[j] >= max) {
					max = averageArr[j];
					idx = j;
				}
			}

			double tempTemp = averageArr[i];
			averageArr[i] = averageArr[idx];
			averageArr[idx] = tempTemp;

			Student tempTempTemp = temp.get(i);
			temp.set(i, temp.get(idx));
			temp.set(idx, tempTempTemp);
		}

		// 출력
		for (int i = 0; i < temp.size(); i += 1) {
			System.out.printf("%d  %s  %s\n", temp.get(i).getStuNo(), temp.get(i).getStuName(), temp.get(i).getStuId());
			for (Subject sub : subList) {
				if (temp.get(i).getStuNo() == sub.getStuNo()) {
					System.out.print(sub.getSubName() + " " + sub.getScore() + " ");
				}
			}
			System.out.println();
			if (averageArr[i] > 0.0) {
				System.out.printf("평균 : %.2f점\n", averageArr[i]);
			} else {
				System.out.println("[ no subject data ]");
			}
			System.out.println("---------------------------------------------------------------");
		}
	}

	void deleteSubjectsByHakbun(int hakbun) { // 학번을 입력받아서 해당하는 학생의 과목을 전부 지웁니다.

		for (int i = 0; i < subList.size(); i += 1) {

			if (subList.get(i).getStuNo() == hakbun) {
				subList.remove(i);
				i -= 1;
				System.out.println("삭제했습니다.");
			}
		}
	}

	void addASubject(int hakbun) { // 해당하는 학번으로 과목을 추가합니다. 과목은 중복될 수 없습니다.
		System.out.println("추가할 과목의 이름을 입력하세요. >> ");

		String subName = ut.sc.next();

		ut.sc.nextLine();

		for (Subject s : subList) {

			if (s.getStuNo() == hakbun && s.getSubName().equals(subName)) {
				System.out.println("이미 기입한 과목입니다.");
				return;
			}
		}

		Subject temp = new Subject();

		temp.setStuNo(hakbun);
		temp.setSubName(subName);
		temp.setScore(ut.rn.nextInt(100 - 50 + 1) + 50);
		subList.add(temp);
		System.out.println("과목을 추가했습니다." + temp.getSubName() + " : " + temp.getScore());
	}

	void showBySubject(ArrayList<Student> stuList) { // 과목이름을 입력받아서 학생들을 사전순으로 정렬합니다.
		System.out.print("과목을 입력하세요. >> ");

		String subName = ut.sc.next();

		ut.sc.nextLine();

		ArrayList<Subject> temp = new ArrayList<Subject>(); // 해당 과목만 배열에 담습니다.

		for (int i = 0; i < subList.size(); i += 1) {

			if (subList.get(i).getSubName().equals(subName))
				temp.add(subList.get(i));
		}

		if (temp.size() == 0) {
			System.out.println("해당 과목의 점수를 가진 학생이 없습니다.");
			return;
		}

		for (int i = 0; i < temp.size(); i += 1) { // 사전순으로 정렬합니다.

			int min = 101, idx = -1;

			for (int j = i; j < temp.size(); j += 1) {

				if (temp.get(j).getScore() < min) {
					min = temp.get(j).getScore();
					idx = j;
				}
			}

			Subject tempTemp = temp.get(i);

			temp.set(i, temp.get(idx));
			temp.set(idx, tempTemp);
		}

		for (Subject sub : temp) { // 결과를 학생정보와 함께 출력합니다.

			for (Student stu : stuList) {

				if (stu.getStuNo() == sub.getStuNo()) {
					System.out.printf("%s %s %d점\n", stu.getStuName(), sub.getSubName(), sub.getScore());
				}
			}
		}
	}
}
