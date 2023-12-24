package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _23카카오택시 {
	public static void main(String[] args) {
//		카카오 택시
//			1 손님을 태워서 목적지까지 이동하는 게임이다
//			2 -10 ~ 10 사이의 램덤 숫자 2개를 저장해 목적지로 설정한다
//			3. 메뉴는 아래와 같다
//				1) 속도설정 : 1~3까지만 가능
//				2) 방향 설정 : 동(1)서(2)남(3)북(4)
//				3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
//				4) 종료
//			4. 거리 1칸당 50원씩 추가되어 도착시 요금도 출력한다
//			5. 도착하면 다시 -10 ~ 10 사이의 랜덤 목적지가 설정된다
		// 도착하면 전체수입에 요금을 추가한다
		// 속도나 방향이 0이면 이동 불가;
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		int dir = 0; // 방향
		int x = 0; // 출발지점 가로
		int y = 0; // 출발지점 세로
		int dx = 0; // 도착지점 가로
		int dy = 0; // 도착지점 세로
		int speed = 0; // 속도
		int crnCost = 0; // 현재 요금
		int earnings = 0; // 전체수익
		boolean run = true;
		dx = rn.nextInt(10 - -10 + 1) + -10;
		dy = rn.nextInt(10 - -10 + 1) + -10;
		while (run) {
			System.out.printf("[목적지] : x : %d y : %d\n", dx, dy);
			System.out.printf("[현재위치] : x : %d y : %d\n", x, y);
			System.out.printf("[방향] : %d [속도] : %d\n", dir, speed);
			System.out.printf("[현재요금] : %d [전체수익] : %d\n", crnCost, earnings);
			System.out.printf("[1.속도] [2.방향] [3.이동] [0.종료]\n");
			int menu = sc.nextInt();
			if (menu == 1) {
				while (true) {
					System.out.println("속도를 입력하세요 >>");
					speed = sc.nextInt();
					if (speed < 0 || speed > 3) {
						System.out.println("속도는 1~3 이어야합니다");
						continue;
					}
					break;
				}
			} else if (menu == 2) {
				while (true) {
					System.out.println("방향 설정 : 동(1)서(2)남(3)북(4)");
					dir = sc.nextInt();
					if (dir < 1 || dir > 4) {
						System.out.println("방향을 다시 설정하세요 >>");
						continue;
					}
					break;
				}
			} else if (menu == 3) {
				if (speed == 0) {
					System.out.println("속도를 먼저 설정하세요");
					continue;
				}
				if (dir == 0) {
					System.out.println("방향을 먼저 설정하세요");
					continue;
				}
				// 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
				if (dir == 1) {
					x += speed;
				} else if (dir == 2) {
					x -= speed;
				} else if (dir == 3) {
					y -= speed;
				} else {
					y += speed;
				}
				// 한 칸당 50원추가
				crnCost += speed * 50;
				// 도착시 현재요금 출력
				if (x == dx && y == dy) {
					System.out.println("목적지에 도착했습니다. 이용 요금 : " + crnCost + "원");
					earnings += crnCost;
					crnCost = 0;
					dx = rn.nextInt(10 - -10 + 1) + -10;
					dy = rn.nextInt(10 - -10 + 1) + -10;
				}
			} else if (menu == 0) {
				System.out.println("종료합니다. 전체수익 : " + earnings + "원");
				run = false;
			} else {
				System.out.println("메뉴를 다시 입력하세요 >>");
			}
		}
		sc.close();
	}
}
