package org.opentutorials.javatutorialsfourth.condition;

public class LoginDemo2 {
	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if (id.equals("egoing") || id.equals("k8805") || id.equals("sorialgi") && pw.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
