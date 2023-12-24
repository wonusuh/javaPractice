package 배열_개념;

import java.util.Arrays;
import java.util.Random;

public class _08중복숫자금지2 {
	public static void main(String[] args) {
//		중복숫자 금지 2단계
//		1. 0~4 사이의 숫자를 arr배열에 저장한다
//		2. 단, 중복되는 숫자는 없어야한다.
//		힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다

//		예)
//		랜덤숫자 : 1 => arr : 값사용 check : 인덱스로 사용
//		check = {false, true, false, false, false}
//		arr = {1, 0, 0, 0, 0}

//		랜덤숫자 : 3
//		check = {false, true, false, true, false}
//		arr = {1, 3, 0, 0, 0}

//		랜덤숫자 : 2 => 
//		check = {false, true, ture, true, false}
//		arr = {1, 3, 2, 0, 0}

//		랜덤숫자 : 2
//		check = {true, false, true, true, false}
		Random rn = new Random();

		boolean[] check = new boolean[5];
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i += 1) {

			arr[i] = rn.nextInt(arr.length); // 0 1 2 3 4

			if (check[arr[i]] == false) {
				check[arr[i]] = true;
				System.out.println("저장 " + arr[i]);
			} else {
				System.out.println("중복 " + arr[i]);
				i -= 1;
			}
			System.out.println(Arrays.toString(check));
			System.out.println(Arrays.toString(arr));
		}
	}
}
