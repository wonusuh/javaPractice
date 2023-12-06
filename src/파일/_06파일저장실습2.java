package 파일;

import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _06파일저장실습2 {

	public static void main(String[] args) {

		String[] names = { "mom", "megait", "github" };
		String[] pws = { "1111", "2222", "3333" };
		int[] moneys = { 20000, 30000, 40000 };

		String fileName = "file2.txt";
		String data = "";

		// 위 데이터를 아래와같이 저장해보세요
		// mom/1111/20000
		// megait/2222/30000
		// ~
		Path path = Paths.get("");
		System.out.println(path.toAbsolutePath());
		final String CUR_PATH = path.toAbsolutePath() + "\\src\\파일\\";
		String filePath = CUR_PATH + fileName;

		for (int i = 0; i < names.length; i += 1) {
			data += names[i] + "/" + pws[i] + "/" + moneys[i];

			if (i != names.length - 1) {
				data += "\n";
			}
		}

		try (FileWriter fw = new FileWriter(filePath)) {
			fw.write(data);
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
