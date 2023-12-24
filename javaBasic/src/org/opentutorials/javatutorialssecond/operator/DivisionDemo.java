/**
 * 
 */
package org.opentutorials.javatutorialssecond.operator;

/**
 * @author user
 *
 */
public class DivisionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 3;

		float c = 10.0F;
		float d = 3.0F;

		System.out.println(a / b);
		System.out.println(c / d);
		System.out.println(a / d); // a가 float으로 implicit conversion 된다.

	}

}
