package 메서드_개념;

class Test05 {

	String name;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class _09메서드기본이론5 {

	public static void main(String[] args) {

		Test05 t = new Test05();

		t.name = "스펀지밥";
		System.out.println(t.name);

		t.setName("뚱이");
		System.out.println(t.getName());
	}
}
