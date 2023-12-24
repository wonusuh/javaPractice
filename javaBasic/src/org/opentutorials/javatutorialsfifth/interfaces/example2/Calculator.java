package org.opentutorials.javatutorialsfifth.interfaces.example2;

public class Calculator implements Calculatable {
	private int first, second, third;

	@Override
	public void setOperands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	@Override
	public int sum() {
		return first + second + third;
	}

	@Override
	public int avg() {
		return (first + second + third) / 3;
	}
}
