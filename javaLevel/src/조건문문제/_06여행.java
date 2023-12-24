package 조건문문제;

//[문제]
//	고속버스를 타고 여행을 떠나려한다.
//	출발시간까지 1시간 여유가 있다.
//	고속버스역과 상점을 시속 3km를 걸어서 왕복을 하고
//	10분 동안 물건을 산다고 하면
//	역에서 1.3km 떨어진 상점을 다녀올 수 있는지 여부를 판단해서
//	
//	물건 살수 있음 
//	물건 살수 없음을 출력하시오 
//	
//	[정답] 62분이 걸려서 물건 살 수없음
public class _06여행 {
	public static void main(String[] args) {
		// dis = vel * time
		// 시속을 분속으로 바꾸기
		// 60min : 3km = 1min : nkm
		// 60n = 3
		// n= 3/60
		// 분속 =0.05
		double spareMin = 60.0;
		System.out.println("여유시간 : " + spareMin + "분");
		double shoppingTime = 10;
		System.out.println("쇼핑시간 : " + shoppingTime + "분");
		double distance = 1.3;
		double minVel = 3 / 60.0;
		// 거 = 시 * 속
		// 시간 = 거리 / 속력
		double twiceMin = (distance / minVel) * 2;
		System.out.println("왕복시간 : " + twiceMin + "분");
		double totalMin = shoppingTime + twiceMin;
		System.out.println("총 걸리는 시간 : " + totalMin + "분");

		boolean canOrNot = spareMin >= totalMin;
		System.out.println("canOrNot : " + canOrNot);
	}
}
