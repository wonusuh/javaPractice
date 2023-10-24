package 배열1_문제;

import java.util.Random;

public class _13맥스 {
	public static void main(String[] args) {
//		문제
//			array에 1~100사이의 랜덤 숫자를 저장하고,
//			가장 큰 값의 인덱스값을 출력하시오.
		Random rn = new Random();
		int[] array = new int[5];
		int max = 0;
		int index = -1;
		for (int i = 0; i < array.length; i += 1) {
			int num = rn.nextInt(100 - 1 + 1) + 1;
			array[i] = num;
			if (num > max) {
				max = num;
				index = i;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("max : " + max);
		System.out.println("index : " + index);
	}
}
