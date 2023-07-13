package org.opentutorials.javatutorialsfourth.polymorphism;

interface father {
}

interface mother {
}

interface programmer {
	public void coding();
}

interface believer {
}

class Rachel implements mother, programmer {
	@Override
	public void coding() {
		System.out.println("elegance");
	}
}

class Steve implements father, programmer, believer {
	@Override
	public void coding() {
		System.out.println("fast");
	}
}

public class Workspace {
	public static void main(String[] args) {
		programmer employee1 = new Steve();
		programmer employee2 = new Rachel();

		employee1.coding();
		employee2.coding();
	}
}
