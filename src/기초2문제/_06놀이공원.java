package 기초2문제;

public class _06놀이공원 {
	public static void main(String[] args) {
		// 놀이공원 입장료 15000
		// 9000원에 입장했다
		// 몇 % 할인받았나?
		// 15000 : 100 = 9000 : n
		// 15000n=90000
		// n = 90000 / 15000
		double entr = 15000;
		double afterDisc = 9000;
		double onePercent = entr / 100;
		double disPercent = (entr - afterDisc) / onePercent;
		System.out.println(disPercent);
	}
}
