package _level2test;

public class 문제12 {
	public static void main(String[] args) {

		// 거리 = 속 * 시

		double bike = 15.0 / 60.0; // 분속
		double walking = 6.0 / 60.0; // 분속

		int i = 1;

		double time = 0.0;

		while (true) {
			if (bike * i * 1.0 == walking * (i + 18.0)) {
				time = i * 1.0;
				System.out.println(time + "분");
				break;
			}
			i += 1;
		}
		System.out.printf("%.0fkm\n", (bike * time));
	}
}
