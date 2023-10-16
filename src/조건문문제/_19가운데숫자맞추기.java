package 조건문문제;

import java.util.Random;
import java.util.Scanner;

public class _19가운데숫자맞추기 {
	public static void main(String[] args) {
		// 가운데 숫자 맞추기 게임
//		1. 150~250 사이의 랜덤숫자 저장
//		2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
//		예) 가운데 숫자를 입력하세요
//		249 : 4 => 정답, 5 오답
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		System.out.println("===가운데 숫자 맞추기 게임===");
		System.out.println("150 ~ 250 사이의 정수를 입력하세요.");
		int rnNum = rn.nextInt(250 - 150 + 1) + 150;
		System.out.println("rnNum : " + rnNum);
		int input = sc.nextInt();
		System.out.println("input : " + input);

		if (input == rnNum % 100 / 10) {
			System.out.println("정답");
		} else if (input < 0 || input > 9) {
			System.out.println("입력값 오류 0~9");
		} else {
			System.out.println("오답");
		}
		sc.close();
	}
}
