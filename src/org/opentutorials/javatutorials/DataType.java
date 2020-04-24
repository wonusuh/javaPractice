/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		정수형
		byte a = -128;
		byte b = 127;
		System.out.println(a + b);

		long c = 2147483647;
		long d = 1;
		System.out.println(c % d);

		int e = 2147483647;
		long f = 2147483647;
		System.out.println(e % f);

//		실수형
		float g = 0;
		double h = 0;
		System.out.println(g % h);

//		문자
		char i = 'a';
		System.out.println(i);

	}

}
