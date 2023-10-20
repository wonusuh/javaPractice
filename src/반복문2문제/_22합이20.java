package 반복문2문제;

import java.util.Random;

public class _22합이20 {
	public static void main(String[] args) {
//		문제
//			1~10 사이의 랜덤 숫자를 3개 저장하고
//			그 숫자의 합이 무조건 20이 되도록 출력해보자
//			단 세 수는 중복일 수 없다
//		예시
//			x=9, y=5, z=6
		Random rn = new Random();
		while (true) {
			int x = rn.nextInt(10 - 1 + 1) + 1;
			int y = rn.nextInt(10 - 1 + 1) + 1;
			int z = rn.nextInt(10 - 1 + 1) + 1;
			if (x != y && y != z && x + y + z == 20) {
				System.out.printf("x == %d, y == %d, z == %d\n", x, y, z);
				break;
			}
		}
	}
}
