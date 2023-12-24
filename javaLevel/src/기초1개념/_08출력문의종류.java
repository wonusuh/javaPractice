package 기초1개념;

// %d : 십진수 = 정수
// %f : 실수
// %c : 문자 한 개
// %s : 문자열
public class _08출력문의종류 {
	public static void main(String[] args) {
		System.out.println(100);
		System.out.print(10);
		System.out.println(20);
		System.out.printf("사과가ㄴ %d개가 있습니다.\n", 5);
		System.out.printf("사과가 %f개가 있습니다.\n", 10 / 3.0);
		
		System.out.printf("사과가 %.2f개가 있습니다.\n", 10 / 3.0);
		
		System.out.printf("%s가 %.2f개가 있습니다.\n", "사과", 10 / 3.0);
		System.out.printf("%s가 %d개가 있습니다.\n", "바나나", 10 / 3);
	}
}
