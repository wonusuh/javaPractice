/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class LogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		and 연산자
		if (true && true) {
			System.out.println(1);
		}
		if (true && false) {
			System.out.println(2);
		}
		if (false && true) {
			System.out.println(3);
		}
		if (false && false) {
			System.out.println(4);
		}
		String id = "egoing";
		String password = "qwer1234";
		if (id.equals("egoing") && password.equals("qwer1234")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

//		or 연산자
		if (true || true) {
			System.out.println(1);
		}
		if (true || false) {
			System.out.println(2);
		}
		if (false || true) {
			System.out.println(3);
		}
		if (false || false) {
			System.out.println(4);
		}
		String id2 = "sorialgi";
		String password2 = "1234";
		if ((id2.equals("egoing") || id2.equals("k8805") || id2.equals("sorialgi")) && password2.equals("1234")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

//		not 연산자
		if (!true) {
			System.out.println(1);
		}
		if (!false) {
			System.out.println(2);
		}

	}

}
