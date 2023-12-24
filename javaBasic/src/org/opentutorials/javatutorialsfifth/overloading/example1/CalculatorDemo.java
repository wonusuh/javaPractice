package org.opentutorials.javatutorialsfifth.overloading.example1;

class Calculator {
	protected int left, right;
	protected int third;

	protected void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void setOperands(int left, int right, int third) {
		this.setOperands(left, right);
		this.third = third;
	}

	protected void sum() {
		System.out.println(this.left + this.right + this.third);
	}

	protected void avg() {
		System.out.println((this.left + this.right + this.third) / 3);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(10, 20, 30);
		c1.sum();
		c1.avg();
	}
}
