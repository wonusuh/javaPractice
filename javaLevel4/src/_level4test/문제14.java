package _level4test;

public class 문제14 {

	public static void main(String[] args) {
//아래와 같이 구구단을 옆으로 출력하시오.
//		
//		2 * 1 = 2	3 * 1 = 3	......		9 * 1 = 9
//		2 * 2 = 4	3 * 2 = 6	......		9 * 2 = 18
//		2 * 3 = 6	3 * 3 = 9	......		9 * 3 = 27
//		
//				.....
//		
//		2 * 9 = 18  3 * 9 = 27  ......		9 * 9 = 81

		for (int i = 1; i < 10; i += 1) {

			for (int j = 2; j < 10; j += 1) {
				System.out.printf("%d * %d = %d    ", j, i, j * i);
			}
			System.out.println();
		}
	}
}
