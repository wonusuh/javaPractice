package School;

import java.util.Random;
import java.util.Scanner;

public class Util {

	Scanner sc;
	Random rn;

	Util() {
		sc = new Scanner(System.in);
		rn = new Random();
	}

	// 예외처리 정수만 입력해주세요
	int getIntValue() {

		int val = -1;

		while (true) {

			try {
				val = sc.nextInt();

				if (val != -1) {
					break;
				}
			} catch (Exception e) {
				System.out.println("정수만 입력해주세요.");
				sc.nextLine();
			}
		}
		return val;
	}

	void closeScanner() {
		sc.close();
	}

	// 파일 저장 : 학생 따로 과목 따로 저장

	// 파일 로드
}
