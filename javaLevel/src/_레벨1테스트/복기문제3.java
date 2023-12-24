package _레벨1테스트;

import java.util.Random;
import java.util.Scanner;

public class 복기문제3 {
	public static void main(String[] args) {
		/*
		 * [ 문제 3 ] # 가위바위보 게임[2단계] 1. com 랜덤으로 값 0 가위 1 바위 2 보 2. me 입력으로 값 받기 3. 둘이 승리
		 * 비교 출력하기
		 */
		Random rn = new Random();
		int com = rn.nextInt(2 - 0 + 1) + 0;
		System.out.println("com : " + com);
		Scanner sc = new Scanner(System.in);
		System.out.println("0가위 1바위 2보 중에 선텍");
		int me = sc.nextInt();
		boolean error = me < 0 || me > 2;
		if (error) {
			System.out.println("0 가위 1 바위 2 보 중에 하나를 입력하세요");
		} else {
			// com==me => 비겼다
			// 지는경우
			// com2 - me1 = 1
			// com1 - me0 = 1
			// com0 - me2 =-2
			int diff = com - me;
			if (com == me) {
				System.out.println("비겼다");
			} else if (diff == 1 || diff == -2) {
				System.out.println("내가 졌다");
			} else {
				System.out.println("내가 이겼다");
			}
		}
		sc.close();
	}
}
