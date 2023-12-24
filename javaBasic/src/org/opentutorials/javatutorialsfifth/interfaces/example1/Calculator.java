package org.opentutorials.javatutorialsfifth.interfaces.example1;

class Calculator {
	int left, right;

	protected void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	protected void sum() {
		System.out.println(left + right);
	}

	protected void avg() {
		System.out.println((left + right) / 2);
	}
}
