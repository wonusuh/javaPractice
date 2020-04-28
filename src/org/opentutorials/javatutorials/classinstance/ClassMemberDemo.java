/**
 * 
 */
package org.opentutorials.javatutorials.classinstance;

/**
 * @author YONSAI
 *
 */

class CFirst {
	static int staticVariable = 1;
	int instanceVariable = 2;

	static void staticStatic() {
		System.out.println(staticVariable);
	}

	static void staticInstance() {
		// 클래스메소드에서는 인스턴스변수에 접근할 수 "없다".
		// System.out.println(instanceVariable);
	}

	void instanceStatic() {
		// 인스턴스메소드에서는 클래스변수에 접근할 수 "있다".
		System.out.println(staticVariable);
	}

	void instanceInstance() {
		System.out.println(instanceVariable);
	}

}

class ClassMemberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CFirst c = new CFirst();
		// 인스턴스를 이용해 정적메소드에 접근 -> 성공
		// 인스턴스메소드가 정적변수에 접근 -> 성공
		c.staticStatic();

		// 인스턴스를 이용해 정적메소드에 접근 -> 성공
		// 정적메소드가 인스턴스변수에 접근 -> 실패
		c.staticInstance();

		// 인스턴스를 이용해 인스턴스메소드에 접근 -> 성공
		// 인스턴스메소드가 클래스변수에 접근 -> 성공
		c.instanceStatic();

		// 인스턴스를 이용해 인스턴스메소드에 접근 -> 성공
		// 인스턴스메소드가 인스턴스변수에 접근 -> 성공
		c.instanceInstance();

		// 클래스를 이용해 클래스메소드에 접근 -> 성공
		// 클래스메소드가 클래스변수에 접근 -> 성공
		CFirst.staticStatic();

		// 클래스를 이용해 클래스메소드에 접근 -> 성공
		// 클래스메소드가 인스턴스변수에 접근 -> 실패
		CFirst.staticInstance();

		// 클래스를 이용해 인스턴스메소드에 접근 -> 실패
		// CFirst.instanceStatic();

		// 클래스를 이용해 인스턴스메소드에 접근 -> 실패
		// CFirst.instanceInstance();

	}

}
