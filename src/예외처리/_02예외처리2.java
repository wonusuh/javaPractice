package 예외처리;

public class _02예외처리2 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		try {
			arr[100] = 100;
		} catch (Exception e) {
			System.out.println("인덱스 값 초과");
		}
		System.out.println("--------------------------");

//		String str = "aaa";

		try {

//			int num = Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("숫자가 아닙니다.");
		}
		System.out.println("--------------------------");

//		str = null;

		try {
//			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("null은 값을 참조할 수 없습니다.");
		}
		System.out.println("--------------------------");
	}
}
