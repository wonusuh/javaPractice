package _level2test;

public class 문제7 {
	public static void main(String[] args) {
		int i = 1;
		int cnt = 0;
		while (i <= 1980) {
			if (1980 % i == 0) {
				if (i % 1000 / 100 == 3) {
					cnt += 1;
					if (cnt == 2) {
						System.out.println(i);
					}
				}
			}
			i += 1;
		}
	}
}
