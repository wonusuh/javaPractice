package org.opentutorials.javatutorialsthird.inheritance.example2;

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
}

class SubtractionableCalculator extends Calculator {
	public SubtractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {
	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator(200, 400);
		c1.sum();
		c1.avg();
		c1.subtract();
	}
}
