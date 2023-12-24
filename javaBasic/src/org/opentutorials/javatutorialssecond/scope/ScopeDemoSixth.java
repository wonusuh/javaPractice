package org.opentutorials.javatutorialssecond.scope;

public class ScopeDemoSixth {
	static int i = 5;

	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		int i = 30; // local variable
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i = 1;
		a();
	}
}
