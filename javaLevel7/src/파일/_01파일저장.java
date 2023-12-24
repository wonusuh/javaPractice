package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class _01파일저장 {

	public static void main(String[] args) {

		String fileName = "file01.txt";
		FileWriter fw = null;

		try {

			fw = new FileWriter(fileName);

			fw.write("김철수,10\n이영희,30\n박민수,50");
			System.out.println("파일쓰기 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
