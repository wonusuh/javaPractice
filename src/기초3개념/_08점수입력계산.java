package 기초3개념;

import java.util.Scanner;
// 점수가 60이상이고 100 이하면
// true 를 출력하시오

/*
	개념 - 콘솔창에서 사용자에게 입력받기
	출력 : syso
	입력 : 따로 객체(공장)를 만들어서 사용한다
*/
public class _08점수입력계산 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double point = scan.nextInt();
		System.out.println(point >= 60 && point <= 100);
		scan.close();
	}
}
