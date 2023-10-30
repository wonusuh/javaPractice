package _level3test;

import java.util.Arrays;
import java.util.Random;

public class 문제6 {
	public static void main(String[] args) {
//		* # 중복숫자 금지[2단계]
//				 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
//				 * 2. 단, 중복되는 숫자는 없어야 한다.
//				 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
//				 * 
//				 * 예)
//				 * 랜덤숫자 : 1
//
//				 * check = {true, false, false, false, false}
//
//				 * arr   = {1, 0, 0, 0, 0}
//
//				 * 랜덤숫자 : 3
//				 * check = {true, false, false, true, false}
//
//				 * arr   = {1, 3, 0, 0, 0}
//
//				 * 랜덤숫자 : 2
//
//				 * check = {true, false, true, true, false}
//
//				 * arr   = {1, 3, 2, 0, 0}
//
//				 * 랜덤숫자 : 2
//
//				 * check = {true, false, true, true, false}
		boolean[] check = new boolean[5];
		int[] arr = new int[5];

		Random rn = new Random();

		for (int i = 0; i < arr.length; i += 1) {

			int num = rn.nextInt(4 - 0 + 1) + 0;

			if (!check[num]) {
				arr[i] = num;
				check[num] = true;
			} else {
				i -= 1;
			}
		}
		System.out.println(Arrays.toString(check));
		System.out.println(Arrays.toString(arr));
	}
}
