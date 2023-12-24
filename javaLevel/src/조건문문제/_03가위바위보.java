package 조건문문제;

import java.util.Scanner;

public class _03가위바위보 {
	public static void main(String[] args) {
		// 가위0 바위1 보2
		// com 은 바위1 만 낼 수 있다.
		// me 0~2 사이의 숫자를 입력받는다.
		// 비겼다. 내가 이겼다. 내가 졌다. 출력
		int com = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 중에 하나를 입력하세요 : ");
		int me = sc.nextInt();
		boolean check = me < 0 || me > 2;
		if (check) {
			System.out.println("0 ~ 2 사이의 정수를 입력하세요.");
		}
		if (!check && me > com) {
			System.out.println("내가 이겼다.");
		}
		if (!check && me == com) {
			System.out.println("비겼다.");
		}
		if (!check && me < com) {
			System.out.println("내가 졌다.");
		}
		sc.close();
	}
}
