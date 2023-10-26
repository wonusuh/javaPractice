package 배열2_문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _16게임1to4 {
	public static void main(String[] args) {
//		1 to 4
//		1. arr 배열에 1~4사이의 숫자를 중복없이 저장한다
//		2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다
//		3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다

		// 순서대로 가장 작은 숫자를 찾는 게임

//		예)
//		4 2 3 1
//		입력 : 3 => 인덱스
//		4 2 3 9
//		
//		9 9 9 9 => 게임 종료
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		for (int i = 0; i < arr.length; i += 1) {
			int num = rn.nextInt(4); // 0 1 2 3
			if (!check[num]) {
				check[num] = true;
				arr[i] = num + 1;
			} else {
				i -= 1;
			}
		}
		int game = 1;
		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.print("가장 작은 숫자의 위치를 입력하세요 : ");
			int answer = sc.nextInt();
			if (game == arr[answer]) {
				arr[answer] = 9;
				game += 1;
			} else {
				continue;
			}
			if (game == 5) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
