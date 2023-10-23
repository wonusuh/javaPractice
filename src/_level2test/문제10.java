package _level2test;

public class 문제10 {
	public static void main(String[] args) {
		int i = 1000;
		int cnt = 0;
		while (i > 0) {
			if (i % 8 == 0) {
				cnt += 1;
				if (cnt != 4) {
					System.out.print(i + ", ");
				} else if (cnt == 4) {
					System.out.print(i);
					break;
				}
			}
			i -= 1;
		}
	}
}
