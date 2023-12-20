package _05인터페이스;

interface I { // 클래스간에 결속이 높으면 가독성은 좋지만 유지보수가 어렵다.
	void methodI();
}

class AAA { // 클래스 AAA는 BBB와 CCC와 느슨한 관계를 가진다.
	public void methodA(I i) { // 인터페이스로 타입을 맞췄기때문에 구현클래스가 뭐가 오든 AAA클래스에서는 알빠가 아님
		i.methodI();
	}
}

class BBB implements I {
	@Override
	public void methodI() {
		System.out.println("메서드 i를 BBB에서 구현");
	}
}

class CCC implements I {
	@Override
	public void methodI() {
		System.out.println("메서드 i를 CCC에서 구현");
	}
}

public class _04느슨한관계 {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.methodA(new BBB());
		a.methodA(new CCC());
	}
}
