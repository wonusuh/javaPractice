package org.opentutorials.javatutorialsthird.scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding everyday";
	}

	public static void main(String[] args) {
		a();
		// System.out.println(title);
	}
}
