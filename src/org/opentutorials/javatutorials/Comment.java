/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Comment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		한줄 주석
		// 두 개의 변수가 같은 데이터 타입일 때 아래와 같이 코드를 작성한다.
		String a = null, b = null;
		System.out.println(a + b);

//		여러줄 주석
		/*
		 * String c, d; c = "coding"; d = "everybody"; System.out.println(c + d);
		 */

//		JavaDoc 주석
		/**
		 * 로 시작하는 주석은 자바의 문서를 만들 때 사용한다.
		 */

//		세미콜론
//		assignment statement
		double aValue = 8933.234;
//		increment statement
		aValue++;
		System.out.println(aValue);
//		method invocation statement
		System.out.println("Hello World!");
//		object creation statement
//		Bicycle myBike = new Bicycle();
		int e = 100;
		double f = 10.1;
		System.out.println(e % f);

	}

}
