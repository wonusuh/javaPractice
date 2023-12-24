package 반복문3문제;

public class _02규칙찾기2 {
	public static void main(String[] args) {
//		문제
//			반복문을 사용해서 아래와같이 출력해보세요
//		예
//			0 0
//			1 1
//			2 3
//			3 6
//			4 10
//			5 15
//			6 21
		int sum = 0;
		for (int i = 0; i < 7; i += 1) {
			sum += i;
			System.out.printf("%d %d\n", i, sum);
		}
	}
}
