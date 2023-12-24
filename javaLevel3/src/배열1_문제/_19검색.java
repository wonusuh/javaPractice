package 배열1_문제;

import java.util.Scanner;

public class _19검색 {
	public static void main(String[] args) {
//		문제
//			array 배열은 학번과 점수가 한 쌍으로 이루어진 데이터이다.
//			
//			문제1
//				학번을 입력하면, 점수를 출력하시오
//				예)
//					입력 : 1001
//					출력 : 20
//			문제2
//				점수를 입력하면, 학번을 출력하시오.
//				예)
//					입력 : 20
//					출력 : 1001
//					
//			예외처리
//				1. 없는학번
//				2. 학번입력 -> 20(x)
//				3. 점수입력 -> 1002(x)
		Scanner sc = new Scanner(System.in);
		int[] array = { 1001, 20, 1002, 45, 1003, 54 };
		int index = -1;
		int scoreException = -1;

		System.out.println("학번을 입력하세요 >>");
		int hakbun = sc.nextInt();
		for (int i = 0; i < array.length; i += 1) {

			if (i % 2 == 0 && hakbun == array[i]) {
				index = array[i + 1];
			}
		}
		if (index == -1) {
			System.out.println("학번을 확인하세요");
		} else {
			System.out.println(index);
		}

		System.out.println("점수를 입력하세요 >>");
		int score = sc.nextInt();
		for (int i = 0; i < array.length; i += 2) {
			if (i >= array.length - 1) {
				break;
			}
			if (score == array[i + 1]) {
				scoreException = array[i];
			}
		}
		if (scoreException == -1) {
			System.out.println("점수를 확인하세요");
		} else {
			System.out.println(scoreException);
		}
		sc.close();
	}
}
