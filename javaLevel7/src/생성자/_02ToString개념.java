package 생성자;

class Ex02 {

	String name;
	int price;

	Ex02(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	void printInfo() {
		System.out.println(name + " " + price + "원");
	}

	@Override
	public String toString() {
		return "Ex02 [name=" + name + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}

public class _02ToString개념 {

	public static void main(String[] args) {

		Ex02 e2 = new Ex02("사과", 2000);

		System.out.println(e2.toString());
	}
}
