package org.opentutorials.javatutorialssecond.object;

class Calculator {
	int left, right;

	public void setOperands(int left, int right) {
		this.left = left; // this.라는것은 앞에서 생성한 c1에 담긴 Calculator 인스턴스를 가리킨다.
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo4 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.setOperands(20, 40);
		c1.sum();
		c1.avg();
		Calculator c2 = new Calculator();
		c2.setOperands(40, 80);
		c2.sum();
		c2.avg();
		c2.setOperands(80, 160);
		c2.sum();
		c2.avg();
	}
}
