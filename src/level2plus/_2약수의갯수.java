package level2plus;

import java.util.Random;

public class _2약수의갯수 {
	public static void main(String[] args) {
//			[문제]
//				10~100사이의 랜덤숫자를 저장하고, 
//				그숫자의 약수의개수를 구한다.
//				약수의개수가 짝수이면 "짝수"를 출력하고,
//				약수의개수가 홀수이면 숫자를 전부 출력한다. 
//			[예시]
//				49 : 1, 7, 49 : 약수의개수가 홀수이므로 숫자를 전부 출력한다.
//				13 : 13, 1 : 13의 경우는 약수의개수가 짝수이므로 숫자를 출력하지말고 "짝수"를 출력한다.
//			[힌트]
//				한번에 해결할수 없다.
		Random rn = new Random();
		int num = rn.nextInt(100 - 10 + 1) + 10;
		System.out.print(num + " : ");

		int i = 1;
		int cnt = 0;
		while (i <= num) {
			if (num % i == 0) {
				cnt += 1;
			}
			i += 1;
		}
		if (cnt % 2 == 0) {
			System.out.print("짝수");
		}

		if (cnt % 2 != 0) {
			int j = 1;
			while (j <= num) {
				if (num % j == 0) {
					System.out.print(j + " ");
				}
				j += 1;
			}
		}
	}
}
