package 파일;

import java.io.FileWriter;
import java.io.IOException;

public class _02파일저장2 {

	public static void main(String[] args) {

		String fileName = "file01.txt";

		try (FileWriter fw = new FileWriter(fileName)) {

			for (int i = 0; i < 10; i += 1) {
				fw.write("안녕\n");
			}
			System.out.println("성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
