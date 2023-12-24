/**
 * 
 */
package org.opentutorials.javatutorials.constructor;

/**
 * @author YONSAI
 *
 */

class Calculator {
	int left, right;

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void average() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemoFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cFirst = new Calculator(10, 20);
		cFirst.sum();
		cFirst.average();

		Calculator cSecond = new Calculator(20, 40);

		cSecond.sum();
		cSecond.average();
	}
}
