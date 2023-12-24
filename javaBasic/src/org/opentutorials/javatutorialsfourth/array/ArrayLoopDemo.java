package org.opentutorials.javatutorialsfourth.array;

public class ArrayLoopDemo {
	public static void main(String[] args) {
		String[] classGroup = { "Jinhyeok", "Yubin", "Iram", "Egoing" };
		for (int i = 0; i < classGroup.length; i++) {
			System.out.println(classGroup[i] + " has done consultant.");
		}
		System.out.println("the consultant of all students have ended.");
	}
}
