package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _23카카오택시_복습 {
	public static void main(String[] args) {
//		카카오 택시
//		1 손님을 태워서 목적지까지 이동하는 게임이다
//		2 -10 ~ 10 사이의 램덤 숫자 2개를 저장해 목적지로 설정한다
//		3. 메뉴는 아래와 같다
//			1) 속도설정 : 1~3까지만 가능
//			2) 방향 설정 : 동(1)서(2)남(3)북(4)
//			3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
//			4) 종료
//		4. 거리 1칸당 50원씩 추가되어 도착시 요금도 출력한다
//		5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다
		// 도착하면 전체수입에 요금을 추가한다
		// 속도나 방향이 0이면 이동 불가;
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int x = 0;
		int y = 0;
		int speed = 0;
		int dir = 0;
		int fee = 0;
		int earnings = 0;
		int xd = rn.nextInt(10 - (-10) + 1) + (-10);
		int yd = rn.nextInt(10 - (-10) + 1) + (-10);
		while (true) {
			System.out.printf("[목적지] xd == %d, yd == %d\n", xd, yd);
			System.out.printf("[현재위치] x == %d, y == %d\n", x, y);
			System.out.printf("[방향] == %d, [속도] == %d\n", dir, speed);
			System.out.printf("[요금] == %d원, [전체수입] == %d원\n", fee, earnings);
			System.out.printf("[1. 속도][2. 방향][3. 이동][0. 종료]\n");
			int menu = sc.nextInt();
			if (menu == 1) {
				while (true) {
					System.out.println("설정할 속도를 입력하세요 : (1 ~ 3) >>");
					speed = sc.nextInt();
					if (speed < 0 || speed > 3) {
						System.out.println("속도는 1 ~ 3 으로만 설정할 수 있습니다.");
						continue;
					}
					break;
				}
			} else if (menu == 2) {
				while (true) {
					System.out.println("동(1) 서(2) 남(3) 북(4) : 설정할 방향을 입력하세요 >>");
					dir = sc.nextInt();
					if (dir < 1 || dir > 4) {
						System.out.println("방향 오류 : 다시 입력하세요 : 동(1)서(2)남(3)북(4)");
					}
					break;
				}
			} else if (menu == 3) {
				if (speed == 0) {
					System.out.println("먼저 속도를 설정하세요");
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
				fee += 50 * speed;
				if (x == xd && y == yd) {
					System.out.println("목적지에 도착했습니다. 요금은 : " + fee);
					earnings += fee;
					fee = 0;
					xd = rn.nextInt(10 - (-10) + 1) + (-10);
					yd = rn.nextInt(10 - (-10) + 1) + (-10);
				}
			} else if (menu == 0) {
				System.out.println("종료합니다. 전체수입 : " + earnings);
				break;
			} else {
				System.out.println("메뉴선택 오류(0 ~ 3)");
				continue;
			}
		}
		sc.close();
	}
}
