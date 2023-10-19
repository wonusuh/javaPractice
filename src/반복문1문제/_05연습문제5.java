package 반복문1문제;

public class _05연습문제5 {

	public static void main(String[] args) {
//		1~15사이의 숫자를 출력하라
//		가로로 출력하세요.
//		, 로 숫자들을 구분하세요
		// * 마지막 숫자에는 , 가 없어야된다
		int i = 1;
		int end = 15;
		while (i <= end) {
			if (i != end) {
				System.out.print(i + ", ");
			} else {
				System.out.println(i);
			}
			i += 1;
		}
	}
}
