package godOfJava.chapter16;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {

	public static void main(String[] args) {
		// 배열
		int[] m = { 1, 2, 3 };
		int[] n = new int[] { 1, 2, 3 };
		// 참조
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();

		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
		System.out.println(m);
		System.out.println(n);
	}

}
