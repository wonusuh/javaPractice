/**
 * 
 */
package org.opentutorials.javatutorialssecond.abstractclass.example2;

/**
 * @author user
 *
 */
abstract class A {
	public abstract int b();

// public abstract int c() {System.out.println("Hello");}

	public void d() {
		System.out.println("world");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj = new A();
		B obj = new B();
	}
}
