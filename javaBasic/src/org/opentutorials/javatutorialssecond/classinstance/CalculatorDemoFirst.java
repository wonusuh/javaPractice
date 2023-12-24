/**
 * 
 */
package org.opentutorials.javatutorialssecond.classinstance;

/**
 * @author user
 *
 */
class CalculatorFirst {
	int left, right;
	static double PI = 3.14;

	public void setOperands(int _left, int right) {
		left = _left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

public class CalculatorDemoFirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorFirst c1 = new CalculatorFirst();
		System.out.println(c1.PI);

		CalculatorFirst c2 = new CalculatorFirst();
		System.out.println(c2.PI);

		System.out.println(CalculatorFirst.PI);
	}

}
