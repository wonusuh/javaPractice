/**
 * 
 */
package org.opentutorials.javatutorials.inheritance.examplefirst;

/**
 * @author YONSAI
 *
 */

class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemoSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationableCalculator cFirst = new MultiplicationableCalculator();
		cFirst.setOperands(10, 20);
		cFirst.sum();
		cFirst.average();
		cFirst.multiplication();

	}

}
