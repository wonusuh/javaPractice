package 배열2_문제;

import java.util.Arrays;
import java.util.Scanner;

public class _14삭제원리2_복습3 {
	public static void main(String[] args) {
//		문제
//		아래 c 배열은 번호와 값이 한 쌍인 배열이다.
//		번호를 하나 입력받아 c 배열에 있는 번호이면,
//		그 번호와 값만 제외하고 d 배열에 복사한다
//		
//		예)
//			입력 : 1002
//			결과 : d = {1001, 40, 1003, 70, 0, 0}
		Scanner sc = new Scanner(System.in);
		int[] c = { 1001, 40, 1002, 65, 1003, 70 };
		int[] d = { 0, 0, 0, 0, 0, 0 };
		System.out.print("학번을 입력하세요 >> ");
		int input = sc.nextInt();
		int idx = -1;
		for (int i = 0; i < c.length; i += 2) {
			if (input == c[i]) {
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			int cnt = 0;
			for (int i = 0; i < d.length; i += 2) {
				if (i != idx) {
					d[cnt] = c[i];
					d[cnt + 1] = c[i + 1];
					cnt += 2;
				}
			}
		} else {
			System.out.println("입력한 값이 배열에 없습니다");
		}
		System.out.println(Arrays.toString(d));
		sc.close();
	}
}
