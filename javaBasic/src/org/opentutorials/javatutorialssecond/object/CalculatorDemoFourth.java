package org.opentutorials.javatutorialssecond.object;

class Calculator {
	int left, right;

	public void setOperands(int _left, int right) {
		left = _left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemoFourth {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();

		Calculator c2 = new Calculator();
		c2.setOperands(40, 80);
		c2.sum();
		c2.avg();
	}
}
