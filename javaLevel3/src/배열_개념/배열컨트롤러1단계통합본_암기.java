package 배열_개념;

import java.util.Arrays;
import java.util.Scanner;

public class 배열컨트롤러1단계통합본_암기 {
	public static void main(String[] args) {
//		1. 추가
//			값을 5개까지만 저장 가능
//			중복되는 값은 저장 불가
//			차례대로 뒤로 저장
//		3. 수정
//			인덱스를 입력받아 수정
//			인덱스를 올바르게 입력했는지 검사
//			중복되는 값으로 수정 불가
//		4. 삭제(값)
//			삭제할 값을 입력받아 해당 값 삭제
//			입력받은 값이 올바른지 검사
//			count == 0 이 되면, 더이상 삭제할 값이 없다는 메시지 출력
//		5. 삽입
//			삽입할 위치값 입력받기
//			삽입할 값 입력받기
//			입력받은 값의 중복검사
//			5개까지 삽입 가능
		Scanner sc = new Scanner(System.in);

		int[] arr = { 0, 0, 0, 0, 0 };

		int count = 0;

		while (true) {
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < count; i += 1) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();

			System.out.println("===[ 배열 컨트롤러 ]===");
			System.out.println("0.종료");
			System.out.println("1.추가");
			System.out.println("2.수정");
			System.out.println("3.삭제(인덱스)");
			System.out.println("4.삭제(값)");
			System.out.println("5.삽입");

			int sel = sc.nextInt();

			if (sel == 0) {
				System.out.println("종료합니다");
				break;
			} else if (sel == 1) {
//				1. 추가
//				값을 5개까지만 저장 가능
//				중복되는 값은 저장 불가
//				차례대로 뒤로 저장
				if (count == 5) {
					System.out.println("값을 더이상 추가할 수 없습니다");
					continue;
				}

				System.out.print("추가할 값을 입력하세요 >>");
				int input = sc.nextInt();

				boolean duplicated = false;

				if (duplicated) {
					System.out.println("중복 된 값은 추가할  수 없습니다.");
					continue;
				}

				// 중복 검사
				for (int i = 0; i < count - 1; i += 1) {
					if (arr[i] == input) {
						duplicated = true;
						System.out.println("중복된 값 추가 불가능");
					}
				}

				for (int i = count - 1; i >= 0; i -= 1) {
					arr[i + 1] = arr[i];
				}
				arr[0] = input;
				count += 1;
			} else if (sel == 2) {
//				3. 수정
//				인덱스를 입력받아 수정
//				인덱스를 올바르게 입력했는지 검사
//				중복되는 값으로 수정 불가
				System.out.println("수정할 인덱스를 입력하세요 >>");
				int idx = sc.nextInt();

				if (idx < 0 || idx > count - 1) {
					System.out.println("인덱스범위에러");
					continue;
				}
				System.out.print("수정할 값을 입력하세요 >>");
				int val = sc.nextInt();

				arr[idx] = val;
			} else if (sel == 3) {
				if (count == 0) {
					System.out.println("삭제할 값이 더이상 없습니다");
					continue;
				}
				System.out.println("삭제할 인덱스를 입력하세요 >>");
				int idx = sc.nextInt();

				if (idx < 0 || idx > count - 1) {
					System.out.println("인덱스 범위 에러");
					continue;
				}
				for (int i = idx; i < count - 1; i += 1) {
					arr[i] = arr[i + 1];
					arr[i + 1] = 0;
				}
				count -= 1;
			} else if (sel == 4) {
				if (count == 0) {
					System.out.println("값을 더이상 삭제할 수 없습니다.");
					continue;
				}
				System.out.println("삭제할 값을 입력하세요 >> ");
				int val = sc.nextInt();
				int idx = -1;

				for (int i = 0; i < count - 1; i += 1) {
					if (val == arr[i]) {
						idx = i;
						break;
					}
				}
				if (idx == -1) {
					System.out.println("값이 없습니다");
					continue;
				}
				for (int i = idx; i < count - 1; i += 1) {
					arr[i] = arr[i + 1];
					arr[i + 1] = 0;
				}
				count -= 1;
			} else if (sel == 5) {
				if (count < 1) {
					System.out.println("데이터가 최소한 한 개는 존재해야합니다");
					continue;
				}
				if (count == 5) {
					System.out.println("값을 더이상 삽입할 수 없습니다");
					continue;
				}
				System.out.println("삽입할 인덱스를 입력 >>");
				int insultIdx = sc.nextInt();

				System.out.println("삽입할 값을 입력 >>");
				int val = sc.nextInt();

				for (int i = count - 1; i >= insultIdx; i -= 1) {
					arr[i + 1] = arr[i];
				}
				arr[insultIdx] = val;
				count += 1;
			} else {
				System.out.println("메뉴를 확인하세요");
				continue;
			}
		}
		sc.close();
	}
}
