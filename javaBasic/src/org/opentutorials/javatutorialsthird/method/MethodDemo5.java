package org.opentutorials.javatutorialsthird.method;

public class MethodDemo5 {
	public static void numbering(int init, int limit) {
		while (init < limit) {
			System.out.println(init);
			init++;
		}
	}

	public static void main(String[] args) {
		numbering(2, 10);
	}
}
