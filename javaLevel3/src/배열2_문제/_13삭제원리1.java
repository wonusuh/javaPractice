package 배열2_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _13삭제원리1 {
	public static void main(String[] args) {
//		문제
//			a배열 안에 값을 한 개 입력받는다.
//			b배열 안에 위에서 입력한 값을 제외하고 복사한다
//			단, 없는 값 입력시 예외처리 하시오
//		예)
//			입력 : 30
//			결과 : b = {10,20,40,50,0}
//			
//			입력 : 100
//			결과 : 값을 잘못 입력했습니다.
		Scanner sc = new Scanner(System.in);

		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = new int[a.length];
		int idx = -1;

		System.out.print("삭제할 값을 입력하세요 >> ");
		int del = sc.nextInt();

		// 값이 배열이 있는지 없는지 체크
		for (int i = 0; i < a.length; i += 1) {
			if (a[i] == del) {
				idx = i;
				break;
			}
		}

		if (idx != -1) {
			// a값을 사용자가 입력한 값만 제외하고 b에 저장
			int cnt = 0;

			for (int i = 0; i < b.length; i += 1) {
				if (i != idx) {
					b[cnt] = a[i];
					cnt += 1;
				}
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		sc.close();
	}
}
