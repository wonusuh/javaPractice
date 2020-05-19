/**
 * 
 */
package org.opentutorials.javatutorials.accessmodifier;

/**
 * @author YONSAI
 *
 */

class A {
	public String y() {
		return "public void y()";
	}

	private String z() {
		return "public void z()";
	}

	public String x() {
		return z();
	}
}

public class AccessDemoFirst {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();

		System.out.println(a.y());
//		System.out.println(a.z());
		System.out.println(a.x());
	}

}
