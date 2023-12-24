/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Constant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1; // a는 변수이고 1은 상수이다.
		System.out.println(a);

//		상수와 데이터 타입

//		실수의 표현
		double b = 2.2;
		double c = 2.2F;
		System.out.println(b * c);

//		정수의 표현
		int d = 2147483647;
		long e = 2147483648L;
		System.out.println(d * e);
//		자바는 byte와 short 타입에 대해서는 int 형을 허용하기 때문에
		byte f = 100;
		short g = 200;
		System.out.println(f * g);

	}

}
