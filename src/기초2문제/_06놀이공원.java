package 기초2문제;

public class _06놀이공원 {
	public static void main(String[] args) {
//		[문제]
//			철수는 놀이공원에 갔다.
//			놀이공원 입장료는 15,000원이다.
//			철수는 특별할인을 받아서 9,000원에 입장했다.
//			몇 % 할인받은 것인지 구하시오.
//		[정답]
//			40%
		double entrance = 15000.0;
		double afterDisc = 9000.0;
		double discRate = 100 - ((afterDisc / entrance) * 100);
		System.out.println(discRate + "%");
	}
}
