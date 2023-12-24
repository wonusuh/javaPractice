package 반복문2문제;

import java.util.Scanner;

public class _06소수찾기 {
	public static void main(String[] args) {
//		문제
//			정수 한 개를 입력받아
//			해당 숫자가 소수인지 아닌지 판별한다
//			소수란, 1과 자기 자신으로만 나눠지는 수를 의미한다.
//			예) 2, 3, 5, 7, 11, 13 ~
//
//		힌트
//			1. 해당 숫자를 1부터 자기자신까지 나눈다.
//			2. 나머지가 0일 때마다 카운트를 센다.
//			3. 그 카운트값이 2이면 소수이다.
//			예)
//				입력 : 6
//				6/1 6/2 6/3 6/4 6/5 6/6
//				=> count : 4 (소수x)
//				
//				입력 : 2
//				2/1 2/2
//				=> count : 2(소수o)

		Scanner sc = new Scanner(System.in);
		System.out.println("소수인지 판별할 정수를 입력하세요");
		int input = sc.nextInt();

		int i = 1;
		int cnt = 0;

		while (i <= input) {
			if (input % i == 0) {
				cnt += 1;
				System.out.println("i : " + i);
			}
			i += 1;
		}
		System.out.println("cnt : " + cnt);
		if (cnt == 2) {
			System.out.println(input + "은 소수입니다.");
		} else {
			System.out.println(input + "은 소수가 아닙니다.");
		}
		sc.close();
	}
}
