package 반복문1문제;

public class _02연습문제2 {
	public static void main(String[] args) {
//		아래 조건을 만족하는 식을 작성하시오
//		조건1) 10~1까지 거꾸로 반복문을 실행해 숫자를 출력한다
//		조건2) 6~3사이는 숫자대신 "안녕"만 출력한다
		int i = 10;
		while (i >= 1) {
			if (i <= 6 && i >= 3) {
				System.out.println("안녕");
			} else {
				System.out.println(i);
			}
			i -= 1;
		}
		System.out.println("현재 i 값 : " + i);
	}
}
