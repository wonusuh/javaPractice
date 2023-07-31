package org.opentutorials.javatutorialsfifth.reference;

class A {
	protected int id;

	protected A(int id) {
		this.id = id;
	}
}

public class ReferenceDemo1 {
	public static void main(String[] args) {
		runValue();
		runReference();
	}

	public static void runReference() {
		A a = new A(1);
		A b = a;
		b = new A(2);
		b.id = 2;
		System.out.println("runReference, " + a.id);
	}

	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue " + a);
	}
}
