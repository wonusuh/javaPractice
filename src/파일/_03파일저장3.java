package 파일;

import java.io.File;
import java.io.IOException;

public class _03파일저장3 {

	public static void main(String[] args) {

//		Path path = Paths.get("");
//		System.out.println(path.toAbsolutePath());
//
//		final String CUR_PATH = path.toAbsolutePath() + "\\src\\파일\\";

		String path = System.getProperty("user.dir");
		String fileName = "file1.txt";
		final String CUR_PATH = path + "\\src\\파일\\";
		String filePath = CUR_PATH + fileName;
		System.out.println(filePath);

		File file1 = new File(filePath);

		System.out.println(file1.exists());

		try {
			boolean result = file1.createNewFile();
			System.out.println(result ? "파일 생성함" : "파일 이미있음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
