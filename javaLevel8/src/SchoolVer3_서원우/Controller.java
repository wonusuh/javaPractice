package SchoolVer3_서원우;

// 무조건 파일 업로드 먼저
public class Controller {

	private Utils ut = Utils.getInstance();
	private StudentDAO stuDAO;
	private SubjectDAO subDAO;

	public Controller() {

		stuDAO = new StudentDAO();
		subDAO = new SubjectDAO();

		String stuData = ut.getData("student.txt");
		String subData = ut.getData("subject.txt");

		stuDAO.putDataIn(stuData);
		subDAO.putDataIn(subData);
	}

	private void mainMenu() {
		System.out.println("[1]학생추가"); // 학번(1001) 자동증가 : 학생id 중복 불가
		System.out.println("[2]학생삭제"); // 학생 id 입력후 삭제 과목도 같이 삭제
		System.out.println("[3]과목추가"); // 학번 입력후 점수 랜덤 50-100 : 과목이름 중복 저장불가능
		System.out.println("[4]과목삭제"); // 학번 입력후 과목삭제
		System.out.println("[5]전체학생목록"); // 점수로 출력
		System.out.println("[6]과목별학생목록"); // 과목이름 입력받아서 해당 과목 학생이름과 과목점수 출력 (오름차순 이름순)
		System.out.println("[7]파일저장");
		System.out.println("[8]파일로드");
		System.out.println("[0]종료");
		System.out.println("선택 >> ");
	}

	public void run() {

		while (true) {
			mainMenu();

			int sel = ut.getInput(0, 8);

			if (sel == 0) { // 종료
				break;
			} else if (sel == 1) { // 학생추가
				stuDAO.addAStudent();
			} else if (sel == 2) { // 학생삭제

				int hakbun = stuDAO.deleteAStudent();

				subDAO.deleteSubjectsByHakbun(hakbun);
			} else if (sel == 3) { // 과목추가

				int hakbun = stuDAO.findStuNumByStuNum();
				if (hakbun != -1)
					subDAO.addASubject(hakbun, stuDAO);
			} else if (sel == 4) { // 과목삭제

				int hakbun = stuDAO.findStuNumByStuNum();
				if (hakbun != -1)
					subDAO.deleteASubjectByHakbun(hakbun);
			} else if (sel == 5) { // 전체학생목록
				subDAO.showAllInfo(stuDAO.stuList);
			} else if (sel == 6) { // 과목별학생목록
				subDAO.showBySubject(stuDAO.stuList);
			} else if (sel == 7) { // 파일저장
				ut.saveStudents("student.txt", stuDAO.stuList);
				ut.saveSubjects("subject.txt", subDAO.subList);
			} else if (sel == 8) { // 파일로드

				String stuData = ut.getData("student.txt");
				String subData = ut.getData("subject.txt");

				stuDAO.putDataIn(stuData);
				subDAO.putDataIn(subData);
			}
		}
		ut.sc.close();
	}
}
