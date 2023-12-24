package _level2test;

public class 문제9 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 27) {
			if (27 % i == 0) {
				System.out.println(i);
				sum += i;
			}
			i += 1;
		}
		System.out.println("sum == " + sum);
	}
}
