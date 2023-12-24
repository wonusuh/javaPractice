package 배열심화_문제3;

import java.util.Scanner;

public class _17게시판1단계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 14; // 전체 게시글의 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글의 수
		int curPageNum = 1; // 현재 페이지의 번호
		int pageCount = 0; // 전체 페이지의 개수
		int startRow = 1; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호

		System.out.print("한 페이지에 보여줄 게시글의 수를 입력하세요. >> ");
		pageSize = sc.nextInt();
		pageCount = count / pageSize;

		if (count % pageSize != 0) {
			pageCount += 1;
		}

		while (true) {

			// 시작 게시물의 번호
			startRow = (curPageNum - 1) * pageSize;

			// 끝 게시물의 번호
			endRow = startRow + pageSize;

			// 마지막 페이지에서의 게시물
			if (endRow > count) {
				endRow = count;
			}
			System.out.printf("(%d/%d)\n", curPageNum, pageCount);

			for (int i = startRow; i < endRow; i += 1) {
				System.out.printf("(%d)\n", i + 1);
			}
			System.out.println("[1. 이전페이지]"); // 페이지 이동
			System.out.println("[2. 다음페이지]");
			System.out.print("선택 >> ");

			int sel = sc.nextInt();

			if (sel == 1) { // 이전페이지로 이동
				curPageNum -= 1;

				if (curPageNum < 1) {
					curPageNum = 1;
				}
			} else if (sel == 2) { // 다음페이지로 이동
				curPageNum += 1;

				if (curPageNum > pageCount) {
					curPageNum = pageCount;
				}
			} else {
				break;
			}
		}
		sc.close();
	}
}
