package 조건문개념;

import java.util.Random;

public class _09최대값구하기 {
	public static void main(String[] args) {
//		숫자 3개를 랜덤으로 저장한다 (-1000 ~ 1000)사이의 수
//		3개의 랜덤 숫자를 비교한다
//		가장 큰 수를 출력한다.
		Random rn = new Random();
		int first = rn.nextInt(1000 - (-1000) + 1) - 1000;
		System.out.println("first : " + first);
		int second = rn.nextInt(1000 - (-1000) + 1) - 1000;
		System.out.println("second : " + second);
		int third = rn.nextInt(1000 - (-1000) + 1) - 1000;
		System.out.println("third : " + third);

		int max = first;

		// 비교
		if (second > max)
			max = second;
		if (third > max) {
			max = third;
		}

		System.out.println("MAX : " + max);
	}
}
