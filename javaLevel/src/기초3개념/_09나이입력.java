package 기초3개념;

import java.util.Scanner;

public class _09나이입력 {
//		1. 공장을 만든다
//		2. 안내문 만들기 : 출력문 작성
//		3. 입력 받아서 변수 만들기
//		4. 결과출력
//		5. 공장 폐쇠
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "세");
		System.out.print("오늘날짜 입력 >> ");
		int day = scan.nextInt();
		System.out.println("오늘날짜 = " + day + "일");
		scan.close();
	}
}
