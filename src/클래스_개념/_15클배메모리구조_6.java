package 클래스_개념;

class Subject {
	String name;
	int socre;
}

class Student1 {
	Subject[] subjects;
	String name;
}

public class _15클배메모리구조_6 {

	public static void main(String[] args) {

		Student1[] st = new Student1[3];

		st[0] = new Student1();
		st[0].subjects = new Subject[3];

		for (int i = 0; i < 3; i += 1) {
			st[0].subjects[i] = new Subject();
		}

		st[1] = new Student1();
		st[1].subjects = new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();

		st[2] = new Student1();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();
	}
}
