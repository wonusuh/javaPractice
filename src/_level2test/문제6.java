package _level2test;

public class 문제6 {
	public static void main(String[] args) {
		int i = 100;
		while (true) {
			if (i % 9 == 0) {
				System.out.println(i);
				break;
			}
			i += 1;
		}
	}
}
