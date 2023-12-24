package org.opentutorials.javatutorialsfifth.inheritance.example1;

class MultipliableCalculator extends Calculator {
	MultipliableCalculator(int left, int right) {
		super(left, right);
	}

	protected void multiplication() {
		System.out.println(this.left * this.right);
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		MultipliableCalculator c1 = new MultipliableCalculator(10, 20);
		c1.sum();
		c1.avg();
		// c1.subtract();
		c1.multiplication();
	}
}
