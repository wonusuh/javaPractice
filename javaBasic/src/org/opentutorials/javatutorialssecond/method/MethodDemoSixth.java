package org.opentutorials.javatutorialssecond.method;

public class MethodDemoSixth {
	public static String numbering(int init, int limit) {
		String output = "";
		for (int i = init; i < limit; i++) {
			output += i; // output = output + i;
		}
		return output;
	}

	public static void main(String[] args) {
		String result = numbering(1, 10);
		System.out.println(result);
	}
}
