/**
 * 
 */
package org.opentutorials.javatutorialssecond.inheritance.example1;

/**
 * @author user
 *
 */
class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.multipliction();
		c1.division();
	}

}
