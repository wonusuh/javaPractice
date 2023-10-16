package 조건문개념;

import java.util.Random;

public class _10페이징문제 {
	public static void main(String[] args) {
//		1~200사이의 랜덤숫자를 저장하고 다음과같이 출력하시오

//		랜덤숫자가
//		1~10      사이 값이면, 1
//		11~20    사이 값이면, 11
//		21~30    사이 값이면, 21
//		.....................
//		101~110 사이 값이면, 101

//		[예]
//		5 ==> 1
//		10 ==> 1
//		11 ==> 11
//		20 ==> 11
//		24 ==> 21
//		30 ==> 21
//		104 ==> 101
//		154 ==> 151
		Random rn = new Random();
		int num = rn.nextInt(200 - 1 + 1) + 1;
		System.out.println("num : " + num);
		int ten = num / 10;
		System.out.println("ten : " + ten);
		int one = num % 10;

		// 페이지는 (10의자리수 * 10 + 1) 해서 표시
		int page = (ten * 10) + 1;

		// 1의자리가 0이면 10을 뺀다
		if (one == 0) {
			page -= 10;
		}
		System.out.println("page : " + page);
	}
}
