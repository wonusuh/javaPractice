package _11컬렉션Member;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	private final static String CUR_PATH = System.getProperty("user.dir") + "//src//_11컬렉션Member//",
			FILE_NAME = "member.txt";

	static void save() {
		System.out.println("[ 파일로 저장합니다. ]");
		MemberDAO dao = MemberDAO.getInstance();
		if (dao.getMemberList().size() == 0) {
			System.out.println("멤버가 존재하지 않습니다.");
			return;
		}
		ArrayList<Member> list = dao.getMemberList();
		String data = "";
		for (int i = 0; i < list.size(); i += 1) {
			data += list.get(i).getId() + "/" + list.get(i).getPw();
			if (i != list.size() - 1)
				data += "\n";
		}
		try (FileWriter fw = new FileWriter(CUR_PATH + FILE_NAME)) {
			fw.write(data);
			System.out.println(FILE_NAME + " 에 저장했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void load() {
		System.out.println("[ 저장된 파일을 불러옵니다. ]");
		try (FileReader fr = new FileReader(CUR_PATH + FILE_NAME); BufferedReader br = new BufferedReader(fr)) {
			String data = "";
			while (true) {
				String oneLine = br.readLine();
				if (oneLine == null)
					break;
				data += oneLine + "\n";
			}
			data = data.substring(0, data.length() - 1);
			MemberDAO dao = MemberDAO.getInstance();
			dao.putDataIn(data);
			System.out.println(FILE_NAME + " 를 MemberDAO 로 보냈습니다.");
		} catch (FileNotFoundException e) {
			System.out.println(FILE_NAME + " 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
