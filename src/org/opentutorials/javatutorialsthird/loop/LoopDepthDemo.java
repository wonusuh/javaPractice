package org.opentutorials.javatutorialsthird.loop;

public class LoopDepthDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i : " + i + ", " + "j : " + j);
			}
		}
	}
}
