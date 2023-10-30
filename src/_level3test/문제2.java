package _level3test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 문제2 {
	public static void main(String[] args) {
//		* 중복숫자 금지 1단계 
//	     (1. 배열에 1 ~ 4까지 순서대로 넣는다)
//	     (2. 셔플을 해서 랜덤 숫자와 0번 인덱스 값을 100번 섞는다 )	
//
//	     * #  1 to 4
//		 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
//		 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
//		 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
//		 * 예)
//		 * 4 2 3 1
//		 * 입력 : 3
//		 * 4 2 3 9
//		 * 입력 : 1
//		 * 4 9 3 9
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i += 1) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < 100; i += 1) {

			int idx = rn.nextInt(3 - 0 + 1) + 0;
			int temp = arr[0];

			arr[0] = arr[idx];
			arr[idx] = temp;
		}

		int cnt = 1;

		while (true) {
			System.out.println("1 to 4");
			System.out.println(Arrays.toString(arr));
			System.out.print("가장 작은 수의 인덱스는? >> ");

			int idx = sc.nextInt();

			if (idx < 0 || idx > arr.length - 1) {
				System.out.println("인덱스 범위 오류");
				continue;
			}

			if (arr[idx] == cnt) {
				arr[idx] = 9;
				cnt += 1;
			}

			if (cnt > 4) {
				System.out.println(Arrays.toString(arr));
				break;
			}
		}
		sc.close();
	}
}
