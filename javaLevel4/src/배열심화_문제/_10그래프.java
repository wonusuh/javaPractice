package 배열심화_문제;

public class _10그래프 {
	public static void main(String[] args) {
//		문제
//			아래 scoreList데이터는 학생 6명의 점수이다
//			이 데이터를 그래프로 표현하려고 한다
//			표시는 10의 자리 숫자로 표현해서
//			개수만큼 *로출력하시오
//			
//			예)
//				31  : ***
//				76  : *******
//				54  : *****
//				100 : **********
//				2   : 
		int[] scoreList = { 31, 76, 54, 2, 100, 23 };
//		System.out.printf("%-3d : ", scoreList[i]); // 오른쪽부터 자리수 3개 순차대로 표시
//		 3자리 수 이하면 빈공간 표시
//		System.out.printf("%3d : ", scoreList[i]); // 왼쪽부터 자리수 3개 순차대로 표시

		for (int i = 0; i < scoreList.length; i += 1) {
			System.out.printf("%-3d : ", scoreList[i]); // 왼쪽부터 자리수 3개 순차대로 표시
			for (int k = 0; k < scoreList[i] / 10; k += 1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
