/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class TypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		암시적 형 변환(implicit conversion)
		double a = 3.0F;
		System.out.println("a = " + a);
//		좁은범위에서 넓은범위로만 가능
//		byte -> short, char -> int -> long -> float -> double

//		상수와 상수의 연산
		int b = 3;
		float c = 1.0F;
		double d = b + c;
//		3은 float으로 변환되고, 3.0F + 1.0F은 double로 변환된다.
		System.out.println("d = " + d);

//		명시적 형 변환(explicit conversion)
//		암시적 형 변환이 되지 않는 경우에는 수동으로 변환해야한다.
		float e = (float) 100.0;
		int f = (int) 100.0F;
		System.out.println(e * f);

	}

}
