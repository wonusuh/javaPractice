package 배열심화_문제2;

import java.util.Random;

public class _01시험지나눠주기 {
	public static void main(String[] args) {
//		아래 2차원배열은 3학년 1반의 학생 수를 표현한 것으로
//		세로4 가로5의 총 학생 수는 20명이다.
//		배열 안의 각각의 값들은 각 학생별 시험을 보기위한 필요페이지 수이다.
//		학생마다 필요한 수가 다르다.
//		
//		시험지를 인덱스 위치(0, 0)부터 나누어주려 할 때,
//		지그재그 형태로 전달하려한다.
//		
//		첫 번쨰줄은 앞에서부터 뒤로 이동한다 3 1 5 4 1
//		두 번째 줄은 뒤에서부터 앞으로 이동한다 8 2 4 6 1
//		~
//		~
//		
//		랜덤으로 학생수(1~20)를 저장하고,
//		각 학생별로 필요한 페이지 수의 합을 출력한다.
//		
//		예) 랜덤숫자 7 => {3 + 1 + 5 + 4 +1 } + {8 + 2} =24
//		예) 랜덤숫자 12 => {3 + 1 + 5 + 4 +1 } + {8 + 2+4+6+1}+2+3 =40
		Random rn = new Random();
		int[][] arr = {

				{ 3, 1, 5, 4, 1 },

				{ 1, 6, 4, 2, 8 },

				{ 2, 3, 5, 5, 2 },

				{ 6, 1, 7, 1, 2 } };
		int cnt = rn.nextInt(20 - 1 + 1) + 1;
		System.out.println("cnt == " + cnt);

		int pages = 0;
		for (int i = 0; i < arr.length; i += 1) {

			for (int j = 0; j < arr[i].length; j += 1) {

				if (cnt == 0) {
					break;
				}

				if (i % 2 != 0) {
					pages += arr[i][(arr[i].length - 1) - j];
					System.out.print(arr[i][(arr[i].length - 1) - j] + " ");
				} else {
					pages += arr[i][j];
					System.out.print(arr[i][j] + " ");
				}
				cnt -= 1;
			}
		}
		System.out.println();
		System.out.println("pages == " + pages);
	}
}
