package org.opentutorials.javatutorialsfourth.interfaces.example2;

/*

class CalculatorDummy implements Calculatable {
public void setOperands(int left, int right, int third) {
}

public int sum() {
return 60;
}

public int avg() {
return 20;
}
}

*/public class CalculatorConsumer {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOperands(10, 20, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
		System.out.println(c.sum() + c.avg());
	}
}
