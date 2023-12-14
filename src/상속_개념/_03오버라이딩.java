package 상속_개념;

class Parent {
	void test1() {
		System.out.println("부모 test1");
	}
}

class Child extends Parent {
	void test2() {
		System.out.println("test2");
	}

	@Override
	void test1() {
		System.out.println("자식 test1");
		super.test1();
	}
}

public class _03오버라이딩 {
	public static void main(String[] args) {
		Child c = new Child();
		c.test1();
		c.test2();
	}
}
