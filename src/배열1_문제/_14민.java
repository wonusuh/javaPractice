package 배열1_문제;

import java.util.Random;

public class _14민 {
	public static void main(String[] args) {
//		문제
//			array에 -100~100사이의 랜덤 숫자를 저장하고,
//			가장 작은 값의 인덱스값을 출력하시오.
		Random rn = new Random();
		int[] array = new int[5];
		int index = 0;
		int min = 0;
		for (int i = 0; i < array.length; i += 1) {
			int num = rn.nextInt(100 - (-100) + 1) + (-100);
			array[i] = num;
			if (i == 0) {
				min = array[0];
			}
			if (num < min) {
				min = num;
				index = i;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("min : " + min);
		System.out.println("index : " + index);
	}
}
