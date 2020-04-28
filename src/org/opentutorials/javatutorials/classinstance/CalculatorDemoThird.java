/**
 * 
 */
package org.opentutorials.javatutorials.classinstance;

/**
 * @author YONSAI
 *
 */

class CalculatorThird {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void average(int left, int right) {
		System.out.println((left + right) / 2);
	}

}

public class CalculatorDemoThird {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorThird.sum(10, 20);
		CalculatorThird.average(10, 20);
		CalculatorThird.sum(20, 40);
		CalculatorThird.average(20, 40);

	}

}
