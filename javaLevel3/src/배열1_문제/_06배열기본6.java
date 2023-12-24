package 배열1_문제;

public class _06배열기본6 {
	public static void main(String[] args) {
//		문제1
//			array의 값을 temp1에 복사한 후 모든 값을 출력하시오.
//		정답1
//			10, 20, 30, 40, 50
//		
//		문제2
//			array 값의 2배를 temp2에 복사후, 모든 값을 출력하시오
//		정답2
//			20, 40, 60, 80, 100
		int[] array = { 10, 20, 30, 40, 50 };
		int[] temp1 = new int[5];
		int[] temp2 = new int[5];

		for (int i = 0; i < array.length; i += 1) {
			temp1[i] = array[i];
			System.out.print(temp1[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < array.length; i += 1) {
			temp2[i] = 2 * array[i];
			System.out.print(temp2[i] + " ");
		}
	}
}
