package godOfJava.chapter53;
 
public class ForCondition {	//1~100 홀수들의 합

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<101; i++) {
			if (i%2 == 1) {
				sum += i;
//				System.out.println(i);
			}
		}
		System.out.println("1~100까지 홀수들의 합은: " + sum);
	}

}
