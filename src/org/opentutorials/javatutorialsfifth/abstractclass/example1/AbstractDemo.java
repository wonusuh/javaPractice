package org.opentutorials.javatutorialsfifth.abstractclass.example1;

abstract class A {
	protected abstract int b();

	protected void d() {
		System.out.println("world");
	}
}

class B extends A {
	@Override
	protected int b() {
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}
}
