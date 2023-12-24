package org.opentutorials.javatutorialsfourth.abstractclass.example1;

abstract class A {
	public abstract int b();

	public void d() {
		System.out.println("world");
	}
}

class B extends A {

	@Override
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		B obj = new B();
	}
}
