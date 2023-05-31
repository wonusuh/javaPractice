/**
 * 
 */
package org.opentutorials.javatutorialssecond.io;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class ScannerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
	}

}
