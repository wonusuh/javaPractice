package 문자열기본;

import java.util.Arrays;

public class _05문자열함수 {
	public static void main(String[] args) {
		// 0 12 3456
		String str = "가나다라마바사";

		// 1.문자 한개 추출 =>
		char a = str.charAt(0); // '가'

		// 2. 문자 한개~ 여러개 추출
		String b = str.substring(4); // 입력한 인덱스 부터 끝까지
		System.out.println(b); // 마바자
		b = str.substring(2, 2);
		System.out.println(b); // 다

		String str2 = ""; // 주소값은 있지만 문자열이 비어있는 상태
		String str3 = null; // 비어있는주소 => 참조변수에만 사용할 수 있다
		// int num = null; => 기본변수는 순수하게 값을 저장하기때문에 null 사용 불가능
		String str4 = "\t";

		System.out.println(str2.equals(str3));
		// System.out.println(str3.compareTo(str2)); null은 . 접근이 불가능하다

		System.out.println(str2.length() == 0); // 빈 문자열이다
		System.out.println(str2.isEmpty());// 빈 문자열이다
		System.out.println(str2.isBlank()); // 빈문자열은 공백이다

		// blank => 공백(white space)
		System.out.println(str4.isEmpty()); // false
		System.out.println(str4.isBlank()); // true

		str = "떡볶이,짜장면,치킨,우동,돈까스";

		// split(구분자) => String -> String[]

		String[] food = str.split(",");
		System.out.println(Arrays.toString(food));
		System.out.println(food[2]);

		// trim() => 앞 뒤에 있는 공백을 제거해주는 함수

		str = "    hello     world     ";
		System.out.println(str.trim()); // 중간에 있는 공백은 제거 해주지 않음

		// 문자열 변경

		str = "HelloHelloHello";
		System.out.println(str.replace("Hello", "A"));
		str = "Hello Hi Hello";
		System.out.println(str.replaceAll("Hello", "A"));
		System.out.println(str.replaceAll(" ", ""));
//===========
		/*
		 * 기준문자열.compareTo(비교문자열) => 음수 : 기준문자열이 사전적으로 앞선 문자다 기준문자열.compareTo(비교문자열) =>
		 * 0 : 두 문자열이 같다 기준문자열.compareTo(비교문자열) => 양수 : 기준문자열이 사전적으로 뒤에 있는 문자다
		 */

	}
}
