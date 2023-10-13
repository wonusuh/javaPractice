package 기초4개념;

import java.util.Random;
import java.util.Scanner;

public class _06랜덤 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		System.out.println("1-6 사이의 값을 입력하세요");
		int dice1 = rn.nextInt();
		System.out.println("dice1 = " + dice1);

		int dice2 = rn.nextInt(3) + 0;
		System.out.println("dice2 = " + dice2);

		int rnNum = rn.nextInt(10) + 1;
		System.out.println("rnNum = " + rnNum);

		int rnNum2 = rn.nextInt(7) - 3;
		System.out.println("rnNum2 = " + rnNum2);

		// 랜덤 범위 사용 공식 : 갯수 = 끝값 - 시작값 + 1
		// rn.nextInt(갯수) + 시작값;
		// 3 - -3 => 6 + 1 => 7

		// 랜덤값 150 ~ 250 사이를 출력하시오
		int rnNum3 = rn.nextInt(101) + 150;
		System.out.println("rnNum3 = " + rnNum3);

		sc.close();
	}
}
