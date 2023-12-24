/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (true) {
			System.out.println("result : true");
		}

		if (false) {
			System.out.println("result : true");
		}

		if (true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);

		if (false) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);

		if (true) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

		if (false) {
			System.out.println(1);
		} else {
			System.out.println(2);
		}

		if (false) {
			System.out.println(1);
		} else if (true) {
			System.out.println(2);
		} else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

		if (false) {
			System.out.println(1);
		} else if (false) {
			System.out.println(2);
		} else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

		if (false) {
			System.out.println(1);
		} else if (false) {
			System.out.println(2);
		} else if (false) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

//		변수와 비교연산자 그리고 조건문
		String id = "wonu";
		if (id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

//		조건문의 중첩
		String id2 = "egoing";
		String password = "qwer1234";
		if (id2.equals("egoing")) {
			if (password.equals("qwer1234")) {
				System.out.println("id, password : right");
			} else {
				System.out.println("password : wrong");
			}
		} else {
			System.out.println("id : wrong");
		}

//		switch 문
		System.out.println("switch (1)");
		switch (1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		System.out.println("switch (2)");
		switch (2) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		System.out.println("switch (3)");
		switch (3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}

		int val = 1;
		if (val == 1) {
			System.out.println("one");
		} else if (val == 2) {
			System.out.println("two");
		} else if (val == 2) {
			System.out.println("three");
		}

		System.out.println("switch2 (1)");
		switch (1) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println("switch2 (2)");
		switch (2) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println("switch2 (3)");
		switch (3) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}
		System.out.println("switch2 (4)");
		switch (4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
