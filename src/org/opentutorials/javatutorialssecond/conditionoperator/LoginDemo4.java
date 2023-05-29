/**
 * 
 */
package org.opentutorials.javatutorialssecond.conditionoperator;

/**
 * @author user
 *
 */
public class LoginDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = args[0];
		String password = args[1];

		if (id.equals("egoing") || id.equals("sorialgi") || id.equals("k8805") && password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
