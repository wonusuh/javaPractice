/**
 * 
 */
package org.opentutorials.javatutorials.overloading.examplefirst;

/**
 * @author YONSAI
 *
 */
public class OverloadingDemo {

	/**
	 * @param args
	 */
	void a() {
		System.out.println("void a()");
	}

	void a(int argFirst) {
		System.out.println("void a(int argFirst)");
	}

//	void a(int paramFirst) {
//		System.out.println("void a(int argFirst)");
//	}

	void a(String argFirst) {
		System.out.println("void a(String argFirst)");
	}

//	int a() {
//		System.out.println("void a()");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od = new OverloadingDemo();
		od.a();
		od.a(1);
		od.a("coding everyday");
	}

}
