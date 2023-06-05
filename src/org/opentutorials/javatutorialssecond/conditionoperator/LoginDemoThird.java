/**
 * 
 */
package org.opentutorials.javatutorialssecond.conditionoperator;

/**
 * @author user
 *
 */
public class LoginDemoThird {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = args[0];
		String password = args[1];

		if (id.equals("egoing") && password.equals("111111")) {
			System.out.println("rignt");
		} else {
			System.out.println("wrong");
		}

	}

}
