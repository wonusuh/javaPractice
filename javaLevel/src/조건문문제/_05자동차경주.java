package 조건문문제;

public class _05자동차경주 {
	public static void main(String[] args) {
		// 자동차는 154km 의 거리를 1시간 18분에 달린다.
		// 트럭은 215km의 거리를 2시간 17분에 달린다.
		// 자동차가 트럭보다 빠른지 여부를 출력해라
		// 정답 자동차가 더 빠르다
		// 거 = 속 * 시
		double carDis = 154.0;
		double carTime = 78.0;
		double carVel = carDis / carTime;
		System.out.println("차의 분속 = " + carVel);

		double truckDis = 215.0;
		double truckTime = 137.0;
		double truckVel = truckDis / truckTime;
		System.out.println("트럭의 분속 = " + truckVel);

		if (carVel > truckVel) {
			System.out.println("자동차가 더 빠르다");
		}
		if (carVel == truckVel) {
			System.out.println("속력이 같다");
		}
		if (carVel < truckVel) {
			System.out.println("트럭이 더 빠르다");
		}
	}
}
