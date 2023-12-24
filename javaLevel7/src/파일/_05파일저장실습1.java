package 파일;

import java.io.FileWriter;

public class _05파일저장실습1 {

	public static void main(String[] args) {

		// 김철수/20,이만수/30,이영희/40
		String[] names = { "김철수", "이만수", "이영희" };
		int[] ages = { 20, 30, 40 };

		String path = System.getProperty("user.dir");
		final String CUR_PATH = path + "\\src\\파일\\";

		String fileName = "fileTest01.txt";
		String filePath = CUR_PATH + fileName;

		String data = "";
		for (int i = 0; i < names.length; i += 1) {
			data += names[i] + "/" + ages[i];

			if (i != names.length - 1) {
				data += ",";
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
