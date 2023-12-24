package _level2test;

public class 문제8 {
	public static void main(String[] args) {
		int cs = 13;
		int father = 45;
		int i = 1;
		while (true) {
			cs += 1;
			father += 1;
			if (cs * 3 == father) {
				System.out.println(i + "년");
				break;
			}
			i += 1;
		}
	}
}
