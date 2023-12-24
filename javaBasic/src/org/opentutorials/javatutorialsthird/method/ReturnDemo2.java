package org.opentutorials.javatutorialsthird.method;

public class ReturnDemo2 {
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

	public static void main(String[] args) {
		System.out.println(num(0));
		System.out.println(num(1));
		System.out.println(num(2));
		System.out.println(num(3));
	}
}
