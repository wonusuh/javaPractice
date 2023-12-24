package godOfJava.chapter17;

class JLoc {
	public int a; 
	public int b;
}
public class JavaUserDefinedType {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		// 사용자 정의 타입을 사용
		JLoc jloc = new JLoc();
		jloc.a = x;
		jloc.b = y;
		
		JLoc myL = jloc;
		myL.b++;
		
		System.out.println(myL.a);
		System.out.println(jloc.b);
		System.out.println(myL);
		System.out.println(jloc);
	}

}
