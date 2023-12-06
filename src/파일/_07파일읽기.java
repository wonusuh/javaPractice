package 파일;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _07파일읽기 {

	public static void main(String[] args) {

		final String CUR_PATH = System.getProperty("user.dir") + "//src//파일//";
		String fileName = "fileTest01.txt";

		try (FileReader fr = new FileReader(CUR_PATH + fileName)) {

			BufferedReader br = new BufferedReader(fr);

			String data = br.readLine();
			System.out.println("파일 읽기 성공" + data);
		} catch (FileNotFoundException e) {// fileReader 객체 생성시 필요한 예외
			e.printStackTrace();
			System.out.println("파일이 존재하지않습니다.");
		} catch (IOException e) {// fileReader 닫을 때 필요한 예외
			e.printStackTrace();
			System.out.println("파일리더, 버퍼이더 닫기 실패");
		}

	}
}
