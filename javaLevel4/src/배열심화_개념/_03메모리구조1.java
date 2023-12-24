package 배열심화_개념;

public class _03메모리구조1 {
	// main 메서드 안에서 소스코드 작성중
	// 메서드 안에서 선언한 변수는 다 지역변수다
	// 지역변수 => 반드시 초기값이 있어야된다.
	public static void main(String[] args) {

		// 데이터 영역 구분
		// 1. stack : 메서드의 영역(지역변수)
		// 2. heap : new 한 모든것들의 영역(참조변수)
		// 3. static : static이 붙은 것

		int a = 10;
		int b = 20;

		int[] arr = new int[3];
		int[] arr2 = { a, b };
		int[] arr3 = null;

		arr[0] = 10;
		arr[1] = b;

		System.out.println(arr2);
		System.out.println(arr3);
	}
}
