package 클래스_개념;

class CC {
	int a, b;
}

public class _12클배메모리구조_3 {

	public static void main(String[] args) {

		CC[] ccList = new CC[3];

		for (int i = 0; i < ccList.length; i += 1) {

			ccList[i] = new CC();

			ccList[i].a = 10;
			ccList[i].b = 20;
		}

		CC cc = ccList[0];
		cc.a = 100;
	}
}
