package org.opentutorials.javatutorials.inheritance.examplesecond;

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
	public SubtractionableCalculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemoFourth {
	public static void main(String[] args) {
		SubtractionableCalculator cFirst = new SubtractionableCalculator(10, 20);
		cFirst.sum();
		cFirst.average();
		cFirst.subtract();
	}
}
