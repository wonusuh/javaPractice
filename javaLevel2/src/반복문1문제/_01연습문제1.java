package 반복문1문제;

public class _01연습문제1 {
	public static void main(String[] args) {
//		아래 조건을 만족하는 식을 작성하시오
//		조건1) 1~10 까지 반복문을 실행하여 숫자를 출력한다
//		조건2) 1~5까지는 안녕을 함께 출력한다
//		조건3) 6~10까지는 "잘가"를 함꼐출력한다.
		int i = 1;
		while (i <= 10) {
			if (i <= 5) {
				System.out.println(i + "안녕");
			}
			if (i >= 6 && i <= 10) {
				System.out.println(i + "잘가");
			}
			i += 1;
		}
	}
}
