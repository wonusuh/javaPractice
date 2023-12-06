package 예외처리;

class Ex01 {

	int sample1(int num, int divider) {

		int result = 0;

		try {
			System.out.printf("%d / %d == ", num, divider);
			result = num / divider;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return result;
	}

	int sample2(int num, int divider) throws Exception {

		int result = 0;

		try {
			System.out.printf("%d / %d == ", num, divider);
			result = num / divider;
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		return result;
	}
}

public class _07예외떠넘기기 {

	public static void main(String[] args) {

		Ex01 e = new Ex01();

		System.out.println(e.sample1(10, 3));

		try {
			System.out.println(e.sample2(10, 3));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
