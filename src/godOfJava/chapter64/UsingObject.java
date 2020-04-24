package godOfJava.chapter64;

public class UsingObject {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode()); // 네이티브 10진수
		System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1);
		System.out.println(obj2.toString()); // java.lang.Object@6d06d69c
		
		System.out.println(obj1.getClass().getName());
		String str = obj1.getClass().getName()+"@"+Integer.toHexString(obj1.hashCode());
	}

}
