package 파일;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _09파일읽기실습2 {

	public static void main(String[] args) {

		final String CUR_PATH = System.getProperty("user.dir") + "//src//파일//";
		String fileName = "file2.txt";
		String data = "";

		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr)) {

			while (true) {

				int read = fr.read();

				if (read == -1) {
					break;
				}
				data += (char) read;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(data);
	}
}
