package 반복문2문제;

import java.util.Random;

public class _10가장큰수위치 {
	public static void main(String[] args) {
//		문제
//			반복문을사용하여 랜덤 숫자 1~9를 5번 출력한다
//			1. 랜덤 숫자 중 가장 큰 수의 번호를 출력한다
//				(번호는 출력순서이다)
//			2. 가장 큰 수가 여러 개 있다면 가장 첫 번째 번호를 출력한다.
//			
//		예)
//			3 7 4 7 5
//			가장 큰 수 : 7
//			번호 : 2
//			*가장 큰 수가 2개 이지만 첫 번째 번호를 출력한다.

		Random random = new Random();

		int i = 1;
		int max = 0;
		int location = 0;

		while (i <= 5) {
			int rn = random.nextInt(9 - 1 + 1) + 1;

			if (rn > max) {
				max = rn;
				location = i;
			}
			System.out.printf("i == %d, rn == %d, max == %d\n", i, rn, max);
			i += 1;
		}
		System.out.println("location : " + location);
	}
}
