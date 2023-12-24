package org.opentutorials.javatutorialsfourth.constant2;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");

	private String color;

	Fruit(String color) {
		this.color = color;
		System.out.println("Call constructor " + this + " " + this.color);
	}

	public String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE
}

public class ConstantDemo {
	public static void main(String[] args) {
		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}
	}
}
