package SchoolVer3_서원우;

import java.util.ArrayList;

public class SubjectDAO {

	public ArrayList<Subject> subList;
	private Utils ut = Utils.getInstance();

	public SubjectDAO() { // 기본생성자
		subList = new ArrayList<Subject>();
	}

	public void putDataIn(String data) { // 로드해온 데이터를 subList에 넣습니다.

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

	public void showAllInfo(ArrayList<Student> stuList) { // 학생들의 모든 정보를 평균의 내림차순으로 정렬

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

	public void deleteSubjectsByHakbun(int hakbun) { // 학번을 입력받아서 해당하는 학생의 과목을 전부 지웁니다.
		int cnt = 0;
		for (int i = 0; i < subList.size(); i += 1) {

			if (subList.get(i).getStuNo() == hakbun) {
				subList.remove(i);
				i -= 1;
				cnt += 1;
				System.out.println("삭제했습니다.");
			}
		}
		if (cnt == 0) {
			System.out.println("과목이 존재하지 않습니다.");
		}
	}

	public void addASubject(int hakbun, StudentDAO stuDAO) { // 해당하는 학번으로 과목을 추가합니다. 과목은 중복될 수 없습니다.
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
		for (int i = 0; i < stuDAO.stuList.size(); i += 1) {
			if (stuDAO.stuList.get(i).getStuNo() == hakbun) {
				for (int j = 0; j < subList.size(); j += 1) {
					if (subList.get(j).getStuNo() == hakbun) {
						System.out.printf("%s %d ", subList.get(j).getSubName(), subList.get(j).getScore());
					}
				}
				System.out.println();
				break;
			}
		}
	}

	public void showBySubject(ArrayList<Student> stuList) { // 과목이름을 입력받아서 학생들을 사전순으로 정렬합니다.
		System.out.print("과목을 입력하세요. >> ");
		String subName = ut.sc.next();
		ut.sc.nextLine();
		ArrayList<StudentBySubject> result = new ArrayList<StudentBySubject>();
		for (int i = 0; i < stuList.size(); i += 1) {
			for (int j = 0; j < subList.size(); j += 1) {
				if (stuList.get(i).getStuNo() == subList.get(j).getStuNo()
						&& subList.get(j).getSubName().equals(subName)) {
					StudentBySubject s = new StudentBySubject();
					s.setNum(subList.get(j).getStuNo());
					s.setName(stuList.get(i).getStuName());
					s.setScore(subList.get(j).getScore());
					result.add(s);
				}
			}
		}
		for (int i = 0; i < result.size(); i += 1) { // 사전순으로 정렬합니다.
			for (int j = 0; j < result.size() - 1; j += 1) {
				if (result.get(j).getName().compareTo(result.get(j + 1).getName()) > 0) {
					StudentBySubject temp = result.get(j);
					result.set(j, result.get(j + 1));
					result.set(j + 1, temp);
				}
			}
		}
		for (StudentBySubject s : result) { // 결과를 출럭합니다.
			System.out.printf("%d %s %d\n", s.getNum(), s.getName(), s.getScore());
		}
	}

	public void deleteASubjectByHakbun(int hakbun) { // 학번과 과목을 입력받아서 과목을 삭제합니다.
		System.out.println("과목을 입력하세요. >> ");
		String subName = ut.sc.next();
		ut.sc.nextLine();
		boolean check = false;
		for (int i = 0; i < subList.size(); i += 1) {
			if (subList.get(i).getStuNo() == hakbun && subList.get(i).getSubName().equals(subName)) {
				subList.remove(i);
				System.out.println("과목을 삭제했습니다.");
				return;
			}
		}
		if (!check) {
			System.out.println("해당 과목이 존재하지 않습니다.");
		}
	}
}

class StudentBySubject {
	private int num, score;
	private String name;

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}