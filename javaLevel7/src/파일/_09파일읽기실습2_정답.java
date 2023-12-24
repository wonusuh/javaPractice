package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _09파일읽기실습2_정답 {

	public static void main(String[] args) {

		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;

		final String CUR_PATH = System.getProperty("user.dir") + "//src//파일//";
		String fileName = "file2.txt";

		File file = new File(CUR_PATH + fileName);

		String data = "";
		if (file.exists()) {

			try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr);) {
				while (true) {
					String str = br.readLine();
					if (str == null)
						break;
					data += str + "\n";
				}

			} catch (IOException e) {
				System.out.println("파일 읽기 에러 ");
				e.printStackTrace();
			}

		} else {
			System.out.println("파일이 존재하지 않습니다");
		}

		System.out.println(data);
		if (!data.isEmpty()) {
			String[] temp = data.split("\n");
			ids = new String[temp.length];
			pws = new String[temp.length];
			moneys = new int[temp.length];

			for (int i = 0; i < temp.length; i += 1) {
				String[] info = temp[i].split("/");
				ids[i] = info[0];
				pws[i] = info[1];
				moneys[i] = Integer.parseInt(info[2]);
			}
			for (int i = 0; i < ids.length; i += 1) {
				System.out.printf("%s %s %d %n", ids[i], pws[i], moneys[i]);
			}
		}
	}

}
