package 문자열기본;

public class _04문자열비교2 {
	public static void main(String[] args) {

		char str1 = '가';
		char str2 = '나';
		String str3 = "가";
		String str4 = "나";

		// compareTo : cha의 숫자특성을 이용해서 문자열이 같은지 다른지를 비교 : 정렬

		System.out.println((int) str1);
		System.out.println((int) str2);

		System.out.println(str3.compareTo(str4) == 0);
	}
}
