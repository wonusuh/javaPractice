package 반복문응용_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _05배열중복제거2 {
	public static void main(String[] args) {
//		문제
//			값을 입력받아 data배열에서 해당 값을 제외하시오
//			단, 같은 값이 여러개 있으면 전부 제외하시오
//			
//			예)
//				입력 : 5
//				결과 { 2, 6, 8, 6, 0, 0}
		Scanner sc = new Scanner(System.in);

		int[] data = { 5, 2, 6, 8, 5, 6 };

		System.out.print("제외할 값을 입력하세요 >> ");

		int input = sc.nextInt();
		int cnt = 0;

		for (int i = 0; i < data.length; i += 1) {

			if (input == data[i]) {

				for (int k = i; k < data.length - 1; k += 1) {
					data[k] = data[k + 1];
					data[k + 1] = 0;
				}
				cnt += 1;
				System.out.println(Arrays.toString(data));
			}
		}
		if (cnt == 0) {
			System.out.println("찾는 값이 없습니다");
		}
		sc.close();
	}
}
