package _레벨1테스트;

public class 응용3 {
	public static void main(String[] args) {
//		[문제 3]
//				연필 7타를 여학생 3명과 남학생 4명에게 남김없이 똑같이 나누어 주었다.
//				여학생들이 받은 연필개수가 5의 배수이고,
//				남학생들이 받은 연필개수가 3의 배수인지 여부를
//				true 또는 false로 표현하시오.
//				(연필 1타는 12자루)
//			[정답]
//				false
		int total = 7 * 12;
		int students = 7;
		int person = total / students;

		int girlsHave = person * 3;
		System.out.println(girlsHave);
		int boysHave = person * 4;
		System.out.println(boysHave);

		boolean girlsFiveTimes = girlsHave % 5 == 0;
		boolean boysThreeTimes = boysHave % 3 == 0;

		System.out.println(girlsFiveTimes);
		System.out.println(boysThreeTimes);
		System.out.println(girlsFiveTimes && boysThreeTimes);
	}
}
