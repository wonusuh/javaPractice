package godOfJava.chapter71;

public class SystemTest {
	
	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for (int i=0; i<1.0e5; i++) {
			System.out.println("");
		}
		long ltime2 = System.currentTimeMillis();
		System.out.println(ltime2-ltime);
	}
}
