package _level4test;

public class 문제9 {
	public static void main(String[] args) {
//		 input 의 배열안의 값들이   array배열의 값들과 일치하고,
//		  그순서도 일치하면  true , 아니면 false 출력 	
//		  
//		예) input1의 값들은  6,1,8  이고 array 의  
//			index 5~7(6,1,8) 의 값과 순서가 일치한다.
//		결과)  true	
//			  	
//		예) input2의 값들을 array 배열에 있는값들과 일치하지만, 
//		   input2 순서가 6,3 이고, array 의 값은 3,6 으로 순서가 다르다.
//		결과) false
		int array[] = { 1, 3, 3, 6, 5, 6, 1, 8, 9 };
//		int input1[] = { 6, 1, 8 };
//		int input2[] = { 6, 3 };
		int input3[] = { 1, 8, 9 };

		int[] run = input3;

		boolean check = false;
		int size = run.length;

		for (int i = 0; i < array.length - size + 1; i += 1) {

			if (run[0] == array[i]) {

				for (int k = 0; k < size; k += 1) {

					if (array[i + k] == run[k]) {
						System.out.print(run[k]);
					} else {
						break;
					}
					check = true;
				}
				System.out.println();
			}
		}
		System.out.println(check);
	}
}
