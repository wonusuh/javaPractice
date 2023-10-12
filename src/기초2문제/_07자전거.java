package 기초2문제;

/*
[문제]
	철수는 자전거를 타고 일정한 빠르기로 7분 동안 23/30km를 갔다.
	철수가 자전거를 타고 1분 동안 간 거리가 몇 km인지 구하시오.
	단, 소수점 두 자리까지 출력하시오.
[정답]
	0.11km
*/
public class _07자전거 {
	public static void main(String[] args) {
		// 7 : 23/30 = 1 : n
		// 7n = 23/30
		// n = 23/30/7
		double timeMin = 7.0;
		double distanceKm = 23.0 / 30.0;
		double oneMinDis = distanceKm / timeMin;
		System.out.printf("%.2fkm\n", oneMinDis);
	}
}
