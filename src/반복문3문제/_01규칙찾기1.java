package 반복문3문제;

public class _01규칙찾기1 {
	public static void main(String[] args) {
//		문제
//			while 문 사용해서 아래와같이 출력해보세요
//			for문 사용해서 출력해보세요
//		예
//			0 0 1
//			1 2 3
//			2 4 5
//			3 6 7
//			4 8 9
		int i = 0;
		while (i < 5) {
			System.out.printf("%d %d %d\n", i, i * 2, (2 * i) + 1);
			i += 1;
		}
		System.out.println("==========");
		for (int k = 0; k < 5; k += 1) {
			System.out.printf("%d %d %d\n", k, k * 2, (2 * k) + 1);

		}
	}
}
