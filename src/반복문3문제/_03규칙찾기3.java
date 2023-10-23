package 반복문3문제;

public class _03규칙찾기3 {
	public static void main(String[] args) {
//		문제
//			반복문을 사용하여 아래와같이 출력하세요
//		예시
//			0 30
//			1 29
//			2 27
//			3 24
//			4 20
//			5 15
//			6 9
//			7 2
//			8 -6
//			9 -15
		int sum = 30;
		for (int i = 0; i < 10; i += 1) {
			sum -= i;
			System.out.printf("%d %d\n", i, sum);
		}
	}
}
