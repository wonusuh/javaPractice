package 반복문응용_문제;

import java.util.Random;

public class _03점프이동 {
	public static void main(String[] args) {
//		문제
//			map 배열은 게임의 지도를 의미하고
//			그 값은 추가로 이동할 수 있는 거리를 의미한다
//			
//			player 변수는 map배열의 현재 위치를 의미한다
//			즉, player는 현재 map의 0번째 인덱스에 있다.
//			
//			주사위 1~3를 랜덤으로 저장해, player의 위치를 출력하시오

//		예) 주사위가 1이 나오면
//			player 1칸 이동한다
//			map[1]은 3이므로 추가로 3칸을 더 이동한다
//			즉 player의 위치는 4가 된다

//		예) 주사위가 2이 나오면
//			player 2칸 이동한다
//			map[2]은 0이므로 추가이동 없음
//			즉 player의 위치는 2가 된다

//		예) 주사위가 3이 나오면
//			player 3칸 이동한다
//			map[3]은 3이므로 추가로 3칸을 더 이동한다
//			즉 player의 위치는 5가 된다.
		int[] map = { 0, 3, 0, 3, 0, 0, -1, 1, 0, 0 };

		int player = 0; // 인덱스

		Random rn = new Random();

		int dice = rn.nextInt(3 - 1 + 1) + 1; // 0 1

		player += dice;
		while (true) {
			if (map[player] == 0) {
				break;
			}
			player += map[player];
		}
		System.out.println(player);
	}
}
