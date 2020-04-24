package godOfJava.chapter66;

public class StringMain {

	public static void main(String[] args) {
		String city1 = "Asia";
		String city2 = "Europe";
		String city3 = new String("Asia");
		String city7 = "Asia";

		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1 == city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1 == city3);
		System.out.println(city1 == city7);
		System.out.println(city1.equals(city3));
		System.out.println(city1.equals(city7));
	}

}
