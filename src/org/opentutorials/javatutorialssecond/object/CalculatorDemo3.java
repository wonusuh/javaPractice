/**
 * 
 */
package org.opentutorials.javatutorialssecond.object;

/**
 * @author user
 *
 */
public class CalculatorDemo3 {
	/**
	 * @param args
	 */
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 10, right = 20;
		sum(left, right);
		avg(left, right);

		left = 20;
		right = 40;
		sum(left, right);
		avg(left, right);
	}
}
