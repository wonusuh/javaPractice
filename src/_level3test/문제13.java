package _level3test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제13 {
	public static void main(String[] args) {
//				아래 번호를 입력받아, 각 방향으로 0이 아닌 숫자를 모으시오.
//				1)left 2)right
//				
//				예) 1)left
//				   arr = {2,3,4,5,0,0,0,0,0}
//				
//				예) 2)right
//				   arr = {0,0,0,0,0,2,3,4,5}
		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 0, 3, 4, 0, 0, 5, 6 };

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("1)left");
			System.out.println("2)right");
			System.out.println("0)exit");
			System.out.print("메뉴 선택 : ");

			int menu = sc.nextInt();

			if (menu == 1) {
				// left

				for (int i = 0; i < arr.length; i += 1) {

					if (arr[i] == 0) {

						for (int k = i; k < arr.length - 1; k += 1) {
							arr[i] = arr[i + 1];
							System.out.println(Arrays.toString(arr));
						}
					}
				}
			} else if (menu == 2) {
				// right
			} else if (menu == 0) {
				// exit
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("메뉴를 다시 선택하세요.");
			}
		}
		sc.close();
	}
}
