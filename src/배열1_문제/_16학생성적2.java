package 배열1_문제;

import java.util.Scanner;

public class _16학생성적2 {
	public static void main(String[] args) {
//		문제
//			학번을 입력받아 성적을 출력하시오.
		// 단, 없는 학번 입력시 예외처리하시오
//		정답
//			학번 입력 >> 1003 성적 : 45점
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		int index = -1;

		Scanner sc = new Scanner(System.in);
		System.out.println("학번 입력 >>");
		int input = sc.nextInt();
		for (int i = 0; i < numberList.length; i += 1) {
			if (numberList[i] == input) {
				index = i;
			}
		}
		System.out.println(index == -1 ? "없는학번입니다" : scoreList[index]);
		sc.close();
	}
}
