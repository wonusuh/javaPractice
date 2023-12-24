package 문자열기본;

public class _06형변환 {
	public static void main(String[] args) {
		// 형변환 => 자료형의 타입을 바꾸는 것을 의미

		// 기본 자료형을 형변환 하는 방법
		char a = 'a';
		int aNum = (int) a; // 강제형변환
		System.out.printf("a = %c , aNum = %d \n", a, aNum);

		int bNum = a + 1; // 자동형변환
		System.out.println((char) bNum);

		// 문자열을 형변환 하는 방법 : 정식
		String str = "10";
		int strNum1 = Integer.parseInt(str); // 10 // 문자를 숫자로 바꾸는것
		String strNum2 = String.valueOf(10); // "10" // 숫자를 문자로 바꾸는것

		System.out.println(strNum1 + 1); // 11
		System.out.println(strNum2 + 1); // 101

		// 숫자 -> 문자로 변경 : 자동형변환

		String strNum3 = 100 + ""; // "100"
		System.out.println(strNum3 + 1); // 1001
	}
}
