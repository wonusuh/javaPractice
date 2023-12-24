package School;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Controller {

	StudentDAO stuDAO;
	SubjectDAO subDAO;
	Util u;
	final String CUR_PATH = System.getProperty("user.dir") + "//src//School//";
	String stuFileName = "stuList.txt", subFileName = "subList.txt";

	Controller() {

		stuDAO = new StudentDAO();
		subDAO = new SubjectDAO();
		u = new Util();
	}

	void mainMenu() {
		System.out.println("[1]학생추가");// 학번1001부터 자동 증가(id 중복 불가)
		System.out.println("[2]학생삭제");// 학번 입력 후 과목도 같이 삭제
		System.out.println("[3]학생과목추가");// 점수 랜덤 50 ~ 100, 과목이름 중복 저장 불가능
		System.out.println("[4]학생과목삭제");// 학번 입력 후 과목 이름 받아서 해당 과목에서 학생 1명 삭제
		System.out.println("[5]전체학생목록");// 점수로 출력
		System.out.println("[6]과목별학생목록"); // 과목이름 입력받아서 해당 과목 학생이름과 과목점수 출력(오름차순)
		System.out.println("[7]파일저장");
		System.out.println("[8]파일로드");
		System.out.println("[0]종료");
		System.out.print(">> ");
	}

	int findHakbun() {

		int hakbun = u.getIntValue(), idx = stuDAO.getIdxbyHakbun(hakbun);

		if (idx == -1) {
			System.err.println("존재하지 않는 학번입니다.");
			return -1;
		}
		return hakbun;
	}

	void run() {

		while (true) {
			mainMenu();

			int sel = u.getIntValue();

			if (sel == 1) {
				stuDAO.addAStudent();
			} else if (sel == 2) {
				System.out.println("삭제할 학생의 학번을 입력하세요. >> ");

				int hakbun = findHakbun();

				if (hakbun != -1) {
					stuDAO.deleteAStudent(hakbun);
					subDAO.deleteSubjects(hakbun);
				}
			} else if (sel == 3) {

				if (stuDAO.stuList == null) {
					System.out.println("학생배열을 확인하세요.");
					continue;
				}
				System.out.println("과목을 추가할 학생의 학번을 입력하세요. >> ");

				int hakbun = findHakbun();

				if (hakbun != -1) {

					Subject s = subDAO.addASubject(hakbun);

					if (s != null) {
						stuDAO.addToAStudent(hakbun, s);
					}
				}
			} else if (sel == 4) {
				System.out.println("과목을 삭제할 학생의 학번을 입력하세요. >> ");

				int hakbun = findHakbun();

				if (hakbun != -1) {
					System.out.println("삭제할 과목의 이름을 입력하세요. >> ");

					String subName = u.sc.next();
					u.sc.nextLine();

					if (subDAO.isTheSubExist(hakbun, subName)) {
						stuDAO.deleteASubject(hakbun, subName);
//						subDAO.deleteSubjects(hakbun);
					} else {
						System.out.println("과목이 존재하지 않습니다.");
					}
				}
			} else if (sel == 5) {
				System.out.println(Arrays.toString(subDAO.subList));
				stuDAO.printAll();
			} else if (sel == 6) {

				if (subDAO.subList == null) {
					System.err.println("과목 데이터가 null입니다.");
					continue;
				}

				System.out.println("[ 과목별 학생 목록 ]");
				System.out.println("검색할 과목을 입력하세요. >> ");

				String subName = u.sc.next();
				u.sc.nextLine();

				if (subDAO.isTheSubExist(subName)) {

					Subject[] result = subDAO.showStudentsWithTheSubject(subName);

					stuDAO.showWithName(result);

//					// 출력
//					for (Subject s : result) {
//						System.out.printf("%d %s %d\n", s.getStuNo(), s.getSubName(), s.getScore());
//					}
				} else {
					System.out.println("해당 과목이 없습니다.");
				}
			} else if (sel == 7) {

				if (stuDAO.stuList == null || subDAO.subList == null) {
					System.err.println("stuList와 subList가 존재해야합니다.");
					continue;
				}

				// 학생 데이터 만들기
				String stuData = "";

				for (int i = 0; i < stuDAO.stuList.length; i += 1) {
					stuData += stuDAO.stuList[i].getStuNo() + "/" + stuDAO.stuList[i].getName() + "/"
							+ stuDAO.stuList[i].getStuId();

					if (i != stuDAO.stuList.length - 1) {
						stuData += "\n";
					}
				}

				try (FileWriter fr = new FileWriter(CUR_PATH + stuFileName)) {
					fr.write(stuData);
				} catch (IOException e) {
					e.printStackTrace();
				}

				// 점수 데이터 만들기
				String subData = "";

				for (int i = 0; i < subDAO.subList.length; i += 1) {
					subData += subDAO.subList[i].getStuNo() + "/" + subDAO.subList[i].getSubName() + "/"
							+ subDAO.subList[i].getScore();

					if (i != subDAO.subList.length - 1) {
						subData += "\n";
					}
				}

				try (FileWriter fr = new FileWriter(CUR_PATH + subFileName)) {
					fr.write(subData);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (sel == 8) {

				File file = new File(CUR_PATH + stuFileName);

				if (!file.exists()) {
					System.err.println("파일이 존재하지 않습니다.");
					continue;
				}

				try (FileReader fr = new FileReader(CUR_PATH + stuFileName);
						BufferedReader br = new BufferedReader(fr)) {

					while (true) {

						String data = br.readLine();

						if (data == null) {
							break;
						}
						String[] datas = data.split("\n");
						System.out.println(Arrays.toString(datas));
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (sel == 0) {
				u.closeScanner();
				break;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
