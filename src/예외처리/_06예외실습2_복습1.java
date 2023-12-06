package 예외처리;

public class _06예외실습2_복습1 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		int idx = 5;

		try {

			if (idx < 0 || idx > arr.length - 1) {

				throw new Exception("인덱스가 이게 뭡니까?");
			}
			System.out.println(arr[idx]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}
