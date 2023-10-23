package 반복문3문제;

public class _05규칙찾기5 {
	public static void main(String[] args) {
//		문제
//			반복문을 10회 반복해서 아래와같이 출력하시오
//		예
//			0 1
//			1 2
//			2 3
//			3 1
//			4 2
//			5 3
//			6 1
//			7 2
//			8 3
//			9 1
		int num = 0;
		for (int i = 0; i < 10; i += 1) {
			num += 1;
			if (num > 3) {
				num = 1;
			}
			System.out.printf("%d %d\n", i, num);
		}
	}
}
