package org.opentutorials.javatutorialsthird.polymorphism;

class O {
	public void a(int param) {
		System.out.print("int : ");
		System.out.println(param);
	}

	public void a(String param) {
		System.out.print("String : ");
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
