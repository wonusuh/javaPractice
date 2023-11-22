package 클래스_기본;

import java.util.Scanner;

class Sample01 {
	int a;
	int b;
}

public class _03클래스메모리구조_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Sample01 s1 = new Sample01();

		s1 = new Sample01();
		s1.a = sc.nextInt(); // 100 입력

		s1 = new Sample01();

		sc.close();
	}
}
