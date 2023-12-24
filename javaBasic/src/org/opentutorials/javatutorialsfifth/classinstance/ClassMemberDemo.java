package org.opentutorials.javatutorialsfifth.classinstance;

class C1 {
	static int static_variable = 1;
	int instance_variable = 2;

	static void static_static() {
		System.out.println(static_variable);
	}

	static void static_instance() {
		System.out.println(/* instance_variable */);
	}

	void instance_static() {
		System.out.println(static_variable);
	}

	void instance_instance() {
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		c.static_static();
		c.static_instance();
		c.instance_static();
		c.instance_instance();

		C1.static_static();
		C1.static_instance();
		// C1.instance_static();
		// C1.instance_instance();
	}
}
