package _level2test;

public class 문제13 {
	public static void main(String[] args) {
		int bike = 0;
		int rope = 90;
		while (true) {
			if (bike * 4 + rope * 9 == 505) {
				System.out.println("자전거 = " + bike + "분");
				System.out.println("줄넘기 = " + rope + "분");
				break;
			}
			bike += 1;
			rope -= 1;
		}
	}
}
