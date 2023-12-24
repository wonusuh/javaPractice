package 배열심화_문제3;

import java.util.Arrays;
import java.util.Scanner;

public class _18게시판2단계 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 가변배열 board
		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글의 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지개수
		int startRow = 0; // 현재 페이지의 시작 게시글의 번호
		int endRow = 0; // 현재 페이지의 마지막 게시글의 번호

		System.out.print("현재 페이지에 보여줄 게시글의 수를 입력하세요. >> ");
		pageSize = sc.nextInt();

		// 현재 보이는 페이지에서만 삭제 내용확인 가능
		while (true) {
			pageCount = count / pageSize;

			if (count % pageSize != 0) {
				pageCount += 1;
			}
			System.out.println(Arrays.deepToString(board));
			// 시작 인덱스 : 0부터
			startRow = (curPageNum - 1) * pageSize;

			// 끝 인덱스
			endRow = startRow + pageSize;

			// 마지막 페이지 처리
			if (endRow > count) {
				endRow = count;
			}

			// 출력하기
			System.out.printf("게시물 %d개, (%d/%d)\n", count, curPageNum, pageCount);
			for (int i = startRow; i < endRow; i += 1) {
				System.out.printf("(%d)%s%n", i + 1, board[i][0]);
			}
			System.out.println("[1]이전");
			System.out.println("[2]이후");
			System.out.println("[3]추가하기"); // 실제 board + 1
			System.out.println("[4]삭제하기"); // 실제 board - 1
			System.out.println("[5]내용확인");
			System.out.print("선택 >> ");

			int sel = sc.nextInt();

			if (sel == 1) {
				// 이전
				if (curPageNum == 1) {
					System.out.println("이전페이지 존재하지 않음");
					continue;
				}
				curPageNum -= 1;
			} else if (sel == 2) {
				// 이후
				if (curPageNum == pageCount) {
					System.out.println("다음페이지 존재하지 않음");
					continue;
				}
				curPageNum += 1;
			} else if (sel == 3) {
				// 추가하기
				System.out.print("게시글의 제목을 입력하세요 >> ");
				String title = sc.next();
				sc.nextLine();

				System.out.print("게시글의 내용을 입력하세요 >> ");
				String content = sc.next();
				sc.nextLine();

				String[] temp = new String[2];
				temp[0] = title;
				temp[1] = content;

				if (board == null) {
					board = new String[1][];
					board[0] = temp;
				} else {

					String[][] copy = board;
					board = new String[count + 1][];

					for (int i = 0; i < copy.length; i += 1) {
						board[i] = copy[i];
					}
					board[board.length - 1] = temp;
				}
				count += 1;
			} else if (sel == 4) {
				// 삭제하기
				System.out.print("삭제할 게시글의 번호를 입력하세요 >> ");
				int del = sc.nextInt() - 1;

				if (del >= curPageNum * pageSize || del < curPageNum * pageSize - pageSize) {
					System.err.println("삭제할 게시물이 존재하지 않습니다.");
					continue;
				}

				for (int i = del; i < board.length - 1; i += 1) {
					board[i] = board[i + 1];
				}

				String[][] copy = board;
				board = new String[count - 1][];
				for (int i = 0; i < board.length; i += 1) {
					board[i] = copy[i];
				}
				count -= 1;
			} else if (sel == 5) {
				// 내용확인
				System.out.print("내용을 확인할 게시물의 번호를 입력하세요 >> ");
				int content = sc.nextInt() - 1;

				if (content >= curPageNum * pageSize || content < curPageNum * pageSize - pageSize) {
					System.err.println("조회할 게시물이 존재하지 않습니다.");
					continue;
				}
				System.out.printf("내용 : %s\n", board[content][1]);
			} else {
				break;
			}
		}
		sc.close();
	}
}
