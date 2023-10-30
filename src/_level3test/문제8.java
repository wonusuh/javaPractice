package _level3test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문제8 {
	public static void main(String[] args) {
//				1. arr배열에 1~100 사이의 랜덤값 6개를 저장한다.
//					예) arr = {7, 45, 3, 6, 7, 1}
//				2. 배열의 값을 차례대로 출력한다. 그리고 선택 보기를 출력한다.
//					예)
//						1번 : 7
//						(1)홀 (2) 짝
//						
//						2번 : 45
//						(1)홀 (2) 짝
//						...
//				3. 제시된 문제가 홀수이면 1, 짝수이면 2를 선택한다.
//				4. 6회 반복하고 정답개수를 출력한다.
		int[] arr = new int[6];

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int score = 0;

		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = rn.nextInt(100 - 1 + 1) + 1;
		}

		for (int i = 0; i < arr.length; i += 1) {
			System.out.printf("%d번 : %d\n", i + 1, arr[i]);
			System.out.println("(1)홀 (2)짝");

			int evenOdd = sc.nextInt();

			if (evenOdd < 1 || evenOdd > 2) {
				System.out.println("다시 선택하세요. (1)홀 (2)짝");
				i -= 1;
				continue;
			}

			if (((arr[i] % 2 != 0) && evenOdd == 1) || ((arr[i] % 2 == 0) && evenOdd == 2)) {
				score += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("정답 : " + score + "개");
		sc.close();
	}
}
