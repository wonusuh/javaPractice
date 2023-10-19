package _기초연습예제1;

public class A4_사과 {
	public static void main(String[] args) {
//		[문제]
//			무게가 같은 사과 15개의 무게를 재었더니 25/8kg 이었다.
//			사과 한 개의 무게를 구하시오.
//			단, 소수점 두 자리까지 출력하시오.
//		[정답]
//			0.21g

		double total = 25.0 / 8.0;
		double oneApple = total / 15.0;
		System.out.printf("%.2fkg\n", oneApple);

	}
}
