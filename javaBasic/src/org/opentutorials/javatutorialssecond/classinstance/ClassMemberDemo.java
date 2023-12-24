/**
 * 
 */
package org.opentutorials.javatutorialssecond.classinstance;

/**
 * @author user
 *
 */
class CFirst {
	static int staticVariable = 1;
	int instanceVariable = 2;

	static void staticStatic() {
		System.out.println(staticVariable);
	}

	static void staticInstance() {
		// System.out.println(instanceVariable);
	}

	void instanceStatic() {
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
		// 인스턴스를 이용해 정적 메소드에 접근
		// 정적 메소드가 정적 변수에 접근
		c.staticStatic();

		// 인스턴스를 이용해 정적 메소드에 접근
		// 정적 메소드가 인스턴스 변수에 접근 (실패)
		c.staticInstance();

		// 인스턴스를 이용해 인스턴스 메소드에 접근
		// 인스턴스 메소드가 정적 변수에 접근
		c.instanceStatic();

		// 인스턴스를 이용해 인스턴스 메소드에 접근
		// 인스턴스 메소드가 인스턴스 변수에 접근
		c.instanceInstance();

		// 클래스를 이용해 클래스 메소드에 접근
		// 클래스 메소드가 클래스 변수에 접근
		CFirst.staticStatic();

		// 클래스를 이용해 클래스 메소드에 접근
		// 클래스 메소드가 정적 변수에 접근 (실패)
		CFirst.staticInstance();

		// 클래스를 이용해 인스턴스 메소드에 접근 (실패)
		// CFirst.instanceStatic();

		// 클래스를 이용해 인스턴스 메소드에 접근 (실패)
		// CFirst.instanceInstance();
	}

}
