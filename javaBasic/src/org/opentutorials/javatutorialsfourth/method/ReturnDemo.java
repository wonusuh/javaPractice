package org.opentutorials.javatutorialsfourth.method;

public class ReturnDemo {
	public static String getMembers(int param) {
		String[] members = { "first", "second", "third", "fourth" };
		return members[param];
	}

	public static void main(String[] args) {
		System.out.println(getMembers(2));
	}
}
