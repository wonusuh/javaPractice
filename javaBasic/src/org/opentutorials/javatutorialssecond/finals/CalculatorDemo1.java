/**
 * 
 */
package org.opentutorials.javatutorialssecond.finals;

/**
 * @author user
 *
 */
class Calculator {
	static final double PI = 3.14;
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
// 		Calculator.PI = 6;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
//		Calculator.PI = 10;
	}
}
