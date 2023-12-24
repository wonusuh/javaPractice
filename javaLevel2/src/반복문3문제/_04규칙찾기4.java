package 반복문3문제;

public class _04규칙찾기4 {
	public static void main(String[] args) {
//		문제
//			반복문을 10회 반복해서 아래와같이 출력하시오
//		예
//			0 0
//			1 0
//			2 1
//			3 1
//			4 2
//			5 2
//			6 3
//			7 3
//			8 4
//			9 4
		int sum = 0;
		for (int i = 0; i < 10; i += 1) {
			System.out.printf("%d %d\n", i, sum);
			if (i % 2 != 0) {
				sum += 1;
			}
		}
	}
}
