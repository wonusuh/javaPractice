package org.opentutorials.javatutorialsthird.variables;

class Bicycle {
}

public class CommentAndSemicolon {
	public static void main(String[] args) {
		// 두 개의 변수가 같은 데이터타입일 때 아래와 같이 코드를 작성한다.
		String a, b;
		/*
		 * a = "coding"; b = " everyday"; System.out.println(a + b);
		 */

		double aValue = 8933.234; // assignment "statement"
		aValue++; // increment "statement"
		System.out.println(aValue); // method invocation "statement"
		Bicycle myBike = new Bicycle(); // object creation "statement"
	}
}
