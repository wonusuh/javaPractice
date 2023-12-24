package 배열1_문제;

public class _02배열기본2 {
	public static void main(String[] args) {
//		array => 100 200 300 400 500 저장 후,
//		4의 배수만 출력하시오
//		4의 배수의 갯수도 출력하시오
		int[] array = new int[5];
		int cnt = 0;
		for (int i = 0; i < array.length; i += 1) {
			array[i] = 100 * (i + 1);
			if (array[i] % 4 == 0) {
				cnt += 1;
				System.out.println(array[i]);
			}
		}
		System.out.printf("4의 배수의 갯수 : %d\n", cnt);
	}
}
