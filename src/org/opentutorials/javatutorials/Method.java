/**
 * 
 */
package org.opentutorials.javatutorials;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author YONSAI
 *
 */
public class Method {

	/**
	 * @param args
	 */

	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void secondNumbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void thirdNumbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static String fourthNumbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void fifthNumbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static String sixthNumbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static String seventhNumbering(int init, int limit) {
		int i = init;
		String output = "";

		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static String num(int i) {
		if (i == 0) {
			return "zero";
		} else if (i == 1) {
			return "one";
		} else if (i == 2) {
			return "two";
		}
		return "none";
	}

	public static String getMember1() {
		return "최진혁";
	}

	public static String getMember2() {
		return "최유빈";
	}

	public static String getMember3() {
		return "한이람";
	}

	public static String[] getMembers() {
		String[] members = { "최진혁", "최유빈", "한이람" };
		return members;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		numbering();
		numbering();
		numbering();
		numbering();
		numbering();

//		메소드의 입력값
		secondNumbering(5);
		secondNumbering(2);
		thirdNumbering(1, 5);
		thirdNumbering(3, 5);

//		메소드의 출력값
		String result = fourthNumbering(1, 5);
		System.out.println("result = output = " + result);

//		메소드의 출력값 2
		fifthNumbering(1, 5);

		String secondResult = sixthNumbering(1, 5);
		System.out.println(secondResult);

		String thirdResult = seventhNumbering(1, 5);
		System.out.println(thirdResult);
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(thirdResult);
			out.close();
		} catch (IOException e) {
		}

		System.out.println(num(0));
		System.out.println(num(1));
		System.out.println(num(2));
		System.out.println(num(3));

		System.out.println(getMember1());
		System.out.println(getMember2());
		System.out.println(getMember3());

		String[] members = getMembers();
		System.out.println(members);

	}

}
