/**
 * 
 */
package org.opentutorials.javatutorialssecond.condition;

/**
 * @author user
 *
 */
public class LoginDemoSecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = args[0];
		String password = args[1];

		if (id.equals("egoing")) {
			if (password.equals("111111")) {
				System.out.println("rignt");
			} else {
				System.out.println("worng");
			}
		} else {
			System.out.println("wrong");
		}

	}

}
