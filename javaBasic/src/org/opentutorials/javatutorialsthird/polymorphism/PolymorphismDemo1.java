package org.opentutorials.javatutorialsthird.polymorphism;

class A {
	public String x() {
		return "A.x()";
	}
}

class B extends A {
	public String x() {
		return "B.x()";
	}

	public String y() {
		return "y()";
	}
}

class B2 extends A {
	public String x() {
		return "B2.x()";
	}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		A obj = new B();
		System.out.println(obj.x());

		A obj2 = new B2();
		System.out.println(obj2.x());
	}
}
