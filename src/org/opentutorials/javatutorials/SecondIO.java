/**
 * 
 */
package org.opentutorials.javatutorials;

import java.util.Scanner;

/**
 * @author YONSAI
 *
 */
public class SecondIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		sc.close();
	}
	

}
