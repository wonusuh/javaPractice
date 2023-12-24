package _level3test;

import java.util.Arrays;
import java.util.Random;

public class 문제14 {
	public static void main(String[] args) {
//				1. 컴퓨터 랜덤하게 최대값을 고르게 한다.
//				2. 정답이면 해당 값을 0으로 변경한다.
//				3. 단, 이미 0으로 변경된 위치는 다시 랜덤하게 고르지 못하게 막는다.
//				4. arr배열의 모든 값이 0으로 변경되면, 프로그램은 종료된다.
//				
//				예)
//					랜덤 : 3
//					11, 87, 42, 0, 24
//					
//					랜덤 : 3
//					이미 선택 완료된 위치입니다.
//					
//					랜덤 : 0
//					11, 87, 42, 0, 24
//					(최대값이 아니므로 아무일안생김)
		int[] arr = { 11, 87, 42, 100, 24 };

		Random rn = new Random();

		int cnt = 0;
		int maxIdx = -1;

		while (true) {

			// 최대값 판별
			int max = 0;
			for (int i = 0; i < arr.length; i += 1) {
				if (arr[i] > max) {
					max = arr[i];
					maxIdx = i;
				}
			}

			int num = rn.nextInt(4 - 0 + 1) + 0;
			System.out.println("num" + num);

			if (num == maxIdx) {
				arr[maxIdx] = 0;
				cnt += 1;
				System.out.println(Arrays.toString(arr));
			}

			if (cnt == 5) {
				System.out.println("종료합니다");
				break;
			}

		}
	}
}
