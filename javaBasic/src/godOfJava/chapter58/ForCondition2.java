
package godOfJava.chapter58;

import java.util.ArrayList;
import java.util.List;

public class ForCondition2 {


	public static void main(String[] args) {
		 List<Integer> ilist = new ArrayList<> ();
		 int s = 0;
		 for (int i=1; i <= 10; i++) {
			 ilist.add(i);
		 }
		 
		 for (int m : ilist) {
			 if (m%2 == 1) {
				 s += m*m;
				 System.out.printf("%d\t", m*m);
			 }
		 }
		 
		 System.out.println();
		 System.out.println("1~100까지 홀수들의 제곱근의 합 : " + s);

	}

}
