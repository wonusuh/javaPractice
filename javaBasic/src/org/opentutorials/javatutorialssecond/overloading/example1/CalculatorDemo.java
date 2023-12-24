/**
 * 
 */
package org.opentutorials.javatutorialssecond.overloading.example1;

/**
 * @author user
 *
 */
class Calculator {
	int left, right;
	int third = 0;

	public void setOperands(int left, int right) {
		System.out.println("setOperands(int left, int right)");
		this.left = left;
		this.right = right;
	}

	public void setOperands(int left, int right, int third) {
		System.out.println("setOperands(int left, int right, int third)");
		this.setOperands(left, right);
		this.third = third;
	}

	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	public void average() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cFirst = new Calculator();
		cFirst.setOperands(10, 20);
		cFirst.sum();
		cFirst.average();
		cFirst.setOperands(10, 20, 30);
		cFirst.sum();
		cFirst.average();
	}
}
