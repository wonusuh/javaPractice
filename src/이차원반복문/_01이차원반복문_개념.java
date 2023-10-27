package 이차원반복문;

public class _01이차원반복문_개념 {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i += 1) {
			System.out.print(i + " ");
			if (i % 3 == 0) {
				System.out.println();
			}
		}

		// 2차원 반복문은 직사각형의 데이터를 출력할 수 있다
		for (int i = 0; i < 4; i += 1) {
			for (int k = 0; k < 3; k += 1) {
				System.out.printf("[i]=%d [k]=%d \n", i, k);
			}
		}

//		문제
//			아래와 같은 사각형을 출력하시오
//			###
//			###
//			###
		for (int i = 1; i < 10; i += 1) {
			System.out.print("#");
			if (i % 3 == 0) {
				System.out.println();
			}
		}

		System.out.println("==========");

		// i는 세로, k는 가로
		for (int i = 1; i < 4; i += 1) {
			for (int k = 1; k < 4; k += 1) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
