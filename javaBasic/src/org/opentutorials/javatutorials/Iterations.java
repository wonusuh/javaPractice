/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Iterations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while
		int i = 0;
		while (i < 10) {
			System.out.println("Coding Everyday" + i);
			i++;
		}

//		for
		for (int j = 5; j < 20; j += 2) {
			System.out.println("coding everyday" + j);
		}

//		반복문의 효용
		int max = 10;
		int k = 0;
		while (k < max) {
			System.out.println("coding everyday" + (k + 1) * 2);
			k++;
		}

//		반복문의 제어
		for (int l = 0; l < 10; l++) {
			if (l == 5) {
				break;
			}
			System.out.println("coding everyday " + l);
		}
		for (int m = 0; m < 10; m++) {
			if (m == 5) {
				continue;
			}
			System.out.println("coding everyday " + m);
		}

//		반복문의 중첩
		for (int n = 0; n < 10; n++) {
			for (int o = 0; o < 10; o++) {
				System.out.println(n + "" + o);
			}
		}

	}

}
