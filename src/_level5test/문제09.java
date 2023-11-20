package _level5test;

import java.util.Arrays;
import java.util.Scanner;

public class 문제09 {

	public static void main(String[] args) {
//# 콘솔 게시판
//1. [이전] 또는 [이후] 버튼을 누르면 페이지 번호가 변경된다. 
//2. 현재 페이지 번호에 해당되는 게시글만 볼 수있다.
//3. 2차원 배열 board에 0열에는 제목을 1열에는 게시글의 내용을 저장한다. 
//4. 실제로 배열의 길이가 늘어나고 줄어들어야한다 : 추가 삭제 

		String[][] board = null;
		int count = 0; // 전체 게시글 수
		int pageSize = 3; // 한 페이지에 보여줄 게시글 수
		int curPageNum = 1; // 현재 페이지 번호
		int pageCount = 0; // 전체 페이지 개수
		int startRow = 0; // 현재 페이지의 게시글 시작 번호
		int endRow = 0; // 현재 페이지의 게시글 마지막 번호
		Scanner sc = new Scanner(System.in);

		System.out.print("한 페이지에 나타낼 게시글의 수를 입력하세요. >> ");
		pageSize = sc.nextInt();

		while (true) {
			pageCount = count / pageSize;
			if (count % pageSize != 0) {
				pageCount += 1;
			}

			// 해당하는 페이지에서 보여줄 첫 번째 게시물
			startRow = (curPageNum - 1) * pageSize;

			// 해당 페이지에서 보여줄 마지막 게시물
			endRow = startRow + pageSize;

			// 마지막 게시물 처리
			if (endRow > count) {
				endRow = count;
			}

			System.out.println("board[][] : " + Arrays.deepToString(board));
			System.out.printf("(%d/%d)\n", curPageNum, pageCount);

			// 게시글들 출력
			if (board != null) {

				for (int i = startRow; i < endRow; i += 1) {
					System.out.printf("(%d)%s\n", i + 1, board[i][0]);
				}
			}
			System.out.print("[1. 이전] [2. 이후] [3. 글쓰기] [4. 글삭제]");
			int input = sc.nextInt();

			if (input == 1) {
				// 이전

				if (curPageNum == 1) {
					continue;
				}
				curPageNum -= 1;
			} else if (input == 2) {
				// 이후
				if (curPageNum == pageCount) {
					continue;
				}
				curPageNum += 1;
			} else if (input == 3) {
				// 글쓰기

				System.out.print("제목을 입력하세요 >> ");
				String title = sc.next();
				sc.nextLine();

				System.out.print("내용을 입력하세요 >> ");
				String content = sc.next();
				sc.nextLine();

				if (board == null) {
					board = new String[1][];
				} else {

					String[][] copy = board;
					board = new String[count + 1][];

					for (int i = 0; i < copy.length; i += 1) {
						board[i] = copy[i];
					}
				}

				String[] temp = new String[2];

				temp[0] = title;
				temp[1] = content;
				board[count] = temp;
				count += 1;
			} else if (input == -1) {
				break;
			} else if (input == 4) {
				// 글 삭제
				if (count == 0) {
					System.err.println("게시판에 게시글이 없습니다.");
					continue;
				}

				System.out.println("삭제할 글의 번호를 입력하세요. >> ");
				int del = sc.nextInt();

				for (int i = del; i < board.length - 1; i += 1) {
					board[i] = board[i + 1];
				}

				if (count == 1) {
					board = null;
					count = 0;
					continue;
				} else {

					String[][] copy = board;
					board = new String[count - 1][];

					for (int i = 0; i < board.length; i += 1) {
						board[i] = copy[i];
					}
					count -= 1;
				}
			}
		}
		sc.close();
	}
}
