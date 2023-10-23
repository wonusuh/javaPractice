package _level2test;

public class 문제11 {
	public static void main(String[] args) {
		double first = 80.0;
		double second = 72.0;
		double average = 0.0;
		for (int i = 0; i <= 100; i += 1) {
			average = (first + second + i * 1.0) / 3;
			System.out.printf("%d점 일 때 평균 : %.2f\n", i, average);
			if (average >= 82) {
				break;
			}
		}
	}
}
