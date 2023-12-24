package 배열2_문제;

import java.util.Arrays;

public class _02합격순차저장1 {
	public static void main(String[] args) {
//		문제
//			아래 조건을 모두 만족시키시오
//			조건1) 아래 배열의 a와b를 비교해서 둘의 합을 c에 저장하시오
//			조건2) 배열 c의 값 중에서 짝수만 d에 저장하시오
//			조건3) 배열 d에 저장할 때는 앞에서부터 순차적으로 저장하시오
//		정답
//			c = { 23, 74, 47 ,82, 51}
//			d = {74, 82, 0, 0, 0}
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 13, 54, 17, 42, 1 };
		int[] c = new int[5];
		int[] d = new int[5];

		int idx = 0;
		for (int i = 0; i < a.length; i += 1) {
			c[i] += a[i] + b[i];
			if (c[i] % 2 == 0) {
				d[idx] = c[i];
				idx += 1;
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
}
