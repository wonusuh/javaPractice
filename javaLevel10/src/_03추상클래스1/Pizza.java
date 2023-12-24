package _03추상클래스1;

public abstract class Pizza {
	int price;
	String brand, name;

	void makePizza() {
		makeDough();
		putTopping();
		bakePizza();
		cutPizza();
		putInBox();
	}

	void makeDough() {
		System.out.println("피자 도우 만들기");
	}

	abstract void putTopping();

	void bakePizza() {
		System.out.println(name + " 피자 굽기");
	}

	void cutPizza() {
		System.out.println("피자 자르기");
	}

	void putInBox() {
		System.out.println("피자 포장하기");
	}
}
