package 기초1문제1;

/*
[문제]
	철수는 친구의 생일 선물로 가격이 4000원인 필통 1개와 
	가격이 700원인 공책 몇 권을 사려고 한다. 
	철수는 13000원을 가지고 있을 때,
	[1] 공책은 최대한 몇 권을 살 수 있을지 구하시오.
	[2] 공책을 최대로 구입한 후 나머지 금액도 출력하시오.
[정답] 
	[1] 12
	[2] 600
*/
public class _11생일선물 {
	public static void main(String[] args) {
		/*
		 * 풀이
		 * [1] (13000-4000) / 700
		 * [2] (13000-4000) % 700
		 */
		System.out.println((13000 - 4000) / 700);
		System.out.println((13000 - 4000) % 700);
	}
}
