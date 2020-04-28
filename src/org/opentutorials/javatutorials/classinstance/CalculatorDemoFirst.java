/**
 * 
 */
package org.opentutorials.javatutorials.classinstance;

/**
 * @author YONSAI
 *
 */

class Calculator {
	static double PI = 3.14;
	int left, right;

	public void setOperands(int left, int right) {
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
		Calculator cFirst = new Calculator();
		System.out.println(cFirst.PI);

		Calculator cSecond = new Calculator();
		System.out.println(cSecond.PI);

		System.out.println(Calculator.PI);

	}

}
