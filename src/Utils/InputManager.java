package Utils;

import java.util.Scanner;

public class InputManager {
	private static final InputManager INSTANCE = new InputManager();
	public Scanner sc;

	private InputManager() { // 싱글턴패턴의 생성자입니다.
		sc = new Scanner(System.in);
	}

	public static InputManager getInstance() { // 단 하나의 인스턴스만 존재하며, 그 인스턴스를 리턴합니다.
		return INSTANCE;
	}

	public int getValue(int start, int end) { // 입력값을 예외처리합니다.
		while (true) {
			try {
				System.out.printf("(%d ~ %d) 숫자를 선택하세요. >> ", start, end);
				int input = sc.nextInt();
				if (input == 100)
					return input;
				if (input < start || input > end)
					throw new Exception();
				return input;
			} catch (Exception e) {
				System.out.printf("(%d ~ %d)의 정수만 입력하세요.\n", start, end);
				sc.nextLine();
			}
		}
	}
}
