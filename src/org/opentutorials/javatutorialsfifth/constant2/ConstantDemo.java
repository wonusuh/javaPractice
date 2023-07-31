package org.opentutorials.javatutorialsfifth.constant2;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");

	protected String color;

	private Fruit(String color) {
		this.color = color;
		System.out.println("Call constructor " + this);
	}

	protected String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo {
	public static void main(String[] args) {
		/*
		 * Fruit type = Fruit.BANANA; switch (type) { case APPLE: System.out.println(57
		 * + " kcal, " + Fruit.APPLE.getColor()); break; case PEACH:
		 * System.out.println(34 + " kcal"); break; case BANANA: System.out.println(93 +
		 * " kcal " + Fruit.BANANA.getColor()); break; }
		 */
		for (Fruit f : Fruit.values()) {
			System.out.println(f + ", " + f.getColor());
		}
	}
}
