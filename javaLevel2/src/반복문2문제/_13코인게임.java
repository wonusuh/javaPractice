package 반복문2문제;

import java.util.Random;
import java.util.Scanner;

public class _13코인게임 {
	public static void main(String[] args) {
//		문제
		// 내 자금 3500
//			1. 0 또는 1의 랜덤 숫자를 저장한다
//			2. 0은 동전의 앞면, 1은 동전의 뒷면이다
//			3. 동전의 앞뒷면을 맞추는 게임다
//			4. 정답을 맞추면 500원 이득을 보고,
//				틀리면 700원 손해를 본다.
//				연속 두 번 정답 맟추면 두 배! 1000원!
//			5. 게임이 끝날 때마다 게임을 계속할지 종료할지 선택한다(1.yes 2.no)
//			6. 게임 종료 후, 남은 자금을 출력하시오
//			7. 남은 돈이 0원이면 자동으로 게임 종료
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int cash = 1000;
		int twice = 0;
		boolean run = true;

		while (run) {
			int coin0or1 = rn.nextInt(1 - 0 + 1) + 0;
			System.out.printf("conin0or1 == %d\n", coin0or1);

			System.out.println("예측하세요 : (0)앞, (1)뒤 >>");
			int choice = sc.nextInt();

			if (choice < 0 || choice > 1) {
				System.out.println("앞뒤 숫자를 다시 입력하세요");
				continue;
			}

			if (choice == coin0or1) {
				twice += 1;
				if (twice == 2) {
					System.out.println("연속 맞춤!");
					cash += 1000;
					twice = 0;
				} else {
					System.out.println("맞춤");
					cash += 500;
				}
			} else {
				System.out.println("틀림");
				cash -= 700;
				twice = 0;
			}
			System.out.println("현재 남은 내 돈 : " + cash);
			if (cash <= 0) {
				System.out.println("파산");
				break;
			}

			// 두 개의 반복문을 나가는 방법
			while (true) {
				System.out.println("계속 하시겠습니까? 1.yes 2.no");
				int yesOrNo = sc.nextInt();

				if (yesOrNo < 1 || yesOrNo > 2) {
					System.out.println("입력 오류 1.yes 2.no");
					continue;
				}

				if (yesOrNo == 2) {
					run = false;
					break;
				}
			}
		}
		System.out.println("게임 종료");
		System.out.println("현재 남은 내 돈 : " + cash);
		sc.close();
	}
}
