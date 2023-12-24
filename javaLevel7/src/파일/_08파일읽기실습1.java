package 파일;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class _08파일읽기실습1 {

	public static void main(String[] args) {

		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		ids = new String[3];
		pws = new String[3];
		moneys = new int[3];

		final String CUR_PATH = System.getProperty("user.dir") + "//src//파일//";
		String fileName = "file2.txt";
		System.out.println(CUR_PATH + fileName);

		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr);) {

			for (int i = 0; i < ids.length; i += 1) {

				String[] splitted = br.readLine().split("/");
				System.out.println(Arrays.toString(splitted));

				ids[i] = splitted[0];
				pws[i] = splitted[1];
//				System.out.println(splitted[2]);
				moneys[i] = Integer.parseInt(splitted[2]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int j = 0; j < ids.length; j += 1) {
			System.out.printf("%s %s %d\n", ids[j], pws[j], moneys[j]);
		}
	}
}
