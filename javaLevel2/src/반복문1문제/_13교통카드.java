package 반복문1문제;

public class _13교통카드 {
	public static void main(String[] args) {
//		문제
//			선호네 반 학생 25명이 체험학습을 하러가기위해
//			버스를 탔는데, 총 요금이 19400원이었다
//			
//			교통카드를 사용하면 720원이고
//			현금으로 지불하면 1000원일 때
//			
//			교통카드를 사용한 학생 수와 현금을 사용한 학생 수는
//			각각 몇 명인지 구하시오.
//		정답
//			교통카드 20명
//			현금 5명

		int card = 25;
		int cash = 0;

		while (true) {
			if ((card * 720 + cash * 1000) == 19400)
				break;
			card -= 1;
			cash += 1;
		}
		System.out.println("카드 : " + card);
		System.out.println("현금 : " + cash);
	}
}
