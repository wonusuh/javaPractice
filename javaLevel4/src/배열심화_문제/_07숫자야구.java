package 배열심화_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _07숫자야구 {
	public static void main(String[] args) {
//		문제
//			1. me에 1~9 사이의 숫자 3개를 저장한다
//			단, 중복되는 숫자는 저장할 수 없다.
//			2. com과 me를 비교해 정답을 맞출 때까지 반복한다.
//			3. 숫자와 자리가 모두 같으면 strike +=1,
//				숫자가 같고, 자리가 틀리면 ball +=1
//				
//			예) 정답 :1 7 3 : 3 1 5 >>> 2b
//					1 7 3 : 1 5 6 >>> 1s
		int[] com = { 1, 7, 3 };
		int[] me = new int[3];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < me.length; i += 1) {
			System.out.printf("me(1~9) %d번쨰입력 >> \n", i + 1);

			int input = sc.nextInt();

			if (input < 1 || input > 9) {
				System.out.println("다시 입력");
				i -= 1;
				continue;
			}

			boolean duplicated = false;
			for (int k = 0; k < me.length; k += 1) {
				if (input == me[k]) {
					duplicated = true;
					break;
				}
			}

			if (duplicated) {
				System.out.println("값이 중복됐습니다");
				i -= 1;
				continue;
			} else {
				me[i] = input;
			}
		}
		System.out.println("com : " + Arrays.toString(com));
		System.out.println("me : " + Arrays.toString(me));

		int ball = 0;
		int strike = 0;

		for (int i = 0; i < com.length; i += 1) {
			for (int k = 0; k < me.length; k += 1) {
				if (me[k] == com[i]) {
					if (i == k) {
						strike += 1;
					} else {
						ball += 1;
					}
				}
			}
		}

		System.out.println("ball : " + ball);
		System.out.println("strike : " + strike);
		sc.close();
	}
}
