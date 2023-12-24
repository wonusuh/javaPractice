package SchoolVer2_서원우;

import java.util.ArrayList;

public class StudentDAO {

	public ArrayList<Student> stuList;
	private int hakbun = 1001;
	private Utils ut;

	public StudentDAO() { // 기본생성자
		stuList = new ArrayList<Student>();
		ut = new Utils();
	}

	public void putDataIn(String data) { // 로드해온 데이터를 stuList에 넣습니다.

		String[] datas = data.split("\n");

		for (int i = 0; i < datas.length; i += 1) {

			String[] splitted = datas[i].split("/");
			Student temp = new Student();

			temp.setStuNo(Integer.parseInt(splitted[0]));
			hakbun = temp.getStuNo() + 1;
			temp.setStuName(splitted[1]);
			temp.setStuId(splitted[2]);
			stuList.add(temp);
		}
	}

	private int findStuNumById(String id) { // id로 검색해서 학생번호를 리턴합니다.

		for (Student s : stuList) {

			if (s.getStuId().equals(id)) {
				System.out.println("아이디가 존재합니다.");
				return s.getStuNo();
			}
		}
		System.out.println("아이디가 존재하지 않습니다.");
		return -1;
	}

	public void addAStudent() { // 학생 한 명을 추가합니다.
		System.out.println("[ 학생 추가 ]");
		System.out.println("등록할 id를 입력하세요. >> ");

		String id = ut.sc.next();

		ut.sc.nextLine();

		int stuNum = findStuNumById(id);

		if (stuNum == -1) {
			System.out.println("등록할 이름을 입력하세요. >> ");

			String name = ut.sc.next();

			ut.sc.nextLine();

			Student temp = new Student();

			temp.setStuNo(hakbun);
			temp.setStuName(name);
			temp.setStuId(id);
			stuList.add(temp);
			System.out.printf("%d  %s  %s\n", temp.getStuNo(), temp.getStuName(), temp.getStuId());
			System.out.println("학생을 추가했습니다.");
		}
	}

	public int deleteAStudent() { // id를 입력받아 학생을 삭제하고 학번을 리턴합니다.
		System.out.println("삭제할 id를 입력하세요. >> ");

		String id = ut.sc.next();

		ut.sc.nextLine();

		int stuNum = findStuNumById(id);

		if (stuNum != -1) {

			for (int i = 0; i < stuList.size(); i += 1) {

				if (stuList.get(i).getStuId().equals(id)) {
					System.out.println(stuList.get(i).getStuNo() + "번 학생을 삭제했습니다.");
					stuList.remove(i);
					return stuNum;
				}
			}
		}
		return -1;
	}

	public int findStuNumByStuNum() { // 학번이 있는지 검색하고 그 학번을 리턴합니다.
		System.out.println("학번을 입력하세요. >> ");

		int num = ut.sc.nextInt();

		for (Student s : stuList) {

			if (s.getStuNo() == num) {
				System.out.println("학번이 존재합니다.");
				return s.getStuNo();
			}
		}
		System.out.println("존재하지 않는 학번입니다.");
		return -1;
	}
}
