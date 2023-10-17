package _레벨1테스트;

import java.util.Scanner;

public class 응용9 {
	public static void main(String[] args) {
//		[문제 9]
//				1. 시험점수를 입력받는다.
//				2. 시험점수에 해당하는 학점을 출력한다.
//				3. 아래는 점수표이다.
//					91 ~ 100점		A학점
//					90 ~ 81점		  B학점
//					80이하			  재시험
//				4. 단, 만점이거나 A학점과 B학점의 일의 자리가 7점 이상이면, +를 추가한다.
//				   A학점과 B학점의 일의 자리가 3점 이하이면, -를 추가한다.
//				
//				예)
//					100	 =>		A+
//					95  =>    	A
//					93   =>    	A-
//					
//					87	=>			B+
//					85  =>    	B
//					82	=>		B-
//					
//					23	=>		재시험

//				응용 9번 a , b , + , - 한개씩만 조건 분리해보세요
//				지금 +, - 가 각각 두번씩 있는것을 수정해보세요
		Scanner sc = new Scanner(System.in);
		System.out.println("시험점수를 입력하세요 : ");
		int input = sc.nextInt();
		String score = null;

		boolean error = input > 100 || input < 0;
		boolean plus = input % 10 >= 7;
		boolean minus = input % 10 >= 7;

		if (error) {
			System.out.println("점수를 다시 입력하세요. (0~100)");
		}

		if (!error) {
			if (input == 100) {
				score = "A+";
			} else if (input <= 99 && input >= 91) {
				score = "A";
				if (input % 10 >= 7) {
					score += "+";
				}
				if (input % 10 <= 3) {
					score += "-";
				}
			} else if (input <= 90 && input >= 81) {
				score = "B";
				if (input % 10 >= 7) {
					score += "+";
				}
				if (input % 10 <= 3) {
					score += "-";
				}
			} else {
				score = "재시험";
			}
		}
		System.out.println("score : " + score);
		sc.close();
	}
}
