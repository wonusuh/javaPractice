package 배열_개념;

import java.util.Arrays;
import java.util.Scanner;

public class _11삭제원리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 0 1 2 3 4
		int[] arr = { 21, 1, 67, 2, 0 }; // 방 길이는 5개
		int cnt = 4; // 실제 저장한 데이터

		// 1. 배열에 실제 저장한 값이 존재하지 않을때 => 삭제 불가능
		// 2. 실제저장한 데이터 길이에서만 삭제 가능

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.print("[");
			for (int i = 0; i < cnt; i++) {
				System.out.print(i == 0 ? arr[i] : " ," + arr[i]);
			}
			System.out.println("]");

			System.out.println("1.삭제(인덱스)");
			System.out.println("2.삭제(값)");
			int sel = sc.nextInt();
			if (sel == 1) {
				if (cnt == 0) { // [0,0,0,0,0]
					System.out.println("삭제할 값이 없습니다");
					continue;
				}

				System.out.print("삭제 인덱스 >>");
				int delIdx = sc.nextInt();

				if (delIdx < 0 || delIdx >= cnt) {
					System.out.println("인덱스 범위오류 ");
					continue;
				}
				// 0 1 2 3
				for (int i = delIdx; i < cnt - 1; i++) {
					arr[i] = arr[i + 1];
				}

				cnt -= 1;// 실제 데이터를 삭제
				arr[cnt] = 0;

				System.out.println(Arrays.toString(arr));

			} else if (sel == 2) {
				if (cnt == 0) { // [0,0,0,0,0]
					System.out.println("삭제할 값이 없습니다");
					continue;
				}
				int delIdx = -1;
				System.out.print("삭제 값 >>");

				int delVal = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (delVal == arr[i]) {
						delIdx = i;
						break;
					}
				}

				if (delIdx == -1) {
					System.out.println("값이 없습니다");
					continue;
				}
				for (int i = delIdx; i < cnt - 1; i++) {
					arr[i] = arr[i + 1];
				}
				cnt -= 1;
				arr[cnt] = 0;
			} else {
				System.out.println("종료 ");
				break;
			}
		}
		sc.close();
	}
}
