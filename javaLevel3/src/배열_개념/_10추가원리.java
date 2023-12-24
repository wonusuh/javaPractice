package 배열_개념;

import java.util.Arrays;
import java.util.Scanner;

public class _10추가원리 {
	public static void main(String[] args) {
//		문제
//			arr 배열에 값을 1개씩 입력받아 저장한다
//			단, 5개 이상 추가할 수 없다
//									출력형태
//		>> 10 { 10, 0 0 0 0}		10
//		>> 20 { 10, 20 0 0 0}		10 20
		// 가득 차면 저장공간 초과
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5]; // 0 0 0 0 0
		int cnt = 0;
		int num = 0;
		boolean[] check = new boolean[arr.length];

		int i = 0;
		boolean run = true;

		while (run) {
			System.out.print("배열에 저장할 값을 입력하세요 >>");
			num = sc.nextInt();
			if (num == -100) {
				System.out.println("종료합니다");
				break;
			}
			if (cnt != arr.length) {
				arr[i] = num;
				check[i] = true;
				cnt += 1;
			} else {
				System.out.println("더이상 입력 불가능");
				break;
			}
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(check));
			i += 1;
		}
		System.out.println(Arrays.toString(arr));
		for (int j = 0; j < check.length; j += 1) {
			if (check[j]) {
				System.out.print(arr[j] + " ");
			}
		}
		sc.close();
	}
}
