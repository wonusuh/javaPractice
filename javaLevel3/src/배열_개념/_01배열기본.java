package 배열_개념;

/*
	변수의 한계 : 값을 재할당하면 기존의 데이터는 사라진다
	변수의 한계를 극복하기위해 배열 등장
*/
public class _01배열기본 {
	public static void main(String[] args) {
		// 1. 일반 변수 값 저장
		int num = 10;
		System.out.println(num);

		num = 100;
		System.out.println(num);

		// int num2 = null; 값을 저장하느 자료형 타입에서는 null 사용 불가
		int[] array = null; // 비어있는 주소값
		array = new int[5]; // 정수값이 5개가 들어가는 메모리방을 생성하고
							// 그 메모리방의 주소값을 arr에 저장
		System.out.println(array);

//		int num2;
//		System.out.println(num2);

		System.out.println("array[0] == " + array[0]);
		System.out.println("array[1] == " + array[1]);
		System.out.println("array[2] == " + array[2]);
		System.out.println("array[3] == " + array[3]);
		System.out.println("array[4] == " + array[4]);

		System.out.println();

		array[0] = 10; // array의 0번째 가서 10을 넣어줘
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		for (int i = 0; i < array.length; i += 1) {
			System.out.println("array[" + i + "] == " + array[i]);
		}
	}
}
