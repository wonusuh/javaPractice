package _기초연습예제1;

public class A3_김밥 {
	public static void main(String[] args) {

		// [문제]
		// 소풍 도시락을 만들기위해 김밥재료를 구입하려고 한다.
		// 김밥재료로는 햄, 계란, 당근이 필요하다.
		// 햄 한 개의 가격은 2,500원이고 총 4개가 필요하다.
		// 계란 한 판은 3,000원이고 총 2판이 필요하다.
		// 당근 한 개의 가격은 2,000원이고 총 8개가 필요하다.
		// 집에 냉장고를 열어봤더니 당근 2개, 햄 1개가 있었다.
		// 철수가 나머지 재료를 사는데 필요한 총 금액을 구하시오.
		// [정답]
		// 25,500원

		int hamNeed = 4 - 1;
		int eggNeed = 2;
		int carrotNeed = 8 - 2;
		int hamPrice = 2500;
		int eggPrice = 3000;
		int carrotPrice = 2000;

		int result = hamNeed * hamPrice + eggNeed * eggPrice + carrotNeed * carrotPrice;
		System.out.println(result + "원");

	}
}
