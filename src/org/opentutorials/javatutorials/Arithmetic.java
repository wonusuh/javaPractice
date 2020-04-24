/**
 * 
 */
package org.opentutorials.javatutorials;

/**
 * @author YONSAI
 *
 */
public class Arithmetic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		대입연산자, 산술연산자, 비교연산자 논리연산자, etc

//		산술연산자(arithmetic)
		int result = 1 + 2;
		System.out.println(result);

		result = result - 1;
		System.out.println(result);

		result = result * 2;
		System.out.println(result);

		result = result / 2;
		System.out.println(result);

		result = result + 8;
		result = result % 7;
		System.out.println(result);

		int a = 3;
		System.out.print(0 % a);
		System.out.print(1 % a);
		System.out.print(2 % a);
		System.out.print(3 % a);
		System.out.print(4 % a);
		System.out.print(5 % a);
		System.out.print(6 % a);
		System.out.print(7 % a);
		System.out.println(8 % a);

		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);

		int b = 10;
		int c = 3;
		float d = 10.0F;
		float e = 3.0F;
		System.out.println(b / c + " 나머지가 버려졌다.");
		System.out.println(d / e);
		System.out.println(b / e + " 암시적형변환 : 정수가 실수가 됐다.");

//		단항연산자(unary operator)
		int i = 3;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);

//		연산의 우선순위
		int f = 4 - 3 * 6;
		System.out.println(f);

	}

}
