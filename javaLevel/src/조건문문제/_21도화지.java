package 조건문문제;

public class _21도화지 {
	public static void main(String[] args) {
//		민수네 반 학생은 26명이다
//		반 학생들에게 도화지를 두 장씩 나누어 주려고 한다
//		도화지는 열장씩 묶음으로만 판매하고 열장에 1200원이다
//		총 얼마가  필요한지 구하라
//		정답
//		7200

		int totalNeeds = 26 * 2;

		int tenPapers = 10;
		int price = 1200;

		int bundles = totalNeeds / tenPapers;

		if (totalNeeds % tenPapers != 0) {
			bundles = bundles + 1;
		}
		int totalPrice = bundles * price;
		System.out.println("총 필요한 금액 : " + totalPrice);
	}
}
