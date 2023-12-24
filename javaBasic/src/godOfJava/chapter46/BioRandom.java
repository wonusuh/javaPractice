package godOfJava.chapter46;

public class BioRandom {

	public static void main(String[] args) {
		int range = 10;
		int start = 1;
		int a=0, b=0, c=0;
		while(true) {
			a = (int)(Math.random() * range + start);
			b = (int)(Math.random() * range + start);
			c = (int)(Math.random() * range + start);
			System.out.printf("%d\t%d\t%d\n", a,b,c);
			if (a!=b && b!=c && c!=a) break; // 종료조건
			
		}

	}

}
