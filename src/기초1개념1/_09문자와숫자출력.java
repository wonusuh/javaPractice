package 기초1개념1;

public class _09문자와숫자출력 {
	public static void main(String[] args) {

		System.out.println(10 + 3);
		System.out.println("10" + 3);
		System.out.println("5" + "사과");
		System.out.println("10" + 3 + 4);
		System.out.println(3 + 4 + "10");
		System.out.println("10" + (3 + 4));
		System.out.println(3 + 4 * 5);
		System.out.println((3 + 4) * 5);

		System.out.printf("바나나" + "가 " + (1 + 1 + 1) + "개 있습니다.\n");
		System.out.printf("%s가 %d개 있습니다.\n", "바나나", 10 / 3);
	}
}
