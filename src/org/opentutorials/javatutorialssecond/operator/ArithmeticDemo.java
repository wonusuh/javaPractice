/**
 * 
 */
package org.opentutorials.javatutorialssecond.operator;

/**
 * @author user
 *
 */
public class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// result의 값은 3
		int result = 1 + 2;
		System.out.println(result);

		// result의 값은 2
		result = result - 1;
		System.out.println(result);

		// result의 값은 4
		result = result * 2;
		System.out.println(result);

		// result의 값은 2
		result = result / 2;
		System.out.println(result);

		// result의 값은 10
		result = result + 8;
		// result의 값은 3
		result = result % 7;
		System.out.println(result);

	}

}
