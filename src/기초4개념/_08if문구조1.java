package 기초4개념;

public class _08if문구조1 {
	public static void main(String[] args) {
		System.out.println("1과자 2.음료수 3.라면");

		int sel = 3;

		if (sel == 1) {
			System.out.println("과자");
		} else if (sel == 2) {
			System.out.println("음료수");
		} else if (sel == 3) {
			System.out.println("라면");
		} else {
			System.out.println("오류");
		}
	}
}
