/**
 * 
 */
package org.opentutorials.javatutorials.inheritance.examplefirst;

/**
 * @author YONSAI
 *
 */

class Calculator {
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

class SubtractionableCalculator extends Calculator {
	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemoFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractionableCalculator cFirst = new SubtractionableCalculator();
		cFirst.setOperands(10, 20);
		cFirst.sum();
		cFirst.average();
		cFirst.subtract();

	}

}
