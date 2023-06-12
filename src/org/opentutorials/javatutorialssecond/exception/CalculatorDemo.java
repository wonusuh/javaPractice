package org.opentutorials.javatutorialssecond.exception;

class Calculator {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void devide() {
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left / this.right);
			System.out.println(" 입니다.");
		} catch (Exception e) {
			System.out.println("\n\ne.getMessage()\n" + e.getMessage());
		}
		System.out.println("Divided");
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 0);
		c1.devide();
	}
}
