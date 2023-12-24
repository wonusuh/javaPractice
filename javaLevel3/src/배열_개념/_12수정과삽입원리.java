package 배열_개념;

import java.util.Arrays;
import java.util.Scanner;

public class _12수정과삽입원리 {
	public static void main(String[] args) {

//		문제
//			수정할 인덱스를 입력받고
//			수정할 값을 입력받아 해당 위치의 값을 수정하시오

		Scanner sc = new Scanner(System.in);
		int[] arr = { 21, 1, 67, 2, 0 }; // 방 길이는 5개
		int cnt = 4; // 실제 저장한 데이터

		while (true) {
			System.out.println(Arrays.toString(arr));

			System.out.println("1.수정(인덱스)");
			System.out.println("2.삽입(값)");
			int sel = sc.nextInt();
			if (sel == 1) {
				// 인덱스 => 1
				// 수정할 값 = > 100
				// [21, 100, 67, 2, 0]
				if (cnt == 0) {
					System.out.println("값이  없습니다");
					continue;
				}
				System.out.print("수정할 인덱스를 입력하세요 >> ");
				int index = sc.nextInt();
				if (index < 0 || index >= cnt) {
					System.out.println("범위 에러");
					continue;
				}
				System.out.print("어떤 값으로 수정하시겠습니까? >>");
				int modifying = sc.nextInt();
				arr[index] = modifying;
			} else if (sel == 2) {
				System.out.println("cnt : " + cnt);
				// 추가 => 맨 뒤에 순차적으로 추가가 됨
				// 삽입 => 추가 원하는 인덱스에 추가 = > 뒤에 있는 값 옆으로 이동
				if (cnt == 5) {
					System.out.println("값을 추가할수 없습니다");
					continue;
				}
				System.out.print("삽입할 인덱스를 입력하세요 >> ");
				int insultIdx = sc.nextInt();
				if (insultIdx < 0 || insultIdx >= cnt) {
					System.out.println("범위오류");
					continue;
				}
				System.out.print("삽입할 값을 입력하세요 >>");
				int insultVal = sc.nextInt();
				for (int i = cnt - 1; i >= insultIdx; i -= 1) {
					arr[i + 1] = arr[i];
				}
				arr[insultIdx] = insultVal;
				cnt += 1; // 실제 저장 데이터 +1
			} else {
				System.out.println("종료합니다");
				break;
			}
		}
		sc.close();
	}
}
