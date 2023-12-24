package 기초2문제;
/*				
[문제1] 
	철수는 870미터를 40분간 걸어갔다. 
	철수의 시속은 얼마인가? 21
	철수의 분속은 얼마인가? 1260
	
[문제2] 
		철수는 시속 3km의 속도로 37분간 걸어갔다.
		철수가 이동한 거리는 몇km 인가?
		철수가 이동한 거리는 몇m 인가?	
*/

public class _02속력 {

	public static void main(String[] args) {
		
		// 870m : 40분 = x : 1분
		// 40x = 870
		// 분 = 870/40
		// 시속 = 870/40 *60
		// 1시간 => 60분
		int 이동거리 = 870;
		int 이동시간 = 40;
		double 분속 = 이동거리 / 이동시간 * 1.0;
		double 시속 = 이동거리 / 이동시간 * 60;
		System.out.println("[문제 1]");
		System.out.printf("분속 = %.0f, 시속 = %.0f \n", 분속, 시속);

		// 거 = 속 * 시
		double meter = 870;
		double min = 40;
		double minVel = meter / min;
		double hourVel = minVel * 60;
		System.out.println("minVel = " + minVel);
		System.out.println("hourVel = " + hourVel);

//	      [문제2] 
//		철수는 시속 3km의 속도로 37분간 걸어갔다. 
//		철수가 이동한 거리는 몇km 인가?
//		철수가 이동한 거리는 몇m 인가?	
//		
//		  60분 : 3km = 1분 : xkm 
//		  3= 60x;
//		  x = 3/60
//		  x => 분속

		시속 = 3;
		분속 = 시속 / 60.0;
		이동시간 = 37;
		// 실수과 정수값의 연산은 무조건 실수값
		double 이동거리km = 분속 * 이동시간;
		double 이동거리m = 이동거리km * 1000;

		System.out.println("이동거리km = " + 이동거리km);
		System.out.println("이동거리m = " + 이동거리m);

		// 거 = 속 * 시
		hourVel = 3;
		minVel = hourVel / 60;
		min = 37;
		double distanceMeter = minVel * 37;
		double distanceKM = distanceMeter * 1000;
		System.out.println(distanceMeter);
		System.out.println(distanceKM);
		/* 
	      [문제2] 
		철수는 시속 3km의 속도로 37분간 걸어갔다. 
		철수가 이동한 거리는 몇km 인가?
		철수가 이동한 거리는 몇m 인가?	
		
		  60분 : 3km = 1분 : xkm 
		  3= 60x;
		  x = 3/60
		  x => 분속
	     */
	}
}
