package 클래스_개념;

class DD {
	int a, b;
}

public class _13클배메모리구조_4 {

	public static void main(String[] args) {

		DD[] ddList = new DD[3];

		DD d1 = new DD();
		d1.a = 100;
		ddList[0] = d1;

		d1 = new DD();
		d1.a = 200;
		ddList[1] = d1;

		d1 = new DD();
		d1.a = 300;
		ddList[2] = d1;

		System.out.println(ddList[0].a);
		System.out.println(ddList[1].a);
		System.out.println(ddList[2].a);
	}
}
