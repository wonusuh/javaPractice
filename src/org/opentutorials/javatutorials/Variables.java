/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		정수
		int a;
		a = 1;
		System.out.println(a + 1); // 2
		a = 2;
		System.out.println(a + 1); // 3

//		실수
		double b = 1.1;
		System.out.println(b + 1.1); // 2.2
		b = 2.1;
		System.out.println(b + 1.1); // 3.2
//		int c = 1.1; error

//		문자열
		String first = "coding";
		System.out.println(first + " " + "everybody");
		String d, e;
		d = "coding";
		e = " everybody";
		System.out.println(d + e);

//		변수가 없다면
		System.out.println(100 + 10);
		System.out.println((100 + 10) / 10);
		System.out.println(((100 + 10) / 10) - 10);
		System.out.println((((100 + 10) / 10) - 10) * 10);
//		계산해야 할 값을 100이 아니라 1000으로 바꿔야
//		한다면 위의 코드를 모두 수정해야 할 것이다.

//		변수가 있다면
		int f = 100;
		System.out.println(f + 10);
		System.out.println((f + 10) / 10);
		System.out.println(((f + 10) / 10) - 10);
		System.out.println((((f + 10) / 10) - 10) * 10);

	}

}
