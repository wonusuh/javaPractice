package _레벨1테스트;

import java.util.Random;
import java.util.Scanner;

public class 응용6 {
	public static void main(String[] args) {
//		[문제  6]
//				1. 0 또는 1의 랜덤 숫자를 저장한다.
//				2. 0은 동전 앞면, 1은 동전의 뒷면이다.
//				3. 동전의 앞뒷면을 맞추는 게임이다. 
//		                              사용자에게 0.앞면 1.뒷면 입력 받아서 정답, 오답 출력

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("동전의 앞면(0), 뒷면(1) 중에 하나를 예측하세요 =>");
		int predict = sc.nextInt();
		int coin = rn.nextInt(1 - 0 + 1) + 0;

		boolean error = predict < 0 || predict > 1;
		if (error) {
			System.out.println("둘 중 하나의 수만 입력하세요. 앞면(0), 뒷면(1)");
		} else {
			System.out.println("내 예측 : " + predict);
			System.out.println("동전 : " + coin);
			if (predict == coin) {
				System.out.println("정답");
			} else {
				System.out.println("오답");
			}
		}
		sc.close();
	}
}
