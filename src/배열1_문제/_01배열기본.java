package 배열1_문제;

public class _01배열기본 {
	public static void main(String[] args) {
		int[] array = new int[5];
		int sum = 0;
		for (int i = 0; i < array.length; i += 1) {
			array[i] = 10 * (i + 1);
			System.out.println("array[" + i + "] == " + array[i]);
			sum += array[i];
		}
		System.out.println(sum);
	}
}
