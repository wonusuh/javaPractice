/**
 * 
 */
package org.opentutorials.javatutorialssecond.io;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Scanner2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		System.out.println("number needed");
		sc.close();
	}

}
