package _level2test;

import java.util.Random;
import java.util.Scanner;

public class 문제5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int xd = rn.nextInt(10 - (-10) + 1) + (-10);
		int yd = rn.nextInt(10 - (-10) + 1) + (-10);
		int x = 0;
		int y = 0;
		int fee = 0;
		int earnings = 0;
		int speed = 0;
		int dir = 0;
		boolean run = true;
		while (run) {
			System.out.printf("[목적지] xd == %d, yd == %d\n", xd, yd);
			System.out.printf("[현재위치] x == %d, y == %d\n", x, y);
			System.out.printf("[속력] == %d, [방향] == %d\n", speed, dir);
			System.out.printf("[요금] == %d, [전체수익] == %d\n", fee, earnings);
			System.out.printf("[1. 속력설정][2. 방향설정][3. 이동하기]\n");
			int menu = sc.nextInt();
			if (menu == 1) {
				while (true) {
					System.out.println("설정할 속력을 입력하세요 >>");
					speed = sc.nextInt();
					if (speed < 1 || speed > 3) {
						System.out.println("속력은 (1~3)로 설정할 수 있습니다.");
						continue;
					}
					break;
				}
			} else if (menu == 2) {
				while (true) {
					System.out.println("설정할 방향을 입력하세요. 동(1)서(2)남(3)북(4) >>");
					dir = sc.nextInt();
					if (dir < 1 || dir > 4) {
						System.out.println("방향은 (1~4)로 설정할 수 있습니다.");
						continue;
					}
					break;
				}
			} else if (menu == 3) {
				if (speed == 0) {
					System.out.println("먼저 속력을 설정하세요");
					continue;
				}
				if (dir == 0) {
					System.out.println("먼저 방향을 설정하세요");
					continue;
				}
				if (dir == 1) {
					x += speed;
				} else if (dir == 2) {
					x -= speed;
				} else if (dir == 3) {
					y -= speed;
				} else {
					y += speed;
				}
				fee += speed * 50;
				if (x == xd && y == yd) {
					System.out.println("목적지에 도착! 요금은 : " + fee);
					earnings += fee;
					fee = 0;
					xd = rn.nextInt(10 - (-10) + 1) + (-10);
					yd = rn.nextInt(10 - (-10) + 1) + (-10);
				}
			} else {
				System.out.println("메뉴를 다시 입력하세요(1~3)");
				continue;
			}
		}
		sc.close();
	}
}
