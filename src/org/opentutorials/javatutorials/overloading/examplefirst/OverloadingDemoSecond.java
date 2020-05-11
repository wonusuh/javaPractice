/**
 * 
 */
package org.opentutorials.javatutorials.overloading.examplefirst;

/**
 * @author YONSAI
 *
 */
public class OverloadingDemoSecond extends OverloadingDemo {

	/**
	 * @param args
	 */

	void a(String argFirst, String argSecond) {
		System.out.println("sub class : void a(String argFirst, Stirng argSecond)");
	}

	void a() {
		System.out.println("sub class : void a()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemoSecond od = new OverloadingDemoSecond();
		od.a();
		od.a(1);
		od.a("coding everyday");
		od.a("coding everyday", "coding everyday");
	}

}
