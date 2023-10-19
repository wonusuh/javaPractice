package 반복문1문제;

public class _06연습문제6 {
	public static void main(String[] args) {
//		문제
//			40~100사이의 5의 배수만 출력한다
//			반복문 종료 후 5의 배수의 전체의 합을 구하라
//		정답
//			40	45	50	~ 100
//			합 = 910
		int i = 40;
		int end = 100;
		int sum = 0;
		while (i <= end) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
				sum += i;
			}
			i += 1;
		}
		System.out.println("sum : " + sum);
	}
}
