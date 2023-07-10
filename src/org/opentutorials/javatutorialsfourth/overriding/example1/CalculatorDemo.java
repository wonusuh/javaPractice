package org.opentutorials.javatutorialsfourth.overriding.example1;

class Calculator {
	int left, right;

	public Calculator() {
	}

	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() {
		return (this.left + this.right) / 2;
	}
}

class SubtractionableCalculator extends Calculator {
	public SubtractionableCalculator(int left, int right) {
		super(left, right);
	}

	public void sum() {
		System.out.println("execution result is : <" + (this.left + this.right) + ">");
	}

	public int avg() {
		return super.avg();
	}

	public void subtract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubtractionableCalculator c1 = new SubtractionableCalculator(10, 20);
		c1.sum();
		System.out.println(c1.avg());
		c1.subtract();
	}
}
