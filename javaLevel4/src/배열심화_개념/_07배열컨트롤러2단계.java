package 배열심화_개념;

import java.util.Arrays;
import java.util.Scanner;

public class _07배열컨트롤러2단계 {
	public static void main(String[] args) {
//		배열 컨트롤러 2단계
//		1. 추가
//			값을 받아서 순차적으로 추가
//		2. 삭제(인덱스)
//			인덱스를 입력받아 해당 위치의 값 삭제
//			예외처리
//		3. 삭제(값)
//			값을 입력받아 삭제
//			예외처리
//		4. 삽입
//			인덱스와 값을 입력받아 삽입
		Scanner sc = new Scanner(System.in);

		int[] score = null;
		int count = 0;

		while (true) {
			System.out.println(Arrays.toString(score));

			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스로)");
			System.out.println("[3]삭제(값으로)");
			System.out.println("[4]삽입");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 >> ");

			int sel = sc.nextInt();

			if (sel == 1) { // 추가
				System.out.print("추가할 값을 입력하세요 >> ");

				int value = sc.nextInt();

				if (score == null) {
					score = new int[1];
				}

				int[] copy = score;
				score = new int[count + 1];

				for (int i = 0; i < copy.length; i += 1) {
					score[i] = copy[i];
				}
				score[score.length - 1] = value;
				count += 1;
			} else if (sel == 2) { // 삭제 인덱스로

				if (count == 0) {
					System.out.println("배열에 아무 값도 없습니다");
					continue;
				}

				System.out.print("삭제할 값의 인덱스를 입력하세요 >> ");

				int idx = sc.nextInt();

				if (idx < 0 || idx >= count) {
					System.out.println("인덱스 범위 오류");
					continue;
				}

				for (int i = idx; i < score.length - 1; i += 1) {
					score[i] = score[i + 1];
					score[i + 1] = 0;
				}

				int[] copy = score;
				score = new int[count - 1];
				System.out.println("copy" + Arrays.toString(copy));
				System.out.println("score" + Arrays.toString(score));

				for (int i = 0; i < score.length; i += 1) {
					score[i] = copy[i];
				}

				count -= 1;
			} else if (sel == 3) { // 삭제 값으로

				if (count == 0) {
					System.out.println("배열에 아무 값도 없습니다");
					continue;
				}

				System.out.print("삭제할 값를 입력하세요 >> ");

				int del = sc.nextInt();
				int idx = -1;

				for (int i = 0; i < score.length; i += 1) {
					if (del == score[i]) {
						idx = i;
						break;
					}
				}

				if (idx != -1) {

					for (int i = idx; i < score.length - 1; i += 1) {
						score[i] = score[i + 1];
					}

					int[] copy = score;
					score = new int[count - 1];

					for (int i = 0; i < score.length; i += 1) {
						score[i] = copy[i];
					}
					count -= 1;
				} else {
					System.out.println("삭제할 값이 없습니다.");
					continue;
				}
			} else if (sel == 4) { // 삽입
				if (count == 0) {
					System.out.println("배열이 비어있습니다.");
					continue;
				}
				System.out.print("삽입할 위치의 인덱스를 입력하세요 >> ");

				int idx = sc.nextInt();

				if (idx < 0 || idx >= count) {
					System.out.println("인덱스 범위 오류");
					continue;
				}

				System.out.print("삽입할 값을 입력하세요 >> ");

				int value = sc.nextInt();

				int[] copy = score;
				score = new int[count + 1];

				//
				for (int i = 0; i < score.length - 1; i += 1) {
					if (i < idx) {
						score[i] = copy[i];
					} else {
						score[i + 1] = copy[i];
					}
				}
				score[idx] = value;
				//

				System.out.println("copy" + Arrays.toString(copy));
				System.out.println("score" + Arrays.toString(score));
				count += 1;
			} else if (sel == 0) { // 종료
				System.out.println("종료합니다");
				break;
			} else { // 셀렉트 예외
				System.out.println("메뉴를 다시 선택하세요");
			}
		}
		sc.close();
	}
}
