/**
 * 
 */
package org.opentutorials.javatutorials.inheritance.examplethird;

/**
 * @author YONSAI
 *
 */

class Calculator {
	int left, right;

	public Calculator() {

	}

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

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
	public SubtractionableCalculator(int left, int right) {
		super(left, right);
	}

	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemoFifth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubtractionableCalculator cFirst = new SubtractionableCalculator(10, 20);
		// 두 개의 생성자 중에 정수를 두 개 받는 생성자를 호출했다.
		cFirst.sum();
		cFirst.average();
		cFirst.subtract();

	}

}
