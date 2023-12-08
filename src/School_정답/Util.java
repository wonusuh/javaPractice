package School_정답;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Util {

	final String CUR_PATH = System.getProperty("user.dir") + "\\src\\School\\";
	Scanner sc = new Scanner(System.in);

	int getValue(String msg, int start, int end) {
		while (true) {
			System.out.printf("▶ %s[%d-%d] 입력:", msg, start, end);
			try {
				int num = sc.nextInt();
				sc.nextLine();
				if (num < start || num > end) {
					System.out.printf("%d - %d 사이값 입력해주세요 %n", start, end);
					continue;
				}
				return num;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("숫자값을 입력하세요");
			}
		}
	}

	String getValue(String msg) {
		System.out.printf("▶ %s 입력:", msg);
		return sc.next();
	}

	void closeScanner() {
		sc.close();
	}

	void fileInit(String fileName) {
		File file = new File(CUR_PATH + fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일 생성 실패");
				e.printStackTrace();
			}
		}
	}

	String loadData(String fileName) {

		String data = "";
		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr)) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				data += line + "\n";
			}
			data = data.substring(0, data.length() - 1);
			//System.out.println(fileName + " 로드 완료");

		} catch (IOException e) {
			System.out.println(fileName + " 로드 실패");
			e.printStackTrace();
		}
		return data;
	}

	void laodFromFile(StudentDAO stuDAO, SubjectDAO subDAO) {
		String subData = loadData("subject.txt");
		String stuData = loadData("student.txt");
		
		stuDAO.addStudentsFromData(stuData); // 학생들객체 stuList
		subDAO.addSubjectsFromData(subData); // 과목들객체 subList
		stuDAO.joinSubjectData(subDAO); // 합치지 
		stuDAO.updateMaxStuNo();
		
	}
	
	void saveToFile(StudentDAO stuDAO, SubjectDAO subDAO) {
		String stuData = stuDAO.saveAsFileData();
		String subData = subDAO.saveAsFileData();
		saveData("student.txt", stuData);
		saveData("subject.txt",subData);
	}
	
	
	void saveData(String fileName, String data) {
		try(FileWriter fw = new FileWriter(CUR_PATH+fileName)){
			fw.write(data);
			System.out.println(fileName + "저장 성공");
		} catch (IOException e) {
			System.out.println(fileName + "저장 실패");
			e.printStackTrace();
		}
	}
	
	

}