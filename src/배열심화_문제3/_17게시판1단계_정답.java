package 배열심화_문제3;

import java.util.Scanner;

public class _17게시판1단계_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 14; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호

		System.out.println("현재 페이지에 보여줄 게시글 숫자");
		pageSize = sc.nextInt();

		pageCount = count / pageSize;
		if (count % pageSize > 0) {
			pageCount += 1;
		}

		while (true) {
			// 시작 인덱스 0부터
			startRow = (curPageNum - 1) * pageSize; // (1-1)*4 => 0 (2-1)*4 => 4

			// 끝인덱스
			endRow = startRow + pageSize; // 0 + 4 4

			if (endRow > count) {
				endRow = count;
			}

			for (int i = startRow; i < endRow; i += 1) {
				System.out.printf("(%d)%n", i + 1);
			}

			System.out.println("[이전 1]"); // 페이지 이동
			System.out.println("[이후 2]");
			System.out.println("선택 >> ");
			int choice = sc.nextInt();
			if (choice != 1 && choice != 2) {
				break;
			}
			if (choice == 1) {
				if (curPageNum == 1) {
					System.out.println("이전페이지 존재하지 않음");
					continue;
				}
				curPageNum -= 1;
			} else {
				if (curPageNum == pageCount) {
					System.out.println("이후페이지가 존재하지않음 ");
					continue;
				}
				curPageNum += 1;
			}

		}
		sc.close();
	}
}
