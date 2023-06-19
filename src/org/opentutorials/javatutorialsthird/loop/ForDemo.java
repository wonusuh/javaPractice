package org.opentutorials.javatutorialsthird.loop;

public class ForDemo {
	public static void main(String[] args) {
		int i = 0;
		int max = 1000;

		for (i = 0; i < max; i = (i + 1) * 2) {
			System.out.println("Coding everydey" + i);
		}
	}
}
