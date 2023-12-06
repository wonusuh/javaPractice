package 예외처리;

//컴파일 예외(실행전에) - 문법적인 예외
//런타임(실행후에) 예외 - 논리적인 예외
public class _01예외처리1 {

	public static void main(String[] args) {

		int num = 10, divider = 0;

		try {
			System.out.println("num == " + num / divider);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
	}
}
