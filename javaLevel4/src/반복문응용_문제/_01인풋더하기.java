package 반복문응용_문제;

public class _01인풋더하기 {
	public static void main(String[] args) {
//		문제
//			민수는 학교에서 산수시험을 봤다
//			arr1의 숫자와 arr2의 숫자의 합을 구하는 시험이다
//			
//			input배열은 민수가 작성한 답이다
//			민수는 답을 순차적으로 적지 않고 뒤섞여서 적었다.
//			위 더하기문제의 답을 답안지에서 찾아서 민수는 몇문제를 맞췄는지 출력하시오.
//		정답
//			4
		int[] arr1 = { 4, 65, 23, 1, 45, 7 };
		int[] arr2 = { 61, 2, 54, 3, 5, 6 };

		int[] input = { 67, 13, 2, 22, 65, 4 };

		int score = 0;

		for (int i = 0; i < arr1.length; i += 1) {

			for (int k = 0; k < input.length; k += 1) {

				if (arr1[i] + arr2[i] == input[k]) {
					score += 1;
					break;
				}
			}
		}
		System.out.println(score);
	}
}
