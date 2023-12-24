package 반복문2문제;

import java.util.Random;

public class _19즉석복권1 {
	public static void main(String[] args) {
//		문제
//			1~9사이의 랜덤 값을 4개 출력한다
//			랜덤값이 모두 짝수이면 "당첨"을 출력,
//			하나라도 짝수가 아니면 "꽝"을 출력한다.
//			
//		예시
//			2 2 4 8 : "당첨"
//			6 8 1 4 : "꽝"
		Random rn = new Random();
		int i = 1;
		int cnt = 0;

		while (i <= 4) {
			int num = rn.nextInt(9 - 1 + 1) + 1;
			System.out.print(num + " ");
			if (num % 2 == 0) {
				cnt += 1;
			}
			i += 1;
		}
		if (cnt == 4) {
			System.out.println(" : \"당첨\"");
		} else {
			System.out.println(" : \"꽝\"");
		}
	}
}
