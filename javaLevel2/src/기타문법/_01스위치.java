package 기타문법;
// 비교대상이 전부 == 상수 만 사용되는 곳
public class _01스위치 {
	public static void main(String[] args) {
		int age = 20;

		if (age < 19 && age >= 10) {
			System.out.println("청소년");
		} else if (age >= 19 && age >= 10) {
			System.out.println("어른");
		} else if (age < 19 && age >= 10) {
			System.out.println("노인");
		} else {
			System.out.println("비교대상 아님");
		}

		switch (age) {
		case 19:
		case 20:
			System.out.println("어른");
			break;
		case 21:
		case 60:
			System.out.println("노인");
		default:
		}
	}
}
