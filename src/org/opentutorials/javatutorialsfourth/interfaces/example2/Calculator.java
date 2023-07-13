package org.opentutorials.javatutorialsfourth.interfaces.example2;

class Calculator implements Calculatable {
	int left, right, third;

	public void setOperands(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
	}

	public int sum() {
		return this.left + this.right + this.third;
	}

	public int avg() {
		return (this.left + this.right + this.third) / 3;
	}
}
