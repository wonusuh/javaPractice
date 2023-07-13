package org.opentutorials.javatutorialsfourth.polymorphism;

class O {
	public void a(int param) {
		System.out.println("printing numbers");
		System.out.println(param);
	}

	public void a(String param) {
		System.out.println("printing letters");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {
	public static void main(String[] args) {
		O o = new O();
		o.a(1);
		o.a("one");
	}
}
