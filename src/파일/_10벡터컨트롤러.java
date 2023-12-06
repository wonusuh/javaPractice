package 파일;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class FileEx {

	Scanner sc = new Scanner(System.in);
	String fileName = "vector.txt";
	int[] arr = null;
	int size;
	final String CUR_PATH = System.getProperty("user.dir") + "//src//파일//";

	// 입력 값 문자 입력 예외처리 하기
	void printMenu() {
		System.out.println("[벡터 컨트롤러]");
		System.out.println("[1]추가하기");
		System.out.println("[2]삭제하기(인덱스로)");
		System.out.println("[3]저장하기");
		System.out.println("[4]로드하기");
		System.out.println("[5]종료하기");
		printArr();
		System.out.print("메뉴 선택 : ");
	}

	void printArr() {
		System.out.println("arr : " + Arrays.toString(arr));
	}

	void add() {
		System.out.print("추가할 값을 입력하세요. >> ");

		try {

			int input = sc.nextInt();

			int[] copy = arr;
			arr = new int[++size];

			if (copy != null) {

				for (int i = 0; i < copy.length; i += 1) {
					arr[i] = copy[i];
				}
			}
			arr[arr.length - 1] = input;
		} catch (Exception e) {
			System.err.println("정수를 입력하세요.");
			sc.nextLine();
		}

	}

	void delete() {

		if (arr == null) {
			System.err.println("배열에 값이 없습니다.");
			return;
		}
		printArr();
		System.out.println("삭제할 값의 인덱스를 입력하세요. >> ");

		int idx = sc.nextInt();

		if (idx < 0 || idx > arr.length - 1) {
			System.err.println("존재하지 않는 인덱스 입니다.");
			return;
		}

		for (int i = idx; i < size - 1; i += 1) {
			arr[i] = arr[i + 1];
		}

		int[] copy = arr;
		arr = new int[--size];

		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = copy[i];
		}
	}

	void save() {

		if (arr == null) {
			System.err.println("저장할 배열이 없습니다.");
			return;
		}

		try (FileWriter fr = new FileWriter(CUR_PATH + fileName)) {

			String data = "";

			for (int i = 0; i < arr.length; i += 1) {
				data += arr[i];
			}

			fr.write(data);
			System.out.println("성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void road() {

		File file = new File(CUR_PATH + fileName);

		if (!file.exists()) {
			System.err.println("파일이 존재하지 않습니다.");
			return;
		}

		String data = "";

		try (FileReader fr = new FileReader(CUR_PATH + fileName); BufferedReader br = new BufferedReader(fr)) {

			while (true) {

				int read = fr.read();

				if (read == -1) {
					break;
				}
				data += (char) read;
			}

			arr = new int[data.length()];

			for (int i = 0; i < data.length(); i += 1) {
				arr[i] = Integer.parseInt(data.substring(i, i + 1));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void run() {

		while (true) {
			printMenu();

			try {

				int sel = sc.nextInt();

				if (sel == 1) {
					add();
				} else if (sel == 2) {
					delete();
				} else if (sel == 3) {
					save();
				} else if (sel == 4) {
					road();
				} else if (sel == 5) {
					break;
				}
			} catch (Exception e) {
				System.err.println("정수를 입력하세요.");
				sc.nextLine();
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _10벡터컨트롤러 {

	public static void main(String[] args) {

		FileEx e = new FileEx();

		e.run();
		e.sc.close();
	}
}
