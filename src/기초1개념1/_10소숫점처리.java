package 기초1개념1;

/* 
 * 소숫점 처리 방식
 * 1. 올림 ceil : 3.4 -> 4
 * 2. 내림 floor : 3.4 -> 3
 * 3. 반올림 round : 01234 소숫점 버리고, 56789면 올린다
. * */
public class _10소숫점처리 {
	public static void main(String[] args) {
		System.out.println(11 / 3.0);
		System.out.println(Math.ceil(11 / 3.0));
		System.out.println(Math.floor(11 / 3.0));
		System.out.println(Math.round(2.4));
		System.out.println(Math.round(2.5));
	}
}
