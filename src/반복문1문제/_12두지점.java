package 반복문1문제;

public class _12두지점 {
	public static void main(String[] args) {
//		문제
//			철수네 가족은 x와 y두 지점을 자전거를 타고 왕복하였다
//			갈 때는 시속 15km, 올 때는 시속 12km로 이동하여
//			총 45분이 걸렸다.
//			두 지점 x, y의 각각 소요시간과
//			왕복으로 이동한 총 거리를 구하시오.

//		정답
//			소요시간 : x = 20분, y = 25분
//			왕복 총 거리 = 10km

		// 즉 거리를 구하려면 속력을 알아야한다
		// -> 반복문을 통해서 노가다로 두 지점 속력 구하기

		// 거리 = 속력 * 시간
		double 갈때분속 = 15 / 60.0;
		double 올때분속 = 12 / 60.0;

		int x = 45; // x -= 1
		int y = 0; // y += 1

		boolean run = true;
		while (run) {
			if (x * 갈때분속 == y * 올때분속) {
				run = false;
			} else {
				x -= 1;
				y += 1;
			}
		}
		double 갈때거리 = x * 갈때분속;
		double 올때거리 = y * 올때분속;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println(갈때거리);
		System.out.println(올때거리);
	}
}
