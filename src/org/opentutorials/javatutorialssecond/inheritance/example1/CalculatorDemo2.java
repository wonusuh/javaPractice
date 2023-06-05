/**
 * 
 */
package org.opentutorials.javatutorialssecond.inheritance.example1;

/**
 * @author user
 *
 */
class MultiplicationableCalculator extends Calculator {
	public void multipliction() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.multipliction();
	}

}
