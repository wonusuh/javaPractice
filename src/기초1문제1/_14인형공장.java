package 기초1문제1;

/*
[문제]
	인형 공장에서 인형 10개를 생산하는데,
	불량을 염두해두고 1개씩 더 만든다.
	인형을 1200개 주문받았을 때,
	인형은 총 몇 개 생산해야 되는지 구하시오.	
[정답] 
	1320
*/
public class _14인형공장 {
	public static void main(String[] args) {
		// 풀이
		// 1200 * 1.1
		System.out.println(Math.round(1200 * 1.1));
	}
}
