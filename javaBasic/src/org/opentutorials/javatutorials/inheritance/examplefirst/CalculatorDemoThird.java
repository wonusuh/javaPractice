/**
 * 
 */
package org.opentutorials.javatutorials.inheritance.examplefirst;

/**
 * @author YONSAI
 *
 */

class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemoThird {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionableCalculator cFirst = new DivisionableCalculator();
		cFirst.setOperands(10, 20);
		cFirst.sum();
		cFirst.average();
		// cFirst.subtract();
		cFirst.multiplication();
		cFirst.division();

	}

}
