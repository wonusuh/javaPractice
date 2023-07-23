package org.opentutorials.javatutorialsfifth.classinstance;

class Calculator2 {
	protected static final double PI = (float) 3.14F;
	static int base = 0;
	private int left, right;

	Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right + base);
	}

	public void avg() {
		System.out.println((this.left + this.right + base) / 2);
	}
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2(10, 20);
		c1.sum();

		Calculator2 c2 = new Calculator2(20, 40);
		c2.sum();

		Calculator2.base = 10;
		c1.sum();
		c2.sum();
	}
}
