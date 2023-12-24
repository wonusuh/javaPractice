package org.opentutorials.javatutorialsfifth.condition;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing") || id.equals("choi") || id.equals("han") && password.equals("111111")) {
			System.out.println("·Î±×ÀÎ right");
		} else {
			System.out.println("id or password wrong");
		}
	}
}
