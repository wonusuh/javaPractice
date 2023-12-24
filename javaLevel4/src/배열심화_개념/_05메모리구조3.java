package 배열심화_개념;

public class _05메모리구조3 {
	public static void main(String[] args) {

		int[] arr3 = { 10, 20, 30, 40 };
		int[] temp = arr3;
		int[] arr4 = temp;

		if (arr3 == arr4) {
			System.out.println("같다2");
		} else {
			System.out.println("다르다2");
		}
	}
}
