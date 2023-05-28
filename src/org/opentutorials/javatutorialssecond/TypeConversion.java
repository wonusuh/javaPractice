/**
 * 
 */
package org.opentutorials.javatutorialssecond;

/**
 * @author user
 *
 */
public class TypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// implicit conversion
		double a = 3.0F;
		// float b= 3.0; error (implicit conversion이 되지 않는다.)
		int b = 3;
		float c = 1.0F;
		double d = b + c;
		// b가 float으로 implicit conversion 된다.
		// ( b + c )가 double로 implicit conversion 된다.
		System.out.println(d);

		// explicit conversion
		// float e = 100.0; error (implicit conversion이 안된다.)
		// int f = 110.0F; error (implicit conversion이 안된다.)
		float e = (float) 100.0;
		int f = (int) 100.0F;

	}

}
