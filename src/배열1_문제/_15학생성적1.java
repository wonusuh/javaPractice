package 배열1_문제;

import java.util.Random;

public class _15학생성적1 {
	public static void main(String[] args) {
//		문제1
//			array에 1~100점 사이의 랜덤 점수를 5개 저장하고출력하시오
//			
//		문제2
//			전교생의 총점과 평균을 출력하시오
//		
//		문제3
//			성적이 60점 이상이면 합격. 합격생 수를 출력하시오
		Random rn = new Random();
		int[] array = new int[5];
		int total = 0;
		int pass = 0;

		for (int i = 0; i < array.length; i += 1) {
			array[i] = rn.nextInt(100 - 1 + 1) + 1;
			total += array[i];
			if (array[i] >= 60) {
				pass += 1;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (total * 1.0) / (array.length * 1.0));
		System.out.println("합격자수 : " + pass);
	}
}
