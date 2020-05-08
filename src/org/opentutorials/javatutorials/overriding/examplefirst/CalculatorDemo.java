/**
 * 
 */
package org.opentutorials.javatutorials.overriding.examplefirst;

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
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
	}

	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {

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
