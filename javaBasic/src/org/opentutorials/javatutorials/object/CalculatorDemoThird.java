/**
 * 
 */
package org.opentutorials.javatutorials.object;

/**
 * @author YONSAI
 *
 */
public class CalculatorDemoThird {

	/**
	 * @param args
	 */

	public static void average(int left, int right) {
		System.out.println((left + right) / 2);
	}

	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left, right;

		left = 10;
		right = 20;

		sum(left, right);
		average(left, right);

		left = 20;
		right = 40;

		sum(left, right);
		average(left, right);

	}

}
