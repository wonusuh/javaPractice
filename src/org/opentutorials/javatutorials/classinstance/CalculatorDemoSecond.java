/**
 * 
 */
package org.opentutorials.javatutorials.classinstance;

/**
 * @author YONSAI
 *
 */

class CalculatorSecond {
	static double PI = 3.14;
//	class variable base is added
	static int base = 0;
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void average() {
		System.out.println((this.left + this.right + base) / 2);
	}

}

public class CalculatorDemoSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorSecond cFirst = new CalculatorSecond();
		cFirst.setOperands(10, 20);
		cFirst.sum();

		CalculatorSecond cSecond = new CalculatorSecond();
		cSecond.setOperands(20, 40);
		cSecond.sum();

		CalculatorSecond.base = 10;
		cFirst.sum();
		cSecond.sum();

	}

}
