package _기초연습예제1;

public class A3_철수가방 {
	public static void main(String[] args) {
//		문제]
//				철수는 운동을 위해 집에서 직진으로 1,800m를 걸어간 후
//				집으로 돌아가기 위해 뒤돌아서 300m를 걸어갔다.
//				철수는 힘들어서 잠시 쉬었다.
//				철수는 다시 일어나서 집으로 200m를 걸어갔을때쯤
//				아까 쉬었던 자리에 가방을 두고온 것을 깨달았다.
//				철수는 다시 돌아가서 가방을 가지고 집으로 돌아왔다.
//				오늘 철수가 걸은 길이는 총 몇m인지 구하시오.
//			[정답]
//				4,000m
		int workout = 1800;
		int restPoint = 300;
		System.out.println(restPoint);
		int returning = 200 * 2;
		System.out.println(returning);
		int restToHome = 1500;

		System.out.println(workout + restPoint + returning + restToHome + "m");
	}
}
