/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Compare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		System.out.println(a == b);
		System.out.println(a == 1);
		System.out.println("one" == "two");
		System.out.println("one" == "one");

		System.out.println(a != b);
		System.out.println(a != 1);
		System.out.println("one" != "two");
		System.out.println("one" != "one");

		System.out.println(10 > 20);
		System.out.println(10 > 2);
		System.out.println(10 > 10);

		System.out.println(10 >= 20);
		System.out.println(10 >= 2);
		System.out.println(10 >= 10);

		String c = "Hello world!";
		String d = new String("Hello world!"); // 생성자
		System.out.println(c == d);
		System.out.println(c.equals(d));

	}

}
