package 반복문2문제;

import java.util.Random;

public class _08자리수출력 {
	public static void main(String[] args) {
//		1~ 99,999 사이의 랜덤숫자를 저장하고
//		자리수가 몇 자리인지 구하시오
//		
//		예)
//			8 : 1자리
//			102 : 3자리
//			88 : 2자리
//			919 : 3자리

		Random rn = new Random();
		int num = rn.nextInt(99999 - 1 + 1) + 1;
		System.out.println("생성된 랜덤숫자 : " + num);

		int cnt = 0;

		while (true) {
			if (num / 10 != 0 && num >= 0) {
				num = num / 10;
				System.out.println("num : " + num);
				cnt += 1;
			} else {
				cnt += 1;
				break;
			}
		}
		System.out.println(cnt + "자리수");
	}
}
