/**
 * 
 */
package org.opentutorials.javatutorialssecond.condition;

/**
 * @author user
 *
 */
public class LoginDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String id = args[0]; // <-명령 프롬프트에서 입력한 값이 이 안으로 들어온다.
		if (id.equals("egoing")) {
			System.out.println("rignt");
		} else {
			System.out.println("wrong");
		}

	}

}
