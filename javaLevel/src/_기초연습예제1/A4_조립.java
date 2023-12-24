package _기초연습예제1;

public class A4_조립 {
	public static void main(String[] args) {
//		[문제]
//			어느 공장에서 한 사람이 한 시간에 컴퓨터를 4대 조립할 수 있다.
//			3명이 컴퓨터 96대를 조립하는데 필요한 시간을 구하시오.
//		[정답]
//			8시간

		int manPerHour = 4;
		int employees = 3;
		int computers = 96;

		int result = computers / (manPerHour * employees);
		System.out.println(result + "시간");
	}
}
