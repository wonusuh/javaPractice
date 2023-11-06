package _level4test;

public class 문제8 {
	public static void main(String[] args) {
//		arr1 과 arr2 각각의 값들이 모두 같은지 검사하시오.
//		전부 같으면 true, 틀린 값이 하나라도 있으면 false를 출력하시오.
//		단, 위치는 달라도 상관없다. 
//		중복된값이 있을수있고 하나씩 만 매칭이된다.
//  => 저 말은 배열이 {1,2,3,4,5} / {2,3,1,5,4} 이렇게 한개씩 매칭한다는 소리 
//
//    arr1 에 1이 2개 2가 2개 3이 2개 
//    arr2 에 1이 2개 2가 2개 3이 2개
//    니깐 ture 
//
//	[정답]
//		true
		int[] arr1 = { 1, 2, 3, 1, 2, 3 };
		int[] arr2 = { 3, 2, 1, 2, 3, 1 };

		//
		boolean[] check = new boolean[arr1.length];
		int cnt = 0;

		for (int i = 0; i < arr1.length; i += 1) {

			for (int k = 0; k < arr1.length; k += 1) {

				if (check[k] == false && arr1[i] == arr2[k]) {
					check[k] = true;
					cnt += 1;
					break;
				}
			}
		}

		if (cnt == arr1.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
