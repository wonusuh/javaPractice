package 기초2문제;

/*
[문제1]
	인형 125개가있다. 전체를 100퍼센트라고 했을 때, 
	1퍼센트는 인형 몇 개인지 구하시오.
	
[문제2]
	인형 125개가있다. 인형 1개는 몇 퍼센트인지 구하시오.

[문제3]
	인형 40개가있다. 전체를 100퍼센트라고 했을 때, 
	일퍼센트는 인형 몇 개 인지 구하시오.

[문제4]
	인형 40개가있다. 인형1개는 몇 퍼센트인지 구하시오.
*/
public class _05확률 {
	public static void main(String[] args) {
		// 1
		double total = 125;
		double onePercent = total / 100;
		System.out.println(onePercent);

		// 2
		// 125 : 1 = 100 : n
		// 125n = 100
		// n = 100 / 125
		total = 125;
		double oneDoll = 100 / total;
		System.out.println(oneDoll + "%");

		// 3
		// 100% : 40개 = 1% : n개
		// 100n = 40
		// n = 40/100

		// 100n/100 = 40/100
		total = 40;
		onePercent = total / 100;
		System.out.println(onePercent);

		// 4
		// 40 :100 = 1 :n
		// 40n = 100
		// n = 100/40
		total = 40;
		oneDoll = 100 / total;
		System.out.println(oneDoll + "%");
	}
}
