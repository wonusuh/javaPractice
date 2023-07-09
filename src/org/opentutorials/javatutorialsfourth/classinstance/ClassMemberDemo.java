package org.opentutorials.javatutorialsfourth.classinstance;

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
		C1 instance = new C1();
		instance.static_static();
		instance.static_instance();
		instance.instance_static();
		instance.instance_instance();

		C1.static_static();
		C1.static_instance();
	}
}
