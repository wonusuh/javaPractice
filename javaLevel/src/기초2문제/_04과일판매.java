package 기초2문제;

/*
	[문제]
		가게에 과일 250개가 있다.
		그중에 오전에 120개가 팔렸고, 오후에는 80개가 팔렸다.
		남은 과일은 전체 과일의 몇 % 인지 구하시오.
	[정답]
		20%
 */
public class _04과일판매 {
	public static void main(String[] args) {
		double total = 250;
		double soldAm = 120;
		double soldPm = 80;
		double remainFruit = total - soldAm - soldPm;
		double percent = remainFruit / total;
		System.out.println((percent) * 100 + "%");
	}
}
