/**
 * 
 */
package org.opentutorials.javatutorialssecond.progenitor;

/**
 * @author user
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

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

	public String toString() {
		return super.toString() + ", left : " + this.left + ", right : " + this.right;
	}
}

public class CalculatorDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		System.out.println(c1);
		System.out.println(c1.toString());
	}
}
