package 문자열기본;

import java.util.Scanner;

public class _01문자열입력 {
	public static void main(String[] args) {

		// 클래스 => 기능을 사용하려면 항상 .(in)통해서 기능을 사용할 수 있다. : 읽기전용 문자열

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력 >> ");
		String name = sc.next(); // 공백은 인식하지 못한다
		System.out.println("name == " + name);

		System.out.print("자기소개 입력 >> ");
		String intro = sc.nextLine();
		System.out.println("intro == " + intro);
		System.out.println(intro.length());

		sc.close();
	}
}
