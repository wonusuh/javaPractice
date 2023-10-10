package 기초1문제1;

/*
 * 철수 현금 10000
 * 사과 한 개 200원
 * 귤 한 개 110원
 * 사과 3개와 귤 10개를 사려고 한다
 * 모두 사면 거스름돈은 얼마인지 구하시오
 * 정답 8300
 */
public class _04마트 {
	public static void main(String[] args) {
		System.out.println(10000 - ((200 * 3) + (110 * 10)));
	}
}
