package godOfJava.chapter20;

class Student {
	int[] grade;
}

public class Grad {

	public static void main(String[] args) {
		// a 70,80 b 80,90
		Student a = new Student();
		Student b = new Student();
		a.grade = new int[] {70,80};
		b.grade = new int[] {80,90};
		int total = 0;
		for (int i = 0; i < a.grade.length; i++) {
			total += a.grade[i];
 
		}
		
		System.out.println("a의 총점은 " + total);
	}
}
