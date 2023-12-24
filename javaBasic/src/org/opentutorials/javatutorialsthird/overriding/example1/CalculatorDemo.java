package org.opentutorials.javatutorialsthird.overriding.example1;

class Calculator {
	int left, right;

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
		System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
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
		System.out.println("실행 결과는 " + c1.avg() + "입니다.");
		c1.subtract();
	}
}
