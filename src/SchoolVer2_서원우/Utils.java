package SchoolVer2_서원우;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utils {

	public Scanner sc;
	private final String CUR_PATH;
	public Random rn;

	// 기본생성자
	public Utils() {
		sc = new Scanner(System.in);
		CUR_PATH = System.getProperty("user.dir") + "//src//School_서원우//";
		rn = new Random();
	}

	public int getInput(int start, int end) { // 메뉴를 선택할 때 입력값의 예외를 처리합니다.

		while (true) {

			try {

				int num = sc.nextInt();

				if (num < start || num > end) {
					System.out.println("0 ~ 8 사이의 정수를 입력하세요");
					continue;
				}

				return num;
			} catch (Exception e) {
				System.out.println("정수만 입력할 수 있습니다.");
				sc.nextLine();
			}
		}
	}

	public String getData(String fileName) { // 파일을 읽어서 String에 저장하고 리턴합니다.

		File f = new File(CUR_PATH + fileName);
		if (!f.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return null;
		}

		String data = "";

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr)) {

			int cnt = 0;

			while (true) {

				String oneLine = br.readLine();

				if (oneLine == null) {
					break;
				}
				System.out.print(++cnt + " ");
				data += oneLine + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		data = data.substring(0, data.length() - 1);
		System.out.println(fileName + " 로드에 성공했습니다.");
		return data;
	}

	public void saveStudents(String fileName, ArrayList<Student> stuList) { // 배열을 받아와서 파일에 저장합니다.

		File f = new File(CUR_PATH + fileName);

		if (!f.exists()) {
			System.out.println(fileName + " 이 존재하지 않습니다");
			return;
		}

		if (stuList.size() == 0) {
			System.out.println("학생목록이 존재하지 않습니다.");
			return;
		}

		String data = "";

		try (FileWriter fw = new FileWriter(CUR_PATH + fileName);) {

			for (int i = 0; i < stuList.size(); i += 1) {
				data += stuList.get(i).getStuNo() + "/" + stuList.get(i).getStuName() + "/" + stuList.get(i).getStuId();

				if (i != stuList.size() - 1)
					data += "\n";
			}
			fw.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveSubjects(String fileName, ArrayList<Subject> subList) { // 배열을 받아와서 파일에 저장합니다.

		File f = new File(CUR_PATH + fileName);

		if (!f.exists()) {
			System.out.println(fileName + " 이 존재하지 않습니다");
			return;
		}

		if (subList.size() == 0) {
			System.out.println("과목목록이 존재하지 않습니다.");
			return;
		}

		String data = "";

		try (FileWriter fw = new FileWriter(CUR_PATH + fileName);) {

			for (int i = 0; i < subList.size(); i += 1) {
				data += subList.get(i).getStuNo() + "/" + subList.get(i).getSubName() + "/" + subList.get(i).getScore();

				if (i != subList.size() - 1)
					data += "\n";
			}
			fw.write(data);
			System.out.println("저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
