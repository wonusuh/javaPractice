package org.opentutorials.javatutorialsfourth.method;

public class MethodDemo4 {
	public static void numbering(int start, int limit) {
		for (int i = start; i < limit; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		numbering(5, 10);
	}
}
